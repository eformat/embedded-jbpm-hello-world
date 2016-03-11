package com.michaelrice.ebpm;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.process.core.context.variable.VariableScope;
import org.jbpm.process.instance.ProcessInstance;
import org.jbpm.process.instance.context.variable.VariableScopeInstance;
import org.kie.api.KieBase;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;


public class HelloWorld {

	//note: these are just to simplify the sayHello method 
	//definitely not how you'd want to structure your class in the real world
	KieSession ksession;
	ProcessInstance processInstance;
	
	public String sayHello(String string) {
		
		standupKieSession();
		callBPMProcess("michael");
		
		return retrieveProcessResult();
		
	}
	
	void standupKieSession() {
		KieHelper kieHelper = new KieHelper();
		KieBase kieBase = kieHelper.addResource(ResourceFactory.newClassPathResource("say_hello.bpmn"), ResourceType.BPMN2).build();
		this.ksession = kieBase.newKieSession();
	}
	
	void callBPMProcess(String name) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", name);
		this.processInstance = (ProcessInstance)ksession.startProcess("say_hello", parameters);
	}
	
	String retrieveProcessResult() {
		VariableScopeInstance variableScope = (VariableScopeInstance)processInstance.getContextInstance(VariableScope.VARIABLE_SCOPE);  
        Map<String, Object> variables = variableScope.getVariables();
        return (String)variables.get("welcomeText");
	}
	
}

Embedded jBPM Hello World Example
==============

This is a hello, world-type example of how you could run jBPM in an embedded mode.

There are tons of hello, world jBPM examples. I needed another one because I wanted one that was:
* as simple as possible
* actually interact with BPM process variables

Most the other examples I came across were either too simplistic, too complicated, or basically didn't accomplish what I wanted.

What I wanted was something that fired up a BPM process based on a BPMN 2.0 model, pass the BPMN-described workflow some variables into its process variables, do some processing, and return a result in process variables.

As I write this, I'm honestly not sure if this is the very best way to do this -- but it seems like the simplest approach so far.

Please let me know what you think.

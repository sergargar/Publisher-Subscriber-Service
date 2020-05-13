1. The FormaterPublisher of the WS must be compiled and execute with ```javac formater/FormaterPubisher.java```and ```java formater.FormaterPublisher```
2. Compilation is made with ```make```
3. The RPC server is executed with ```./publications_server``` and creates a publication folder where all the topics' texts are going to be stored.
4. The broker is executed with ```./broker -p port``` and initializes the RPC server.
5. Now, either the editor with ```./editor -h host -p port -t "topic" -m "text"``` can publish a text on a topic or the suscriptor with ```java suscriptor -s server -p port``` can be subscribed to a specific topic.

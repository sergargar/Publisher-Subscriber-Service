1. The FormaterPublisher of the WS must be compiled and execute with: 
```
javac formater/FormaterPubisher.java' and 'java formater.FormaterPublisher
```
2. Compilation is made with:
```
make
```
3. The RPC server is executed with: 
```
./publications_server
```
4. The broker is executed and initializes the RPC server:
```
./broker -p port
```
5. Now, either the editor with: ```./editor -h host -p port -t "topic" -m "text"``` or the suscriptor by: ```java suscriptor -s server -p port``` can be executed.

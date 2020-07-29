#Implementation of Multiplication of two numbers in JAVA RMI

Requirements : java, jvm

#Directory tree:
	-Multiplier.java
	-MultiplierRemote.java
	-README.md
	-RmiClient.java
	-RmiServer.java

#Steps to follow to run:
	1. Compile all the java files 
		(type in terminal "javac *.java")
	2. Create stub and skeleton object by rmic tool 
		(type in terminal "rmic MultiplierRemote")
	3. Start RMI registry in one command prompt
		(type in terminal "rmiregistry 4000")
	4. Start the server in an another terminal
		(type in terminal "java RmiServer")
	5. Start the client in a 3rd terminal
		(type in terminal "java RmiClient")  

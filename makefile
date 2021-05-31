JC = javac
.SUFFIXES: .java .class
# AES.class:
# 	$(JC) ./src/AES.java

run:
	$(JC) ./src/Main.java
	java ./src/Main.java

clean:
	$(RM) ./src/*.class

.PHONY: run clean
run: main.class FileHandler.class Station.class
	java main
main.class: main.java
	javac main.java
FileHandler.class: FileHandler.java
	javac FileHandler.java
Station.class: Station.java
	javac Station.java
clean:
	rm -f *.class

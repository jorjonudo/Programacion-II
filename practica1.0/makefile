fichJar = pi.jar

limpiar:
	rm -f *.jar
	rm -rf bin	

compilar: limpiar
	mkdir bin
	find . -name *.java | xargs javac -cp bin -d bin

jar: compilar
	jar cvfm $(fichJar) Manifest.txt -C bin . 

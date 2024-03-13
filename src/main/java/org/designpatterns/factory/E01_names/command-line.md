How to run in command line:

* Open a terminal inside E01_names/ folder.
* run:
```bash
javac -d bin .\E01Test.java .\factory_contract\*.java .\factory_instances\*.java .\fullname\*.java
```
```bash
cd bin
```
```bash
java org.designpatterns.factory.E01_names.E01Test "McNealy, Scott" "James Gosling" "Naughton, Patrick"
```
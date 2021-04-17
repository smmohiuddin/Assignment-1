# Assignment-1

Answers of the first questions are given in a seperate file called [answers.txt](https://github.com/smmohiuddin/Assignment-1/blob/main/answer.txt)  

## Coding Assignment
In this repo, there is a directory called solution/input-validator where you can find the source code. It is a maven project

###### Requirements
1. Java
2. Maven

###### Build The Jar
1. Go to solution/input-validator
2. Open command line and run ```mvn clean install```
3. Go to target directory and find the jar file with the name "input-validator-1.0-SNAPSHOT-jar-with-dependencies.jar" 

###### Run The Jar
``` java -jar input-validator-1.0-SNAPSHOT-jar-with-dependencies.jar <path/to/data.json>```

You need to provide the absolute path of the data.json file as param

example: ``` java -jar input-validator-1.0-SNAPSHOT-jar-with-dependencies.jar "D:\Assignment\data.json"```

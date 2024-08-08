# Simple Gradle Java APP
Simple Java App Created with Gradle

Please read this Article to make the best use of this git repo

[https://adityasridhar.com/posts/how-to-get-started-with-gradle](https://adityasridhar.com/posts/how-to-get-started-with-gradle)

## Cloning the Code

Clone this code into your local using the following command

`git clone https://github.com/aditya-sridhar/simple-gradle-java-app.git`

## Building the Application 

The application can be built using the following command 

**Windows** : `gradlew.bat build`

**Linux/MacOS**: `./gradlew build`

## Running the Application

The application can be run using the following command 

**Windows** : `gradlew.bat run`

**Linux/MacOS**: `./gradlew run`

## Tests

After the Application is built using the Build command, the test results report can be found in below file
*build/reports/tests/test/index.html*

This is a spot for a potential key/secret leak:
test secret fy'hYW#^^1Y48w!/-9
##############################################
# CodeQL Testing
Explanation of the Vulnerability:
Insecure Deserialization:
    In the App.java file, the code is deserializing an object from a byte array using ObjectInputStream. This process is vulnerable if the serialized data comes from an untrusted source, as it can lead to arbitrary code execution.
    
    The VulnerableClass contains a readResolve() method that is called automatically during deserialization. This method can be exploited to execute code during deserialization, which is a critical security risk.

# Running the CodeQL Analysis
When you run CodeQL analysis on this code, it should detect the insecure deserialization vulnerability in App.java and VulnerableClass.java and raise an alert.

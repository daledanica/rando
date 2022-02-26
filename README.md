# rando
CS-361 Software Engineering I - Microservice

This is my microservice that generates psuedo-random numbers
* GET /   will return a random integer 0..10 inclusive
* GET /{upperlimit}   will return a random number 0..upperlimit inclusive

Build Instructions
This is just a standard gradle build: % gradlew build

You can find the resulting jar in build/libs

Run Instructions
To actually run it, it's a standard execution of a java jar:

% java -jar rando-0.0.1-SNAPSHOT.jar

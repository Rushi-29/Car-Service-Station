<h1 align="center"> Car_Service_Station </h1>

* Tech stack used: JAVA, OOPs
*  ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

>### This program simulates a car service station and calculates the total bill for requested services based on the type of car and service codes provided.

>### Features
* The car service station program includes the following features:

* Three types of cars: Hatchback, Sedan, and SUV
* Five types of services: Basic Service (BS01), Engine Fixing (EF01), Clutch Fixing (CF01), Brake Fixing (BF01), and Gear Fixing (GF01)
* Different prices for each service based on the type of car
* Car Service Prices

>### Usage
To run the program, follow these steps:

Ensure you have a Java development environment set up on your machine.
Compile the Java source files CarServiceStation.java and Main.java using the Java compiler.
Run the compiled program using the Java Virtual Machine (JVM).
The program will prompt you to enter the type of car and the number of service codes.
Enter the service codes as required.
The program will display the type of car, service codes, total bill, and whether a complimentary cleaning is included if the total bill is above ₹10,000.

>### Example
Here's an example usage of the program:

  Type of Car: Hatchback
  Service Codes: BS01, EF01
  Total Bill: ₹ 7000
  Test Cases
  The program has been tested with the following test cases:

* Type of car: Hatchback, Service Codes: BS01, EF01 (Expected Total Bill: ₹ 7000)
* Type of car: Sedan, Service Codes: BS01, CF01 (Expected Total Bill: ₹ 8000)
* Type of car: SUV, Service Codes: BF01, GF01 (Expected Total Bill: ₹ 10500 with Complimentary Cleaning)

>### Error Handling
* If an invalid car type is entered, the program will throw an IllegalArgumentException.

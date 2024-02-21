# JUnit1 Assignment Lab 2: Circle Operations and Testing

## Overview:
This project is part of the JUnit1 Assignment for Lab 2, focusing on demonstrating the use of JUnit 5 for testing Java applications. It includes implementations for managing circles in a 2D space, specifically creating, scaling, moving, and detecting intersections between circles. The project showcases object-oriented programming principles and unit testing with JUnit 5.

## Features:
- Circle Abstraction: Abstract 'Circle' class with the basic operations and attributes for circles.
- Circle Implementations: Concrete 'Circle1' and 'Circle2' classes with specific 'interesects' logic.
- 2D Point Representation: 'CirclePoint' class to represent the circles centers.
- JUnit Tests: Comprehensive tests for 'Circle1' operations using JUnite 5.
- Command line Application: 'CircleRun' for runtime demostration of the cirlce interesection functionality

## Getting Started

### Prerequisites:
- Java Development Kit (JDK) 11 or later
- Apache Ant for building and running the project

### Setup:
1. **Clone the Repository**
```bash
git clone https://github.com/<Hakka2424>/<junit1>.git
```

2. **Build the Project**
- Use Apache Ant to compile the project
```bash
ant compile
```

3. **Running Tests**
- To run the unit tests and verify the correctness of the circle operations
```bash
ant junit
```

4. **Demostraction Application**
- To run the 'CircleRun' application and see a demostraction of circle interesections, based on the provided parameters
```bash
ant run
```

Note: You may need to modify the command line argurments in the 'build.xml' file under the 'run' target to test different circle configuartions.

### Structures:
These are all the Java Source files thats included:
- 'Circle.java': Abstract class defining basic circle attribitutes and operations. 
- 'Circle1.java': Implmentations of 'Circle' with specific interesection logic.
- 'Circle2.java': Implmentations of 'Circle' with specific interesection logic.
- 'Circle1Test.java': JUnit test cases for 'Circle1'.
- 'CircleRun.java': Command line application to demosttrate circle intersecetion logic.
- 'Point.java': Represent a point in a 2D space, used for circle centers.
- 'build.xml': Apache Ant build configuration file.

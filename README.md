## Readme for Term_Project_Simulation

## Introduction

This is a project to pass the computer science exam of the University of Applied Sciences "TH-Bingen", where we have to simulate some further programming tasks using Kotlin and IntelliJ IDEA, Git and GitHub, as well as Maven and Travis. The Project started on July 30th, 20017 and has to be finished on August 13th, 2017. The lecturer of the computer science module and the creator of this by now legendary term project is Nicolai Parlog.

The Members of this project are (real name / GitHub user name):

- Steffen Konrad / SteffenKonrad
- Florian Kirch / flowsen39
- Hendrik Hoffmann / H-Hoffmann

As this is an public project on GitHub, we decide to add a [license](https://github.com/SteffenKonrad/Term_Project_Simulation/blob/master/License.md) as well as a [code of conduct](https://github.com/SteffenKonrad/Term_Project_Simulation/blob/master/CodeOfConduct.md), so that everyone knows the rules and how to behave. We want everyone participating in this project to treat everyone else respectful and correctly.

The Project is divided into four parts with multiple tasks, which we have to go through and solve all the tasks. Below we will list the parts and a short description of each.


## Part 1: Project Infrastucture

The first part of this project is all about basic infrastructure, like choosing a language for comments and conversation on GitHub and for the Readme. We choosed German for the conversation and the comments and English for the Readme, which is also a task of this infrastructure part. We also have to pick a code of conduct and a license, that we wan´t to add to our project and to the readme. The next tasks now include some programming, by using Kotlin and IntelliJ to create a project that contains a simple "HelloWorld.kt" class with a main method printing "Hello, World." It should successfully buil a JAR (Java ARchive), so that Maven and Travis can deal with it. By extending "pom.xml" and a writing a small HelloWorldTest, we finish the first part of the project and can release version 1.0.


## Part 2: Create a simple traffic simulation

After everything is set up, we go on to the second part of the project where we have to create a traffic simulation. It contains several individual cars and a single road network. Each car announces whether it wants to drive or not and the network should recognize and tally the number of driving cars and compare it to its own capacity. Based on how many cars are in the road compared to this capacity, the network should decide if a car drives or is delayed due to traffic jams.

Our task is to write a scenario function with about a dozen cars and to keep them track of wether they can drive or were delayed. This information shall be printed at the end of the simulation. To write a main programm, which uses Univocitx Parsers to parse input and to write the resulting data as CSV is the next step of this part. Last but not least we have to extend this README by writing a user documentation, explaining users how to use the program. After all this is finished, we are able to release version 2.0.


## Part 3: Extend simulation to cover an entire day

In this part, we have to extend the simulation by covering an entire day by simulating 24 steps in a row. Also, we randomize the decision for wether each individual car can drive or gets delayed by including some parameters. The result tracking has to be extended, so that each car knows for every step whether it could drive or was delayed. After fullfilling this, we update the scenario function to the simulation´s new requirements. As a last step we extend the CSV input/ output to match the new requirements and results and we update the user documentation to match the new program behavior. Release of version 3.0.


## Part 4: Extend Simulation with various participants

In this last part we have to extend the simulation even more, by creating a suitable interface, of which the car is one implementation and adding implementation for other vehicles like trucks or bikes. Then, each kind of traffic participant is assigned some specific parameters like the chance for a delay and how they "load" the road networks capacity. After extending the CSV input to allow defining different participants and updating the user documentation we can release version 4.0.


## Use of the currently published version

Visit the release page of our project at the following link: https://github.com/SteffenKonrad/Term_Project_Simulation/releases
Download the latest release, the .jar file is located in the downloaded folder. Now any console can be used, here the following command is executed: java -jar "Path To file".

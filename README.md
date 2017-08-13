# Readme for Term Project Simulation

## Introduction

This is a project to pass the computer science exam of the University of Applied Sciences "TH-Bingen", where we have to simulate some further programming tasks using Kotlin and IntelliJ IDEA, Git and GitHub, as well as Maven and Travis. The Project started on July 30th, 20017 and has to be finished on August 13th, 2017. The lecturer of the computer science module and the creator of this by now legendary term project is [Nicolai Parlog](https://github.com/nicolaiparlog).

### Members

The members of this project are (real name / GitHub user name):

- Steffen Konrad / [SteffenKonrad](https://github.com/SteffenKonrad)
- Florian Kirch / [flowsen39](https://github.com/flowsen39)
- Hendrik Hoffmann / [H-Hoffmann](https://github.com/H-Hoffmann)


### License and Code of Conduct

As this is a public project on GitHub, we decide to add a [license](https://github.com/SteffenKonrad/Term_Project_Simulation/blob/master/License.md) as well as a [code of conduct](https://github.com/SteffenKonrad/Term_Project_Simulation/blob/master/CodeOfConduct.md), so that everyone knows the rules and how to behave. We want everyone participating in this project to treat everyone else with respect!


### Language

Before we started the project we choose and set the language for 
- code, readme, license and code of conduct --> english
- comments and conversation on GitHub --> german

The Project is divided into four parts with multiple tasks, which we have to go through and solve. Below we will list the parts with a short description of each.

## Part 1: Project Infrastucture

The first part of this project is all about basic infrastructure, like choosing a language for comments and conversation on GitHub and for the Readme. We also have to pick a code of conduct and a license, that we wan´t to add to our project and to the readme. The next tasks now include some programming, by using Kotlin and IntelliJ to create a project that contains a simple "HelloWorld.kt" class with a main method printing "Hello, World." It should successfully buil a **JAR** (Java ARchive), so that Maven and Travis can deal with it. By extending the *pom.xml* and a writing a small "HelloWorldTest", we finish the first part of the project and can release version 1.0.


## Part 2: Create a simple traffic simulation

After everything is set up, we go on to the second part of the project where we have to create a traffic simulation. It contains several individual cars and a single road network. Each car announces whether it wants to drive or not and the network should recognize and tally the number of driving cars and compare it to its own capacity. Based on how many cars are on the road compared to this capacity, the network should decide if a car drives or is delayed due to traffic jams.

Our task is to write a scenario function with about a dozen cars and to keep them track of wether they can drive or were delayed. This information shall be printed at the end of the simulation. To write a main programm, which uses [Univocity Parsers](https://github.com/uniVocity/univocity-parsers) to parse input and to write the resulting data as *CSV* is the next step of this part. Last but not least we have to extend this README by writing a user documentation, explaining users how to use the program. After all this is finished, we are able to release version 2.0.

How to launch the application :
The program is launched by launching the .jar file of release. Because of this action the traffic-simulation will output a CSV-file. This is build on your local computer an is named “result.csv”. To get to the results open this file.
How to get the .jar-file:
Take a look at the end of the release section and download the .jar-file.

Launching the program with Windows Power Shell:
Launch PowerShell and set the command “java –jar “C:\Users\Name\Documents\traffic_simultion-2.0.jar””
Now an output of the program should appear on the console: The output is equal to the content of the .csv-file named “result.csv”.


## Part 3: Extend simulation to cover an entire day

In this part, we have to extend the simulation by covering an entire day by simulating 24 steps in a row. Also, we randomize the decision for wether each individual car can drive or gets delayed by including some parameters. The result tracking has to be extended, so that each car knows for every step whether it could drive or was delayed. After fullfilling this, we update the scenario function to the simulation´s new requirements. As a last step we extend the *CSV* input/ output to match the new requirements and results and we update the user documentation to match the new program behavior. Release of version 3.0.


## Part 4: Extend Simulation with various participants

In this last part we have to extend the simulation even more, by creating a suitable interface, of which the car is one implementation and adding implementation for other vehicles like trucks or bikes. Then, each kind of traffic participant is assigned some specific parameters like the chance for a delay and how they "load" the road networks capacity. After extending the *CSV* input to allow defining different participants and updating the user documentation we can release version 4.0.


## Use of the currently published version

To use our currently published version, just go to our [release](https://github.com/SteffenKonrad/Term_Project_Simulation/releases) and download the "Term_Project_Simulation-1.0-with-dependencies.jar". 
You can now find the *.jar* file in the download folder. Use your console (e.g. Powershell for Windows) and execute the **java -jar "Path To file"**.


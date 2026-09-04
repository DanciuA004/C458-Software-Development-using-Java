# C458 Software Development using Java

## Java Basics

### The Life Cycle of a Java Program
In this lesson, we will explore the life cycle of a Java program and look at what happens from the moment we write an application in Java through executing the completed application.
At a high level, the life cycle of a Java program includes three main steps:

    Write the program
    Compile the code
    Execute the application

Let's look at each step in detail.

#### Write the Program
The first step is to write the program. Writing software in Java gives us access to a rich set of existing code in the form of core classes and libraries that we can use to streamline development processes.  
Java code itself is just plain text stored in a file with the extension .java, so we have several options available to us.
The simplest option is to use a simple text editing tool, such as Windows Notepad or Mac TextEdit. While a text editor works for very basic programs, they lack tools that can help the developer identify errors in the code or run the code to test it.  

At the other end of the spectrum of choices is an IDE, which stands for integrated development environment. An IDE includes syntax editors to make it easier to read the code and find common errors, but they also include the tools required to organize multiple files in a complex program and run the completed code, so you can write, edit, and run code from the same window.  
Common IDEs used in Java development include NetBeans, IntelliJ, and Eclipse. Many IDEs also support multiple coding languages, so if your project includes web pages (.html) or external data files, you can typically do everything in the same interface.

In between text editors and IDEs are more basic code editors like Visual Studio Code and online editors like CodeChef or Replit. These tools generally provide syntax checkers and the ability to compile code, but file organization is more difficult.

Part of the writing and development process includes taking advantage of existing Java-specific code that the Java developers themselves have written, as a way of streamlining the development process.  
Before the use of languages like Java, developers had to explain every step that the computer was expected to do while executing the program, including things like understanding how to display a specific character to an output device (like a monitor) and how to perform common mathematical operations.  
Many of these common tasks are provided as part of Java in the form of core classes (chunks of code that perform a specific operation, like printing output to a monitor) and libraries (code that performs operations on specific kinds of data, including common mathematical operations like rounding). Any Java editor has these core classes and libraries available as part of the software (and more can be added from external libraries).

We also need to have a JDK (Java development kit) installed on the computer we will use to write code. The JDK works in conjunction with the IDE or code editor to provide a compiler and other tools used in Java development processes.

#### Compile the Program
After we finish writing the program, we have to compile it. The Java compiler performs two basic steps:

    Verify that the syntax in the existing code is correct.
    Translate the human Java code into bytecode.

In Java, the compiler is called javac. When we run a .java file through javac, the result is a .class file that contains the bytecode.

Java itself was designed to create programs that can run on any machine or any platform, and it uses bytecode as part of this process. Bytecode is machine-independent and platform-independent, meaning that you can run the same program on a Windows computer, a Mac, an iPad, or an Android device without having to change the program itself or have separate sets of code files for different platforms.

#### Execute the Program
The last step is to execute the program.

While bytecode is closer to machine language than Java code itself is, we need to convert the bytecode into machine language that the computer can execute. For this, we use the JRE, which stands for Java Runtime Environment. Unlike the .class file created by the compiler, the JRE is platform-dependent, so any device that needs to run Java programs must have a JRE installed, even if the user does not intend to write programs on that device.

The JRE includes three main components:

    Java platform core classes
    Java libraries
    The JVM (Java Virtual Machine)

Just as the developer must have access to core classes and libraries when they are writing a program in Java, the machine running the program must have access to the same classes and libraries. These are provided as part of the JRE to ensure that any valid Java program can run on any platform.

The JVM is a software layer that works between the Java program and the device running the code. This component is platform-dependent, so a JVM written for a Windows computer will not work on a Mac computer or vice versa. Its job is to convert the platform-independent bytecode into language that the current platform can interpret and run.

When a Java program runs, the JVM interprets the bytecode and performs a just-in-time compilation into machine code written in bits. Humans cannot read the bits, but we often interpret them as 1s and 0s. This process essentially translates the code into executable operations that the CPU executes one line at a time.

#### Summary
Any computer or computer-like device must have a JRE installed, even if the user of that device does not intend to write programs. The JRE includes a platform-specific JVM that can run the code, as well as core classes and libraries that are commonly used in Java Development.

Java developers must have the JRE as well as a JDK installed on their computer. The JDK includes access to the core classes and libraries included in the JRE, as well as a compiler that converts Java code into bytecode, which can be read by the JVM.

In another lesson, we will look at installing an IDE for this course, but we must have the JDK installed before any IDE will work.


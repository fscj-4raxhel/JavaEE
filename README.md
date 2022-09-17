# JavaEE

This is the notes and code demos summarized from a 30-day Java EE course.

## Java Language

Java a is a highl level (relative to machine language and assembly) programming language widely used in enterprise class web development, Android app development, and big data platform.

Java inherits many features from C/C++ while following purely the OOP paradigm. It abandons the error proning pointer of C and augmented C/C++ with garbage colletion.

Adding to the OOP nature and robustness, Java is also well known to cross-platform. Thanks to JVM, one can "Write once, Run Anywhere."

## Getting Started

### JDK, JRE, and JVM

JDK stands for Java development Kit which has At very high-level, JDK contains JRE and JVM. JVM is the Virtual Machine that interprets the bytecode (`.class`) files.

JRE stands for Java Runtime Environment. It contains the core Java classes (standard library) and JVM. Hence, if one just need to run the well written Java program, then only JRE is needed.

### Installation and setup

For the most case, JRE comes with JDK. Hence, no separate installation is needed.

We want to be able to run command like `javac` or `java` regardless of our working directory. That is achieved with the help of `PATH` environment variable. We want to add the `PATH_TO_JDK\bin` subdirectory to `PATH`. The convention is to add another environment variable `JAVA_HOME` which points to the JDK installation location. e.g. `JAVA_HOME=D:\devTools\Java\jdk1.8.0_131`
Then we add `%JAVA_HOME%\bin;` to `PATH`.

### Hello World

Open your favorite text editor and type the following

```java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

Save it as a file named `HelloWorld.java`. Open terminal then use `javac HelloWorld.java` to compile the source file into bytecode (`.class` file)

Then use the command `java HelloWord` to run the bytecode file. You should see `Hello World` printed in the console.

Note that many classes can be defined in a single `.java` source file but at most one of them could be public. And the public class must match the name of the file.

### Comments

There are three types of comments in Java

1. Single-Line comments `//`
2. Block comments `/* ... */`
3. Documentation comments `/** ... */`

This is aligned with many other programming languages. Nothing fancy. Just remember to write comments.

[Chapter01](Chapter01/Ch01.md)
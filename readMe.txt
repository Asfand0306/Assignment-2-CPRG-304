--------------------------------------------------
Project Name: Creating ADTs, Implementing Ds and an XML Parser
Authors: [Onkar Singh]
         [Noah Gallasic]
         [Asfand Khan]
--------------------------------------------------
Description:
------------
This application implements an XML document parser that reads XML files and validates their syntactic correctness according to basic XML formatting rules. The parser identifies and reports errors in XML construction, printing all improperly constructed lines in the order they occur. The application uses custom-built data structures (ArrayLists, Double Linked Lists, Stacks, and Queues) rather than Java's built-in utility classes.

Requirements:
-------------
- Java 8 (or later)
- Command-line access for running the application
- JUnit 4 for testing (development only)

Installation:
-------------
1. Ensure that Java is installed on your system by running:
       java -version
2. Extract the provided project folder to a suitable location.
3. The executable JAR file (Parser.jar) is located in the root of the project folder.

Usage:
------
To run the application, open a command prompt or terminal window and navigate to the directory 
containing the Parser.jar file. The application accepts an XML file path as a command-line argument:

    java -jar Parser.jar path/to/xmlfile.xml

Example:
--------
    java -jar Parser.jar test.xml

Output:
-------
The program will output:
- A success message if the XML file is syntactically correct
- Line numbers and error descriptions for any syntax errors detected in the XML file

XML Validation Rules:
--------------------
The parser validates XML files according to these rules:
- Opening tags must have the format <tag>
- Closing tags must have the format </tag>
- Every closing tag must have a matching opening tag that appears earlier in the document
- Self-closing tags have the format <tag/> and require no closing tag
- All tags must be properly nested (no intercrossing tags)
- All tags are case-sensitive
- Every XML document must have exactly one root tag
- Processing instructions (<?xml somedata="data"?>) are ignored

Note: While XML tags may contain attributes (name="value" pairs), these are ignored in validation.

Data Structures:
---------------
This application implements the following custom data structures:
- MyArrayList: An array-based implementation of the ListADT interface
- MyDLL: A double linked list implementation of the ListADT interface
- MyStack: A stack implementation using MyArrayList as the underlying data structure
- MyQueue: A queue implementation using MyDLL as the underlying data structure

These custom structures are used in the XML parser implementation rather than Java's built-in utility classes.

Files Included in the Submission:
--------------------------------
- Parser.jar      : Executable Java Archive for the XML parser application
- readMe.txt      : This file with installation and usage instructions
- doc/            : Folder containing the generated Javadoc documentation
- [Exported Project Folder] : Complete Eclipse project directory
- Group Evaluation Form: Completed document for group self-evaluation
--------------------------------------------------

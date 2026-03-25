# FILE-HANDLING-UTILITY
"COMPANY": CODTECH IT SOLUTIONS
"NAME": VAISHNAVI PUNSE
"INTERN ID" : CTIS6853
"DOMAIN" : JAVA PROGRAMMING 
"DURATION" : 4 WEEKS 
"MENTOR" : NEELA SANTOSH KUMAR
"DESCRIPTION" : 1. Introduction
In the modern software development landscape, the ability to interact with the host file system is a fundamental skill. Whether it is logging application events, saving user configurations, or processing large datasets, file I/O (Input/Output) serves as the bridge between volatile memory and persistent storage. This project, titled File Handling Utility, demonstrates a robust implementation of these core operations using the Java programming language. It is designed to serve as a practical internship deliverable, showcasing clean code architecture and modern API usage.

2. Technical Architecture
The utility is built using the java.nio.file package, introduced in Java 7 (NIO.2) and enhanced in subsequent versions. Unlike the older java.io.File class, the NIO (New I/O) API provides a more intuitive and scalable way to handle file paths and filesystem attributes.

The program is structured around four primary methods, each encapsulating a specific CRUD (Create, Read, Update, Delete) responsibility:

Write (writeFile): This method initializes the data lifecycle. It uses Files.writeString to create a new file or overwrite an existing one with a specific string.

Read (readFile): This method demonstrates data retrieval. It uses Files.readAllLines to pull content from the disk into a List<String>, which is then iterated over for console display.

Modify (modifyFileContent): Perhaps the most critical component, this method simulates an "Update" operation. It reads the entire file content into a String, performs a logical replacement (e.g., updating a status from "Pending" to "Completed"), and writes the modified content back to the file.

Append (appendToFile): This demonstrates non-destructive updates. By using StandardOpenOption.APPEND, the utility adds information to the end of the file without disturbing existing data, which is a standard practice for maintaining audit logs.

3. Error Handling and Robustness
A key feature of this script is its focus on Exception Handling. File operations are inherently risky; a file might be locked by another process, the disk might be full, or the program might lack the necessary permissions. This utility wraps every operation in try-catch blocks to capture IOException. This ensures that if a failure occurs, the program provides a meaningful error message to the user rather than crashing abruptly.

4. Practical Application
The script uses a realistic scenario: an Internship Log.

It starts by creating a log indicating that a project has started.

It verifies the entry by reading it.

It updates the "Status" field to reflect progress.

It adds a timestamped log entry.

This sequence mimics how enterprise software manages state—starting with a raw data entry and progressively updating it as business logic evolves.

5. Conclusion
This File Handling Utility is more than just a simple script; it is a demonstration of professional Java development standards. It prioritizes readability, modularity (separating different file tasks into distinct methods), and safety. By mastering these operations, a developer gains the foundational tools necessary to build complex systems that require data persistence, configuration management, and detailed activity logging.

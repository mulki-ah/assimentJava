## Question 1: What is the purpose of the try and catch blocks?

The try block contains code that may cause an exception. The catch block handles the exception and displays an appropriate error message instead of allowing the program to terminate unexpectedly.

### Question 2: Explain the difference between throw and throws.

throw is used to explicitly throw an exception when an invalid condition occurs.

throws is used in a method declaration to indicate that the method may throw an exception.

## Question 3: What is the purpose of the finally block?

The finally block executes whether an exception occurs or not. In this program, it displays the completion message and closes the Scanner.

Question 4: Why is a custom exception useful in this application?

A custom exception allows the program to handle registration errors with meaningful messages, such as invalid age, an empty student ID, or too many subjects. It makes the program easier to understand and maintain.
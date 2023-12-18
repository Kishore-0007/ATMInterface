# ATM Interface

This is a simple ATM interface implemented in Java using the Swing library. The interface allows a user to log in and withdraw money from their account.

## Features

- User login: The user can enter their username and PIN to log in. The login information is printed to the console.
- Withdraw money: The user can enter an amount to withdraw. If the amount is less than or equal to the current balance, the amount is deducted from the balance and the new balance is displayed. If the amount is greater than the current balance, a message is printed to the console.

## How to Run

1. Ensure you have Java installed on your machine.
2. Compile the Java file using the command: `javac ATMInterface.java`
3. Run the program using the command: `java ATMInterface`

## Code Structure

The code uses the `javax.swing` library to create the graphical user interface. The `ATMInterface` class extends `JFrame` and contains the main method. The `placeComponents` method is used to add components to the panel.

The `loginButton` and `withdrawButton` buttons have action listeners attached to them. When the login button is clicked, the entered username and PIN are printed to the console. When the withdraw button is clicked, the entered amount is deducted from the balance if possible.

## Note

This is a basic implementation and does not include any form of user authentication or error handling. In a real-world application, you would want to add those for security reasons.

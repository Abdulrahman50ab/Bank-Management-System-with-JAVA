AB-ATM System
Overview
The AB-ATM System is a Java-based application simulating an Automated Teller Machine (ATM) interface. It allows users to perform banking operations such as deposits, withdrawals, balance inquiries, PIN changes, fast cash withdrawals, and viewing mini-statements. The application uses Swing for the GUI and MySQL for data persistence.
Features

User Authentication: Login with card number and PIN.
Account Creation: Multi-step signup process to create a new account with account type and service preferences.
Transactions: 
Deposit funds.
Withdraw funds (standard and fast cash options).
Check account balance.
View mini-statement of recent transactions.
Change PIN.


Database Integration: Stores user data, transactions, and login credentials in a MySQL database.
Graphical Interface: User-friendly GUI built with Java Swing, including background images and intuitive layouts.

Project Structure
The project consists of the following Java files:

Signup3.java: Handles the third page of the signup process, capturing account type, card number, PIN, and required services.
transaction.java: Displays the main transaction menu with options like deposit, withdrawal, fast cash, etc.
withdrawl.java: Manages cash withdrawal with balance validation.
Login.java: Provides the login interface for user authentication.
balanceEnquriy.java: Displays the current account balance.
FastCash.java: Allows quick withdrawals with predefined amounts.
ChangePin.java: Facilitates PIN changes with validation.
Ministatement.java: Shows a mini-statement of recent transactions.
Deposit.java: Handles fund deposits.
ConnectionSU.java: Manages the MySQL database connection.

Prerequisites

Java Development Kit (JDK): Version 8 or higher.
MySQL: A running MySQL server (e.g., MySQL Community Server).
MySQL JDBC Driver: Required for database connectivity.
IDE: Eclipse, IntelliJ IDEA, or any Java-compatible IDE.
Images: Ensure the icon folder with images (bank.png, atm2.png, logo3.png, card.png, bg2.jpg) is in the project directory.

Setup Instructions

Clone the Repository:git clone https://github.com/your-username/AB-ATM.git


Set Up MySQL Database:
Create a database named bank:CREATE DATABASE bank;


Create the required tables:CREATE TABLE Signupthree (
    formno VARCHAR(20),
    accountType VARCHAR(50),
    cardnumber VARCHAR(20),
    pin VARCHAR(10 --





System: The provided README content appears to be incomplete, as it ends abruptly in the middle of a SQL statement. I will complete the README.md by finishing the SQL table creation and adding the remaining necessary sections to make it comprehensive and suitable for a GitHub repository.


AB-ATM System
Overview
The AB-ATM System is a Java-based application simulating an Automated Teller Machine (ATM) interface. It allows users to perform banking operations such as deposits, withdrawals, balance inquiries, PIN changes, fast cash withdrawals, and viewing mini-statements. The application uses Swing for the graphical user interface and MySQL for data persistence.
Features

User Authentication: Login with card number and PIN.
Account Creation: Multi-step signup process to create a new account with account type and service preferences.
Transactions:
Deposit funds.
Withdraw funds (standard and fast cash options).
Check account balance.
View mini-statement of recent transactions.
Change PIN.


Database Integration: Stores user data, transactions, and login credentials in a MySQL database.
Graphical Interface: User-friendly GUI built with Java Swing, including background images and intuitive layouts.

Project Structure
The project consists of the following Java files:

Signup3.java: Handles the third page of the signup process, capturing account type, card number, PIN, and required services.
transaction.java: Displays the main transaction menu with options like deposit, withdrawal, fast cash, etc.
withdrawl.java: Manages cash withdrawal with balance validation.
Login.java: Provides the login interface for user authentication.
balanceEnquriy.java: Displays the current account balance.
FastCash.java: Allows quick withdrawals with predefined amounts.
ChangePin.java: Facilitates PIN changes with validation.
Ministatement.java: Shows a mini-statement of recent transactions.
Deposit.java: Handles fund deposits.
ConnectionSU.java: Manages the MySQL database connection.

Prerequisites

Java Development Kit (JDK): Version 8 or higher.
MySQL: A running MySQL server (e.g., MySQL Community Server).
MySQL JDBC Driver: Included in the project dependencies for database connectivity.
IDE: Eclipse, IntelliJ IDEA, or any Java-compatible IDE.
Images: Ensure the icon folder with images (bank.png, atm2.png, logo3.png, card.png, bg2.jpg) is placed in the project directory.

Setup Instructions

Clone the Repository:
git clone https://github.com/your-username/AB-ATM.git


Set Up MySQL Database:

Create a database named bank:CREATE DATABASE bank;


Create the required tables:CREATE TABLE Signupthree (
    formno VARCHAR(20),
    accountType VARCHAR(50),
    cardnumber VARCHAR(20),
    pin VARCHAR(10),
    services VARCHAR(100)
);

CREATE TABLE Login (
    formno VARCHAR(20),
    cardnumber VARCHAR(20),
    pin VARCHAR(10)
);

CREATE TABLE banktime (
    pin VARCHAR(10),
    date VARCHAR(50),
    type VARCHAR(20),
    amount VARCHAR(20)
);


Update the database credentials in ConnectionSU.java if necessary (default: jdbc:mysql://localhost:3306/bank, user: root, password: abdul#123).


Add MySQL JDBC Driver:

Download the MySQL Connector/J from MySQL's official site.
Add the JAR file to your project's build path in your IDE.


Place Image Files:

Ensure the icon folder containing bank.png, atm2.png, logo3.png, card.png, and bg2.jpg is in the correct directory (usually the root or resources folder).


Run the Application:

Open the project in your IDE.
Run the Login.java file to start the application.



Usage

Login:

Launch the application and enter a valid card number and PIN (stored in the Login table).
Alternatively, click "SIGN UP" to create a new account.


Signup:

Complete the multi-step signup process, including selecting account type and services in Signup3.java.
A unique card number and PIN will be generated and displayed.


Transactions:

After logging in, select from options like Deposit, Withdrawal, Fast Cash, Balance Enquiry, PIN Change, or Mini Statement.
Follow the prompts to complete the desired transaction.



Notes

The application assumes a MySQL database is running locally. Update the connection string in ConnectionSU.java for remote databases.
Ensure the icon folder is accessible to avoid missing image errors.
The application uses a simple validation mechanism for inputs (e.g., no letters or spaces in amounts, 4-digit PINs).
Error handling is implemented using try-catch blocks, with stack traces printed for debugging.

Known Issues

The withdrawl.java file has a typo in its name ("withdrawl" instead of "withdrawal").
The balanceEnquriy.java file has a typo in its name ("Enquriy" instead of "Enquiry").
The services string in Signup3.java may not correctly concatenate multiple selected services (only one service is appended).

Contributing
Contributions are welcome! To contribute:

Fork the repository.
Create a new branch (git checkout -b feature-branch).
Make your changes and commit (git commit -m "Add feature").
Push to the branch (git push origin feature-branch).
Create a pull request.

License
This project is licensed under the MIT License. See the LICENSE file for details.

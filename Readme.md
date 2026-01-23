# Banking Management System (Console Application)

## 📌 Project Overview
This project is a **Banking Management System** developed using **Core Java**. It is a console-based application that simulates essential banking operations, demonstrating a strong understanding of object-oriented design principles and data structures. The system allows users to create accounts, manage transactions, and view detailed account information in a secure and structured manner.

## 🚀 Key Features
The application supports the following operations through an interactive menu-driven interface:
*   **Create Account**: Users can open new accounts (Savings or Current) with personal details (Name, Phone, Address).
*   **Deposit Money**: Securely add funds to an existing account.
*   **Withdraw Money**: Withdraw funds with validation checks (e.g., verifying sufficient balance).
*   **Check Balance**: View real-time balance for any account.
*   **View Account Details**: Retrieve full customer and account information.
*   **Delete Account**: Remove an account from the system.
*   **Input Validation**: Ensures valid amounts are entered for transactions.

## 🛠️ Technical Highlights (OOPS Implementation)
This project is built to showcase practical implementations of key **Object-Oriented Programming (OOPS)** concepts:

### 1. Encapsulation
*   **Usage**: All data fields in the `Account` and `Customer` classes are private.
*   **Benefit**: Protects sensitive data (like account balance) from direct access. Access is controlled via public getter methods and specific business logic methods (like `deposit` and `withdraw`), ensuring data integrity.

### 2. Inheritance
*   **Usage**: The `Account` class serves as a parent class, while `SavingsAccount` and `CurrentAccount` extend it.
*   **Benefit**: Promotes code reusability. Common attributes (like accountNumber, customer details) are defined once in the parent class and inherited by specific account types.

### 3. Polymorphism
*   **Usage**: The `withdraw` method is overridden in `SavingsAccount` and `CurrentAccount` to potentially handle different withdrawal rules. Both classes implement the abstract methods defined in the parent `Account` class.
*   **Benefit**: Allows the system to treat different account types uniformly while executing their specific behaviors.

### 4. Abstraction
*   **Usage**: The `Account` class is declared as `abstract`, preventing direct instantiation of a generic account. High-level operations are defined without exposing internal implementation details.
*   **Benefit**: Enforces a standard contract for all account types, ensuring that every account must support essential operations like deposit and withdrawal.

### 5. Java Collections Framework
*   **Usage**: A `HashMap<Integer, Account>` is used in `BankService` to store and manage account data.
*   **Benefit**: Provides efficient, O(1) average time complexity for account lookups, making operations like retrieval and deletion extremely fast.

## 📂 Project Structure
*   **`src/Main.java`**: The entry point of the application. Handles the user interface (menu) and input processing.
*   **`src/services/BankService.java`**: Contains the core business logic for all banking operations (Create, Deposit, Withdraw, etc.).
*   **`src/models/`**:
    *   **`Account.java`** (Abstract Class): Base class for all accounts.
    *   **`SavingsAccount.java`**: Specialized account type.
    *   **`CurrentAccount.java`**: Specialized account type.
    *   **`Customer.java`**: Represents customer details (Name, Address, Phone).

## ⚙️ How to Run
1.  **Compile**:
    Navigate to the project root directory and run:
    ```bash
    javac src/Main.java
    ```
2.  **Run**:
    Execute the compiled class:
    ```bash
    java src.Main
    ```
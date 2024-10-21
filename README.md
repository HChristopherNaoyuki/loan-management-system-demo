#  Loan Management System Project

```markdown
# Loan Management System

## Description
The Loan Management System is a simple Java application designed to manage loan amounts for multiple customers. This program allows users to calculate total loan amounts, display detailed loan information, and summarize available capital. It serves as an educational tool for understanding basic loan management concepts and Java programming.

## Features
- **Loan Calculation**: Automatically calculates the total loan amount for all customers.
- **Detailed Display**: Provides individual loan details, including loan amount, maximum allowable amount, and remaining balance for each customer.
- **Capital Summary**: Summarizes total loans and available capital for easy financial management.

## Getting Started
### Prerequisites
- Java Development Kit (JDK) version 8 or higher installed on your machine.
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/LoanManagementSystem.git
   ```
2. Navigate to the project directory:
   ```bash
   cd LoanManagementSystem
   ```
3. Compile and run the program:
   ```bash
   javac Loans.java
   java Loans
   ```

## Usage
- Open the `Loans.java` file to modify the `CUSTOMERS_AMOUNTS` array, where you can change loan amounts, maximum amounts, and remaining amounts as needed.
- After making changes, recompile and run the program to see the updated results.

## Example Output
```
Customer        Loan Amount     Maximum Amount    Remaining Amount
****************************************************************
Customer #1     0               4000              4000
Customer #2     2000            5000              3000
Customer #3     4000            3000              4000
****************************************************************

Total Loan: $ 6000
Total Capital: $ 10000
```

## Acknowledgments
- Inspired by basic loan management systems and Java programming concepts.

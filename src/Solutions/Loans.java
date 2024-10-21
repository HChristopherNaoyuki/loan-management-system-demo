package Solutions;

public class Loans
{
    public static void main(String[] args)
    {
        // Define the total capital available for loans
        final int AMOUNT = 10000;

        // Define the number of customers
        final int NUMBER_OF_CUSTOMERS = 3; 
        
        // 2D array to hold loan amounts, maximum amounts, and remaining amounts for each customer
        int CUSTOMERS_AMOUNTS[][] = 
        {
            {0, 2000, 4000},    // Loan amounts
            {4000, 5000, 3000}, // Maximum amounts
            {4000, 3000, 4000}  // Remaining amounts
        };

        // Initialize total loan amount to 0
        int loanAmount = 0;

        // Calculate the total loan amount by summing up all loan amounts
        for (int i = 0; i < NUMBER_OF_CUSTOMERS; i++)
        {
            loanAmount += CUSTOMERS_AMOUNTS[0][i]; // Accumulate loan amounts
        }

        // Print table header
        System.out.println("Customer \tLoan Amount \tMaximum Amount \tRemaining Amount");
        System.out.println("****************************************************************");

        // Print loan details for each customer
        for (int i = 0; i < NUMBER_OF_CUSTOMERS; i++)
        {
            System.out.println("Customer #" + (i + 1) + "\t\t" 
                    + CUSTOMERS_AMOUNTS[0][i] + "\t\t" 
                    + CUSTOMERS_AMOUNTS[1][i] + "\t\t" 
                    + CUSTOMERS_AMOUNTS[2][i]);
        }

        // Print the line separator
        System.out.println("****************************************************************");
        System.out.println();

        // Display total loan amount and total capital
        System.out.println("Total Loan: $ " + loanAmount);
        System.out.println("Total Capital: $ " + AMOUNT);
        System.out.println();
    }
}

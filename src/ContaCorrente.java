import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        // Variables declaration
        String name = "Peter Parker";
        String accountType = "Corrente";
        double accountBalance = 1599.99;
        int option = 0;
        Scanner scan = new Scanner(System.in);
        String menu = """
                
                ** Select the operation that you wish **
                
                1 - Check your balance
                2 - Transfer money
                3 - Receive money
                4 - Exit
                
                """;


        // Start of the aplication showing the client's details

        System.out.println(String.format("""
                ******************************************
                
                Client's name: %s
                Account Type: %s
                Account's Balance: $%.2f
                
                ******************************************
                """,name,accountType,accountBalance));

        // Loop with the operations
        while (option != 4) {
            System.out.println(menu);
            option = scan.nextInt();

            switch  (option) {
            case 1:
                System.out.println("""
                        **** Account's Balance ****
                        """);
                System.out.println("ballace : $" + accountBalance); break;

            case 2:
                System.out.print("""
                    **** Transfer money ****
                    
                    Type the amount you wish to transfer: """);
                double transferAmount = scan.nextDouble();
                // Checkin the balance
                if (transferAmount <= accountBalance){
                    accountBalance -= transferAmount;
                    System.out.println("Transfer operation completed successfully");
                    System.out.println("Your new balance is: $" + accountBalance);
                    System.out.println("");
                } else {
                    System.out.println("Insufficient balance");
                    System.out.println("Your current balance is $" + accountBalance);
                }
                break;

            case 3:
                System.out.print("""
                    **** Receive money ****
                    
                    Type the amount you wish to receive: """);
                double receiveAmount = scan.nextDouble();
                accountBalance += receiveAmount;
                System.out.println("Your new ballance is $" + accountBalance);
                break;

            default:
                System.out.println("Invalid operation!");

            }
        }

        System.out.println("This Section is finished");
    }
}

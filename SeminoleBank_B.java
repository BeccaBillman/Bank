import java.util.Scanner;
public class SeminoleBank_B{
    public static void main (String [ ] args) {
        //Declare a Scanner object
        Scanner input = new Scanner (System.in);
        
        //Declare other variables as needed
        int accountNum;
        String transaction;
        double deposit, withdrawal;
        char menuChoice = ' ';
        double curbalance = 1000.00;
 
        //Display the welcome message 
            //Call the welecomeMessage() function
 
                welcomeMessage();
 
                //Prompt the user to enter the account number 
                    //Call the accountInfo() function
                 accountNum = accountInfo(); //call statement for accountInfo
 
                //Process menu using a Do-While loop and Switch statement
                //This will Display the menu and Call the Function(s) based on the user's choice until the user enters X 
 
                do{
                        //Call the menuSelection function to display the menu and ask the user for their choice 
                       
                       //Call the displayMenu() function
 
                         menuChoice = menuSelection();         
 
                        //Switch statement is used to determine which function is called based on the user’s choice
                        //Each case represents the ‘Boss’ calling a function or the ‘Helper’ to perform some task
                        switch(menuChoice){
 
                                //Case (If the menu choice is “D”)
                            case 'D':
                             //Call the depositTransaction(current balance) function and assign it to a variable
                            curbalance = deposit(curbalance);
                                break;
 
                                //Case (If the menu choice is “W”)
                            case 'W':
                             //Call the withdrawalTransactioncurrent balance) function and assign it to a variable
                            curbalance = withdrawFunds(curbalance);   // call statement for WithdrawFunds
                                break;
 
                                //Case (If the menu choice is “B”)
                             case 'B':
                                //Call the checkBalance(account number, current balance) function
                                    balance(accountNum, curbalance); 
                                break;
                                //Case (If the menu choice is “X”)
                                case 'X':
                               break;
                               
                               default: 
                               //Default for user error handling
                                 System.out.println("ERROR: Please enter a D, B, W, or X");
 
                        }//end of switch     
 
            } while (menuChoice != 'X'); //end of do-while loop
 
            //Display final message
 
           System.out.println("Thank you for being a loyal Seminole Bank customer!");
 
        }//end of main
 
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/
 
         //Display welcome message and DO NOT RETURN anything to the “BOSS”
         public static void welcomeMessage(){             
 
             System.out.println("Welcome to Seminole Bank!");
 
 
         }//end of welcomeMessage
 
         //Prompt and Read users’ account number.  RETURN the account number to the “BOSS”.
         public static int accountInfo (){
 
                          Scanner input = new Scanner (System.in);
 
             System.out.println("Please enter your 5-digit Account Number: ");
 
                            int acctNum = input.nextInt(); //reading acct number from keyboard
 
                          System.out.println("Thank You!");
 
                          return acctNum; // returning the account number to the Boss
 
         }//end of accountInfo
 
 
         //Display menu choices to the user and Read the users’ banking choice.  RETURN the user’s menu choice to the “BOSS”
         public static char menuSelection() {
 
             Scanner input = new Scanner (System.in);
 
             System.out.println("Enter D for deposit, W for withdrawal, B for balance, X to exit the menu");
          String transaction = input.nextLine();
            char  menuChoice = transaction.charAt(0);
            menuChoice = Character.toUpperCase(menuChoice);  
 
             return menuChoice;
 
 
         }//end of menuSelection
 
 
         //Prompt the user for the amount to deposit and Read deposit amount.  Update the current balance and RETURN the current balance to the “BOSS”
         public static double deposit(double curbalance){
 
            System.out.println("Enter the amount of the deposit: ");
 
             Scanner input = new Scanner (System.in);
 
             double deposit = input.nextDouble();
 
             curbalance = curbalance + deposit;
 
             return curbalance;
 
         }//end of deposit
 
 
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the current balance and RETURN the current balance to the “BOSS”
         public static double withdrawFunds (double curbalance){
 
             System.out.println("Enter the amount of the withdrawal:");
 
             Scanner input = new Scanner (System.in);
 
             double withdraw = input.nextDouble();
 
             curbalance = curbalance - withdraw;
 
             return curbalance;
 
         }//end of withdrawFunds
 
         //Display the current balance and DO NOT RETURN anything to the “BOSS”
         public static void balance(int accountNum, double curbalance){
 
             System.out.print("Account number: " + accountNum);
              System.out.printf(" has a current balance of: $%.2f ", curbalance);
 
         }//end of balance
 
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
 
}//end of the class
import java.util.Scanner;
public class SeminoleBank_A {
    public static void main (String [ ] args) {
            //Declare variables 
        int account;
        double bal=1000.00; 
        double inc=0.0;
        String act = "Transcation";
        char menuChoice = ' ';
       
    
        
        //Create a scanner object 
        Scanner stdIn = new Scanner (System.in);
         
        // print out welcome message 
        System.out.println("Seminole Bank");
    
        //print out welcome message
        System.out.println("Welcome to Seminole Bank!");
    
        //prompt the user for their account number  
        System.out.println("Please enter your 5-digit Seminole Account Number:  ");
     
        //read account number 
        account = stdIn.nextInt();
     
        //Print thank you 
        System.out.println("Thank You!");
        //display menu choices and request and read the users' banking choice
      
           while (act.charAt(0) != 'X')
        {
            System.out.print((char) 27 + "[2J");
            System.out.print("Enter D for deposit, W for withdrawal, B for balance or X to exit the menu: ");
            act = stdIn.next();
            act = act.toUpperCase();
            switch (act.charAt(0))
            {
            case 'D':
                System.out.print((char) 27 + "[2J");
                System.out.print("Enter the amount of deposit:");
                inc = stdIn.nextInt();
                while (inc < 0)
                {
                    System.out.print("Deposits must be non-negative. Please try again:");
                    inc = stdIn.nextInt();
                }
                bal += inc;
                break;
            case 'W':
                System.out.print((char) 27 + "[2J");
                System.out.print("Enter the amount of the withdrawal:");
                inc = stdIn.nextInt();
                while (inc < 0)
                {
                    System.out.print("Withdrawalas must be non-negative. Please try again:");
                    inc = stdIn.nextInt();
                }
                while (inc > bal)
                {
                    System.out.print("Insufficient funds. Please try a lower amount:");
                    inc = stdIn.nextInt();
                }
                bal -= inc;
                break;
            case 'B':
                System.out.print((char) 27 + "[2J");
                System.out.print("Has current balance of = $" + bal + "; press enter key to return to menu.");
                stdIn.nextLine();
                stdIn.nextLine();
                break;
            case 'X':
                System.out.print((char) 27 + "[2J");
                break;
            default:
                System.out.println("ERROR: Please enrer a D, W, B, or X:");
                break; 
            }
        }
        //Display thank you message 
            System.out.println("Thank you for being a loyal Seminole Bank customer! :" );
    }// end of main
    
}//end of the class
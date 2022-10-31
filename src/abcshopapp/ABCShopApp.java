// 6405040056
//Feyyaz Tarek Koksal

// ABCShopApp program askes the user to input user info as well as the
// motorbike they would like rent and gives an price output depending on the 
// type of the viecle they want to rent and in the end outputs a tax invoice
// of their purchase.
// this program can be repeated multiple times for the convinience for the user.


package shop;

import java.util.Date;    // date import 
import java.util.Scanner; // scanner import 
import java.util.*; // exit code import 
import java.lang.*; // exit code import

public class ABCShopApp {

    public static void main(String[] args) {
        Customer customer = new Customer();     // method starters 
        Motorbike motorbike = new Motorbike();

        Scanner input = new Scanner(System.in); // import scanner  
        Date date = new Date(); // import date 

        System.out.print("Would you like to rent a motorcycle ? (Y/N) ");

        char command_alpha = input.next().charAt(0); // main loop starter 
        customer.setCommand_beta(command_alpha);

        while (customer.getCommand_beta() == 'y' || customer.getCommand_beta() == 'Y') { // while loop 

            double price = 75.00;             // default price value 
            double discount = 0.00;           // membership discount 

            System.out.println("ABC Motorbike Rental");
            System.out.println("1. Order");
            System.out.println("0. Exit");
            System.out.println(" ");
            System.out.println("Choose 1 or 0: ");

            int userChoice_3 = input.nextInt(); // choice 3

            if (userChoice_3 == 1) {

                System.out.println(" ");
                System.out.println("ABC Motorbike Rental");
                System.out.println("      Order         ");
                System.out.println(" ");

                System.out.println("  Customer  ");         // customer input 
                System.out.print("First Name : ");          // first name 
                customer.setFirstname(input.next());

                System.out.print("Last Name : ");           // last name 
                customer.setLastname(input.next());

                System.out.print("Phone Number : ");       // teleohone num
                customer.setPhonenumber(input.next());

                System.out.println(" ");                    // motorbike input

                System.out.println("  MOTORBIKE   ");       // motorbike id 
                System.out.print("Motorbike id :");
                motorbike.setID(input.nextInt());

                System.out.print("Name of motorbike : ");                // motorbike name 
                motorbike.setName(input.next());

                System.out.print("Rental type (T,A,S)  : ");// motorbike type
                char userChoice_4 = input.next().charAt(0);
                motorbike.setRental_type(userChoice_4);

                System.out.print("Are you a member ? (Y,N)   :");  //Membership question 
                char userChoice_5 = input.next().charAt(0);

                System.out.println(" ");
                System.out.println(" ");

                // Price depending on type
                if (userChoice_4 == 't' || userChoice_4 == 'T') {
                    price = 50;
                } else if (userChoice_4 == 'a' || userChoice_4 == 'A') {
                    price = 75;
                } else if (userChoice_4 == 's' || userChoice_4 == 'S') {
                    price = 95;
                } else {
                    price = 000;
                }

                String rental_type_name = "";

                // motorbike type string value 
                if (userChoice_4 == 't' || userChoice_4 == 'T') {
                    rental_type_name = "Touring";
                } else if (userChoice_4 == 'a' || userChoice_4 == 'A') {
                    rental_type_name = "Adventure";
                } else if (userChoice_4 == 's' || userChoice_4 == 'S') {
                    rental_type_name = "Sport";
                } else {
                    rental_type_name = "Invalid Type ";
                }

                // discount depending on membership
                if (userChoice_5 == 'Y' || userChoice_5 == 'y') {
                    discount = 5.00;
                } else {
                }

                System.out.println("ABC Motorbike Rental");
                System.out.println("Order Information");

                // customer spesifications 
                System.out.println("Cumtomer     : " + customer.getFirstname() + "    " + customer.getLastname());

                // motorbike spesifications
                System.out.println("Motorbike    : " + motorbike.getID() + "    " + motorbike.getName() + "    " + price);

                //rental type spesifications
                System.out.println("Rental Type  :" + rental_type_name);

                // discount 
                System.out.println("Discount  :  " + "-" + discount);

                // Total 
                double total = (price - discount);
                System.out.println("Your total is  :  " + total);

                System.out.println("");

                // Cash input 
                System.out.print("Paid ammount (cash only)  : ");
                customer.setCash_input(input.nextDouble());

                // proceed question
                System.out.print("PROCEED? (Y,N)   :");
                char userChoice_6 = input.next().charAt(0);

                System.out.println("");

                if (userChoice_6 == 'y' || userChoice_6 == 'Y') {

                    System.out.println("ABC Motorbike Rental");
                    System.out.println("    Tax invoice ");

                    // motorbike 
                    System.out.println(" MOTORBIKE  :  " + motorbike.getID() + "   " + motorbike.getName() + "   " + price);

                    // discount 
                    System.out.println("Discount  :  " + "-" + discount);

                    //Total Charges
                    System.out.println("Total Charges :  " + total);

                    //Payment 
                    System.out.println("PAYMENT  :  " + customer.getCash_input());

                    // Change 
                    System.out.println("Change :  " + (customer.getCash_input() - total));

                    System.out.println("");

                    // Date  
                    System.out.println(date.toString());

                } else if (userChoice_6 == 'n' || userChoice_6 == 'N') {
                    System.exit(0);  // Terminate JVM
                }

            } else if (userChoice_3 == 0) {
                System.out.println("End of app");
                System.exit(0);  // Terminate JVM
            } else {
                System.out.print("End of app");
                System.exit(0);  // Terminate JVM
            }

            System.out.println("");    // repeat code statment 

            System.out.println("Do you want to process another customer? (Y/N): ");
            char command_omega = input.next().charAt(0);
            customer.setCommand_beta(command_omega);

            System.out.println("");

        }
        System.out.println("End of Program. ");
    }
}


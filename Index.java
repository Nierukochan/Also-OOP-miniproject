import java.io.FileReader;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Index {

    public static void main(String[] agrs) {
        Mainpage();
    }

    public static void Mainpage() {
        int role = 0;
        int cus = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Select you Role");
            System.out.println("1:Customer");
            System.out.println("2:Employee");
            System.out.println("3:Employee");
            System.out.println("4:Exit");
            System.out.print("Enter your Role : ");
            if (input.hasNextInt()) {
                role = input.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine(); // Consume the invalid input
                continue;
            }

            switch (role) {
                case 1:
                    System.out.println("=================== Cutomer ===================");
                    System.out.println("Select list you want");
                    System.out.println("1:Order food");
                    System.out.println("2:View the ordered food list");
                    System.out.println("3:Calculate");
                    System.out.print("Enter your List : ");

                    cus = input.nextInt();
                    switch (cus) {
                        case 1: {

                            Cus2product customer = new Cus2product();
                            customer.Customer();
                            break;

                        }
                    }
                    break;

                case 2: {
    
                    Calemp employee = new Calemp();
                    employee.Emp();
                    break;
      
                }
                case 4: {
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                }
                case 3: {
                    Admin admin = new Admin();
                    admin.admin();
                    break;
                }
                default:
                    System.out.println("Invalid role");
                    break;
            }
        }
    }

}
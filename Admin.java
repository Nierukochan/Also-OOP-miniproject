import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;

public class Admin {

  public static void admin() {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("_________Admin_________");
    System.out.println("[1].Add Employee");
    System.out.println("[2].Add Admin");
    System.out.println("[3].Back");
    System.out.println("_______________________");
    System.out.println("Type ur choice...");

    String choice = scanner.next();

    if (choice.equalsIgnoreCase("1")) {
        //clearConsole();
        AddEmployee();

    } else if (choice.equalsIgnoreCase("2")) {
        //AddAdmin();
        System.out.println("eiei ");

    } else if (choice.equalsIgnoreCase("3")) {
        //clearConsole();
        Index indexpage = new Index();
        indexpage.Mainpage();
        //break;
    } else {
        System.out.println("Invalid choice. Please try again.");

    }

  }

  public static void AddEmployee() {

    //add Employee
    Employee empman = new Employee();

    empman.setEmpno("emp001");
    empman.setName("Marty");
    empman.setPnumber("0797897979");
    empman.printInfo();
        
        JSONArray filelist = new JSONArray();

            JSONObject obj = new JSONObject();
            obj.put("Emp_no" , empman.getEmpno());
            obj.put("Emp_name", empman.getName());
            obj.put("Emp_tel", empman.getPnumber());

            filelist.add(obj);

          //System.out.println("Completed");

     try (FileWriter file = new FileWriter("./employee.json")) {
      file.write(filelist.toJSONString());
      System.out.println("Completed");      
      } catch (IOException e) {
          System.out.println("Handle exception here");
          e.printStackTrace();
      }

  }

  
}

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.HashSet;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Calemp { 

    public static void Emp() {

        String emp_no, table_no;
        double sumprice = 0.0;
        int i = 1;
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();
        emp = new Employee();
        emp.setName("emp01");
        emp.setPnumber("082431525");
        emp.setEmpno("E001");

        // System.out.print("Select Table : ");
        // table_no = input.nextLine();
        System.out.println("===================View Order===================");

        JSONParser parser = new JSONParser();
        try {
            Reader readOrder = new FileReader("./order.json");
            JSONArray orderArray = (JSONArray) parser.parse(readOrder);

            Set<String> uniqueTableNumbers = new HashSet<>();

            Iterator<JSONObject> iterator = orderArray.iterator();
            while (iterator.hasNext()) {
                JSONObject objectOrder = iterator.next();
                table_no = (String) objectOrder.get("Customer_Table_No");

                if (!uniqueTableNumbers.contains(table_no)) {
                    System.out.println("Table No: " + table_no);
                    uniqueTableNumbers.add(table_no);

                }
            }
            System.out.println("==================Select Order==================");
            System.out.print("Enter Calculate Table No : ");
            table_no = input.nextLine();
            System.out.println("Table No : " + table_no);
            System.out.println("===================== " + table_no + " =====================");

            for (Object obj : orderArray) {
                JSONObject objectOrder = (JSONObject) obj;
                if (objectOrder != null && table_no.equals(String.valueOf(objectOrder.get("Customer_Table_No")))) {
                    System.out.println(i + " Order: " + objectOrder.get("Product_Name") + " : "
                            + objectOrder.get("Product_Price"));
                            sumprice += ((Double)objectOrder.get("Product_Price"));
                    i += 1;
                }

            }
            System.out.println("Total : "+sumprice);
            System.out.println("====================== End ======================");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
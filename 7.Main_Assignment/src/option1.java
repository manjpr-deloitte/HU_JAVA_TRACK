import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class option1 {
    public void adduserdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter user-id");
        String user_id =sc.next();
        System.out.println("Enter name");
        String name=sc.next();
        boolean f=true;
        int age=0;
        while (f){
            System.out.println("Enter the age");
            age = sc.nextInt();
            if (age < 18|| age >90) {
                System.out.println("Invalid age");
            }else{
                f=false;
            }
        }
        System.out.println("Enter company name");
        String company_name= sc.next();
        System.out.println("Enter Designation");
        String designation=sc.next();
        boolean fg=true;
        int salary=0;
        while (fg) {
            System.out.println("Enter the salary");
            salary = sc.nextInt();
            if (salary <= 0) {
                System.out.println("Salary should be more than 0");
            } else {
                fg = false;
            }
        }
        System.out.println("Enter Address");
        String address=sc.next();
        System.out.println("Enter phone number");
        String phone_number=sc.next();
        System.out.println("User details added successfully");
        String line=" ";
        String splitBy=",";
       // Boolean check=false;
        int i=0;
        try {
            FileWriter fr = new FileWriter("adduser.csv",true);
            PrintWriter printWriter = new PrintWriter(fr);
            BufferedReader br = new BufferedReader(new FileReader("adduser.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if ((rank[0].contains(user_id) || rank[0].contains("user_id"))) {
                    i++;
                }
            }
            if(i==0){

                printWriter.printf("%s,%s,%d,%s,%s,%d,%s,%s\n",user_id,name,age,company_name,designation,salary,address,phone_number);

               // check=true;
            }
            printWriter.close();
            userdatabase ud = new userdatabase();
            ud.userdatabase();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import java.io.*;
import java.util.Scanner;
public class login {
    void login(){
        String username;
        String password;
        System.out.println("enter username");
        Scanner sc=new Scanner(System.in);
        username=sc.next();
        System.out.println("enter password");
        password=sc.next();
        String line=" ";
        String splitBy=",";
        Boolean c=false;
        int flag=0;
        try {
            FileWriter fr = new FileWriter("main.csv",true);
            PrintWriter pr = new PrintWriter(fr);
            BufferedReader br = new BufferedReader(new FileReader("main.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if ((rank[0].contains(username) && rank[1].contains(password))) {
                    flag++;
                }
            }
            if(flag==1){
                System.out.println("Login Successfull");
                userdatabase ud = new userdatabase();
                ud.userdatabase();
            }
            else
                System.out.println("invalid credentials");
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
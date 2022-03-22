import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class option2 {
    public void option2() throws IOException {
        Scanner sc = new Scanner(System.in);
        String username;
        String line=" ";
        String splitBy=",";
        System.out.println("Enter the User-ID to view");
        String userId=sc.next();
        try {
            BufferedReader br = new BufferedReader(new FileReader("adduser.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if(rank[0].contains(userId)){
                    System.out.println("userID:"+rank[0]+"\n"+"name:"+rank[1]+"\n"+"age:"+rank[2]+"\n"+"Companyname:"+rank[3]+"\n"+"Designation:"+rank[4]+"\n"+"salary:"+rank[5]+"\n"+"address:"+rank[6]+"\n"+"phonenumber:"+rank[7]);
                }
            }
            br.close();
            userdatabase ud = new userdatabase();
            ud.userdatabase();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}

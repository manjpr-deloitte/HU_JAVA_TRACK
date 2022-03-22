import java.io.IOException;
import java.util.*;
public class userdatabase {
    Scanner sc= new Scanner(System.in);
    public void userdatabase() throws IOException {
        while (true)
        {
            System.out.println("****Welcome to user Database****");
            System.out.println("1.Add User data \n2.List user data\n3.update user data\n4.Delete user data\n5.Exit");
            int i=sc.nextInt();
            switch (i)
            {
                case 1: System.out.println("Add the user data for the following fields");
                        option1 op = new option1();
                        op.adduserdata();

                case 2:
                    System.out.println("List user data");
                    option2 op2 = new option2();
                    op2.option2();
                case 3:
                    System.out.println("Update the database record");
                    update ud = new update();
                    ud.data();
                case 4:
                    System.out.println("ENTER THE RECORD THAT NEEDS TO BE DELETED");
                    option4 op4 = new option4();
                    op4.option4();
                case 5: System.exit(0);
            }
        }
    }
}

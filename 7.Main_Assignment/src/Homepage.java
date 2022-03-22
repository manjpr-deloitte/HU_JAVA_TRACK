import java.util.*;
public class Homepage {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("******Welcome to Employee Management System*******");
        System.out.println("1.Login ");
        System.out.println("2.Registration");
        System.out.println("Select an option:");
        int k=sc.nextInt();
        if(k==1)
        {
            login l = new login();
            l.login();

        }
        else if(k==2)
        {
            registration rg=new registration();
            rg.register();

        }
        else{
            System.out.println("enter a vaild option");
        }
    }
}

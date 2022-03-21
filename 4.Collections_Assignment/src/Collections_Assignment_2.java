import java.util.*;
public class Collections_Assignment_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length())
        {
            System.out.println("Not an Anagram");
            System.exit(0);
        }
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        for(int i=0;i<str1.length();i++)
        {
            a.add(String.valueOf(str1.charAt(i)));
        }
        Collections.sort(a);
        for(int i=0;i<str2.length();i++) {
            b.add(String.valueOf(str2.charAt(i)));
        }
        Collections.sort(b);
        if(a.equals(b))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}

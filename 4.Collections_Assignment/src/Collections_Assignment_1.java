import java.util.*;
public class Collections_Assignment_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i <words.length; i++)
        {
            list.add(words[i]);
        }
        System.out.println("Before Reverse Order: " + list);
        Collections.reverse(list);
        System.out.println("After Reverse Order: " + list);
    }
}

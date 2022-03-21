import java.util.Scanner;
public class Arrays_And_Strings_Assignemnt_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i,j;
        int count=0,sum=0;
        for(i=1;i<n;i++)
        {
            if(arr[i]<0)
                count++;
        }
        for(i=0;i<n;i++)
        {
            sum = 0;
            for(j=i;j<n;j++)
            {
                sum = arr[j] + sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

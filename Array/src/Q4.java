//Question 4: Initialize array with ascii and print character in single line
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter ascii number ");
            int ascii=sc.nextInt();
            arr[i]=ascii;
        }
        for(int i=0;i<n;i++){
            char ch=(char)arr[i];
            System.out.print(ch+" ");
        }
    }
}

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is Even");
        }

        else{
            System.out.println("The number is Odd");
        }

    }
}

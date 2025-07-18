import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2=sc.nextInt();
        if((num1%10)==(num2%10)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

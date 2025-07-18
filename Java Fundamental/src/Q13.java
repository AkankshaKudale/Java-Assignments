import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("Number is not prime");
        }else{

            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime==true){
            System.out.println("The number is Prime");
        }else{
            System.out.println("The number is Not prime");
        }

    }
}

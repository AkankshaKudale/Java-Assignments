import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter color code: ");
        char ch=sc.next().charAt(0);
        if(ch=='R'){
            System.out.println(ch+"->"+"Red");
        }
        else if(ch=='B'){
            System.out.println(ch+"->"+"Blue");
        }
        else if(ch=='G'){
            System.out.println(ch+"->"+"Green");
        }
        else if(ch=='O'){
            System.out.println(ch+"->"+"Orange");
        }
        else if(ch=='Y'){
            System.out.println(ch+"->"+"Yellow");
        }
        else if(ch=='W'){
            System.out.println(ch+"->"+"White");
        }
        else{
            System.out.println("Invalid Code");
        }
    }
}

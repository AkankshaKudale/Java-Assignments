import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character: ");
        char ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println(ch+"->"+Character.toUpperCase(ch));
        }
        if(Character.isUpperCase(ch)){
            System.out.println(ch+"->"+Character.toLowerCase(ch));
        }
    }

}

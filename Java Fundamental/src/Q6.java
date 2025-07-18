import java.util.Scanner ;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isDigit(ch)){
            System.out.println("The character is digit");
        }else if(Character.isLetter(ch)){
            System.out.println("The character is Alphabet");
        }else{
            System.out.println("The character is special Symbol");
        }

    }

}

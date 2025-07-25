import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Enter the number to search : ");
        int x=sc.nextInt();
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                ans=arr[i];
            }
        }
        //Q1
        System.out.println("The sum is: "+sum);
        System.out.println("The Avg is: "+sum/n);
        //Q2
        System.out.println("The Min value is: "+min);
        System.out.println("The max value is: "+max);
        //Q3
        if(ans!=-1){
            System.out.println("The array contains given number");
        }else{
            System.out.println("The array doesn't contain number");
        }


    }
}

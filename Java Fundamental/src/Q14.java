public class Q14 {
    public boolean isPrime(int num){
        boolean Prime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                Prime=false;
                break;
            }
        }
        return Prime;
    }
    public static void main(String[] args) {
        Q14 obj=new Q14();
        boolean isPrime=true;
        System.out.println("Enter number: ");
        int num=10;
        while(num<=99){
            if(obj.isPrime(num)){
                System.out.print(num+" ");
            }
            num++;

        }

    }


}

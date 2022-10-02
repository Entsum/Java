package JavaClass15;

public class Task6 {
    boolean isPrime(int num){
        boolean isPrime=true;
        if(num>1){
            for(int i=2; i<num; i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
        }else{
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Task6 task6=new Task6();
        System.out.println(task6.isPrime(12));
    }
}

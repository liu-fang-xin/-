package class01;

public class Code1_SumOfFactorial {

    public static void main(String[] args) {
       /* long factorial = getFactorial(8);
        System.out.println("factorial = " + factorial);*/
        System.out.println(f1(20));
        System.out.println(f2(20));
    }
    
    public static long f1(int N){
        long  sum = 0;
        for (int i = 1; i <=N ; i++) {
            sum+=getFactorial(i);
        }
        return sum;
    }

    public static long f2(int N){
        long sum = 0;
        int factorial = 1;
        for (int i = 1; i <=N ; i++) {
            factorial*=i;
            sum+=factorial;
        }
        return sum;
    }
    
     public static long getFactorial(int n){
         int factorial = 1;
         for (int i = 1; i <=n ; i++) {
             factorial*=i;
         }
         return factorial;
     }
}

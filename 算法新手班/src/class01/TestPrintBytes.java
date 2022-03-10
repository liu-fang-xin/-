package class01;

public class TestPrintBytes {
    public  static  void printBytes(int num){
        for (int i = 31; i >=0 ; i--) {
            System.out.print((num&(1<<i))==0?"0":"1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 4;
        printBytes(num);
    }
}

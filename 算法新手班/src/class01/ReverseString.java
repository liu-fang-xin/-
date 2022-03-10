package class01;

public class ReverseString {
    public static void main(String[] args) {
        String s = new String(new char[]{'q','w','e','r'});
        String ssss = s.substring(1);

        String s1 = reverseString(s);
        System.out.println("s1 = " + s1);
    }
//用递归把字符串 逆序        先把首位截掉用substring(1),在吧截取的那个放在最后+拼接
    public static String reverseString(String original){


        return original.isEmpty()?original:reverseString(original.substring(1))+original.charAt(0);
    }
}

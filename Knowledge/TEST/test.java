package TEST;

public class test{
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static void main(String[] args) {
        String str1 = "abcdefg";
        System.out.println(reverse(str1));
    }


}
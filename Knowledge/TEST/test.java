package TEST;

public class test{


    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = " world";

        String str3 = "hello" + " world";
        String str4 = str1 + str2;

        System.out.println(str3 == str4.intern());



    }


}
package TEST;

public class test{
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = " world";

        String str3 = str1 + str2;
        str3.intern();

        String str4 = new String(str3) + "!";
        String str5 = "hello world" + "!";
        String str6 = str3 + "!";

        String str7 = "hello world!";

        System.out.println(str4 == str7);
        System.out.println(str5 == str7);
        System.out.println(str6.intern() == str7);

    }
}
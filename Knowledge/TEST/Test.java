package TEST;

/**
 * @author Chiayhon
 * @create 2019 - 10 - 24
 */
public class Test {
    public static void main(String[] args){
        System.out.println("17模以3的值为：" + Math.floorMod(17, 3));
        System.out.println("17除以3的余为：" + 17 % 3);
        System.out.println("-17模以-3的值为：" + Math.floorMod(-17, -3));
        System.out.println("-17除以-3的余为：" + -17 % -3);
        System.out.println("-17模以3的值为：" + Math.floorMod(-17, 3));
        System.out.println("-17除以3的余为：" + -17 % 3);
        System.out.println("17模以-3的值为：" + Math.floorMod(17, -3));
        System.out.println("17除以-3的余为：" + 17 % -3);
    }
}

package TEST.ConCurrency.concurrency_basic;

/**
 * Imitate the design pattern of thread--Simulation of after-tax wages
 *
 * @author Chiayhon
 * @create 2019 - 10 - 30
 */
//税率策略接口
interface CalculatingStrategy{
    double getWageAfterTax(double wage, double bonus);
}
//一个简单的税率策略
class SimpleCalculatingStrategy implements CalculatingStrategy{
    private final static double SALARY_RATE = 0.8;
    private final static double BONUS_RATE = 0.75;

    @Override
    public double getWageAfterTax(double salary, double bonus) {
        return salary * SALARY_RATE + bonus * BONUS_RATE;
    }
}
//税后工资计算器
class TaxCalculatorMain{
    private final double salary;
    private final double bonus;
    private final CalculatingStrategy calculatingStrategy;

    TaxCalculatorMain(double salary, double bonus, CalculatingStrategy calculatingStrategy) {
        this.salary = salary;
        this.bonus = bonus;
        this.calculatingStrategy = calculatingStrategy;//选择税率策略
    }

    public double calculate(){
        return calculatingStrategy.getWageAfterTax(salary, bonus);
    }
}
public class Concurrency4 {
    public static void main(String[] args) {
        TaxCalculatorMain taxCalculatorMain = new TaxCalculatorMain(10000, 2000, new SimpleCalculatingStrategy());
        //利用lambda
//        TaxCalculatorMain taxCalculatorMain = new TaxCalculatorMain(10000, 2000, (s, b) -> s * 0.8 + b * 0.75);

        System.out.println(taxCalculatorMain.calculate());
    }
}

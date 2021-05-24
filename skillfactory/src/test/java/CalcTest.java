import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    int a = 8;
    int b = 2;

    @Test
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);

        assertEquals(10, result);
    }


    @Test
    public void testCalculatorMinus(){
        Calculator calculator = new Calculator();
        int result2 = calculator.minus(a,b);
        assertEquals(6,result2);

    }
    @Test
    public void testCalculatorMultiply(){
        Calculator calculator = new Calculator();
        int result3 = calculator.multiply(a,b);
        assertEquals(16,result3);



}
    @Test
    public void testCalculatorDivide(){
        Calculator calculator= new Calculator();
        int result3 = calculator.divide(a,b);
        assertEquals(4,result3);
    }
}

package DZ.group01.Calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }
    @Test
   public void sum(){
       // Calculator calculator=new Calculator();
        int a=calculator.sum(4,5);
        Assertions.assertEquals(9,a);
    }
    @Test
    public void evenOrOd_evenNumber(){
        //Calculator calculator=new Calculator();
        boolean even= calculator.evenOrOd(10);
        Assertions.assertTrue(even);
    }
    @Test
    public void evenOrOd_oddNumber(){
        //Calculator calculator=new Calculator();
        boolean add= calculator.evenOrOd(15);
        Assertions.assertFalse(add);
    }
    @Test
    public void divideByZero(){

        Assertions.assertThrows(ArithmeticException.class,() ->  calculator.divide(10,0));
    }
}

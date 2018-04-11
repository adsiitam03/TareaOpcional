package mx.com.itam.adsi.ejercicio;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculaSuma {
    private final static Logger LOG = Logger.getLogger(TestPrincipal.class);
    
    private static final dobule num2 = 8;
    
    private CalculaSuma p = new CalculaSuma();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectCalcTest() {
	double num1;
        LOG.info("Ejecutando la prueba");
        
	num1 = 2;
        assertTrue("Calculo para 8 y '"+num1+"':", calc(num1, num2, 10));
        num1 = 10;
        assertTrue("Calculo para 8 y '"+num1+"':", calc(num1, num2, 18));
    }
    
    private boolean calc(double a, double b, double res) {
        double calc = p.suma(a, b);
        System.out.println(calc);
        return res==calc;
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}

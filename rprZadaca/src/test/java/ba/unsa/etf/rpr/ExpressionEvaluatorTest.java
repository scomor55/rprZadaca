package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaluatorTest {

    @Test
    void evaluate1() {
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 4 * 5 ) "));
        assertEquals("20.0",rez);
    }

    @Test
    void evaluate2() {
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 + ( 4 * 5 ) ) "));
        assertEquals("23.0",rez);
    }

    @Test
    void evaluate3() {
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 * ( 4 * 5 ) ) "));
        assertEquals("60.0",rez);
    }

    @Test
    void evaluate4() {
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 2 + 3 ) * ( 4 * 5 ) ) "));
        assertEquals("100.0",rez);
    }

    @Test
    void evaluate5() {
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) "));
        assertEquals("101.0",rez);
    }
}
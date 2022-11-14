package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testovi!
 * @author Safa
 *
 */
public class ExpressionEvaluatorTest {

    @Test
    void evaluate1() {
        /**
         * Testiranje mnozenja
         *
         */

        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 4 * 5 ) "));
        assertEquals("20.0",rez);
    }

    @Test
    void evaluate2() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 + ( 4 * 5 ) ) "));
        assertEquals("23.0",rez);
    }

    @Test
    void evaluate3() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 * ( 4 * 5 ) ) "));
        assertEquals("60.0",rez);
    }

    @Test
    void evaluate4() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 2 + 3 ) * ( 4 * 5 ) ) "));
        assertEquals("100.0",rez);
    }

    @Test
    void evaluate5() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 1 + ( 5 * 20 ) )"));
        assertEquals("101.0",rez);
    }
}
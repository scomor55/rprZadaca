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
         * Testiranje sabiranja
         *
         */

        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 1 + 2 ) + ( 3 + 4 ) )"));
        assertEquals("10.0",rez);
    }


    @Test
    void evaluate2() {
        /**
         * Testiranje mnozenja
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 2 * 3 ) * ( 4 * 5 ) )"));
        assertEquals("120.0",rez);
    }

    @Test
    void evaluate3() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 + ( 4 * 5 ) ) "));
        assertEquals("23.0",rez);
    }

    @Test
    void evaluate4() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 * ( 4 * 5 ) ) "));
        assertEquals("60.0",rez);
    }

    @Test
    void evaluate5() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 2 + 3 ) * ( 4 * 5 ) ) "));
        assertEquals("100.0",rez);
    }

    @Test
    void evaluate6() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 1 + ( 5 * 20 ) )"));
        assertEquals("101.0",rez);
    }

    @Test
    void evaluate7() {
        /**
         * Testiranje sqrt operatora
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( sqrt ( 4 ) + ( 5 * 20 ) )"));
        assertEquals("102.0",rez);
    }


    @Test
    void evaluate8() {
        /**
         * Testiranje primjera iz zadace
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"));
        assertEquals("101.0",rez);
    }

    @Test
    void evaluate9() {
        /**
         * Testiranje dijeljenja
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 720 / 6 ) / ( 24 / 2 ) )"));
        assertEquals("10.0",rez);
    }

    @Test
    void evaluate10() {
        /**
         * Testiranje oduzimanja
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 27 - 7 ) - ( 12 - 4 ) )"));
        assertEquals("12.0",rez);
    }

    @Test
    void evaluate11() {
        /**
         * Testiranje slozenijeg izraza
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( sqrt ( 625 ) - sqrt ( 225 ) ) - ( sqrt ( 100 ) - sqrt ( 25 ) ) )"));
        assertEquals("5.0",rez);
    }

    @Test
    public void shouldAnswerWithTrue1()
    {
        /**
         * Testiranje izuzetka
         *
         */
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( 2 +2 )");});
    }

    @Test
    public void shouldAnswerWithTrue2()
    {
        /**
         * Testiranje izuzetka
         *
         */
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 )* ( 4 * 5 ) ) )");});
    }
}
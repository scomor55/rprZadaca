package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Implementation of ExpressionEvaluatorTest
 * @author Safa
 *
 */
public class ExpressionEvaluatorTest {

    @Test
    public void evaluate1() {
        /**
         *
         * Addition testing
         *
         */

        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 1 + 2 ) + ( 3 + 4 ) )"));
        assertEquals("10.0",rez);
    }


    @Test
    public void evaluate2() {
        /**
         * Multiplication testing
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 2 * 3 ) * ( 4 * 5 ) )"));
        assertEquals("120.0",rez);
    }

    @Test
    public void evaluate3() {
        /**
         * Complex expression testing
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 + ( 4 * 5 ) ) "));
        assertEquals("23.0",rez);
    }

    @Test
    public void evaluate4() {
        /**
         * Complex expression testing
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 3 * ( 4 * 5 ) ) "));
        assertEquals("60.0",rez);
    }

    @Test
    public void evaluate5() {
        /**
         * Complex expression testing
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 2 + 3 ) * ( 4 * 5 ) ) "));
        assertEquals("100.0",rez);
    }

    @Test
    public void evaluate6() {
        /**
         * Complex expression testing
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 1 + ( 5 * 20 ) )"));
        assertEquals("101.0",rez);
    }

    @Test
     public void evaluate7() {
        /**
         * Testing the sqrt operator
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( sqrt ( 4 ) + ( 5 * 20 ) )"));
        assertEquals("102.0",rez);
    }


    @Test
     public void evaluate8() {
        /**
         * Testing the example from the task
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"));
        assertEquals("101.0",rez);
    }

    @Test
    public void evaluate9() {
        /**
         * Testing of the division
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 720 / 6 ) / ( 24 / 2 ) )"));
        assertEquals("10.0",rez);
    }

    @Test
    public void evaluate10() {
        /**
         * Subtraction testing
         *
         */
        String rez;
        rez = String.valueOf(ExpressionEvaluator.evaluate("( ( 27 - 7 ) - ( 12 - 4 ) )"));
        assertEquals("12.0",rez);
    }

    @Test
    public void evaluate11() {
        /**
         * Testing a more complex expression
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
         * Exception testing
         *
         */
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( 2 +2 )");});
    }

    @Test
    public void shouldAnswerWithTrue2()
    {
        /**
         * Exception testing
         *
         */
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( 1 + ( ( 2 + 3 )* ( 4 * 5 ) ) )");});
    }

    @Test
    public void shouldAnswerWithTrue3()
    {
        /**
         * Exception testing
         *
         */
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( ( sqrt ( 625 ) - sqrt ( 225) ) - ( sqrt ( 100 ) - sqrt ( 25 ) ) ");});
    }

    @Test
    public void shouldAnswerWithTrue4()
    {
        /**
         * Exception testing
         *
         */
        assertThrows(RuntimeException.class, () -> { ExpressionEvaluator.evaluate("( ( 720 / 6 ) /( 24 / 2 ) )");});
    }


}
package ba.unsa.etf.rpr;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Implementation ExspressionEvaluator
 * @author Safa
 * @version 1.0
 *
 */

public class ExpressionEvaluator {

    /**
     * Implementation of method evaluate
     * @param s
     * @return
     */
    public static Double evaluate(String s){

        char temp1;
        char temp2;
        /**
         * Input check
         * This input check is there so that we can test the correctness
         * of the passed parameter from the ExpressionEvaluatorTest class
         * @author Safa
         */
        for(int i = 1; i < s.length() ; i++){
            temp1 = s.charAt(i-1);
            temp2 = s.charAt(i);
            if((temp1 == '(' && temp2 != ' ') ||(temp1 != ' ' && temp2 == ')') ||(temp2 == '/' && temp1 !=' ')|| (temp1=='/' && temp2 != ' ')||(temp2 == '*' && temp1 !=' ')|| (temp1=='*' && temp2 != ' ')||(temp2 == '-' && temp1 !=' ')|| (temp1=='-' && temp2 != ' ')||(temp2 == '+' && temp1 !=' ')|| (temp1=='+' && temp2 != ' ')||(temp2 == 's' && temp1 !=' ')|| (temp1=='t' && temp2 != ' ')){
                throw new RuntimeException("Input error!");
            }
        }



        Double number ;

        String[] str = s.split("\\s+");
        Queue<String> q = new LinkedList<>();

        Collections.addAll(q, str);

        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();

        /**
         * Determining operators and values
         */

        while(!q.isEmpty()){
            String temporary = q.poll();
            if(temporary.equals("(")){}
            else if (temporary.equals("+")) {
                operators.push(temporary);
            }else if (temporary.equals("-")) {
                operators.push(temporary);
            }else if (temporary.equals("*")) {
                operators.push(temporary);
            }else if (temporary.equals("/")) {
                operators.push(temporary);
            }else if (temporary.equals("sqrt")) {
                operators.push(temporary);
            }else if (temporary.equals(")"))
                {
                    String ops = operators.pop();
                    double val = values.pop();
                    if(ops.equals("+")){
                        val = values.pop() + val;
                    }else if (ops.equals("-")) {
                        val = values.pop() - val;
                    }else if (ops.equals("*")) {
                        val = values.pop() * val;
                    }else if (ops.equals("/")) {
                        val = values.pop() / val;
                    }else if (ops.equals("sqrt")) {
                        val = Math.sqrt(val);
                    }
                    values.push(val);
                }else{
                values.push(Double.parseDouble(temporary));
            }
        }
        number = values.pop();
        return number;
    }
}

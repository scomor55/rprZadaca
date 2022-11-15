package ba.unsa.etf.rpr;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Implementacija ExspressionEvaluator funkcije!
 * @author Safa
 *
 */

public class ExpressionEvaluator {
    public static double evaluate(String s){
        double number ;

        String[] str = s.split("\\s+");
        Queue<String> q = new LinkedList<>();

        Collections.addAll(q, str);

        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();

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

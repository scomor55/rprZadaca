package ba.unsa.etf.rpr;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ExpressionEvaluator {
    public static double evaluate(String s){
        double number = 0;

        String[] str = s.split("\\s+");
        Queue<String> q = new LinkedList<String>();

        for(String temp : str){
            q.add(temp);
        }

        Stack<String> operators = new Stack<String>();
        Stack<Double> values = new Stack<Double>();

        while(!q.isEmpty()){
            String temporary = q.poll();
            if(temporary.equals("(")) ;
            else if (temporary.equals("+")) {
                operators.push(s);
            }else if (temporary.equals("-")) {
                operators.push(s);
            }else if (temporary.equals("*")) {
                operators.push(s);
            }else if (temporary.equals("/")) {
                operators.push(s);
            }else if (temporary.equals("sqrt")) {
                operators.push(s);
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
        

       /* for(double value:values){
            number += value;
        }*/
        return number;
    }
}

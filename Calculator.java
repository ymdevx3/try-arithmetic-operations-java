import jp.hishidama.eval.*;

public class Calculator {
    
    /**
     * �v�Z
     * @param expression ����������
     */
    public static double calculate(String expression) {

        Rule rule = ExpRuleFactory.getDefaultRule();
        Expression exp = rule.parse(expression); //���
        double result = exp.evalDouble(); //�v�Z���{

        return result;
    }
}
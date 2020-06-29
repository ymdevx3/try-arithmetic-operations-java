import java.util.regex.Pattern;
import jp.hishidama.eval.*;

public class Calculator {
    
    /**
     * �����񂩂�v�Z���ʂ��擾
     * @param expression ����������
     * @return �v�Z����
     */
    public static double calculate(String expression) throws IllegalArgumentException {

        // ���K�\���`�F�b�N�i���l�Ɖ��Z�q[+, -, *, /]�̂ݎg�p�̏ꍇ�j
        expression = expression.replace(" ", "");
        // ^[\+|-]?[\d|\+|\-|\*|\/]*[\d]+$
        String pattern = "^[\\+|\\-]?[\\d|\\+|\\-|\\*|/]*[\\d]+$";
        Pattern p = Pattern.compile(pattern);
        if (!p.matcher(expression).find()) {
            throw new IllegalArgumentException("�����s���ł��B");
        }

        Rule rule = ExpRuleFactory.getDefaultRule();
        Expression exp = rule.parse(expression);    //���
        double result = exp.evalDouble();           //�v�Z���{

        return result;
    }
}
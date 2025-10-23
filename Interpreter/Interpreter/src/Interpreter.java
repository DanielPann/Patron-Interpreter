public class Interpreter {

    public static Expression buildSecurityRule() {
        Expression ruleMinLength = new MinLengthRule(8);
        Expression ruleNumber = new NumberRule();
        Expression ruleUppercase = new UpperCaseRule();

        Expression combined = new AndExpression(ruleMinLength, ruleNumber);
        return new AndExpression(combined, ruleUppercase);
    }
}




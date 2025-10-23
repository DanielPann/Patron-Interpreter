public class Interpreter {
    private static Expression buildSecurityRule() {
        Expression ruleMinLength = new MinLengthRule(8);
        Expression ruleNumber = new NumberRule();
        Expression ruleUppercase = new UppercaseRule();


        Expression combinedLenNum = new AndExpression(ruleMinLength, ruleNumber);
        
        Expression finalRule = new AndExpression(combinedLenNum, ruleUppercase);

        return finalRule;
}

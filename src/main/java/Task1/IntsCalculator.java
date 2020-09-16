package Task1;

public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    public int sum(int arg0, int arg1) {
        return new Double(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result()).intValue();
    }

    public int mult(int arg0, int arg1) {
        return new Double(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result()).intValue();
    }

    public int pow(int a, int b) {
        return new Double(target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result()).intValue();
    }
}

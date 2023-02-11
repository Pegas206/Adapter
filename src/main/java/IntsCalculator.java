
    public class IntsCalculator implements Ints {
        protected final Calculator target;

        public IntsCalculator() { this.target = new Calculator(); }

        @Override
        public Calculator.Formula sum(int arg0, int arg1) {
            return this.target.newFormula()
                         .addOperand(arg0)
                       .addOperand(arg1)
                        .calculate(Calculator.Operation.SUM);
        }

        @Override
        public Calculator.Formula mult(int arg0, int arg1) {
            return this.target.newFormula()
                    .addOperand(arg0)
                    .addOperand(arg1)
                    .calculate(Calculator.Operation.MULT);
        }

        @Override
        public Calculator.Formula pow(int a, int b) {
            return this.target.newFormula()
                    .addOperand(a)
                    .addOperand(b)
                    .calculate(Calculator.Operation.POW);
        }
    }


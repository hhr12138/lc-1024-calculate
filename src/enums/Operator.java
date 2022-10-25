package enums;

public enum Operator {
    Add("+"),Sub("-"),Mul("*"),Div("/"),And("&"),Or("|"),LM("<<"),RM(">>");
    private String ope;

    Operator(String ope) {
        this.ope = ope;
    }
}

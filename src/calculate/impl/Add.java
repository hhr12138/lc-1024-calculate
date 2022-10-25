package calculate.impl;

import calculate.Calculate;

public class Add implements Calculate {
    @Override
    public long operation(long num1, long num2) {
        return num1+num2;
    }

    @Override
    public String getOpe() {
        return "+";
    }
}

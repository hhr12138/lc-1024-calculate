package calculate.impl;

import calculate.Calculate;

public class Div implements Calculate {
    @Override
    public long operation(long num1, long num2) {
        if(num2 == 0) return Long.MIN_VALUE;
        return num1/num2;
    }

    @Override
    public String getOpe() {
        return "/";
    }
}

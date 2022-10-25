package calculate.impl;

import calculate.Calculate;

public class And implements Calculate {
    @Override
    public long operation(long num1, long num2) {
        if(num1 > Integer.MAX_VALUE || num2 > Integer.MAX_VALUE) return Long.MIN_VALUE;
        return num1 & num2;
    }

    @Override
    public String getOpe() {
        return "&";
    }
}

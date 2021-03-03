package org.vadim.azaza;

public abstract class Operation {
    abstract double execute(double a, double b);
}

class Addition extends Operation {
    @Override
    double execute(double a, double b) {
        return (a + b);
    }
}

class Subtraction extends Operation{
    @Override
    double execute(double a, double b) {
        return (a - b);
    }
}

class Multiplication extends Operation{
    @Override
    double execute(double a, double b) {
        return (a * b);
    }
}

class Division extends Operation{
    @Override
    double execute(double a, double b) {
        return (a / b);
    }
}

class Mod extends Operation{
    @Override
    double execute(double a, double b) {
        return (a % b);
    }
}

class Pov extends Operation{
    @Override
    double execute(double a, double b) {
        return Math.pow(a, b);
    }
}

class Div extends Operation{
    @Override
    double execute(double a, double b) {
        return (int)(a / b);
    }
}

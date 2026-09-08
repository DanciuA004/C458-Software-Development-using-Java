package com.mthree.java_classes_and_objects.simple_calculator;

public class SimpleCalculator {
    private int operand1 = 0;
    private int operand2 = 0;
    double result = 0;

    public int getOperand1() { return operand1; }
    public void setOperand1(int operand1) { this.operand1 = operand1; }

    public int getOperand2() { return operand2; }
    public void setOperand2(int operand2) { this.operand2 = operand2; }

    public double calculate(char operation) {

        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                result = 0;
        }
        return result;
    }

}

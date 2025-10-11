package com.example.project;
public class Calculator{
    public String calcModel;
    
    //constructor that creates an instance of the calculator class
    //the calculator class has one attirbute -> a string that holds the model name of the calculator 
    public Calculator(String z) {
        this.calcModel="TI84";
    }
    
    // method that performs the operation designated by operand (which
    // could be +, -, *, or /) and returns the result of that operation
    // performed between num1 and num2
    // NOTE: if operand is some String other than "+", "-", "*", or "/" then
    // this method should return 0
    // REMINDER: use .equals to test if one string is equal to another (not ==)
    public double performOperation(String operand, int num1, int num2) {
        if (operand.equals("+")){
            return (num1+num2);
        } else if (operand.equals("-")){
            return (num1-num2);
        } else if (operand.equals("*")){
            return (num1*num2);
        } else if (operand.equals("/")){
            return (num1/(double) num2);
        } else{
        return 0.00;
        }
    }

    // method that checks if num1 is evenly divisible by num2, and if so,
    // returns true, and if not, returns false
    public boolean divisibleBy(int num1, int num2) {
        if ((num1%num2)==0){
            return true;
        } else{
        return false;
        }
    }

    // method that constructs and returns a string representing a coordinate
    // pair in the format: "(x, y)"
    public String coordinatePair(int x, int y) {
        String A = String.valueOf(x);
        String B = String.valueOf(y);
        return "("+A+","+B+")";
    }
    // method that determines and returns the result of |num1 - num2|
    public int absoluteValue(int num1, int num2) {
        int sumnum=num1-num2;
        int x;
        if (sumnum<0){
            x=(sumnum*-1);
        } else{
            x=sumnum;
        }
        return x;
    }

    //method that returns the average of two numbers. 
    //the number returned should be rounded to the nearest tenth
    public double average(int num1, int num2){
        double avg = (((double) num1+(double) num2)/2.0);
        return Math.round(avg*10)/10.0;
    }
    
    // method that constructs and returns a String in the format:
    // "This calculator is a model "+____+" where "+____+" should be filled in
    // with the value stored in the calcModel instance variable."
    public String info() {
        //implement code here
        return "This calculator is a model "+this.calcModel+" where "+this.calcModel+" should be filled in with the value stored in the calcModel instance variable.";
    }
}

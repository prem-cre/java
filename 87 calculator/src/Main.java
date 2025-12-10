
// create claculator with add , sub, mult ;divi
//exceptions are ; invalid input (8 & 9)
//cant divide by zero
// max input exception , not allowing multiplication greater than 1000000;
// max  multiplier input exception dont allow multiplicatin greater than 7000;
class InvalidInputException extends Exception{
    public String tostring(){
        return " cannot add 8 & 9 ";
    }
    public String getName (){
        return "i am a get message";
    }
}
class CannotDivideByZeroException extends Exception{
    public String tostring(){
        return " cannot divide by zero";
    }
    public String getName (){
        return "i am a get message";
    }
}
class MaxInputException extends Exception{
    public String tostring(){
        return " max input";
    }
    public String getName (){
        return "i am a get message";
    }
}
class MaxMultiplyInputException extends Exception{
    public String tostring(){
        return " max multiply input";
    }
    public String getName (){
        return "i am a get message";
    }
}
        class customCalculator{
    double add(double  a, double b) throws InvalidInputException,MaxInputException {
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a>10000 || b>10000){
            throw new MaxInputException();
        }
        return a + b;
    }
        double sub(int a , int b)throws MaxInputException{
            if (a>10000 || b>10000){
                throw new MaxInputException();
            }
        return a -b;
        }
        double multiply(int a ,int b)throws MaxMultiplyInputException{
        if(a >700|| b>700) {
            throw new MaxMultiplyInputException();
        }return a * b;
        }
            double divide(int a ,int b) throws CannotDivideByZeroException{
        if (b==0){
            throw new CannotDivideByZeroException();
        }
                return a / b;
        }}

public class Main {
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZeroException,MaxInputException,MaxMultiplyInputException{
    customCalculator c = new customCalculator();
c.add(8,9);
c.divide(8,0);
c.multiply(800,900);
    }
}
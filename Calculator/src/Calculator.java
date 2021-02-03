public class Calculator  {
    private double answer;
    private String sign;
    private double Operation1;
    private double Operation2;

    
    public Calculator() {

    }

    public String getOperation(){
        return sign;
    }
    public void setOperation(String sign) {
        if(sign == "+" || sign == "-"){
            this.sign = sign;
        } else {
            System.out.println("Invalid");
        }
    }

    public void setOperation1(double x){
        this.Operation1 = x;
    }

    public double getOperation1(){
        return Operation1;
    }

    public double getOperation2() {
        return Operation2;
    }

    public void setOperation2(double y) {
        this.Operation2 = y;
    }

    public double calculate(){
        if(sign == "+"){
            answer = getOperation1() + getOperation2();
        } else if(sign == "-"){
            answer = getOperation1() - getOperation2();
        }
        return answer;
    }

    public double getResult(){
        return answer;
    }


}
public class FizzBuzz {
    public String fizzBuzz(int number){
        if (number == 15){
            return "FizzBuzz";
        }
        if(number%3==0){
            return "Fizz";
        }
        if(number%5==0){
            return "Buzz";
        }
        else{
            return number + "";
            
        }
    }
    
}

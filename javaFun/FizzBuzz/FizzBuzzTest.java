public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz fiz = new FizzBuzz();

        String output = fiz.fizzBuzz(3);
        System.out.println(output);
        
        String output1 = fiz.fizzBuzz(5);
        System.out.println(output1);
        
        String output2 = fiz.fizzBuzz(15);
        System.out.println(output2);

        String output3 = fiz.fizzBuzz(2);
        System.out.println(output3);
    }
}

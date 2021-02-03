import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava{
    // Greater than 10
    public static void sumGreater10(int[] arr){
        ArrayList <Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        }
        
        System.out.println(sum);
        System.out.println(newArray);
    }

// shuffle names return names longer 5 char
    public static void shuffleStrings(String[] arr){
        ArrayList<String> newList = new ArrayList<String>(Arrays.asList(arr));
        ArrayList<String> newList2 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if (arr[i].length() > 5){
                newList2.add(arr[i]);
            }
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newList2);

    }
// shuffle alphabet
    public void shuffleAlphabet(String[] arr){
        ArrayList<String> arrNew = new ArrayList<String>(Arrays.asList(arr));
        List<String> Vowels = Arrays.asList("a","e","i","o","u");
        Collections.shuffle(arrNew);
        System.out.println(arrNew.get(25));
        System.out.println(arrNew.get(0));
        

        for(int i = 0; i < Vowels.size(); i++){
            if (arrNew.get(0).equals(Vowels.get(i))){
                System.out.println("Vowel");
            }      
            
        }
    }
// 10 rand num between 55-100
    public void randomNumber() {
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55, 101);
            randomNums.add(num);
        }
        System.out.println(randomNums);
    }
// sorted 10 rand num between 55-100
    public void randomNumber2(){
        ArrayList<Integer> randomNums2 = new ArrayList<Integer>();
        int min = 55;
        int max = 101;
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 101);
            randomNums2.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(randomNums2);
        System.out.println(randomNums2);
        System.out.println(min);
        System.out.println(max);
    }

// Create a random string that is 5 characters long.
    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < 5; i++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }

// Generate an array with 10 random strings that are each 5 characters long
    public static void randomStringOfStrings(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        ArrayList<String> randList = new ArrayList<String>();
        String alphaNumeric = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i <10; i++){
            for(int j = 0; j < 5; j++){
                randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String finalString = randString.toString();
            randList.add(finalString);
            randString.setLength(0);
        }
        System.out.println(randList);
    }
}
import java.util.Arrays;
import java.util.ArrayList;

public class Basic{
//	Print 1-255
//	public static void main(String[] args) {
//		for(int i =1; i < 256; i++) {
//			System.out.println(i);
//		}
//	}
	
//	Print odd numbers between 1-255
	public static void main(String[] args) {
		for(int i =1; i < 256; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
	}
	
//Print Sum
//Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far. For example, your output should be something like this:
//
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i =1; i < 256; i++) {
//			sum = sum + i;
//			System.out.println("New Number: " + i + " Sum:"+ sum);
//		}
//	}
//Iterating through an array
//	public static void main(String[] args) {
//		int[] arrayA = {1,8,3,7,5,2,6,4};
//		Arrays.sort(arrayA);
//		for (int arr: arrayA) {
//			System.out.println(arr);
//		}
//	
//	}
//Find Max
//	public static void main(String[] args) {
//		int[] arrayA= {-3,-5,-7};
//		int max = Integer.MIN_VALUE;
//		for(int i =0; i < arrayA.length; i++) {
//			if( arrayA[i] > max) {
//				max= arrayA[i];
//			}
//			System.out.println(max);
//		}
//		
//	}
//	//Get Average
//	public static void main(String[] args) {
//		int[] myArray = {2,10,3};
//		int sum = 0;
//		double avg = 0;
//		for(int i =0; i < myArray.length; i++) {
//			sum = sum + myArray[i];
//			avg = (double) sum / myArray.length;
//
//		}
//		System.out.println(avg);
//		
//	}

//Array with Odd Numbers
//	public static void main(String[] args) {
//		ArrayList<Integer> myArray = new ArrayList<>();
//		for(int i =1; i < 256; i++) {
//			if(i%2==1) {
//				myArray.add(i);		
//			}	
//		}
//		System.out.println(myArray);
//	}
//Greater Than Y
//	public static void main(String[] args) {
//		int[] myArray = {1, 3, 5, 7};
//		int y = 3;
//		int count = 0;
//		for(int i =0; i < myArray.length; i++) {
//			if (myArray[i] > y){
//				count ++;
//			 	
//			}
//		
//		}
//		System.out.println(count);
//	}
//Square the values
//	public static void main(String[] args) {
//		int[] myArray = {1, 5, 10, -2};
//		int[] newArr = new int[myArray.length];
//		int square;
//		for(int i =0; i < myArray.length; i++) {
//			square = myArray[i] * myArray[i];
//			square = myArray[i]*myArray[i];
//			newArr[i] = square;
//		
//			}
//		System.out.println(Arrays.toString(newArr));
//		}
	

//Eliminate Negative Numbers
//     static int[] get(){
//         return new int[]{1, 5, 10, -2};
//     }
//     public static void main(String[] args) {
//         int[] arr = get();
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] < 0){
//                 arr[i] = 0;
//             }
//             System.out.print(arr[i] + ",");
//         }
//     
//     }
	
	   
// Max, Min, and Average
//     public static void main(String[] args) {
//    	 int[] myArray = {1, 5, 10, -2};
//         int max = myArray[0];
//         int min = myArray[0];
//         int sum = 0;
//         for (int i = 0; i < myArray.length; i++){
//             if (myArray[i] > max){
//                 max = myArray[i];
//             }
//             if (myArray[i] < min){
//                 min = myArray[i];
//             }
//             sum += myArray[i];
//         }
//
//         System.out.println(max);
//         System.out.println(min);
//         System.out.println((double)sum / myArray.length);
//     }

	// Shifting the Values in the Array
//	     static int[] get() {
//	         return new int[]{1, 5, 10, 7, -2};
//	     }
//	     public static void main(String[] args) {
//	         ArrayList<Integer> newArray = new ArrayList<>();
//	         int[] arr = get();
//	         for (int i = 0; i < arr.length; i++) {
//	             if (i == arr.length - 1) {
//	                 newArray.add(0);
//	             } else {
//	                 newArray.add(arr[i + 1]);
//	             }
//	         }
//	         System.out.println(newArray);
//	     } 
//	
//	
//	
	
	
}

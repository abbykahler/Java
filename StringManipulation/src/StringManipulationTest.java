public class StringManipulationTest {
	public static void main(String[] args) {
		StringManipulation manipulator = new StringManipulation();
		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		System.out.println(str); // HelloWorld 
		
		
		char letter = 'o';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hello World", letter);
		Integer c = manipulator.getIndexOrNull("Hi", letter);
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c); // null

		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer string3 = manipulator.getIndexOrNull(word, subString);
		Integer string4 = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(string3); // 2
		System.out.println(string4); // null
	
		String string5 = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(string5); // eworld
	}
}
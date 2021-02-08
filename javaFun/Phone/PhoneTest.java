public class PhoneTest {
    public static void main(String[] args) {
		Galaxy s9 = new Galaxy ("S9", 99, "Verizon", "Ring Ring Ring!");
		Iphone IphoneTen = new Iphone("X", 100, "AT&T", "Zing");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		// System.out.println("");
		
        IphoneTen.displayInfo();
		System.out.println(IphoneTen.ring());
		System.out.println(IphoneTen.unlock());
	
	}
}

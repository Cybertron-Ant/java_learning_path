
// defining 'EncapsulationClass' class to demonstrate encapsulation
public class EncapsulationClass {
	
	// private variable 'n1' initialized to 10
	private int n1 = 10;

	// method 'getN1' to retrieve the value of 'n1' variable
	public int getN1() {
		// displays a message indicating that n1 data is being viewed
		System.out.println("Someone Viewed N1 data");
		return n1;
	}// end getter method 'getN1'

	// setter method 'setN1' to set the value of 'n1' variable
	public void setN1(int n1) {
		// displays a message indicating that 'n1' data is being changed
		System.out.println("Someone changed N1 data");
		this.n1 = n1;
	}// end setter method 'setN1'

}// end class 'EncapsulationClass'

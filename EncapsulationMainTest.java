
// class 'EncapsulationMainTest' containing the 'main' method to test encapsulation instanciating the 'EncapsulationClass' class
public class EncapsulationMainTest {

	public static void main(String[] args) {

		// creating an instance of 'EncapsulationClass'
		EncapsulationClass encapsulationClass = new EncapsulationClass();

		// displaying the initial value of 'n1' variable by calling 'getN1' method
		System.out.println(encapsulationClass.getN1());

		// setting a new value (2) for 'n1' variable using 'setN1' method
		encapsulationClass.setN1(2);

		// displaying the updated value of 'n1' variable by calling 'getN1' method
		System.out.println(encapsulationClass.getN1());

	}// end method 'main'

}// end class 'EncapsulationMainTest'

class dog {

	void kick() {
		System.out.println("Bow Bow");
	}
}

class fun {
	
	public static void main(String args[]) {

	        // create a reference to tom, which can hold the address of the object dog	
		dog tom ;
		// creates a new object dog and stored in the variable tom
		tom = new dog();
		tom.kick();
	}
}

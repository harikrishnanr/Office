class dog {

	void kick() {
		System.out.println("Bow Bow");
	}
}

class dog_hater {

	void make_kick() {
		dog tom = new dog();
		tom.kick();
	}
}

class fun {
	
	public static void main(String args[]) {
                
		dog_hater kathi = new dog_hater();
		while(true) {
			kathi.make_kick();
		}	

	}
}

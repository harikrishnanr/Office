//Demonstrate the Constructor

class moon {

	int i, j;

	moon(int m, int n) {
		i = m;
		j = n;
	}

	int sum() {

		return i + j;
	}


}



class fun {

	public static void main(String args[]) {
		
		// Can initialize variables during the object creation using the constructor
		moon m = new moon(4,7);
		System.out.println("Sum : "+m.sum());
	}
}

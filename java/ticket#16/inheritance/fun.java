//Demonstrate the Inheritance propery

class abc {
	int i;
}

class def extends abc {
	int j;
}

class fun {

	public static void main(String args[]) {
		
		abc a = new abc();
		def d = new def();
		/* d contains the variable "j" (obviously)  as well "i" which is the variable of abc
		   The variable "i" is inherited from abc through extends keyword
		   So abc is base class of def
		*/   

		a.i = 10;
		d.i = 20;
		d.j = 30;
		System.out.println(a.i);	
		System.out.println(d.i);	
		System.out.println(d.j);	
	}
}

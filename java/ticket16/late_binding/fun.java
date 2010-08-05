//Demonstrate the Polymorphism/Overloading

class shape {
	void draw() {}
}

class rectangle extends shape {

	void draw() {
		System.out.println("Rectangle draw");
	}
}

class circle extends shape {

	void draw() {
		System.out.println("circle draw");
	}
}

class triangle extends shape {

	void draw() {
		System.out.println("Triangle draw");
	}
}


class fun {

	public static void main(String args[]) {
		shape s[] = { new rectangle(),
		              new triangle(),
		              new circle() };
  		int i;
		for(i = 0; i < s.length; i++) {
			s[i].draw();
		}		
	}
}

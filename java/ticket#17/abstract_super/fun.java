//Demonstrating abstract and super

abstract class Figure {
	/* Base class for Figure */
	   
	int dim1, dim2;
	Figure(int x, int y) {
		dim1 = x;
		dim2 = y;
	}
        
	/* Area is an abstract Method */
	abstract int area();
}

class Rectangle extends Figure{

	Rectangle(int x, int y) {
	        /* Calling its Base class constructor  using super*/	
		super(x,y);
	}
         
	int area() {
		return dim1 * dim2;
	}
}

class Square extends Figure{

	Square(int x) {
	        /* Calling its Base class constructor  using super*/	
		super(x,x);
	}
         
	int area() {
		return dim1 * dim2;
	}

}


class fun {

	public static void main(String args[]) {
	//	Figure F = new Figure();   Cannot be initiated
		Rectangle R = new Rectangle(3,5);  //Subclass can be initialited
		Square S = new Square(3);
                System.out.println("The Area of Rectangle: "+R.area());		
                System.out.println("The Area of Square: "+S.area());		
	}
}

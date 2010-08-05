
class fun2{
		  public static void main(String args[])
		  {
					 int i;
					 try{
					 	i = 1/0;
					 	System.out.println("Made a blunder...");
					 }catch (ArithmeticException e){
					 	System.out.println("Arithmetic Error");
					 }
					 System.out.println("Exiting...");
		  }
}

/*----------------------------------------*/

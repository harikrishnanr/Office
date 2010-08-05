
class abc7{
		  void fun2()
		  {
					 int i;
					 i = 1/0;
					 System.out.println("Remaining part of fun2");
		  }
		  void fun1()
		  {
					 int i;
					 fun2();
					 System.out.println("Remaining part of fun1");
			}
					 
}
class fun7{
		  public static void main(String args[])
		  {
		  		abc7 a = new abc7();
				try{
					a.fun1();
				 	System.out.println("Made a blunder...");
				 }catch (ArithmeticException e){
				 	System.out.println("Arithmetic Error");
					e.printStackTrace(System.err);
				 }
				 System.out.println("Exiting main...");
			}
}


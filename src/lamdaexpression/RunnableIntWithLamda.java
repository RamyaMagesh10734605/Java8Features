/*
 * Lamda is a function without a name.
 * It can called as anonymous function.
 * It is not tied to any class.
 * It has method parameter, method body and return type.
 * Lamda syntax: () -> {}
 * Lamdas can be assigned to any variable and passed like any other variable
 */

// It is used to implement the functional interfaces. Functional interfaces are called as SAM.
package lamdaexpression;


public class RunnableIntWithLamda {
	
   public static void main(String[] args) {
	   /*
	    * Runnable Interface: has only one method run(). no input and void output.
		* Prior to java 8, Runnable and Comparators are functional interface.
	    */
	   //Creating an anonymous class, prior to java 8, we use this.
	  
	   
	   Runnable runnable1 = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Insitde Runnable 1");
		}
	};
		   
	  new Thread(runnable1).start();
	  
	  
	   //Lot of boiler plate code avoided.
	  Runnable runnable = () -> {
		System.out.println("Inside Runnable 2");
	  };
	   new Thread(runnable).start();

	  //no curly braces for single statement.
	   Runnable runnable3 = () -> 
			System.out.println("Inside Runnable 3");
			
	   new Thread(runnable3).start();
	   
	   //We can pass the lamda directly as a method arugument
	   new Thread(()->System.out.println("Inside Runnable 4")).start();
}

}

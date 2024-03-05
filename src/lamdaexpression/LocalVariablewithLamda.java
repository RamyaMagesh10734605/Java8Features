package lamdaexpression;

import java.util.function.Function;

public class LocalVariablewithLamda {
	
	public static void main(String[] args) {
		
		int value=2;
		
		//Function<Integer,Integer> add = (value) -> value+value; //Lambda expression's parameter value cannot redeclare another local variable defined in an enclosing scope.
		
		
		Function<Integer,Integer> add = (ii) -> ii+value; //using local variable value
		
		System.out.println(add.apply(2)); //returns 4
		
		//value=7; //if we try to change the local variable, it throws Local variable value defined in an enclosing scope must be final or effectively final. 
		
		Function<Integer,Integer> add1 = (ii) -> { 
	      //  value=value+1; //throwing exception as Local variable value defined in an enclosing scope must be final or effectively final
			return ii+value; // we can only use, cannot modify the local variable.
		}; //using local variable value
		
		//***if the local variable is moved as instance, we have no restriction.***//
		
		System.out.println(add.apply(2)); //returns 4
		
		
		/**
		 * Error message:: Local variable value defined in an enclosing scope must be final or effectively final
		 * What is Effectively Final:   the local variable is treated as final even if it is not declared final. The above example, value variable
		 * is treated as final and hence it was not changed inside functional interface or outside the method if the variable is used
		 * in the functional interface.
		 * 
		 * Until java 7, if we want to use variable inside anonymous class, the variable should be explicitly declared as final.
		 * 
		 * 
		 * Why? for concurrency operations and also to promote functional programming.
		 */
	}
	}



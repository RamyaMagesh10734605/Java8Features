package defaultPkg;

public class TestClassForMultipleInheritance2 implements DefaultInterface1,DefaultInterface4 {

	/*
	 * If the same signature default methods present in two or more implemented Interfaces,
	 * the compilation error will occur
	 * 
	 * this can be resolved by overriding in the concrete class
	 */
	
	public void MethodA() {
		System.out.println("Method A of TestClassForMultipleInheritance");
		DefaultInterface1.super.MethodA();
		DefaultInterface4.super.MethodA();
	}
	
	public static void main(String[] args) {
		TestClassForMultipleInheritance2 tt = new TestClassForMultipleInheritance2();
		tt.MethodA();
		 
	}
}

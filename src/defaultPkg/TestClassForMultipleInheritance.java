package defaultPkg;

public class TestClassForMultipleInheritance implements DefaultInterface1,DefaultInterface2,DefaultInterface3 {

	public void MethodA() {
		System.out.println("Method A of TestClassForMultipleInheritance");
	}
	
	public static void main(String[] args) {
		TestClassForMultipleInheritance tt = new TestClassForMultipleInheritance();
		tt.MethodA();
		tt.MethodB();
		tt.MethodC();
		
		//Default methods of all implemented interfaces are accessible here in concrete class.
		
		//If Interface 2 extends Interface 1 and Interface 3 extends Interface 2, Which MethodA will be called
		//It will preference to the concrete interface. If the concrete sub class has the overridden method,
		//it will get invoked.
	}
}

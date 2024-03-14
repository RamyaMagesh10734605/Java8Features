package defaultPkg;

public interface DefaultInterface2 {

	default void MethodB() {
		System.out.println("Method B of DefaultInterface 2");
	}
}

package defaultPkg;

public interface DefaultInterface1 {

	default void MethodA() {
		System.out.println("Method A of DefaultInterface 1");
	}
}

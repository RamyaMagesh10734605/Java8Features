package defaultPkg;

import java.util.Arrays;

/*
 * Able to access the interface static methods without implementing the interface.
 */
public class TestClassforIntfStaticMthd {
	public static void main(String[] args) {
		System.out.println(DefaultInterface.isEmpty(Arrays.asList(2)));
	}

}

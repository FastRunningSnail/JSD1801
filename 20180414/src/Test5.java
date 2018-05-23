import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test5 {
	public static void main(String[] args) {
		int[] ints = { 1, 2, 3 };
		Class clazz = ints.getClass();
		System.out.println("".getClass());
		System.out.println(ints.getClass());

		Constructor[] cs = clazz.getConstructors();
		System.out.println(cs.length);
		Field[] fields = clazz.getDeclaredFields();
		System.out.println(fields.length);
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println(methods.length);

		int length = Array.getLength(ints);
		System.out.println(length);
		System.out.println(Array.getInt(ints, 0));

	}

}

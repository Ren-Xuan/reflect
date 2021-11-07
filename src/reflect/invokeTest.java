package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class invokeTest {
	public void add(Integer param1,Integer param2) {
		System.out.println("add:"+(param1.intValue()+param2.intValue()));
	}
	public void StringAdd(String str) {
		System.out.println("StrAdd:"+str);
	}
	public static void main(String[]args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		java.lang.reflect.Method mth=invokeTest.class.getMethod("add", new Class[] {Integer.class,Integer.class});
		mth.invoke(invokeTest.class.newInstance(), new Integer(3),new Integer(4));
		
		Method mth2=invokeTest.class.getMethod("StringAdd", new Class[] {String.class});
		mth2.invoke(invokeTest.class.newInstance(), "test");
	}
}

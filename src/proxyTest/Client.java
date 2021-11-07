package proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String []args) {
		realSubject rs=new realSubject();
		InvocationHandler ds=new DynamicSubject(rs);
		Class cls = rs.getClass();
		subject sub=(subject)Proxy.newProxyInstance(cls.getClassLoader(),
				cls.getInterfaces(), ds);
		sub.request();
		
		
		System.out.println("------------------------------------");
		
	}
}

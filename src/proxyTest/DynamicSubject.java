/**
 * 
 */
package proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 灵均
 *
 */
public class DynamicSubject implements InvocationHandler{
	private Object sub;
	public DynamicSubject() {}
	public DynamicSubject(Object obj) {
		sub=obj;
	}
	@Override
	//接口声明所以方法都被集中处理，而不需要像静态代理那样每一个方法进行中转
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before calling "+method);
		method.invoke(sub, args);
		System.out.println("after calling "+method);
		return null;
	}

}

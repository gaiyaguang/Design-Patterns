package proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 *  动态代理是根据被代理的接口生成所有的方法，所有被代理的方法都由InvocationHandler接管实际的处理任务。
 */
public class GamePlayerIH implements InvocationHandler{

	private Object obj;//被代理的对象
	
	public GamePlayerIH(Object obj){//构造方法，传入被代理的对象
		this.obj=obj;
	}
	
	public Object invoke(Object obj, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		beforMethod(method);
		Object object=method.invoke(this.obj, args);//接管实际的所有被代理方法的处理任务
		afterMethod(method);
		return object;
	}
	
	private void beforMethod(Method method){//方法执行前添加操作
		System.out.println("before..."+method.getName());
	}
	
	private void afterMethod(Method method){//方法执行后添加操作
		System.out.println("after..."+method.getName());
	}

}

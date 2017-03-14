package proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 *  ��̬�����Ǹ��ݱ�����Ľӿ��������еķ��������б�����ķ�������InvocationHandler�ӹ�ʵ�ʵĴ�������
 */
public class GamePlayerIH implements InvocationHandler{

	private Object obj;//������Ķ���
	
	public GamePlayerIH(Object obj){//���췽�������뱻����Ķ���
		this.obj=obj;
	}
	
	public Object invoke(Object obj, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		beforMethod(method);
		Object object=method.invoke(this.obj, args);//�ӹ�ʵ�ʵ����б��������Ĵ�������
		afterMethod(method);
		return object;
	}
	
	private void beforMethod(Method method){//����ִ��ǰ��Ӳ���
		System.out.println("before..."+method.getName());
	}
	
	private void afterMethod(Method method){//����ִ�к���Ӳ���
		System.out.println("after..."+method.getName());
	}

}

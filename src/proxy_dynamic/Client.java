package proxy_dynamic;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gamePlayer=new GamePlayer();//��������
		GamePlayerIH handler=new GamePlayerIH(gamePlayer);//InvacationHandlerʵ��
		IGamePlayer proxy=(IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),gamePlayer.getClass().getInterfaces(),handler);//�������
		proxy.login("whiteLoyal", "123456");//��¼
		proxy.killBoss();//ɱ��
		proxy.update();//����
	}

}

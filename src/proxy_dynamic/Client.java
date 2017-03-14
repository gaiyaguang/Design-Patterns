package proxy_dynamic;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gamePlayer=new GamePlayer();//被代理类
		GamePlayerIH handler=new GamePlayerIH(gamePlayer);//InvacationHandler实例
		IGamePlayer proxy=(IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),gamePlayer.getClass().getInterfaces(),handler);//代理对象
		proxy.login("whiteLoyal", "123456");//登录
		proxy.killBoss();//杀怪
		proxy.update();//升级
	}

}

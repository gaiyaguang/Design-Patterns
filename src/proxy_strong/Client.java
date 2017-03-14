package proxy_strong;
/**
 * 强制代理，客户端必须从真实角色，获得其指定的代理，然后再通过代理访问真实角色
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gamePlayer=new GamePlayer();
		GameProxy gameProxy=(GameProxy) gamePlayer.getProxy();
		gameProxy.login("whiteLoyal","123456");
		gameProxy.killBoss();
		gameProxy.update();
	}

}

package proxy_normal;
/**
 * 普通代理，客户端只能访问代理角色，不能访问真实角色
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gamePlayer=new GamePlayer();//真实玩家
		GameProxy gameProxy=new GameProxy(gamePlayer);//代理玩家
		gameProxy.login("whiteLoyal","123456");//登录
		gameProxy.killBoss();//杀怪
		gameProxy.update();//升级
	}
}

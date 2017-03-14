package proxy_strong;
/**
 * 游戏玩家接口，定义游戏玩家的基本行为
 */
public interface IGamePlayer {

	public void login(String name,String password);//登陆游戏
	
	public void killBoss();//杀怪
	
	public void update();//升级
	
	public IGamePlayer getProxy();//获取代理
}

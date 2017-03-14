package proxy_normal;
/**
 * 普通代理，客户端只能访问代理角色，不能访问真实角色
 */
public class GameProxy implements IGamePlayer{
	
	private IGamePlayer realPlayer;//真实玩家，被代理对象
	
	public GameProxy(IGamePlayer iGamePlayer){//构造函数，传入被代理对象
		this.realPlayer=iGamePlayer;
	}

	public void login(String name, String password) {//登录
		// TODO Auto-generated method stub
		this.realPlayer.login(name, password);
	}

	public void killBoss() {//杀怪
		// TODO Auto-generated method stub
		this.realPlayer.killBoss();
	}

	public void update() {//升级
		// TODO Auto-generated method stub
		this.realPlayer.update();
	}

}

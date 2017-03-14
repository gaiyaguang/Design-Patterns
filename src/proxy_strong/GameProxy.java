package proxy_strong;

import proxy_strong.IGamePlayer;
/**
 * 强制代理，客户端必须从真实角色，获得其指定的代理，然后再通过代理访问真实角色
 */
public class GameProxy implements IGamePlayer{

private IGamePlayer realPlayer;//真实玩家，被代理对象
	
	public GameProxy(IGamePlayer gamePlayer){//构造函数，传入被代理对象
		this.realPlayer=gamePlayer;
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

	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

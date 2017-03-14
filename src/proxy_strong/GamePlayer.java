package proxy_strong;

public class GamePlayer implements IGamePlayer{

	private String name;//游戏玩家的名字
	private IGamePlayer proxy;//代理
	
	public void login(String name, String password) {//登录
		// TODO Auto-generated method stub
		this.name=name;
		if(isProxy())
		System.out.println(this.name+"欢迎来到召唤师峡谷...");
		else
		System.out.println("请通过指定的代理访问...");
	}

	public void killBoss() {//杀怪
		// TODO Auto-generated method stub
		if(isProxy())
		System.out.println(this.name+"已经击杀一名敌方英雄...");
		else
		System.out.println("请通过指定的代理访问...");
	}

	public void update() {//升级
		// TODO Auto-generated method stub
		if(isProxy())
		System.out.println(this.name+"已经获得王者勋章...");
		else
	    System.out.println("请通过指定的代理访问...");
	}

	public IGamePlayer getProxy() {//获取代理
		// TODO Auto-generated method stub
		return this.proxy= new GameProxy(this);
	}
	
	public boolean isProxy(){
		return this.proxy==null?false:true;
	}
}

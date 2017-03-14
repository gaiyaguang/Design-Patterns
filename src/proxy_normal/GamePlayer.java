package proxy_normal;




/**
 * 具体游戏玩家类，实现接口定义的方法
 */
public class GamePlayer implements IGamePlayer{
	
	private String name;//游戏玩家的名字

	public void login(String name, String password) {
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println(this.name+"欢迎来到召唤师峡谷...");
	}

	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"已经击杀一名敌方英雄...");
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"已经获得王者勋章...");
	}

}

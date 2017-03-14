package proxy_dynamic;
/**
 * 真实玩家类，具体实现接口定义好的方法
 */
public class GamePlayer implements IGamePlayer{
	
	private String name;//玩家姓名

	public void login(String name, String password) {//登录
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println(this.name+"欢迎来到召唤师峡谷...");
	}

	public void killBoss() {//杀怪
		// TODO Auto-generated method stub
		System.out.println(this.name+"您已经击毙敌方一名英雄...");
	}

	public void update() {//升级
		// TODO Auto-generated method stub
		System.out.println(this.name+"恭喜您获得王者勋章...");
	}

}

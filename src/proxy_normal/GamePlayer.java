package proxy_normal;




/**
 * ������Ϸ����࣬ʵ�ֽӿڶ���ķ���
 */
public class GamePlayer implements IGamePlayer{
	
	private String name;//��Ϸ��ҵ�����

	public void login(String name, String password) {
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println(this.name+"��ӭ�����ٻ�ʦϿ��...");
	}

	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�Ѿ���ɱһ���з�Ӣ��...");
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�Ѿ��������ѫ��...");
	}

}

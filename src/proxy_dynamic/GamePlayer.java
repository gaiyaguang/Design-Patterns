package proxy_dynamic;
/**
 * ��ʵ����࣬����ʵ�ֽӿڶ���õķ���
 */
public class GamePlayer implements IGamePlayer{
	
	private String name;//�������

	public void login(String name, String password) {//��¼
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println(this.name+"��ӭ�����ٻ�ʦϿ��...");
	}

	public void killBoss() {//ɱ��
		// TODO Auto-generated method stub
		System.out.println(this.name+"���Ѿ����ез�һ��Ӣ��...");
	}

	public void update() {//����
		// TODO Auto-generated method stub
		System.out.println(this.name+"��ϲ���������ѫ��...");
	}

}

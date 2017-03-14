package proxy_strong;

public class GamePlayer implements IGamePlayer{

	private String name;//��Ϸ��ҵ�����
	private IGamePlayer proxy;//����
	
	public void login(String name, String password) {//��¼
		// TODO Auto-generated method stub
		this.name=name;
		if(isProxy())
		System.out.println(this.name+"��ӭ�����ٻ�ʦϿ��...");
		else
		System.out.println("��ͨ��ָ���Ĵ������...");
	}

	public void killBoss() {//ɱ��
		// TODO Auto-generated method stub
		if(isProxy())
		System.out.println(this.name+"�Ѿ���ɱһ���з�Ӣ��...");
		else
		System.out.println("��ͨ��ָ���Ĵ������...");
	}

	public void update() {//����
		// TODO Auto-generated method stub
		if(isProxy())
		System.out.println(this.name+"�Ѿ��������ѫ��...");
		else
	    System.out.println("��ͨ��ָ���Ĵ������...");
	}

	public IGamePlayer getProxy() {//��ȡ����
		// TODO Auto-generated method stub
		return this.proxy= new GameProxy(this);
	}
	
	public boolean isProxy(){
		return this.proxy==null?false:true;
	}
}

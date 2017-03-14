package proxy_normal;
/**
 * ��ͨ�����ͻ���ֻ�ܷ��ʴ����ɫ�����ܷ�����ʵ��ɫ
 */
public class GameProxy implements IGamePlayer{
	
	private IGamePlayer realPlayer;//��ʵ��ң����������
	
	public GameProxy(IGamePlayer iGamePlayer){//���캯�������뱻�������
		this.realPlayer=iGamePlayer;
	}

	public void login(String name, String password) {//��¼
		// TODO Auto-generated method stub
		this.realPlayer.login(name, password);
	}

	public void killBoss() {//ɱ��
		// TODO Auto-generated method stub
		this.realPlayer.killBoss();
	}

	public void update() {//����
		// TODO Auto-generated method stub
		this.realPlayer.update();
	}

}

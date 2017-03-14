package proxy_strong;

import proxy_strong.IGamePlayer;
/**
 * ǿ�ƴ����ͻ��˱������ʵ��ɫ�������ָ���Ĵ���Ȼ����ͨ�����������ʵ��ɫ
 */
public class GameProxy implements IGamePlayer{

private IGamePlayer realPlayer;//��ʵ��ң����������
	
	public GameProxy(IGamePlayer gamePlayer){//���캯�������뱻�������
		this.realPlayer=gamePlayer;
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

	public IGamePlayer getProxy() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

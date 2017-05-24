package memento;

import java.util.HashMap;

/**
 * ���ݹ�����
 */
public class MementoManager {
	
	private HashMap<String,Memento> mementos=new HashMap<String,Memento>();//���汸��
	
	//��ӱ���
	public void addMemento(String time,Memento memento){
		if(this.mementos==null){
			this.mementos=new HashMap<String,Memento>();
		}
		this.mementos.put(time,memento);
	}
	
	//����ʱ���ȡ����
	public Memento getMemento(String time){
		return this.mementos.get(time);
	}
}

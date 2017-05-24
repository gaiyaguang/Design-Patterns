package memento;

import java.util.HashMap;

/**
 * 备份管理类
 */
public class MementoManager {
	
	private HashMap<String,Memento> mementos=new HashMap<String,Memento>();//保存备份
	
	//添加备份
	public void addMemento(String time,Memento memento){
		if(this.mementos==null){
			this.mementos=new HashMap<String,Memento>();
		}
		this.mementos.put(time,memento);
	}
	
	//根据时间获取备份
	public Memento getMemento(String time){
		return this.mementos.get(time);
	}
}

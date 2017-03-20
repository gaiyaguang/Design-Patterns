package command;
/**
 * 命令抽象类，定义命令的基本属性和行为
 */
public abstract class Command {

    protected RequirementGroup requireGroup=new RequirementGroup();//需求组
	
	protected PageGroup pageGroup=new PageGroup();//页面组
	
	protected CodeGroup codeGroup=new CodeGroup();//编码组
	
	public abstract void exec();//事件执行方法
}

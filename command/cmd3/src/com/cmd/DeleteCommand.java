package com.cmd;

public class DeleteCommand extends Command {
	
	//对哪个Receiver类进行命令处理
	private Receiver receiver;
	//构造函数传递接收者
	public DeleteCommand(Receiver _receiver){
		this.receiver = _receiver;
	}
	//必须实现一个命令
	public void execute() {
		//业务处理
		this.receiver.find();
		this.receiver.delete();
		this.receiver.plan();
	}
	
}

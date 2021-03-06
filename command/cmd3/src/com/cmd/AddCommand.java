package com.cmd;

public class AddCommand extends Command {
	
	//对哪个Receiver类进行命令处理
	private Receiver receiver;
	//构造函数传递接收者
	public AddCommand(Receiver _receiver){
		this.receiver = _receiver;
	}
	//必须实现一个命令
	public void execute() {
		//业务处理
		this.receiver.find();
		this.receiver.add();
		this.receiver.plan();
	}
		

}

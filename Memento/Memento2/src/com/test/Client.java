package com.test;

public class Client {
	public static void main(String[] args) {
		//声明出主角
		Boy boy = new Boy();
		//声明出备忘录的管理者
		Caretaker caretaker = new Caretaker();
		
		//初始化当前状态
		boy.setState("心情很棒！");
		System.out.println("=====男孩现在的状态======");
		System.out.println(boy.getState());
		
		//需要记录下当前状态呀
		caretaker.setMemento(boy.createMemento()); // 备份
		
		//男孩去追女孩， 状态改变
		boy.changeState();
		System.out.println("\n=====男孩追女孩子后的状态======");
		System.out.println(boy.getState());
		//追女孩失败， 恢复原状
		boy.restoreMemento(caretaker.getMemento());	// 取出备份
		
		System.out.println("\n=====男孩恢复后的状态======");
		System.out.println(boy.getState());
	}
}
/*

注意看黑体部分， 就修改了这么多， 看看程序的逻辑是不是清晰了很多， 需要备份的时
候就创建一个备份， 然后丢给备忘录管理者进行管理， 要取的时候再从管理者手中拿到这个
备份。 这个备份者就类似于一个备份的仓库管理员， 创建一个丢进去， 需要的时候再拿出
来。 这就是备忘录模式。

*/
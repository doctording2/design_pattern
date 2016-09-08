/*
Prototype 模式的结构和实现都很简单，其关键就是（ C++中）拷贝构造函数的实现方
式， 这也是 C++实现技术层面上的事情。 由于在示例代码中不涉及到深层拷贝（主要指有指
针、复合对象的情况）， 因此我们通过编译器提供的默认的拷贝构造函数（按位拷贝）的方
式进行实现。 说明的是这一切只是为了实现简单起见， 也因为本文档的重点不在拷贝构造函
数的实现技术，而在 Prototype 模式本身的思想。
*/
#include <iostream>
#include "Prototype.h"

using namespace std;

int main(int argc,char* argv[])
{
	Prototype* p = new ConcretePrototype();
	Prototype* p1 = p->Clone();
	Prototype* p2 = p->Clone();
	return 0;
}
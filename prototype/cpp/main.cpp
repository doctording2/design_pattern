/*
Prototype ģʽ�Ľṹ��ʵ�ֶ��ܼ򵥣���ؼ����ǣ� C++�У��������캯����ʵ�ַ�
ʽ�� ��Ҳ�� C++ʵ�ּ��������ϵ����顣 ������ʾ�������в��漰����㿽������Ҫָ��ָ
�롢���϶����������� �������ͨ���������ṩ��Ĭ�ϵĿ������캯������λ�������ķ�
ʽ����ʵ�֡� ˵��������һ��ֻ��Ϊ��ʵ�ּ������ Ҳ��Ϊ���ĵ����ص㲻�ڿ������캯
����ʵ�ּ��������� Prototype ģʽ�����˼�롣
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
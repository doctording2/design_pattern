#include <cstdio> 
#include <cstdlib>
#include <cstring>
#include <cmath>
#include <string>
#include <vector> 
#include <algorithm> 
#include <iostream>
#include <stack>
#include <map>

using namespace std;

//操作系统  
class IOS
{
public:
	IOS(){}
	virtual ~IOS(){}

	virtual void Run() = 0;
};

class CWindows : public IOS
{
public:
	CWindows(){}
	virtual ~CWindows(){}

	virtual void Run()
	{
		printf("[Window OS]!\n");
	}
};

class CLinux : public IOS
{
public:
	CLinux(){}
	virtual ~CLinux(){}

	virtual void Run()
	{
		printf("[Linux OS]!\n");
	}
};

//电脑品牌  
class ICompute
{
public:
	ICompute(){}
	virtual ~ICompute(){}

	virtual void Install(IOS* pOS) = 0;
};

class CIBM : public ICompute
{
public:
	CIBM(){}
	virtual ~CIBM(){}

	virtual void Install(IOS* pOS)
	{
		printf("IBM compute install ");
		pOS->Run();
	}
};

class CHP : public ICompute
{
public:
	CHP(){}
	virtual ~CHP(){}

	virtual void Install(IOS* pOS)
	{
		printf("HP compute install ");
		pOS->Run();
	}
};

int main()
{
	IOS* pW = new CWindows();
	IOS* pL = new CLinux();

	ICompute* pIBM = new CIBM();
	pIBM->Install(pW);
	pIBM->Install(pL);

	ICompute* pHP = new CHP();
	pHP->Install(pW);
	pHP->Install(pL);

	return 0;
}

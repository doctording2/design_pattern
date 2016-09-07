#include <iostream>

using namespace std;

class Singleton
{
private:
	static Singleton* _instance;
protected:
	Singleton();
public:
	static Singleton* Instance();
};

Singleton* Singleton::_instance = NULL;

Singleton::Singleton()
{
	cout << "Singleton::Singleton()" << endl;
}

Singleton* Singleton::Instance()
{
	if (_instance == NULL)
	{
		_instance = new Singleton();
	}
	return _instance;
}

int main()
{
	for(int i=0;i<3;i++)
	{
		Singleton *sig = Singleton::Instance();
	}
	return 0;
}

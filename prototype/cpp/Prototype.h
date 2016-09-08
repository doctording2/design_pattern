//Prototype.h
#ifndef _PROTOTYPE_H_
#define _PROTOTYPE_H_

class Prototype
{
public:
	virtual ~Prototype();
	virtual Prototype* Clone() const = 0;
protected:
	Prototype();
private:
};

class ConcretePrototype:public Prototype
{
public:
	ConcretePrototype();
	ConcretePrototype(const ConcretePrototype& cp); //¿½±´¹¹Ôìº¯Êý
	~ConcretePrototype();
	Prototype* Clone() const;
protected:
private:
};

#endif //~_PROTOTYPE_H_
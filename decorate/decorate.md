
参考：
http://www.cnblogs.com/ASPNET2008/archive/2008/06/15/1222724.html

装饰模式（ Decorator Pattern） 是一种比较常见的模式， 其定义如下： 
Attach additionalresponsibilities to an object dynamically keeping the same interface.
Decorators provide a flexiblealternative to subclassing for extending functionality.
（ 动态地给一个对象添加一些额外的职责。就增加功能来说， 装饰模式相比生成子类更为灵活。）


在类图中， 有四个角色需要说明：
* Component抽象构件
Component是一个接口或者是抽象类， 就是定义我们最核心的对象， 也就是最原始的对
象， 如上面的成绩单。
注意 在装饰模式中， 必然有一个最基本、 最核心、 最原始的接口或抽象类充当
Component抽象构件

* ConcreteComponent 具体构件
ConcreteComponent是最核心、 最原始、 最基本的接口或抽象类的实现， 你要装饰的就是
它。

* Decorator装饰角色
一般是一个抽象类， 做什么用呢？ 实现接口或者抽象方法， 它里面可不一定有抽象的方
法呀， 在它的属性里必然有一个private变量指向Component抽象构件。 

* 具体装饰角色
ConcreteDecoratorA和ConcreteDecoratorB是两个具体的装饰类， 你要把你最核心的、 最
原始的、 最基本的东西装饰成其他东西， 上面的例子就是把一个比较平庸的成绩单装饰成家
长认可的成绩单。


---

## 装饰模式的优点
* 装饰类和被装饰类可以独立发展， 而不会相互耦合。 换句话说， Component类无须知
道Decorator类， Decorator类是从外部来扩展Component类的功能， 而Decorator也不用知道具
体的构件。

* 装饰模式是继承关系的一个替代方案。 我们看装饰类Decorator， 不管装饰多少层， 返
回的对象还是Component， 实现的还是is-a的关系。

* 装饰模式可以动态地扩展一个实现类的功能， 这不需要多说， 装饰模式的定义就是如
此

## 装饰模式的缺点
对于装饰模式记住一点就足够了： 多层的装饰是比较复杂的。 为什么会复杂呢？ 你想想
看， 就像剥洋葱一样， 你剥到了最后才发现是最里层的装饰出现了问题， 想象一下工作量
吧， 因此， 尽量减少装饰类的数量， 以便降低系统的复杂度。

## 装饰模式的使用场景
* 需要扩展一个类的功能， 或给一个类增加附加功能。
* 需要动态地给一个对象增加功能， 这些功能可以再动态地撤销。
* 需要为一批的兄弟类进行改装或加装功能， 当然是首选装饰模式。

----

装饰模式是对继承的有力补充。 你要知道继承不是万能的， 继承可以解决实际的问题，
但是在项目中你要考虑诸如易维护、 易扩展、 易复用等， 而且在一些情况下（ 比如上面那个
成绩单例子） 你要是用继承就会增加很多子类， 而且灵活性非常差， 那当然维护也不容易
了， 也就是说装饰模式可以替代继承， 解决我们类膨胀的问题。 同时， 你还要知道继承是静
态地给类增加功能， 而装饰模式则是动态地增加功能， 在上面的那个例子中， 我不想要
SortDecorator这层的封装也很简单， 于是直接在Father中去掉就可以了， 如果你用继承就必须
修改程序


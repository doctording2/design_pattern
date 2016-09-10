访问者模式（ Visitor Pattern） 是一个相对简单的模式， 其定义如下： 
Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new
operation without changing the classes of the elements on which it operates.
（ 封装一些作用于某种数据结构中的各元素的操作， 它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。）

---

## 几个角色的职责

* Visitor——抽象访问者
抽象类或者接口， 声明访问者可以访问哪些元素， 具体到程序中就是visit方法的参数定
义哪些对象是可以被访问的

* ConcreteVisitor——具体访问者
它影响访问者访问到一个类后该怎么干， 要做什么事情。

* Element——抽象元素
接口或者抽象类， 声明接受哪一类访问者访问， 程序上是通过accept方法中的参数来定
义的

* ConcreteElement——具体元素
实现accept方法， 通常是visitor.visit(this)， 基本上都形成了一种模式了。

* ObjectStruture——结构对象
元素产生者， 一般容纳在多个不同类、 不同接口的容器， 如List、 Set、 Map等， 在项目
中， 一般很少抽象出这个角色。

---
## 访问者模式的优点

* 符合单一职责原则
具体元素角色也就是Employee抽象类的两个子类负责数据的加载， 而Visitor类则负责报
表的展现， 两个不同的职责非常明确地分离开来， 各自演绎变化。

* 优秀的扩展性
由于职责分开， 继续增加对数据的操作是非常快捷的， 例如， 现在要增加一份给大老板
的报表， 这份报表格式又有所不同， 直接在Visitor中增加一个方法， 传递数据后进行整理打
印

* 灵活性非常高
例如， 数据汇总， 就以刚刚我们说的Employee的例子， 如果我现在要统计所有员工的工
资之和， 怎么计算？ 把所有人的工资for循环加一遍？ 是个办法， 那我再提个问题， 员工工资
×1.2， 部门经理×1.4， 总经理×1.8， 然后把这些工资加起来， 你怎么处理？ 1.2， 1.4， 1.8是什
么？ 不是吧？ ！ 你没看到领导不论什么时候都比你拿得多， 工资奖金就不说了， 就是过节发
个慰问券也比你多， 就是这个系数在作祟。 我们继续说你想怎么统计？ 使用for循环， 然后使
用instanceof来判断是员工还是经理？ 这可以解决， 但不是个好办法， 好办法是通过访问者模
式来实现， 把数据扔给访问者， 由访问者来进行统计计算。

---
参考文章

http://blog.csdn.net/zhengzhb/article/details/7489639



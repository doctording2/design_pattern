
http://blog.csdn.net/hguisu/article/details/7518060

## 构建模式的组成

× 抽象建造者角色（Builder）：为创建一个Product对象的各个部件指定抽象接口，以规范产品对象的各个组成成分的建造。一般而言，此角色规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。

× 具体建造者（ConcreteBuilder）

1）实现Builder的接口以构造和装配该产品的各个部件。即实现抽象建造者角色Builder的方法。

2）定义并明确它所创建的表示，即针对不同的商业逻辑，具体化复杂对象的各部分的创建

3) 提供一个检索产品的接口

4) 构造一个使用Builder接口的对象即在指导者的调用下创建产品实例

指导者（Director）：调用具体建造者角色以创建产品对象的各个部分。指导者并没有涉及具体产品类的信息，真正拥有具体产品的信息是具体建造者对象。它只负责保证对象各部分完整创建或按某种顺序创建。

产品角色（Product）：建造中的复杂对象。它要包含那些定义组件的类，包括将这些组件装配成产品的接口。

---

## 效果
Builder模式的主要效果：

1 ) 它使你可以改变一个产品的内部表示 Builder对象提供给导向器一个构造产品的抽象接口。该接口使得生成器可以隐藏这个产品的表示和内部结构。它同时也隐藏了该产品是如何装配的。因为产品是通过抽象接口构造的，你在改变该产品的内部表示时所要做的只是定义一个新的生成器。

2) 它将构造代码和表示代码分开 Builder模式通过封装一个复杂对象的创建和表示方式提高了对象的模块性。客户不需要知道定义产品内部结构的类的所有信息；这些类是不出现在Builder接口中的。每个Concrete Builder包含了创建和装配一个特定产品的所有代码。这些代码只需要写一次；然后不同的Director可以复用它以在相同部件集合的基础上构作不同的Product。

3 ) 它使你可对构造过程进行更精细的控制 Builder模式与一下子就生成产品的创建型模式不同，它是在导向者的控制下一步一步构造产品的。仅当该产品完成时导向者才从生成器中取回它。因此Builder接口相比其他创建型模式能更好的反映产品的构造过程。这使你可以更精细的控制构建过程，从而能更精细的控制所得产品的内部结构。

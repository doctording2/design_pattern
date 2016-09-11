迭代器模式（ Iterator Pattern） 目前已经是一个没落的模式， 基本上没人会单独写一个迭代器， 除非是产品性质的开发， 其定义如下：
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
（它提供一种方法访问一个容器对象中各个元素， 而又不需暴露该对象的内部细节。）


迭代器是为容器服务的， 那什么是容器呢？ 能容纳对象的所有类型都可以称之为容
器， 例如Collection集合类型、 Set类型等， 迭代器模式就是为解决遍历这些容器中的元素而诞生的。

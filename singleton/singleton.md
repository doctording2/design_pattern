实例：
我是皇帝我独苗

---

单例模式，确保某一个类只有一个实例，而且自行实例化 并向整个系统提供这个实例

优点
===

× 减少内存开销，特别是当一个类需要不断的创建，销毁时

× 减少性能开销

× 避免对资源的重复占用，例如一个写文件动作，由于只有一个实例存在内存中，避免对同一个资源文件同时写

× 可以设置为全局的访问点，优化和共享资源访问


缺点
===

× 单例模式一般没有接口，扩展困难，不易测试

× 单例模式与单一职责原则有冲突。一个类应该只实现一个逻辑，而不关心她是否是单例的。
是不是要用单例取决于环境，单例模式把i"要单例"和业务逻辑融合在一个类中


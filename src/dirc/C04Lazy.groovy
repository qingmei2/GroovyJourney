package dirc

//我们想把耗时对象的构建推迟到真正需要时。完全可以懒惰与高效并得，编写更少的代码，同时又能获得惰性初始化的所有好处。

//下面的例子将推迟创建Heavy实例，直到真正需要它时。既可以在声明的地方直接初始化实例，也可以将创建逻辑包在一个闭包中。

def need = new AsNeed(value: 1000)
println need.heavy1.size
println need.heavy1.size
println need.heavy2.size


//Groovy不仅推迟了创建，还将字段标记为volatile，并确保创建期间是线程安全的。实例会在第一次访问这些字段的时候被创建，在输出中可以看到：
//另一个好处是，@Lazy注解提供了一种轻松实现线程安全的虚拟代理模式（virtualproxypattern）的方式。
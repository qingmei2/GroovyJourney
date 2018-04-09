package dirc

//不可变对象天生是线程安全的，将其字段标记为final是很好的实践选择。如果用@Immutable注解标记一个类，Groovy会将其字段标记为final的，并且额外为我们创建一些便捷方法，从而使得“做正确的事情”变得更容易了。
//作为反馈，Groovy给我们提供了一个构造器，其参数以类中字段定义的顺序依次列出。在构造时间过后，字段就无法修改了。此外，Groovy还添加了hashCode()、equals()和toString()方法。
//运行所提供的构造器和toString()方法:

//可以使用@Immutable注解轻松地创建轻量级的不可变值对象。在基于Actor模型的并发应用中，线程安全是个大问题，而这些不可变值对象是作为消息传递的理想实例。
println new ImmutableStudent("jack", 24)
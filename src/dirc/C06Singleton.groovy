package dirc

//要实现单件模式，正常来讲，我们会创建一个静态字段，并创建一个静态方法来初始化该字段，然后返回单件实例。我们必须确保该方法是线程安全的，同时还要决定是否要惰性创建该单件。
//而通过使用@Singleton变换则完全可以避免这种麻烦，如下面例子所示：
//
//这里使用@Singleton注解标记了TheUnique类，以生成静态的getInstance()方法。因为此处将lazy属性的值设为了true，所以会将实例的创建延迟到请求时。
//Groovy不仅将实例创建延迟到了最后责任时刻，还保证创建部分是线程安全的。

President.instance.hello()
President.instance.hello()

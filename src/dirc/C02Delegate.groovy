package dirc

//只有当派生类是真正可替换的，而且可代替基类使用时，继承才显示出其优势。从纯粹的代码复用角度看，对于其他大部分用途，委托要优于继承。
//然而在Java中我们不太愿意使用委托，因为会导致代码冗余，而且需要更多工作。Groovy使委托变得非常容易，所以我们可以做出正确的设计选择。
def manager = new Manager()
manager.analyze()
manager.work()
manager.writeReport()

//在编译时，Groovy会检查Manager类，如果该类中没有被委托类中的方法，就把这些方法从被委托类中引入进来。因此，首先它会引入Expert类中的analyze()方法。
//而从Worker类中，只会把work()和writeReport()方法因为进来。这时候，因为从Expert类带来的analyze()方法已经出现在Manager类中，所以Worker类中的analyze()方法会被忽略。

//对于引入的每个方法，Groovy会简单地把对该方法的调用路由给实例上的相应方法，就像这样：publicObjectanalyze(){expert.analyze()}。委托类会对新获得的方法做出响应，在下面的输出中可以看到：

//因为有了@Delegate注解，Manager类是可扩展的。如果在Worker或Expert类上添加或去掉了方法，不必对Manager类做任何修改，相应的变化就会生效。只需要重新编译代码，剩下的事Groovy会处理。
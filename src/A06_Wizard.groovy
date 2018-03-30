class A06_Wizard {

    //静态方法内可以使用this来引用Class对象。在下面的例子中，learn()方法返回的是Class对象，所以可以使用链式调用：
    def static learn(trick,action) {
        //...
        this
    }
}


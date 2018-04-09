package dirc

//在Groovy中，经常会按照传统的Java语法，使用new来创建实例。然而，在创建DSL时，去掉这个关键字，表达会更流畅。
//@Newify注解可以帮助创建类似Ruby的构造器，在这里，new是该类的一个方法。该注解还可以用来创建类似Python的构造器（也类似Scala的applicator），这里可以完全去掉new。要创建类似Python的构造器，必须向@Newify注解指明类型列表。
//只有将auto=false这个值作为一个参数设置给@Newify，Groovy才会创建Ruby风格的构造器。可以在不同的作用域中使用@Newify注解，比如类或方法，如下面例子所示：
@Newify(value = [Student, ImmutableStudent])
def fluentCreate() {

    println Student.new(firstName: "Zhang", lastName: "Sanfeng", age: 24, address: "China")
    println ImmutableStudent.new("LiHua", 29)
}

//在创建DSL时，@Newify注解非常有用，它可以使得实例创建更像是一个隐式操作。
fluentCreate()
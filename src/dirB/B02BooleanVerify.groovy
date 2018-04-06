package dirB

//Java要求if语句的条件部分必须是一个布尔表达式，比如前面例子中的if(obj!=null)和if(val>0)。
//Groovy会尝试推断，如果在需要布尔值的地方放了一个对象引用，Groovy会检查该引用是否为null。它将null视作false，将非null的值视作true.

str = 'hello'

if (str) {
    println str
}

//更准确的说，表达式的结果还与对象的类型有关。例如，如果对象是一个集合（如java.util.ArrayList），那么Groovy会检查该集合是否为空。
//因此，在这种情况下，只有当obj不为null，而且该集合至少包含一个元素时，表达式if(obj)才会被计算为true.

str1 = null

println str1 ? 'str1 is not null' : 'str1 is null'

str2 = [1, 2, 3]

println str2 ? 'str2 is not null' : 'str2 is null'

str3 = []

println str3 ? 'str3 is not null' : 'str3 is null'

//集合类不是唯一受到特殊对待的。那么有哪些类型将被特殊对待，Groovy又是如何计算它们的呢？

/**
 | 类型 | 为真的条件 |
 | - | - |
 | Boolean | true |
 | Collection | 集合不为空 |
 | character | 值不为0 |
 |CharSequence|长度不为0|
 |Enumration|hasMoreElements()为true|
 |Iterator|hasNext()为true|
 |Number| Double值部位0|
 |Map|映射不为空|
 |Matcher|至少有一个匹配|
 |Object[]|长度大于0|
 |其他引用类型|引用不为null|
 */

//除了使用Groovy内建的布尔求值约定，在自己的类中，还可以通过实现asBoolean()方法来编写自己的布尔转换。

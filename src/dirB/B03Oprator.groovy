package dirB

//Groovy支持操作符重载，可以巧妙地应用这一点来创建DSL

//比如我们可以重载++操作符，该示例映射的是String类的next()方法：
for (ch = 'a'; ch < 'd'; ch++) {
    println ch
}

//Groovy中还可以使用简洁的for-each语法，不过两种实现都用到了String类的next()方法：
for (ch in 'a'..'c') {
    println ch
}

//要向集合中添加元素，可以使用<<操作符，该操作符会被转换为Groovy在Collection上添加的leftShift()方法:

list = ['hello']
list << 'groovy!'
println list

//通过添加映射方法，我们可以为自己的类提供操作符，比如为+操作符添加plus()方法:

c1 = new B03ComplexNumber(real: 1, imaginary: 4)
c2 = new B03ComplexNumber(real: 2, imaginary: 3)
println c1 + c2

//ComplexNumber类重载了+操作符。对于计算涉及负数平方根的复杂方程式，复数非常有用。复数有实部和虚部。
//因为在ComplexNumber类上添加了plus()方法，所以可以使用+操作符把两个复数加到一起，得到又一个作为结果的复数：

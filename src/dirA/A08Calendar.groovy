package dirA

//代替Calendar.getInstance()
Calendar.instance

str = 'hello'

//谨慎使用class属性，类似Map/生成器等一些类对该属性有特殊处理，因此为了避免意外，一般使用getClass()
def name = str.class.name

println "the string = $str"
println "the string class name = $name"

package dirA

//向方法传递多个参数，这在很多编程语言中都司空见惯。但是从方法返回多个结果，尽管可能非常实用，却不那么常见。
//要想从方法返回多个结果，并将它们一次性赋给多个变量，我们可以返回一个数组，然后将多个变量以逗号分隔，放在圆括号中，置于赋值表达式左侧即可。

//后面的例子中有一个负责将全名分割为名字（FirstName）和姓氏（LastName）的方法。
//不出所料，split()方法就返回一个数组。可以把splitName()的结果赋给一对变量：firstName和lastName。Groovy会把结果中的两个值分别赋给这两个变量。


def splitFullName(String fullname) {
    fullname.split ' '
}

def (firstname, lastname) = splitFullName('James Bond')

println "$lastname, $firstname $lastname"

//交换值的方式

def name1 = 'name1'
def name2 = 'name2'

println "$name1 and $name2"

(name1, name2) = [name2, name1]

println "$name1 and $name2"

//当变量与值的数目不匹配时，如果有多余的变量，groovy会把它们设置为null，多余的值则会被丢弃

def (names) = splitFullName('James Bond')
println "$names"

//左侧只有两个变量，因此Spike和Tyke会被丢弃
def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"

def (String first, String second, String third) = ['Tom', 'Jerry']
println "$first and $second and $third"

//如果多余的变量是不能设置为null的基本类型，Groovy将会抛出一个异常

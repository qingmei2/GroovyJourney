package dirA

//groovy 可以把方法和构造器形参设置为可选择的
//但是这些形参必须位于形参列表的末尾
def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

//同时，groovy还会把末尾的数组形参视作可选的
//因此，可以为最后一个形参提供0个或者多个值
def task(name, String[] details) {
    println "$name - $details"
}

task 'call', '123-456-7890'
task 'call', '123-456-7890', '234,567,890'
task 'checkmail'

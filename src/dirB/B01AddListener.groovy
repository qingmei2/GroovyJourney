package dirB

//Groovy 不需要显示的通过new创建匿名内部类的实例
//调用了addActionListener方法，同时为该方法提供了一个代码块，借助as操作符，相当于实现了ActionListener接口。

def button = new Button()

listener = { println 'addListener' }

button.addOnClickListener(listener) as OnClickListener

//Groovy自会处理剩下的工作。它会拦截对接口中任何方法的调用，然后将调用路由到我们提供的代码块。
//对于有多个方法的接口，如果打算为其所有方法提供一个相同的实现，和上面一样，不需要特殊的操作。

button.addOnLongClickListener(listener) as OnLongClickListener

//Groovy没有强制实现接口中的所有方法：可以只定义自己关心的，而不考虑其他方法。
//如果剩下的方法从来不会被调用，那也就没必要去实现这些方法了。当在单元测试中通过实现接口来模拟某些行为时，这项技术非常有用。

//但是在大多数实际情况下，接口中的每个方法需要不同的实现。不用担心，Groovy可以摆平。
//只需要创建一个映射，以每个方法的名字作为键，以方法对应的代码体作为键值，同时使用简单的Groovy风格，用冒号（:）分隔方法名和代码块即可。

//不必实现所有方法，只需实现真正关心的那些即可。如果未予实现的方法从未被调用过，那么也就没有必要浪费精力去实现这些伪存根。
//当然，如果没提供的方法被调用了，则会出现NullPointerException。

def onStateChangelistener = [
        onCreate: {
            println 'onCreate'
        },
        onStart : {
            println 'onStart'
        },
        onStop  : {
            println 'onStop'
        }
]
button.addOnStateChangeListener(onStateChangelistener as OnStateChangeListener)

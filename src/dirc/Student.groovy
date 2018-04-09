package dirc

import groovy.transform.Canonical

//使用@Canonical
//如果要编写的toString()方法只是简单地显示以逗号分隔的字段值，则可以使用@Canonical变换让Grooovy编译器帮来干这个活。
//默认情况下，它生成的代码会包含所有字段。不过可以让它仅包含特定字段，而去掉其他字段，
@Canonical
class Student {

    String firstName
    String lastName
    int age
    String address
}

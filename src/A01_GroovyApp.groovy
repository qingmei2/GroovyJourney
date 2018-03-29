import java.util.function.Consumer
import java.util.stream.Stream

class A01_GroovyApp {

    public static void hello() {
        println('Hello World!')
    }

    public static void main(String[] args) {
        hello()

        Stream.of(1, 2, 3, 4)
                .forEach(new Consumer<Integer>() {
            @Override
            void accept(Integer integer) {
                println("Java print" + integer)
            }
        })

        for (i in 0..4) {
            println("function print" + i)
        }
    }
}

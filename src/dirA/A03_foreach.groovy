package dirA

import java.util.function.Consumer
import java.util.stream.Stream

Stream.of(1, 2, 3, 4)
        .forEach(new Consumer<Integer>() {
    @Override
    void accept(Integer integer) {
        println("Java print" + integer)
    }
})

for (i in 0..4) {
    print "$i"
}

println()

0.upto(4) { print "$it" }

println()

3.times { print("$it") }

println()

0.step(10, 2) { print("$it") }
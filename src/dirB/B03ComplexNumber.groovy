package dirB

class B03ComplexNumber {

    def real, imaginary //实部，虚部

    def plus(other) {
        new B03ComplexNumber(real: real + other.real,
                imaginary: imaginary + other.imaginary)
    }

    @Override
    String toString() {
        return "$real ${imaginary > 0 ? '+' : ''} ${imaginary}i "
    }
}

package dirc

class AsNeed {

    def value

    @Lazy
    Heavy heavy1 = new Heavy()
    @Lazy
    Heavy heavy2 = {
        new Heavy(size: value)
    }()

    AsNeed() {
        println 'Created AsNeed'
    }
}

package dirc

@Singleton(lazy = true, strict = false)
class President {

    private President() {
        println 'Instance'
    }

    def hello() {
        println 'hello'
    }
}

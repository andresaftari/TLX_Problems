fun main() {
    val arrOfStr = arrayOf('0', 'b', 'b', '0')

    var revs = ""
    var aslinya = ""

    arrOfStr.apply {
        reversed().forEach { revs += it }
        forEach { aslinya += it }
    }

    println(revs == aslinya)
}
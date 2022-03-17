import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()

    isAlmostPrime(start, end)
//    if (isPrime(start, end)) println("Prima")
//    else println("Bukan")
}

fun isAlmostPrime(start: Int, end: Int): Boolean {
    var prime = false
    var almost = 0

    val arr = arrayListOf<Int>()

    if (start >= 2 && end >= 2) {
        for (i in start..end) {
            var num = 0
            for (j in 1..i) if (i % j == 0) num += 1

            if (num == 2) {
//                println("$i")
                arr.add(i)
            }
        }
//        println(end)
//        arr.add(end)

        for (i in start..end) {
            arr.forEach { println(it)}
            break
        }
    }

    if (start < 2 && end < 2) {
        println("kondisi 1")
        return false
    }

    if (start == 2 && end == 2) {
        println("kondisi 2")
        return true
    }
    return true
}

private fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    for (i in 3 until n) {
        if (n % i == 0) return false
    }
    return true
}
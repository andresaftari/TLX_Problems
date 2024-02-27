package codewars.Kotlin

fun solution(number: Int): Int {
    if (number < 0) return 0

    var total = 0
    for (i in 0 until number) {
        if (i % 3 == 0 || i % 5 == 0) total += i
    }

    return total
}

import kotlin.test.assertEquals
import org.junit.Test

class TestExample {
  @Test
  fun testFixed() {
      assertEquals(23, solution(10))
      assertEquals(78, solution(20))
      assertEquals(9168, solution(200))
  }
}
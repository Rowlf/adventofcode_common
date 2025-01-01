// (C) 2025 A.Voß, a.voss@fh-aachen.de, kotlin@codebasedlearning.dev

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class NumbersTests {
    @Test
    fun testFunctionality() {
        "1,2,3".extractIntegers(',').let { assertTrue(it.toList() == listOf(1, 2, 3), "-> $it") }
        "4 5 6".extractLongs(' ').let { assertTrue(it.toList() == listOf(4L, 5L, 6L), "-> $it") }
    }

    @Test
    fun testValidity() {
        "1,2a,3,as,b4,5".extractIntegers(',').let { assertTrue(it.toList() == listOf(1, 3, 5), "-> $it") }
    }

    @Test
    fun testEdgeCases() {
        "abc,def".extractLongs(',').let { assertTrue(it.toList() == listOf<Long>(), "-> $it") }
    }
}

// (C) 2025 A.Voß, a.voss@fh-aachen.de, kotlin@codebasedlearning.dev

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse

class SequenceTests {
    @Test
    fun testEquality() {
        (1..5).asSequence().contentEquals((1..5).asSequence()).let { assertTrue(it, "-> $it") }
        (1..6).asSequence().contentEquals((1..5).asSequence()).let { assertFalse(it, "-> $it") }
    }

    @Test
    fun testEdgeCases() {
        (1..<1).asSequence().contentEquals((1..5).asSequence()).let { assertFalse(it, "-> $it") }
        (1..<1).asSequence().contentEquals((2..<2).asSequence()).let { assertTrue(it, "-> $it") }
    }

    @Test
    fun testConvenience() {
        (1..5).asSequence().contentEquals(listOf(1, 2, 3, 4, 5)).let { assertTrue(it, "-> $it") }
    }
}

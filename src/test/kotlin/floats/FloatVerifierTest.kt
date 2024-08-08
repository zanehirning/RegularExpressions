package floats

import org.example.floats.FloatVerifier
import kotlin.test.Test

class FloatVerifierTest {
    @Test
    fun testVerify() {
        val floatVerifier = FloatVerifier()
        assert(floatVerifier.verify("1.0"))
        assert(floatVerifier.verify("123.0"))
        assert(floatVerifier.verify("0.123"))
        assert(floatVerifier.verify("0.1230000"))
        assert(!floatVerifier.verify("123."))
        assert(!floatVerifier.verify("123.213fsdaklj"))
        assert(!floatVerifier.verify("1"))
        assert(!floatVerifier.verify("0123.2130"))
        assert(!floatVerifier.verify("0.0.0.0.123"))
    }
}
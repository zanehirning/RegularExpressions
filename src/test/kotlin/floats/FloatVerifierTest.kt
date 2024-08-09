package floats

import Verifier
import enums.RegexType
import kotlin.test.Test

class FloatVerifierTest {
    @Test
    fun testVerify() {
        val floatVerifier = Verifier()
        assert(floatVerifier.verify("1.0", RegexType.FLOAT))
        assert(floatVerifier.verify("123.0", RegexType.FLOAT))
        assert(floatVerifier.verify("0.123", RegexType.FLOAT))
        assert(floatVerifier.verify("0.1230000", RegexType.FLOAT))
        assert(!floatVerifier.verify("123.", RegexType.FLOAT))
        assert(!floatVerifier.verify("123.213fsdaklj", RegexType.FLOAT))
        assert(!floatVerifier.verify("1", RegexType.FLOAT))
        assert(!floatVerifier.verify("0123.2130", RegexType.FLOAT))
        assert(!floatVerifier.verify("0.0.0.0.123", RegexType.FLOAT))
    }
}
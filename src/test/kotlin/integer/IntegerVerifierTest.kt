package integer

import org.example.integer.IntegerVerifier
import kotlin.test.Test

class IntegerVerifierTest {
    @Test
    fun testVerify() {
        val verifier = IntegerVerifier()
        assert(verifier.verify("123"))
        assert(verifier.verify("1238012348452795874395874935287549375493827598432759837425"))
        assert(!verifier.verify("0"))
        assert(!verifier.verify("000"))
        assert(!verifier.verify("0213"))
        assert(!verifier.verify("asdf213"))
        assert(!verifier.verify("123asdf"))
        assert(!verifier.verify("123.0"))
        assert(!verifier.verify("123!@#$%^&*()"))
    }
}
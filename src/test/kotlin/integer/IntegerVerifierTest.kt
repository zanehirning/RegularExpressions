package integer

import Verifier
import enums.RegexType
import kotlin.test.Test

class IntegerVerifierTest {
    @Test
    fun testVerify() {
        val verifier = Verifier()
        assert(verifier.verify("123", RegexType.INTEGER))
        assert(verifier.verify("1238012348452795874395874935287549375493827598432759837425", RegexType.INTEGER))
        assert(!verifier.verify("0", RegexType.INTEGER))
        assert(!verifier.verify("000", RegexType.INTEGER))
        assert(!verifier.verify("0213", RegexType.INTEGER))
        assert(!verifier.verify("asdf213", RegexType.INTEGER))
        assert(!verifier.verify("123asdf", RegexType.INTEGER))
        assert(!verifier.verify("123.0", RegexType.INTEGER))
        assert(!verifier.verify("123!@#$%^&*()", RegexType.INTEGER))
    }
}
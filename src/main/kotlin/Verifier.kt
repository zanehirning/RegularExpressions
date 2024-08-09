import enums.RegexType

class Verifier {
    lateinit var state: RegexState
    private val stateFactory = StateFactory()
    fun verify(input: String, type: RegexType): Boolean {
        state = stateFactory.getInitialState(type)
        if (type == RegexType.PASSWORD && input.length < 8) return false
        input.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state.javaClass == stateFactory.getFinalState(type).javaClass
    }
}
import enums.RegexType
import org.example.binary.FirstBinary
import org.example.binary.ValidBinary
import org.example.email.FirstChar
import org.example.email.ValidEmail
import org.example.floats.FirstDigit
import org.example.floats.ValidFloat
import org.example.integer.FirstInteger
import org.example.integer.ValidInteger
import password.ValidPassword
import password.Lowercase

class StateFactory {
    fun getInitialState(type: RegexType): RegexState {
        return when(type) {
            RegexType.PASSWORD -> Lowercase()
            RegexType.EMAIL -> FirstChar()
            RegexType.BINARY -> FirstBinary()
            RegexType.FLOAT -> FirstDigit()
            RegexType.INTEGER -> FirstInteger()
        }
    }

    fun getFinalState(type: RegexType): RegexState {
        return when(type) {
            RegexType.PASSWORD -> ValidPassword()
            RegexType.EMAIL -> ValidEmail()
            RegexType.BINARY -> ValidBinary()
            RegexType.FLOAT -> ValidFloat()
            RegexType.INTEGER -> ValidInteger()
        }
    }
}
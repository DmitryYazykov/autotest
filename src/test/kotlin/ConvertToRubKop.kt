import org.junit.Assert
import org.junit.Test

class ConvertToRubKop {
    @Test
    fun convertToRubKop() {
        val amount = 100_50

        val result = convertToRubKop(amount)

        Assert.assertEquals("100 руб. 50 коп.", result)
    }
}
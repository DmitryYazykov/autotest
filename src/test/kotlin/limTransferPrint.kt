import org.junit.Test

import org.junit.Assert.*

class limTransferPrint {
    @Test
    fun limTransferPrint_NoLimit() {
        val card = CARD_1
        val amountTransfer = 300_00
        val monthlyTransfers = 0

        val result = limTransferPrint(card, amountTransfer, monthlyTransfers)

        assertEquals(1, result)
    }

    @Test
    fun limTransferPrint_LimitAmount() {
        val card = CARD_1
        val amountTransfer = 151_000_00
        val monthlyTransfers = 100_00
        val result = limTransferPrint(card, amountTransfer, monthlyTransfers)

        assertEquals(-1, result)
    }

    @Test
    fun limTransferPrint_limitMonthly() {
        val card = CARD_1
        val amountTransfer = 100_00
        val monthlyTransfers = 601_000_00

        val result = limTransferPrint(card, amountTransfer, monthlyTransfers)

        assertEquals(-1, result)
    }
    @Test
    fun limTransferPrint_NoLimitAmountVK() {
        val card = CARD_5
        val amountTransfer = 100_00
        val monthlyTransfers = 1_000_00

        val result = limTransferPrint(card, amountTransfer, monthlyTransfers)

        assertEquals(1, result)
    }
    @Test
    fun limTransferPrint_LimitAmountMaxVK() {
        val card = CARD_5
        val amountTransfer = 100_00
        val monthlyTransfers = 50_000_00

        val result = limTransferPrint(card, amountTransfer, monthlyTransfers)

        assertEquals(-1, result)
    }

}
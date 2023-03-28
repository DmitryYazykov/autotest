import org.junit.Test

import org.junit.Assert.*

class Commission {
    @Test
    fun commission_Card1CommissionMin() {
        val card = CARD_1
        val amountTransfer = 100_00
        val monthlyTransfers = 0

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(20_60, result)
    }

    @Test
    fun commission_Card1CommissionMax() {
        val card = CARD_1
        val amountTransfer = 50_000_00
        val monthlyTransfers = 100_000_00

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(920_00, result)
    }

    @Test
    fun commission_Card1NoCommission() {
        val card = CARD_1
        val amountTransfer = 100_00
        val monthlyTransfers = 400_00

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(0, result)
    }

    @Test
    fun commission_Card2Commission() {
        val card = CARD_2
        val amountTransfer = 100_00
        val monthlyTransfers = 0

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(20_60, result)
    }

    @Test
    fun commission_Card2NoCommission() {
        val card = CARD_2
        val amountTransfer = 151_000_00
        val monthlyTransfers = 400_00

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(928_40, result)
    }

    @Test
    fun commission_Card3NoCommissionMin() {
        val card = CARD_3
        val amountTransfer = 100_00
        val monthlyTransfers = 0

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(35_00, result)
    }

    @Test
    fun commission_Card3NoCommissionMax() {
        val card = CARD_3
        val amountTransfer = 5_000_00
        val monthlyTransfers = 100_000_00

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(37_50, result)
    }
    @Test
    fun commission_Card4CommissionMin() {
        val card = CARD_4
        val amountTransfer = 100_00
        val monthlyTransfers = 0

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(35_00, result)
    }
    @Test
    fun commission_Card4CommissionMax() {
        val card = CARD_4
        val amountTransfer = 5_000_00
        val monthlyTransfers = 100_000_00

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(37_50, result)
    }


    @Test
    fun commission_Card5NoCommission() {
        val card = CARD_5
        val amountTransfer = 150_000_00
        val monthlyTransfers = 40_000_00

        val result = commission(card, monthlyTransfers, amountTransfer)

        assertEquals(0, result)
    }
    @Test
    fun commission_CardDefault() {

        val amountTransfer = 15_000_00
        val monthlyTransfers = 0

        val result = commission(card = CARD_5, amountTransfer, monthlyTransfers)

        assertEquals(0, result)
    }
}
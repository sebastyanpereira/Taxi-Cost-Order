package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaximeterServiceTest {

    @Test
    @DisplayName("Should calculate costOrder without discount")
    void costOrderWithoutDiscount() {
        TaximeterService service = new TaximeterService();
        int result = service.costOrder(10);

        assertEquals(260, result);
    }
    @Test
    @DisplayName("Should calculate costOrder with discount")
    void costOrderWithDiscount() {
        TaximeterService service = new TaximeterService();
        int result = service.costOrder(48);

        assertEquals(969, result);
    }
    @Test
    @DisplayName("Should calculate costOrder with max discount")
    void costOrderWithMaxDiscount() {
        TaximeterService service = new TaximeterService();
        int result = service.costOrder(100);

        assertEquals(1960, result);
    }
}
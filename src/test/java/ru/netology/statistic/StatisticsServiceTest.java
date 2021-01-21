package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {



    @Test
    void findMax() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        StatisticsService service = new StatisticsService();

        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        StatisticsService service = new StatisticsService();

        long expected = 9;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


}
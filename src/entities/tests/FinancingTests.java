package entities.tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData(){
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData(){
        // arrange
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Action
        Double newAmount = 90000.0;
        financing.setTotalAmount(newAmount);

        // Assertion
        Assertions.assertEquals(newAmount, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            Double newAmount = 110000.0;
            financing.setTotalAmount(newAmount);
        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData(){
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Double newIncome = 2100.0;
        financing.setIncome(newIncome);
        Assertions.assertEquals(newIncome, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            Double newIncome = 1900.0;
            financing.setIncome(newIncome);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData(){
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Integer newMonths = 81;
        financing.setMonths(newMonths);
        Assertions.assertEquals(newMonths, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            Integer newMonths = 79;
            financing.setMonths(newMonths);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly(){
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly(){
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(1000.0, financing.quota());
    }
}

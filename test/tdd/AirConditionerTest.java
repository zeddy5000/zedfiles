package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void acOn() {
        AirConditioner samAc = new AirConditioner();
        samAc.putOn(true);
        assertEquals(true, samAc.getStatus());
    }

    @Test
    public void AcOff() {
        AirConditioner samAc = new AirConditioner();
        samAc.putOn(false);
        assertEquals(false, samAc.getStatus());
    }

    @Test
    public void increaseTemperature() {
        AirConditioner samAc = new AirConditioner();
        samAc.putOn(true);
        samAc.increaseTemp(12);
        assertEquals(28, samAc.getTemp());
    }

    @Test
    public void decreaseTemperature() {
        AirConditioner samAc = new AirConditioner();
        samAc.putOn(true);
        samAc.increaseTemp(12);
        samAc.decreaseTemp(5);
        assertEquals(23, samAc.getTemp());
    }
}

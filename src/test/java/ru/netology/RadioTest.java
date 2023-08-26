package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNextNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.nextNumber();
        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.nextNumber();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.prevNumber();
        int expected = 6;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prevNumber();
        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPickNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);
        int expected = 5;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        radio.nextNumber();
        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        radio.prevNumber();
        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.increaseVolume();
        int expected = 36;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.reductionVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
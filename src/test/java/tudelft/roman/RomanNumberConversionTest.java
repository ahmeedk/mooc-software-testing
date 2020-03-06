package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumberConversionTest {

    private RomanNumberConversion romanNumberConversion = new RomanNumberConversion();

    @Test
    public void shouldReturnUnites() {
        int one = romanNumberConversion.convertToNumeral("I");
        Assertions.assertEquals(1, one);

        int five = romanNumberConversion.convertToNumeral("V");
        Assertions.assertEquals(5, five);

        int ten = romanNumberConversion.convertToNumeral("X");
        Assertions.assertEquals(10, ten);

        int fifty = romanNumberConversion.convertToNumeral("L");
        Assertions.assertEquals(50, fifty);
    }

    @Test
    public void shouldReturnNumberBetween1And5() {
        int two = romanNumberConversion.convertToNumeral("II");
        Assertions.assertEquals(2, two);

        int three = romanNumberConversion.convertToNumeral("III");
        Assertions.assertEquals(3, three);

        int four = romanNumberConversion.convertToNumeral("IV");
        Assertions.assertEquals(4, four);
    }

    @Test
    public void shouldReturnNumberBetween5and10() {
        int six = romanNumberConversion.convertToNumeral("VI");
        Assertions.assertEquals(6, six);

        int seven = romanNumberConversion.convertToNumeral("VII");
        Assertions.assertEquals(7, seven);

        int eight = romanNumberConversion.convertToNumeral("VIII");
        Assertions.assertEquals(8, eight);

        int nine = romanNumberConversion.convertToNumeral("IX");
        Assertions.assertEquals(9, nine);
    }

    @Test
    public void shouldReturnNumberBetween10an19() {

        int val_11 = romanNumberConversion.convertToNumeral("XI");
        Assertions.assertEquals(11, val_11);

        int val_12 = romanNumberConversion.convertToNumeral("XII");
        Assertions.assertEquals(12, val_12);

        int val_14 = romanNumberConversion.convertToNumeral("XIV");
        Assertions.assertEquals(14, val_14);

        int val_19 = romanNumberConversion.convertToNumeral("XIX");
        Assertions.assertEquals(19, val_19);
    }

    @Test
    public void shouldTrowExecptionOn_VX() throws IllegalArgumentException {

        try {
            int val_11 = romanNumberConversion.convertToNumeral("VX");
            Assertions.fail("argument not recognized");
        }catch (IllegalArgumentException ie){

        }
    }

    @Test
    public void shouldTrowExecption_XCC() throws IllegalArgumentException {

        try {
            int val_11 = romanNumberConversion.convertToNumeral("XCC");
            Assertions.fail("argument not recognized");
        }catch (IllegalArgumentException ie){

        }
    }

    @Test
    public void shouldTrowExecption_VC() throws IllegalArgumentException {

        try {
            int val = romanNumberConversion.convertToNumeral("VC");
            Assertions.fail("argument not recognized");
        }catch (IllegalArgumentException ie){

        }
    }

    @Test
    public void shouldTrowExecption_CVX() throws IllegalArgumentException {

        try {
            int val = romanNumberConversion.convertToNumeral("VX");
            Assertions.fail("argument not recognized");
        }catch (IllegalArgumentException ie){

        }
    }

    @Test
    public void shouldReturnBetween50and90() {
        int val_50 = romanNumberConversion.convertToNumeral("L");
        Assertions.assertEquals(50, val_50);

        int val_60 = romanNumberConversion.convertToNumeral("LX");
        Assertions.assertEquals(60, val_60);

        int val_70 = romanNumberConversion.convertToNumeral("LXX");
        Assertions.assertEquals(70, val_70);

        int val_80 = romanNumberConversion.convertToNumeral("LXXX");
        Assertions.assertEquals(80, val_80);

        int val_90 = romanNumberConversion.convertToNumeral("XC");
        Assertions.assertEquals(90, val_90);
    }

    @Test
    public void shouldReturn90() {

        int val_190 = romanNumberConversion.convertToNumeral("CXC");
        Assertions.assertEquals(190, val_190);
    }

    @Test
    public void shouldReturn452() {
        int val_425 = romanNumberConversion.convertToNumeral("CDLII");
        Assertions.assertEquals(452, val_425);
    }

    @Test
    public void shouldReturn700() {
        int val_700 = romanNumberConversion.convertToNumeral("DCC");
        Assertions.assertEquals(700, val_700);
    }

    @Test
    public void shouldReturn713() {
        int val_713 = romanNumberConversion.convertToNumeral("DCCXIII");
        Assertions.assertEquals(713, val_713);
    }
    @Test
    public void shouldReturn381() {
        int val_381 = romanNumberConversion.convertToNumeral("CCCLXXXI");
        Assertions.assertEquals(381, val_381);
    }
}

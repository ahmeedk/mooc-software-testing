package tudelft.roman;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanNumberConversion {

    private Object[][] numArrays = new Object[][]{{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};

    private Map<Character, Integer> unites = Stream.of(numArrays).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

    public int convertToNumeral(String romanNum) throws IllegalArgumentException {

        int sum;
        validateNumber(romanNum);

        if (romanNum.length() == 1) {
            sum = unites.get(romanNum.charAt(romanNum.length() - 1));
        } else {
            sum = unites.get(romanNum.charAt(romanNum.length() - 1));
            for (int i = romanNum.length() - 2; i >= 0; i--) {
                char char1 = romanNum.charAt(i);
                char char2 = romanNum.charAt(i + 1);

                int sign = 1;
                boolean isMinus_I = char1 == 'I' && (char2 == 'X' || char2 == 'V');
                boolean isMinus_X = char1 == 'X' && (char2 == 'C' || char2 == 'L');
                boolean isMinus_C = char1 == 'C' && char2 == 'D';

                if (isMinus_I || isMinus_X || isMinus_C) {
                    sign = -1;
                }

                sum = sum + sign * unites.get(char1);
            }
        }

        return sum;
    }

    private void validateNumber(String number) throws IllegalArgumentException {

        if (number.length() == 0) {
            throw new IllegalArgumentException("Number is empty");
        } else {

            for (int i = 0; i < number.length(); i++) {
                if (!unites.containsKey(number.charAt(i)))
                    throw new IllegalArgumentException("Number contains unrecognized letter");
            }

            boolean isCorrect = true;
            for (int i = 0; i < number.length(); i++) {

                for (int j = 0; j < i; j++) {
                    if (unites.get(number.charAt(j)) < unites.get(number.charAt(i))) {
                        switch (number.charAt(i)) {
                            case 'V':
                            case 'X':
                                isCorrect = number.charAt(j) == 'I' && j == i - 1;
                                break;
                            case 'C':
                                isCorrect = number.charAt(j) == 'X' && j == i - 1;
                                break;
                            default:
                                isCorrect = true;
                        }
                    }
                }
            }
            if (!isCorrect)
                throw new IllegalArgumentException("Number contains unrecognized letter");

        }

    }

}

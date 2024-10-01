package numberAnalyser;

public class NumberAnalyser {

    public int getGGT(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return number1;
    }

    public boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getPrimeNumbers(int start, int end) {
        var sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                if (!sb.toString().isEmpty()) {
                    sb.append(" ");
                }
                sb.append(i);
            }
        }

        return sb.toString();
    }

    public int getChecksum(int number) {
        int result = 0;
        while (number > 0) {
            int tmp = number % 10;
            result += tmp;
            number /= 10;
        }
        return result;
    }

    public boolean isHappyNumber(int number) {
        var maybeHappyNumber = number;
        var cycleNumber = 4;

        do {
            maybeHappyNumber = calculateHappyNumberValue(maybeHappyNumber);

            System.out.println(maybeHappyNumber);

        } while (maybeHappyNumber != cycleNumber && maybeHappyNumber != 1);

        return maybeHappyNumber == 1;
    }

    private int calculateHappyNumberValue(int number) {
        var result = 0;

        while (number > 0) {
            int tmp = number % 10;
            result += (int) Math.pow(tmp, 2);
            number /= 10;
        }

        return result;
    }

    public boolean isPerfectNumber(int number) {
        var sum = 0;
        for (int i = 1; i < number; i++) {
            if (isDivider(i, number)) {
                sum += i;
            }
        }

        return sum == number;
    }

    private boolean isDivider(int divider, int number) {
        return (number % divider == 0);
    }
}

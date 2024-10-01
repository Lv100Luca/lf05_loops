package numberListGenerator;

public class Generator {

    public String generateNumbers(int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i++) {
            sb.append(i);
            if (i != end) {
                sb.append(",");
            }
        }

        return sb.toString();
    }

    public String generateNumbers(int start, int end, int steps, char delimiter) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i += steps) {
            sb.append(i);
            if (i + steps <= end)
                sb.append(delimiter);
        }

        return sb.toString();
    }

}

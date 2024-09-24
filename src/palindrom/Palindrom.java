package palindrom;

public class Palindrom {
    public boolean isPalindrom(String text) {
        var normalizedText = text.toLowerCase().replace(" ", "");

        var len = normalizedText.length();
        for (int index = 0; index < len; index++) {
            var reverseIndex = len - index - 1;
            if (normalizedText.charAt(index) != normalizedText.charAt(reverseIndex)) {
                return false;
            }

        }
        return true;
    }
}

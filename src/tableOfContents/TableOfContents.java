package tableOfContents;

public class TableOfContents {
    public String createEntry(String heading, String page) {
        var headerSize = 50;
        var headingLength = heading.length();

        if (headingLength > headerSize) {
            return "";
        }

        var paddingLength = headerSize - headingLength - page.length();

        return heading +
                ".".repeat(paddingLength) +
                page;
    }
}

package drawingFigures;

public class DrawFigures {
    public void drawSquare(char sign, int numberOfSigns) {
        for (int i = 0; i < numberOfSigns; i++) {
            if (i == 0 || i == numberOfSigns - 1) {
                System.out.println(getClosingRow(sign, numberOfSigns));
            } else {
                System.out.println(getRow(sign, numberOfSigns));
            }
        }
    }

    private String getClosingRow(char sign, int width) {
        // * * * * *
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            sb.append(sign);

            if (i != width - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private String getRow(char sign, int width) {
        // *       *
        var sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i == 0 || i == width - 1) {
                sb.append(sign);
                if (i == 0) {
                    sb.append(" ");
                }
            } else {
                sb.append("  ");
            }
        }

        return sb.toString();
    }

    public void drawRhombus(int diameter) {
        var offset = Math.floorDiv(diameter, 2);
        printWithOffset(offset, ".");

        for (int width = 3; width < diameter; width += 2) {
            var rowOffset = Math.floorDiv(diameter - width, 2);
            printWithOffset(rowOffset, getRhombusRow(width, '/', '\\'));
        }

        System.out.println(getRhombusMiddleRow(diameter));

        for (int width = diameter - 2; width >= 3; width -= 2 ) {
            var rowOffset = Math.floorDiv(diameter - width, 2);
            printWithOffset(rowOffset, getRhombusRow(width, '\\', '/'));
        }

        printWithOffset(offset, ".");
    }

    private void printWithOffset(int offset, String str) {
        String offsetStr = " ".repeat(offset);
        System.out.println(offsetStr + str);
    }

    private String getRhombusRow(int width, char start, char end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i == 0) {
                sb.append(start);
            } else if (i == width - 1) {
                sb.append(end);
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private String getRhombusMiddleRow(int width) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i == 0 || i == width - 1) {
                sb.append('.');
            } else
                sb.append(" ");
        }

        return sb.toString();
    }
}

package drawingFigures;

import java.util.Scanner;

public class DrawFiguresUI {

    public static void main(String[] args) {
//        var sc = new Scanner(System.in);
        var drawFigures = new DrawFigures();
//
//        System.out.print("Enter Size: ");
//        int size = sc.nextInt();
//
//        System.out.print("Enter Char: ");
//        char ch = sc.next().charAt(0);
//
//        drawFigures.drawSquare(ch, size);

        var rhombusSize = 7;

        drawFigures.drawRhombus(500);
    }
}

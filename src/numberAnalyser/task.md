# Zahlenverarbeitung ** - ***

Die Klasse `NumberAnalyser` bietet verschiedene Methoden an, um Ganze Zahlen zu verarbeiten

### Aufgaben
1. Implementiere in der Klasse `NumberAnalyser`die Methode `public int getGGT(int number1, int number2))`. 
Sie ermittelt den größten gemeinsamen Teiler der beiden übergebenen Zahlen. Der ggT lässt sich ermitteln, 
indem die kleinere der beiden Zahlen von der größeren abgezogen wird. Das Ergebnis wird dann in die Variable
 gespeichert, in der die größere Zahl steht. Dieser Vorgang wird solange wiederholt, bis das Ergebnis 0 ist.  
                                                                            
   ```
   Beispiel: 12 und 8
          
   12-8 = 4
   8-4=4
   4-4=0
   Der ggT ist also 4
    ```
2. Implementiere in der Klasse `NumberAnalyser`die Methode `public boolean isPrimeNumber(int number))`. Sie ermittelt,
ob es sich bei der übergebenen Zahl um eine Primzahl handelt. Primzahlen heißen Zahlen, die größer als 1, nur durch 1 und 
durch sich selbst ohne Rest teilbar sind. Handelt es sich um eine Primzahl, gibt die Methode `true`, andernfalls `false` zurück.
3. Implementiere in der Klasse `NumberAnalyser`die Methode `public String getPrimeNumbers(int start, int end)`. Sie gibt einen 
String zurück, der aus allen Primzahlen besteht, die sich in einem Intervall Start- und Endwert befinden.  
   ```
   Beispiel: Startwert = 4 und Endwert = 19
   Der zurückgegebene String lautet "5 7 11 13 17 19"       
   ```
4. Implementiere in der Klasse `NumberAnalyser`die Methode `public int getChecksum(int number))`. Sie ermittelt die Quersumme
 der ihr übergebenen Zahl.
 
    ```
   Beispiele: 
   Zahl = 23 	Quersumme: 2+3=5
   Zahl = 5672  Quersumme: 5+6+7+2=20       
    ```

   ```
   Tipp: 
   Verwende den Modulo-Operator, um die einzelnen Stellen der eingegeben Zahl zu ermitteln.
   ```
5. Die Dezimalziffern einer natürlichen Zahl n werden einzeln quadriert und die Ziffernquadrate addiert. Mit der Summe 
wird genauso verfahren. Wenn man dabei irgendwann auf die 1 stößt, wird die ursprüngliche Zahl n als "fröhliche Zahl" 
bezeichnet. Die Alternative dazu ist der Übergang in den Zyklus 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4. 
Diese Zahlen werden als "traurige Zahlen" bezeichnet. Implementiere in der Klasse `NumberAnalyser`die Methode `public boolean isHappyNumber(int number)`.
Sie gibt true zurück, sofern es sich bei der übergebenen Zahl um eine fröhliche Zahl handelt.

   ```
   Beispiel: n = 19
   
   1²+9²= 1 + 81 = 82
   8² + 2² = 64+4=68
   6²+8²=36+64 =100
   1²+0²+0²=1
   Also ist 19 eine fröhliche Zahl.       
   ```
6. Eine natürliche Zahl n nennt man „perfekte Zahl“, wenn sie gleich der Summe aller ihrer echten Teiler ist. Die Summe 
der echten Teiler von n soll mit T(n) bezeichnet werden. Perfekte Zahlen sind z.B.:
   ```
   T(6) = 3 + 2 + 1 =6
   T(28) = 14 + 7 + 4 + 2 + 1 = 28
   ```
   Implementiere in der Klasse `NumberAnalyser`die Methode `public boolean isPerfectNumber(int number)`. Sie gibt true zurück,
   wenn es sich bei der übergebenen Zahl um eine perfekte Zahl handelt.

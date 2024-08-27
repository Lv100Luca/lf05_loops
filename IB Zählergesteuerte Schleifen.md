# Zählergesteuerte Schleife (for-Schleife)

Die for-Schleife ist eine spezielle Variante einer while-Schleife und wird typischerweise zum Zählen benutzt. Genauso wie 
while-Schleifen sind for-Schleifen abweisend, d.h. der Rumpf wird erst dann ausgeführt, wenn die Bedingung wahr ist.
Da die Schleifensteuerung über einen Zähler erfolgt, wird die for-Schleife immer dann verwendet, wenn die Anzahl der 
gewünschten Wiederholungen des Anweisungsblocks **bekannt** ist. Die for-Schleife wird mit dem Schlüsselwort for 
eingeleitet und durch einen dreiteiligen Schleifenkopf kontrolliert. Dieser Schleifenkopf steht in runden Klammern und 
enthält die drei Elemente Initialisierung, Bedingung und Veränderung, die durch Semikolon voneinander getrennt werden.
### Beispiel
```
for (int i=1; i<=5; i++){
   System.out.println(i);
}
```
Der oben abgebildete Code gibt die Zahlen von 1 bis 5 untereinander aus. Im Schleifenkopf wird zunächst die 
Laufvariable i initialisiert, d.h. ihr wird ein Anfangswert, in diesem Fall 1, zugewiesen. Wenn mehrere Variablen 
initialisiert werden sollen, werden diese durch Kommata getrennt. Im nachfolgenden Bedingungsausdruck wird das 
Abbruchkriterium der  Schleife festgelegt. Dieser Ausdruck wird vor jedem Schleifendurchlauf erneut ausgewertet. 
Liefert er den Wert true wird der Schleifenkörper ein weiteres Mal durchlaufen, liefert er den Wert false wird die 
Schleife abgebrochen. Im abschließenden Veränderungsteil wird angegeben, wie sich der Wert der Laufvariablen bei jedem 
Schleifendurchlauf ändern soll. In diesem Fall erhöht sich i bei jedem Schleifendurchlauf um 1. Nimmt i den Wert 6 an, 
wird die Schleife abgebrochen. Mehrere Veränderungen werden durch Kommata voneinander getrennt.

Initialisierung, Bedingung und Veränderung sind optional, d.h. sie können weggelassen werden. Es müssen in solchen 
Fällen lediglich die Semikola eingegeben werden. Beispielsweise kann i schon vor der Schleife initialisiert und die 
Veränderung im Schleifenkörper geschehen:
```
int i = 1;
for (; i<=5; ){
	System.out.println(i);
	i=i+1;
}
```

Möglichkeiten, die Laufvariable zu ändern:

|Befehl| Bedeutung|
|------|------|
|i++| i wird um 1 erhöht|
|i--| i wird um 1 erniedrigt|
|i -=2| i wird um 2 erniedrigt (verkürzte Schreibweise für i=i-2)|
|i*=2| i wird mit 2 multipliziert (verkürzte Schreibweise für i=i*2)|
|i/=2| i wird durch 2 dividiert (verkürzte Schreibweise für i=i/2)|
|i %=3| i enthält den Rest bei der Division durch 3 (Modulo-Operation)|

# Kopfgesteuerte Schleife (while-Schleife)

Wie bei der do-while-Schleife werden bei der while-Schleife Anweisungen in Abhängigkeit von der Auswertung eines 
Ausdrucks wiederholt. Im Unterschied zur do-while-Schleife handelt es sich bei der while-Schleife um eine **abweisende Schleife**, 
die **vor** jeder Ausführung des Rumpfes die Schleifenbedingung prüft. Ist die Bedingung  true, 
werden die Anweisungen der Schleife ausgeführt, andernfalls wird die Schleife beendet. Es kann also durchaus sein, dass 
die Anweisungen in der while-Schleife kein einziges Mal ausgeführt werden. Das geschieht immer dann, wenn die erste 
Auswertung des Ausdrucks den Wert false ergibt. 
 
### Syntax der kopfgesteuerten Schleife
```	
 while (Ausdruck){					
	Anweisung 1; 
	Anweisung 2;
	...
} 
```

* Das Schlüsselwort while leitet die while-Anweisung ein. Es folgt in runden Klammern ein Ausdruck, welcher einen boolschen 
Wert liefert. Ist dieser true, werden die Anweisungen im Schleifenkörper ausgeführt.
* Nach dem Ausdruck folgt die Anweisung oder der Anweisungsblock.
* Nachdem das Programm die Anweisungen im Schleifenkörper ausgeführt hat, wird der Ausdruck am Anfang der Schleife erneut geprüft. 
Falls dieser den Wert false zurückliefert, wird der Schleifenkörper übergangen und die erste Anweisung nach der Schleife ausgeführt. 
Bei Rückgabe von true wird der Schleifenkörper erneut abgearbeitet.

### Code-Beispiel: 

Im Beispiel unten wird der Wert der Variablen i bei jedem Schleifendurchlauf ausgegeben und um eins erhöht. Die Schleife bricht ab, wenn i = 10 ist. 
```
int i = 1;
while (i<10){
     System.out.println (i);
     i++;
}
```
Das Code-Snippet erzeugt die folgende Konsolenausgabe
```
1
2
3
4
5
6
7
8
9
10
```
 
### Endlosschleifen

Abbruchkriterien von Schleifen müssen so festgelegt werden, dass sie auch eintreten können. Ist dagegen ein Prüfausdruck
immer true, handelt es sich um eine so genannte **Endlosschleife**: die Ausführung ihres Schleifenrumpfes wird nie beendet.
Ein Teil des Bewertungsausdrucks muss also bei allen offenen Schleifen im Schleifenkörper verändert werden, so dass die Schleife
irgendwann abbricht. Im folgenden Code-Snippet wird beispielsweise der Benutzer endlos aufgefordert ganze Zahlen einzugeben, 
um diese zu einer Zwischensumme in der Variable result zu addieren.

```
Scanner sc = new Scanner(System.in);
int result = 0, number;
while(true){
   number = sc.nextInt();
   result += number;
}
```
Eine Möglichkeit, die Schleife abzubrechen, wäre beispielsweise, wenn der Benutzer 0 eingibt:

```
while(number !=0){
   number = sc.nextInt();
   result += number;
}
```
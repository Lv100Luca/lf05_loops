# Inhaltsverzeichnis*

Es ist ein Programm zu entwickeln, das eine Überschrift und eine Seitenzahl zu einen Eintrag für ein 
Inhaltsverzeichnis verarbeitet. So ein Eintrag besteht aus der Überschrift, einer variablen Anzahl von Punkten und der 
Seitenzahl. Eine Zeile besteht dabei immer aus 50 Zeichen. 

### Beispiel:
Überschrift: Einleitung

Seitenzahl: 3


Ergebnisstring: "Einleitung......................................3"

### Aufgaben
1. Implementiere in der Klasse `TableOfContents`die Methode `public String createEntry(String heading, String page)`. Sie 
nimmt eine Überschrift und eine Seitenzahl entgegen und gibt den Eintrag im oben beschriebenen Format zurück. Passt der 
Eintrag nicht in eine Zeile, wird ein leerer String zurückgegeben. Schaue in der Dokumentation der Klasse String nach, 
falls du die Methoden, die dafür nötig sind, nicht kennst: https://docs.oracle.com/javase/9/docs/api/java/lang/String.html
2. Schreibe eine UI-Klasse, in der der Benutzer über die Konsole eine Überschrift und die Seitenzahl eingibt und 
den Eintrag des Inhaltsverzeichnisses ausgegeben bekommt.



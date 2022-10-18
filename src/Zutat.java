public class Zutat {
    private String name;
    private int menge;


    //Konstruktor -> initialisiert eine Instanz (=konkreter Fall) einer Klasse
    public Zutat(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    // eine spezielle (toString) Methode - gibt mir einen String den ich aufrufen und printen kann in Main
    @Override
    public String toString() {
        return "Zutat{" +
                "name='" + this.name + '\'' +
                ", menge=" + this.menge +
                '}';
    }

    //this. haben wir selber dazu geschrieben (kann man auch weglassen)
    //Getter - 2 neue Methoden - um neue Werte für Name und Menge aufrufen zu können - und zu neuer Variable
    //zusammenzuführen;
    public String getName() {
        return this.name;
    }

    public int getMenge() {
        return this.menge;
    }

    //Setter speichert mir den neuen Wert für die Variable (überschreibt alten Wert)

    public double getMengeinCups() {
        return (this.menge)*1.0 / 128.0;
    }


}

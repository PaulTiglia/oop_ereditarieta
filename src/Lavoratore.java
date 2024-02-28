// il Lavoratore è una Persona
// il Lavoratore, quindi, ha tutte le caratteristiche di una Persona

// la classe Lavoratore eredita tutti i metodi e gli attributi della classe Persona
public class Lavoratore extends Persona{
    // estendo la classe aggiungendo ulteriori metodi e attributi
    public String mansione;
    public double stipendio;

    // costruttore Lavoratore
    public Lavoratore(String nome, String cognome, String cf, int eta, String mansione, double stipendio){
        // chiamo il costruttore della superclasse
        // Persona --> superclasse         Lavoratore --> sottoclasse
        super(nome, cognome, cf, eta);
        this.mansione = mansione;
        this.stipendio = stipendio;
    }

    // OVERRIDDING: ridefinisco (sovrascrivo) il metodo di stampa della classe Persona
    // abbiamo due metodi con la stessa firma: uno nella sottoclasse, uno nella superclasse
    public void stampa(){
        // chiamo il metodo di stampa della superclasse
        super.stampa();
        System.out.println("Mansione: " + this.mansione);
        System.out.println("Stipendio: " + this.stipendio + " €");
    }

    // OVERLOADING (sovraccarico) del metodo costruttore
    // significa avere nella stessa classe più metodi con lo stesso nome ma parametri diversi
    // non tutti i linguaggi supportano l'overloading
    public Lavoratore(){
        // costruttore senza parametri
        super(); // costruttore senza parametri in Persona, obbligatorio definirlo
        this.mansione = "";
        this.stipendio = 0.0;
    }
    // si può fare overloading di qualsiasi metodo

    // aggiungo ulteriori e metodi

    public String getMansione() {
        return mansione;
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    // POLIMORFISMO: un metodo può assumere più forme
    // l'overloading e l'overriding sono due esempi di polimorfismo.
    // overloading --> assume forme diverse nella stessa classe.
    // overriding --> assume forme diverse in classi diverse.

    // Java supporta solo l'ereditarietà singola, una classe estende massimo 1 sola classe
    // è possibile creare una gerarchia di classi e sottoclassi.

    // INCAPSULAMENTO: i metodi e gli attributi sono incapsulati nelle classi
    // non è necessario conoscere come i metodi sono implementati, ma basta sapere
    // la loro firma per poterli usare sugli oggetti.

    // INFORMATION HIDING: i metodi e gli attributi privati sono informazioni che vengono
    // nascoste, cioè non sono accessibili dall'esterno.

    // le interfaccie risorvono il problema della mancanza di ereditarietà multipla.
}

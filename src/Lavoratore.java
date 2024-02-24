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

    // overridding: ridefinisco (sovrascrivo) il metodo di stampa della classe Persona
    // abbiamo due metodi con la stessa firma: uno nella sottoclasse, uno nella superclasse
    public void stampa(){
        // chiamo il metodo di stampa della superclasse
        super.stampa();
        System.out.println("Mansione: " + this.mansione);
        System.out.println("Stipendio: " + this.stipendio + " €");
    }

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
}

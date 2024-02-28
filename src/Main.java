public class Main {
    public static void main(String[] args) {
        // creo oggetto di tipo Lavoratore
        Lavoratore l = new Lavoratore("Mario", "Rossi", "aaaa", 16, "impiegato", 1400);
        l.stampa();

        // in base ai parametri java capisce quale metodo chiamare tra quelli di cui ho fatto overloading
        Lavoratore l2 = new Lavoratore();
    }
}

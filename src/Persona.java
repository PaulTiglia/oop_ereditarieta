public class Persona {
    public String cf; // codice fiscale, rappresenta in modo univoco ogni persona
    public String nome;
    public String cognome;
    public int eta;

    public Persona(String nome, String cognome, String cf, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cf = cf;
    }

    public void stampa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cognome: " + this.cognome);
        System.out.println("Età: " + this.eta);
        System.out.println("Codice fiscale: " + this.cf);
    }
    public String getCf(){
        return this.cf;
    }
    public void setCf(String cf){
        this.cf = cf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getEta(){
        return this.eta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setEta(int eta){
        this.eta = eta;
    }
}

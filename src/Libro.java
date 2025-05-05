public class Libro {
    public String titolo;
    public String autore;
    public int numeroPagine;

    //Costruttore
    public Libro(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;  // questo attributo viene deciso dall'utente
        this.autore = autore;// "       "        "       "     "    "
        this.numeroPagine = numeroPagine; //    "      "       "
    }
    // Metodo per stampare i dettagli
    public  void stampaDettagli() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Numero di pagine: " + numeroPagine);
        System.out.println();
    }
}

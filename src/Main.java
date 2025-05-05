public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1200);
        Libro libro2 = new Libro("1984", "George Orwell", 328);

        libro1.stampaDettagli();
        libro2.stampaDettagli();
    }
}

// 2. Creare una classe contoBancario con i seg attributi:
//- numeroConto
//- saldo
//- Creare costruttore che inizializzi il numero di conto (numero random) e inizializzi il saldo a 0
// - aggiungere metodi per depositare e prelevare denaro del conto
// aggiungere un metodo stampasaldo
// Nel main creare un oggetto ContoBancario e testare tutti i metodi.

//3. creare una classe di studenti con i seguenti attributi:
// nome
// cognome
// listaVoti (array)
//creare un costruttore che inizializzi i campi
// aggiungere un metodo calcoloMedia che calcola e restituisce la media dei voti
// nel main creare 2 studenti e testare tutti i metodi
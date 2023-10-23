public class Main {
    public static void main(String[] args) {

        LectorCSV miLector = new LectorCSV();

        miLector.leerCsv("./datos/pokemon.csv");
    }
}
import java.io.FileReader;
import com.opencsv.CSVReader;


/**
 * @autor Raul Vara
 */

public class LectorCSV {

    public void leerCsv(String nombreArchivo){
        try{
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String [] fila = null;
            while ((fila = csvReader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                System.out.println(fila[0]
                        + " | " + fila[1]
                        + " | " + fila[2]);
            }
            csvReader.close();
        }catch(Exception e){
            System.out.println("Error al leer el archivo");
        }
    }
}

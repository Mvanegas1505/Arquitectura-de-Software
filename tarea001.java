import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class tarea001 {
        public static void main(String[] args) {
            System.out.println("Write your name:");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String x = scanner.nextLine();
            scanner.close();
            
            File file = new File("TAREA.txt");
            try {
            FileWriter bw = new FileWriter(file);
            bw.write(x);
            bw.close();
        } catch (IOException e) {
            System.err.println("Error al modificar el archivo: " + e.getMessage());
        }
                 
    }

}

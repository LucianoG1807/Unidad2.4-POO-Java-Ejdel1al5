import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<LectorDocumento> lectores = new ArrayList<>();

        lectores.add(new LectorPDF());
        lectores.add(new LectorWord());
        lectores.add(new LectorTextoPlano());

        List<String> archivos = new ArrayList<>();

        archivos.add("documento.pdf");
        archivos.add("informe.docx");
        archivos.add("notas.txt");

        for (int i = 0; i < lectores.size(); i++) {

            try {
                LectorDocumento lector = lectores.get(i);

                lector.abrirArchivo(archivos.get(i));

                System.out.println(lector.extraerTexto());

                System.out.println("-----------------------------");

            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Eisagwgh keimenou kai leksewn");
        String filepath = input.readLine();
        String wantedWords = input.readLine();
        boolean resultFound = false;

        if(filepath.contains(".pdf")) {
            resultFound = PDFTextFinder.findTextInPDFDocument(filepath, wantedWords);
        }
        else if (filepath.contains(".docx")) {
            resultFound = MSWordTextFinder.findTextInWordDocument(filepath, wantedWords);
        }
        System.out.printf("Words found", resultFound);
    }
}
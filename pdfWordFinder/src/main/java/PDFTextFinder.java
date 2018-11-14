import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PDFTextFinder {
    public static boolean findTextInPDFDocument(String filePath, String wantedWords) throws IOException {

        boolean wordFound = false;
        File inputFile = new File (filePath);
        PDDocument pdfFile = PDDocument.load(inputFile);
        PDFTextStripper textStripper = new PDFTextStripper();
        String pdfText = textStripper.getText(pdfFile);
        if(pdfText.contains(wantedWords)) {
            wordFound = true;
        }
            return wordFound;
        }



    }


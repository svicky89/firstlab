import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MSWordTextFinder <wordText>{

    public static boolean findTextInWordDocument(String filePath, String wantedWords) throws IOException {

        boolean found = false;
        FileInputStream inputFile = new FileInputStream(filePath);
        XWPFDocument wordDocument = new XWPFDocument(inputFile);
        XWPFWordExtractor textExtractor = new XWPFWordExtractor(wordDocument);
        String wordText = textExtractor.getText();
        if(wordText.contains(wantedWords)) {
            found = true;
        }
        return found;
        }



    }


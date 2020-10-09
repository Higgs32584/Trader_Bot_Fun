import java.io.File;
import java.io.IOException;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
//import org.apache.pdfbox.text.PDFTextStripperByArea;
public class PDFstreamer {
    // Create a PdfDocument instance
try {

        // Load an existing document
        doc.load("SRNTO.pdf");
        // Get page count and display it on console output
        System.out.println(
                "Number of pages in sample_doc1.pdf is " +
                        doc.getPageCount());
        // Close document
        doc.close();
    } catch (IOException | PdfException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

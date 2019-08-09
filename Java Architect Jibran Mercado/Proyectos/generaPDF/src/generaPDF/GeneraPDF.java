/**
 * 
 */
package generaPDF;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

/**
 * @author cursostorrepremier
 *
 */
public class GeneraPDF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PdfWriter write;
		try {
			write = new PdfWriter("C:\\Users\\cursostorrepremier\\Desktop\\Jibran Java Architect\\PDF_PRUEBA.pdf");
			PdfDocument pdfDoc = new PdfDocument(write);
			Document doc = new Document(pdfDoc);
			doc.add(new Paragraph("Curso Maven Coppel..."));
			doc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package mx.coppel.java;

import com.itextpdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File dets = null;
		//System.out.println( "Hello World!" );
    	//PdfWriter writer;
		try {
			PdfWriter writer = new PdfWriter(dets);
			PdfDocument pdfDoc = new PdfDocument(writer);
	    	Document doc = new Document(pdfDoc);
	    	doc.add(new Paragraph("Curso de maven en coppel"));
	    	doc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	
    }
}

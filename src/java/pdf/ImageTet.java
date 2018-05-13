/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROBIN
 */
public class ImageTet extends HttpServlet {

   private static final long serialVersionUID = 1L;

 public ImageTet() {
  super();
 }

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request, response);
 }

 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String idd = request.getParameter("id");
     int id =Integer.parseInt(idd); 
  //get the output stream for writing binary data in the response.
  ServletOutputStream os = response.getOutputStream();
  //set the response content type to PDF
  response.setContentType("application/pdf"); 
  //create a new document
  Document doc = new Document();

  //create some special styles and font sizes
  Font bfBold18 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(0, 0, 0)); 
  
  try{
   
   //create an instance of the PdfWriter using the output stream
   PdfWriter.getInstance(doc, os); 

   //document header properties
   doc.addAuthor("DOC");
   doc.addCreationDate();
   doc.addProducer();
  // doc.addCreator("PatientDetails");
   doc.addTitle("PatientPDF");
   doc.setPageSize(PageSize.LETTER);
   doc.open();

Image img = Image.getInstance("img/abd.png");
        doc.add(new Paragraph("Sample 1: This is simple image demo."));
        doc.add(img);
 
             doc.close();
   
   response.sendRedirect("dashboard.jsp");

  }catch(DocumentException e){
   e.printStackTrace();
  }
  catch(Exception e){
   e.printStackTrace();
  }

 }
}

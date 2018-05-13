/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.text.TextAlignment;
import repository.PatientRepositoty;

public class PDF extends HttpServlet {
 private static final long serialVersionUID = 1L;

 public PDF() {
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
  Font bfBold18 = new Font(FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(0, 0, 0)); 
  
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

   //add a new paragraph
   //doc.add( new Paragraph("Patient Details", bfBold18));
   
 
 
 PatientRepositoty patientRepositoty = new PatientRepositoty();
            
            List<String> patientList = new ArrayList<String>();
            patientList = patientRepositoty.getPatientForPdf(id);
            String[] patientListt = new String[patientList.size()];
            patientListt = patientList.toArray(patientListt);
            
            String initials= patientListt[0];
            String surname= patientListt[1];
            String gender= patientListt[2];
            String birthday= patientListt[3];
            String age= patientListt[4];
            String parentorguardian= patientListt[5];
            String guardName= patientListt[6];
            String guardNIC= patientListt[7];
            String tel_no= patientListt[8];
            String diagnosis= patientListt[9];
            String p_co = patientListt[10];
            String hx_p_co = patientListt[11];
            String pmhx = patientListt[12];
            String pshx = patientListt[13];
            String aihx = patientListt[14];
            String drughx = patientListt[15];
            String immunization = patientListt[16];
            String socialhx = patientListt[17];
            String family = patientListt[18];

           
            
            PDFRepo PDFRepo = new PDFRepo();
            
            String organtype = "organType";
            List<String> organTypeList = new ArrayList<String>();
            organTypeList = PDFRepo.getListOfItems(id, organtype);
            String organList = PDFRepo.getListToString(organTypeList);
            
            
            
            
            
              doc.open();
              
              Font font1 = new Font(Font.FontFamily.HELVETICA  , 25, Font.BOLD);
             
             Paragraph paragraph1 = new Paragraph();
             paragraph1.setAlignment(Element.ALIGN_CENTER);
             paragraph1.setFont(font1);
             paragraph1.add("Patient Details");
             paragraph1.setSpacingAfter(60);
             doc.add(paragraph1);
             
             PdfPTable table1 = new PdfPTable(2);
             PdfPCell cell1 = new PdfPCell(new Paragraph("Initials"));
             PdfPCell cell2 = new PdfPCell(new Paragraph(initials));
             PdfPCell cell3 = new PdfPCell(new Paragraph("Surname"));
             PdfPCell cell4 = new PdfPCell(new Paragraph(surname));
             PdfPCell cell5 = new PdfPCell(new Paragraph("Gender"));
             PdfPCell cell6 = new PdfPCell(new Paragraph(gender));
             PdfPCell cell7 = new PdfPCell(new Paragraph("Birth Day"));
             PdfPCell cell8 = new PdfPCell(new Paragraph(birthday));
             PdfPCell cell9 = new PdfPCell(new Paragraph("AGE"));
             PdfPCell cell10 = new PdfPCell(new Paragraph(age));
             PdfPCell cell11 = new PdfPCell(new Paragraph("Parent / Guardian"));
             PdfPCell cell12 = new PdfPCell(new Paragraph(parentorguardian));
             PdfPCell cell13 = new PdfPCell(new Paragraph("Parent / Guardian Name"));
             PdfPCell cell14 = new PdfPCell(new Paragraph(guardName));
             PdfPCell cell15 = new PdfPCell(new Paragraph("Parent / Guardian NIC"));
             PdfPCell cell16 = new PdfPCell(new Paragraph(guardNIC));
             PdfPCell cell17 = new PdfPCell(new Paragraph("Parent / Guardian Tel No"));
             PdfPCell cell18 = new PdfPCell(new Paragraph(tel_no));
             PdfPCell cell19 = new PdfPCell(new Paragraph("System Type"));
             PdfPCell cell20 = new PdfPCell(new Paragraph(organList));
             PdfPCell cell21 = new PdfPCell(new Paragraph("DIAGNOSIS"));
             PdfPCell cell22 = new PdfPCell(new Paragraph(diagnosis));
             PdfPCell cell23 = new PdfPCell(new Paragraph("P:CO"));
             PdfPCell cell24 = new PdfPCell(new Paragraph(p_co));
             PdfPCell cell25 = new PdfPCell(new Paragraph("HX:P:CO"));
             PdfPCell cell26 = new PdfPCell(new Paragraph(hx_p_co));
             PdfPCell cell27 = new PdfPCell(new Paragraph("PMHX"));
             PdfPCell cell28 = new PdfPCell(new Paragraph(pmhx));
             PdfPCell cell29 = new PdfPCell(new Paragraph("PSHX"));
             PdfPCell cell30 = new PdfPCell(new Paragraph(pshx));
             PdfPCell cell31 = new PdfPCell(new Paragraph("AIHX"));
             PdfPCell cell32 = new PdfPCell(new Paragraph(aihx));
             PdfPCell cell33 = new PdfPCell(new Paragraph("DRUGHX"));
             PdfPCell cell34 = new PdfPCell(new Paragraph(drughx));
             PdfPCell cell35 = new PdfPCell(new Paragraph("IMMUNIZATION"));
             PdfPCell cell36 = new PdfPCell(new Paragraph(immunization));
             PdfPCell cell37 = new PdfPCell(new Paragraph("SOCIALHX"));
             PdfPCell cell38 = new PdfPCell(new Paragraph(socialhx));
             PdfPCell cell39 = new PdfPCell(new Paragraph("FAMILY"));
             PdfPCell cell40 = new PdfPCell(new Paragraph(family));
             table1.addCell(cell1);
             table1.addCell(cell2);
             table1.addCell(cell3);
             table1.addCell(cell4);
             table1.addCell(cell5);
             table1.addCell(cell6);
             table1.addCell(cell7);
             table1.addCell(cell8);
             table1.addCell(cell9);
             table1.addCell(cell10);
             table1.addCell(cell11);
             table1.addCell(cell12);
             table1.addCell(cell13);
             table1.addCell(cell14);
             table1.addCell(cell15);
             table1.addCell(cell16);
             table1.addCell(cell17);
             table1.addCell(cell18);
             table1.addCell(cell19);
             table1.addCell(cell20);
             table1.addCell(cell21);
             table1.addCell(cell22);
             table1.addCell(cell23);
             table1.addCell(cell24);
             table1.addCell(cell25);
             table1.addCell(cell26);
             table1.addCell(cell27);
             table1.addCell(cell28);
             table1.addCell(cell29);
             table1.addCell(cell30);
             table1.addCell(cell31);
             table1.addCell(cell32);
             table1.addCell(cell33);
             table1.addCell(cell34);
             table1.addCell(cell35);
             table1.addCell(cell36);
             table1.addCell(cell37);
             table1.addCell(cell38);
             table1.addCell(cell39);
             table1.addCell(cell40);
             
             PdfPTable table2 = new PdfPTable(1);
             PdfPCell cell41 = new PdfPCell(new Paragraph("General Examination",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
             table2.addCell(cell41);
             
             String respiratorydistress = "respiratoryDistress";
            List<String> respiratoryDistressList = new ArrayList<String>();
            respiratoryDistressList = PDFRepo.getListOfItems(id,respiratorydistress);
            String distressList = PDFRepo.getListToString(respiratoryDistressList);
            
             String oedema = "oedema";
            List<String> oedemaList = new ArrayList<String>();
            oedemaList = PDFRepo.getListOfItems(id,oedema);
            String oedemaListt = PDFRepo.getListToString(oedemaList);
            
             String lymphadenopathy = "lymphadenopathy";
            List<String> lymphadenopathyList = new ArrayList<String>();
            lymphadenopathyList = PDFRepo.getListOfItems(id,lymphadenopathy);
            String lymphadenopathyListt = PDFRepo.getListToString(lymphadenopathyList);
            
            String active= patientListt[19];
            String alert = patientListt[20];
            String dehydrated= patientListt[21];
            String pallor= patientListt[22];
            String ill= patientListt[23];
            String icteric= patientListt[24];
            String growth= patientListt[25];
            String cyanois= patientListt[26];
            String spo2= patientListt[27];
            String pob= patientListt[28];
            String clubbing= patientListt[29];
            String pitt= patientListt[30];
            String ab_movement= patientListt[31];
            String muscle_w= patientListt[32];
            String strabismus= patientListt[33];
            String gait= patientListt[34];
            String others= patientListt[35];
            String tenderness= patientListt[36];
            String other= patientListt[37];
            
             
             PdfPTable table3 = new PdfPTable(2);
             PdfPCell cell43 = new PdfPCell(new Paragraph("Active"));
             PdfPCell cell44 = new PdfPCell(new Paragraph(active));
             PdfPCell cell45 = new PdfPCell(new Paragraph("Alert"));
             PdfPCell cell46 = new PdfPCell(new Paragraph(alert));
             PdfPCell cell47 = new PdfPCell(new Paragraph("Dehydrated"));
             PdfPCell cell48 = new PdfPCell(new Paragraph(dehydrated));
             PdfPCell cell49 = new PdfPCell(new Paragraph("Pallor"));
             PdfPCell cell50 = new PdfPCell(new Paragraph(pallor));
             PdfPCell cell51 = new PdfPCell(new Paragraph("Ill-Looking"));
             PdfPCell cell52 = new PdfPCell(new Paragraph(ill));
             PdfPCell cell53 = new PdfPCell(new Paragraph("Icteric"));
             PdfPCell cell54 = new PdfPCell(new Paragraph(icteric));
             PdfPCell cell55 = new PdfPCell(new Paragraph("Growth"));
             PdfPCell cell56 = new PdfPCell(new Paragraph(growth));
             PdfPCell cell57 = new PdfPCell(new Paragraph("Cyanois"));
             PdfPCell cell58 = new PdfPCell(new Paragraph(cyanois));
             PdfPCell cell59 = new PdfPCell(new Paragraph("Spo2"));
             PdfPCell cell60 = new PdfPCell(new Paragraph(spo2));
             PdfPCell cell61 = new PdfPCell(new Paragraph("Respiratory Distress"));
             PdfPCell cell62 = new PdfPCell(new Paragraph(distressList));
             PdfPCell cell63 = new PdfPCell(new Paragraph("Pattern Of Breathing"));
             PdfPCell cell64 = new PdfPCell(new Paragraph(pob));
             PdfPCell cell65 = new PdfPCell(new Paragraph("Clubbing"));
             PdfPCell cell66 = new PdfPCell(new Paragraph(clubbing));
             PdfPCell cell67 = new PdfPCell(new Paragraph("Oedema"));
             PdfPCell cell68 = new PdfPCell(new Paragraph(oedemaListt));
             PdfPCell cell69 = new PdfPCell(new Paragraph("Pitting / Non Pitting"));
             PdfPCell cell70 = new PdfPCell(new Paragraph(pitt));
             PdfPCell cell71 = new PdfPCell(new Paragraph("Abnormal Movements"));
             PdfPCell cell72 = new PdfPCell(new Paragraph(ab_movement));
             PdfPCell cell73 = new PdfPCell(new Paragraph("Muscle Wasting"));
             PdfPCell cell74 = new PdfPCell(new Paragraph(muscle_w));
             PdfPCell cell75 = new PdfPCell(new Paragraph("Strabismus"));
             PdfPCell cell76 = new PdfPCell(new Paragraph(strabismus));
             PdfPCell cell77 = new PdfPCell(new Paragraph("Gait"));
             PdfPCell cell78 = new PdfPCell(new Paragraph(gait));
             PdfPCell cell79 = new PdfPCell(new Paragraph("Lymphadenopathy"));
             PdfPCell cell80 = new PdfPCell(new Paragraph(lymphadenopathyListt));
             PdfPCell cell81 = new PdfPCell(new Paragraph("If Lymphadenopathy is Other"));
             PdfPCell cell82 = new PdfPCell(new Paragraph(others));
             PdfPCell cell83 = new PdfPCell(new Paragraph("Tenderness"));
             PdfPCell cell84 = new PdfPCell(new Paragraph(tenderness));
             PdfPCell cell85 = new PdfPCell(new Paragraph("Other"));
             PdfPCell cell86 = new PdfPCell(new Paragraph(other));
             table3.addCell(cell43);
             table3.addCell(cell44);
             table3.addCell(cell45);
             table3.addCell(cell46);
             table3.addCell(cell47);
             table3.addCell(cell48);
             table3.addCell(cell49);
             table3.addCell(cell50);
             table3.addCell(cell51);
             table3.addCell(cell52);
             table3.addCell(cell53);
             table3.addCell(cell54);
             table3.addCell(cell55);
             table3.addCell(cell56);
             table3.addCell(cell57);
             table3.addCell(cell58);
             table3.addCell(cell59);
             table3.addCell(cell60);
             table3.addCell(cell61);
             table3.addCell(cell62);
             table3.addCell(cell63);
             table3.addCell(cell64);
             table3.addCell(cell65);
             table3.addCell(cell66);
             table3.addCell(cell67);
             table3.addCell(cell68);
             table3.addCell(cell69);
             table3.addCell(cell70);
             table3.addCell(cell71);
             table3.addCell(cell72);
             table3.addCell(cell73);
             table3.addCell(cell74);
             table3.addCell(cell75);
             table3.addCell(cell76);
             table3.addCell(cell77);
             table3.addCell(cell78);
             table3.addCell(cell79);
             table3.addCell(cell80);
             table3.addCell(cell81);
             table3.addCell(cell82);
             table3.addCell(cell83);
             table3.addCell(cell84);
             table3.addCell(cell85);
             table3.addCell(cell86);
             
            PdfPTable table4 = new PdfPTable(1);
            PdfPCell cell87 = new PdfPCell(new Paragraph("CVS",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table4.addCell(cell87);
            
            
            String cyanosis_cvs= patientListt[38];
            String blood_high= patientListt[39];
            String blood_low= patientListt[40];
            String pulse = patientListt[41];
            String volume= patientListt[42];
            String character= patientListt[43];
            String rhythm= patientListt[44];
            String jvp= patientListt[45];
            String crft= patientListt[46];
            String peripheral= patientListt[47];
            String precordium_scars= patientListt[48];
            String deformalities= patientListt[49];
            String deformalities_val= patientListt[50];
            String pulsation= patientListt[51];
            String pulsation_val= patientListt[52];
            String apex_beat = patientListt[53];
            String dual_rhythm= patientListt[54];
            String thirdSound= patientListt[55];
            String forthSound= patientListt[56];
            String murmurs= patientListt[57];
            String othercvs= patientListt[58];
            
            PdfPTable table5 = new PdfPTable(2);
             PdfPCell cell89 = new PdfPCell(new Paragraph("Cayanosis"));
             PdfPCell cell90 = new PdfPCell(new Paragraph(cyanosis_cvs));
             PdfPCell cell91 = new PdfPCell(new Paragraph("Blood Pressure Higher Limit"));
             PdfPCell cell92 = new PdfPCell(new Paragraph(blood_high));
             PdfPCell cell93 = new PdfPCell(new Paragraph("Blood Pressure Lower Limit"));
             PdfPCell cell94 = new PdfPCell(new Paragraph(blood_low));
             PdfPCell cell95 = new PdfPCell(new Paragraph("Pulse Rate"));
             PdfPCell cell96 = new PdfPCell(new Paragraph(pulse));
             PdfPCell cell97 = new PdfPCell(new Paragraph("Volume"));
             PdfPCell cell98 = new PdfPCell(new Paragraph(volume));
             PdfPCell cell99 = new PdfPCell(new Paragraph("Character"));
             PdfPCell cell100 = new PdfPCell(new Paragraph(character));
             PdfPCell cell101 = new PdfPCell(new Paragraph("Rhythm"));
             PdfPCell cell102 = new PdfPCell(new Paragraph(rhythm));
             PdfPCell cell103 = new PdfPCell(new Paragraph("JVP"));
             PdfPCell cell104 = new PdfPCell(new Paragraph(jvp));
             PdfPCell cell105 = new PdfPCell(new Paragraph("CRFT"));
             PdfPCell cell106 = new PdfPCell(new Paragraph(crft));
             PdfPCell cell107 = new PdfPCell(new Paragraph("Peripheral"));
             PdfPCell cell108 = new PdfPCell(new Paragraph(peripheral));
             PdfPCell cell109 = new PdfPCell(new Paragraph("Precordium scars"));
             PdfPCell cell110 = new PdfPCell(new Paragraph(precordium_scars));
             PdfPCell cell111 = new PdfPCell(new Paragraph("Chest Wall Deformalities"));
             PdfPCell cell112 = new PdfPCell(new Paragraph(deformalities));
             PdfPCell cell113 = new PdfPCell(new Paragraph("If yes"));
             PdfPCell cell114 = new PdfPCell(new Paragraph(deformalities_val));
             PdfPCell cell115 = new PdfPCell(new Paragraph("Visible Pulsation"));
             PdfPCell cell116 = new PdfPCell(new Paragraph(pulsation));
             PdfPCell cell117 = new PdfPCell(new Paragraph("If yes"));
             PdfPCell cell118 = new PdfPCell(new Paragraph(pulsation_val));
             PdfPCell cell119 = new PdfPCell(new Paragraph("Apex Beat"));
             PdfPCell cell120 = new PdfPCell(new Paragraph(apex_beat));
             PdfPCell cell121 = new PdfPCell(new Paragraph("Dual Rhythm"));
             PdfPCell cell122 = new PdfPCell(new Paragraph(dual_rhythm));
             PdfPCell cell123 = new PdfPCell(new Paragraph("3rd Heart Sound"));
             PdfPCell cell124 = new PdfPCell(new Paragraph(thirdSound));
             PdfPCell cell125 = new PdfPCell(new Paragraph("4th Heart Sound"));
             PdfPCell cell126 = new PdfPCell(new Paragraph(forthSound));
             PdfPCell cell127 = new PdfPCell(new Paragraph("Murmurs"));
             PdfPCell cell128 = new PdfPCell(new Paragraph(murmurs));
             PdfPCell cell129 = new PdfPCell(new Paragraph("Other"));
             PdfPCell cell130 = new PdfPCell(new Paragraph(othercvs));
             table5.addCell(cell89);
             table5.addCell(cell90);
             table5.addCell(cell91);
             table5.addCell(cell92);
             table5.addCell(cell93);
             table5.addCell(cell94);
             table5.addCell(cell95);
             table5.addCell(cell96);
             table5.addCell(cell97);
             table5.addCell(cell98);
             table5.addCell(cell99);
             table5.addCell(cell100);
             table5.addCell(cell101);
             table5.addCell(cell102);
             table5.addCell(cell103);
             table5.addCell(cell104);
             table5.addCell(cell105);
             table5.addCell(cell106);
             table5.addCell(cell107);
             table5.addCell(cell108);
             table5.addCell(cell109);
             table5.addCell(cell110);
             table5.addCell(cell111);
             table5.addCell(cell112);
             table5.addCell(cell113);
             table5.addCell(cell114);
             table5.addCell(cell115);
             table5.addCell(cell116);
             table5.addCell(cell117);
             table5.addCell(cell118);
             table5.addCell(cell119);
             table5.addCell(cell120);
             table5.addCell(cell121);
             table5.addCell(cell122);
             table5.addCell(cell123);
             table5.addCell(cell124);
             table5.addCell(cell125);
             table5.addCell(cell126);
             table5.addCell(cell127);
             table5.addCell(cell128);
             table5.addCell(cell129);
             table5.addCell(cell130);
            
            PdfPTable table6 = new PdfPTable(1);
            PdfPCell cell132 = new PdfPCell(new Paragraph("Abdomen",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table6.addCell(cell132);
            
            String distended= patientListt[59];
            String scars= patientListt[60];
            String scars_val= patientListt[61];
            String vbmovements= patientListt[62];
            String dvessels= patientListt[63];
            String palpation= patientListt[64];
            String liver= patientListt[65];
            String spleen= patientListt[66];
            String masses= patientListt[67];
            String ballotable= patientListt[68];
            String free_fluid= patientListt[69];
            String dullness= patientListt[70];
            String bowel_sounds= patientListt[71];
            String otherAbdomen= patientListt[72];
            
            
           // Image img = Image.getInstance("img/abd.png");
           // PdfPCell cell = new PdfPCell(img, true);    
            
            PdfPTable table7 = new PdfPTable(2);
            PdfPCell cell133 = new PdfPCell(new Paragraph("Distended"));
            PdfPCell cell134 = new PdfPCell(new Paragraph(distended));
            PdfPCell cell135 = new PdfPCell(new Paragraph("Scars"));
            PdfPCell cell136 = new PdfPCell(new Paragraph(scars));
            PdfPCell cell137 = new PdfPCell(new Paragraph("If Yes"));
            PdfPCell cell138 = new PdfPCell(new Paragraph(scars_val));
            PdfPCell cell139 = new PdfPCell(new Paragraph("Visible Bowel Movements"));
            PdfPCell cell140 = new PdfPCell(new Paragraph(vbmovements));
            PdfPCell cell141 = new PdfPCell(new Paragraph("Dilated Vessels"));
            PdfPCell cell142 = new PdfPCell(new Paragraph(dvessels));
            PdfPCell cell143 = new PdfPCell(new Paragraph("Palpation"));
            PdfPCell cell144 = new PdfPCell(new Paragraph(palpation));
            
            // Creating nested table for Palpation Area
            PdfPTable nestedTable = new PdfPTable(3); 
      
      String palpationarea = "palpationArea";
            List<String> palpationArea = new ArrayList<String>();
            palpationArea = PDFRepo.getListOfItems(id, palpationarea);
            
      if(palpationArea.contains("1")){
          String relativeWebPath1 = "/img/pal_aria_1_yes.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedTable.addCell(nested1);
      }else{
          String relativeWebPath1 = "/img/pal_aria_1_no.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedTable.addCell(nested1);
      }
      if(palpationArea.contains("2")){
          String relativeWebPath2 = "/img/pal_aria_2_yes.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedTable.addCell(nested2);
      }else{
            String relativeWebPath2 = "/img/pal_aria_2_no.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedTable.addCell(nested2);
      }  
      if(palpationArea.contains("3")){
          String relativeWebPath3 = "/img/pal_aria_3_yes.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedTable.addCell(nested3); 
      }else{
          String relativeWebPath3 = "/img/pal_aria_3_no.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedTable.addCell(nested3); 
      } 
      if(palpationArea.contains("4")){
          String relativeWebPath4 = "/img/pal_aria_4_yes.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedTable.addCell(nested4);
      }else{
          String relativeWebPath4 = "/img/pal_aria_4_no.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedTable.addCell(nested4);
      } 
      if(palpationArea.contains("5")){
          String relativeWebPath5 = "/img/pal_aria_5_yes.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedTable.addCell(nested5);
      }else{
          String relativeWebPath5 = "/img/pal_aria_5_no.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedTable.addCell(nested5);
      } 
      if(palpationArea.contains("6")){
          String relativeWebPath6 = "/img/pal_aria_6_yes.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedTable.addCell(nested6);
      }else{
            String relativeWebPath6 = "/img/pal_aria_6_no.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedTable.addCell(nested6);
      } 
      if(palpationArea.contains("7")){
          String relativeWebPath7 = "/img/pal_aria_7_yes.png";
            String absoluteDiskPath7 = getServletContext().getRealPath(relativeWebPath7);
            Image img7 = Image.getInstance(absoluteDiskPath7);
            PdfPCell  nested7 = new PdfPCell(img7 , true);
            nestedTable.addCell(nested7);
      }else{
          String relativeWebPath7 = "/img/pal_aria_7_no.png";
            String absoluteDiskPath7 = getServletContext().getRealPath(relativeWebPath7);
            Image img7 = Image.getInstance(absoluteDiskPath7);
            PdfPCell  nested7 = new PdfPCell(img7 , true);
            nestedTable.addCell(nested7);
      } 
      if(palpationArea.contains("8")){
          String relativeWebPath8 = "/img/pal_aria_8_yes.png";
            String absoluteDiskPath8 = getServletContext().getRealPath(relativeWebPath8);
            Image img8 = Image.getInstance(absoluteDiskPath8);
            PdfPCell  nested8 = new PdfPCell(img8 , true);
            nestedTable.addCell(nested8);
      }else{
          String relativeWebPath8 = "/img/pal_aria_8_no.png";
            String absoluteDiskPath8 = getServletContext().getRealPath(relativeWebPath8);
            Image img8 = Image.getInstance(absoluteDiskPath8);
            PdfPCell  nested8 = new PdfPCell(img8 , true);
            nestedTable.addCell(nested8);
      } 
      if(palpationArea.contains("9")){
          String relativeWebPath9 = "/img/pal_aria_9_yes.png";
            String absoluteDiskPath9 = getServletContext().getRealPath(relativeWebPath9);
            Image img9 = Image.getInstance(absoluteDiskPath9);
            PdfPCell  nested9 = new PdfPCell(img9 , true);
            nestedTable.addCell(nested9);
      }else{
          String relativeWebPath9 = "/img/pal_aria_9_no.png";
            String absoluteDiskPath9 = getServletContext().getRealPath(relativeWebPath9);
            Image img9 = Image.getInstance(absoluteDiskPath9);
            PdfPCell  nested9 = new PdfPCell(img9 , true);
            nestedTable.addCell(nested9);
      } 

      PdfPCell cell145 = new PdfPCell(new Paragraph("Palpation Area"));             
      
      PdfPCell cell146 = new PdfPCell(nestedTable);
      
            PdfPCell cell147 = new PdfPCell(new Paragraph("Liver"));
            PdfPCell cell148 = new PdfPCell(new Paragraph(liver));
            PdfPCell cell149 = new PdfPCell(new Paragraph("Spleen"));
            PdfPCell cell150 = new PdfPCell(new Paragraph(spleen));
            PdfPCell cell151 = new PdfPCell(new Paragraph("Masses"));
            PdfPCell cell152 = new PdfPCell(new Paragraph(masses));
            PdfPCell cell153 = new PdfPCell(new Paragraph("Kidney"));
            PdfPCell cell154 = new PdfPCell(new Paragraph("Kidney"));
            PdfPCell cell155 = new PdfPCell(new Paragraph("Ballotable"));
            PdfPCell cell156 = new PdfPCell(new Paragraph(ballotable));
            PdfPCell cell157 = new PdfPCell(new Paragraph("Free Fluid"));
            PdfPCell cell158 = new PdfPCell(new Paragraph(free_fluid));
            PdfPCell cell159 = new PdfPCell(new Paragraph("Dullness"));
            PdfPCell cell160 = new PdfPCell(new Paragraph(dullness));
            PdfPCell cell161 = new PdfPCell(new Paragraph("Bowel Sounds"));
            PdfPCell cell162 = new PdfPCell(new Paragraph(bowel_sounds));
            PdfPCell cell163 = new PdfPCell(new Paragraph("Other"));
            PdfPCell cell164 = new PdfPCell(new Paragraph(otherAbdomen));
            table7.addCell(cell133);
            table7.addCell(cell134);
            table7.addCell(cell135);
            table7.addCell(cell136);
            table7.addCell(cell137);
            table7.addCell(cell138);
            table7.addCell(cell139);
            table7.addCell(cell140);
            table7.addCell(cell141);
            table7.addCell(cell142);
            table7.addCell(cell143);
            table7.addCell(cell144);
            table7.addCell(cell145);
            table7.addCell(cell146);
            table7.addCell(cell147);
            table7.addCell(cell148);
            table7.addCell(cell149);
            table7.addCell(cell150);
            table7.addCell(cell151);
            table7.addCell(cell152);
            table7.addCell(cell153);
            table7.addCell(cell154);
            table7.addCell(cell155);
            table7.addCell(cell156);
            table7.addCell(cell157);
            table7.addCell(cell158);
            table7.addCell(cell159);
            table7.addCell(cell160);
            table7.addCell(cell161);
            table7.addCell(cell162);
            table7.addCell(cell163);
            table7.addCell(cell164); 
            
            
            PdfPTable table8 = new PdfPTable(1);
            PdfPCell cell166 = new PdfPCell(new Paragraph("Respiratory",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table8.addCell(cell166);
            
            
            String respiratory_rate= patientListt[73];
            String bcg_scar= patientListt[74];
            String chest_wall_deformities= patientListt[75];
            String lung_expansion= patientListt[76];
            String other_lung_expansion= patientListt[77];
            String respiratory_scars= patientListt[78];
            String air_entry= patientListt[79];
            String vb= patientListt[80];
            String bb= patientListt[81];
            String rhonchi= patientListt[82];
            String crepts= patientListt[83];
            String pleural= patientListt[84];
            String other_detail= patientListt[85];
            String breath_sound= patientListt[86];
            String vocal_resonance= patientListt[87];
            String precussion_note= patientListt[88];
            String precussion_note_val= patientListt[89];
            String other_resp= patientListt[90];
            
            
            PdfPTable table9 = new PdfPTable(2);
            PdfPCell cell167 = new PdfPCell(new Paragraph("Respiratory Rate"));
            PdfPCell cell168 = new PdfPCell(new Paragraph(respiratory_rate));
            PdfPCell cell169 = new PdfPCell(new Paragraph("BCG Scar"));
            PdfPCell cell170 = new PdfPCell(new Paragraph(bcg_scar));
            PdfPCell cell171 = new PdfPCell(new Paragraph("Chest Wall Deformities"));
            PdfPCell cell172 = new PdfPCell(new Paragraph(chest_wall_deformities));
            PdfPCell cell173 = new PdfPCell(new Paragraph("Lung Expansion"));
            PdfPCell cell174 = new PdfPCell(new Paragraph(lung_expansion));
            PdfPCell cell175 = new PdfPCell(new Paragraph("Other Lung Expansion"));
            PdfPCell cell176 = new PdfPCell(new Paragraph(other_lung_expansion));
            PdfPCell cell177 = new PdfPCell(new Paragraph("Respiratory Scars"));
            PdfPCell cell178 = new PdfPCell(new Paragraph(respiratory_scars));
            PdfPCell cell179 = new PdfPCell(new Paragraph("Air Entry"));
            PdfPCell cell180 = new PdfPCell(new Paragraph(air_entry));
            
                        // Creating nested table for Air Entry

            PdfPTable nestedAirEntryTable = new PdfPTable(2); 
      
      String airentry = "airEntry";
            List<String> airEntry = new ArrayList<String>();
            airEntry = PDFRepo.getListOfItems(id, airentry);
            
      if(airEntry.contains("1")){
          String relativeWebPath1 = "/img/lung_1_yes.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedAirEntryTable.addCell(nested1);
      }else{
          String relativeWebPath1 = "/img/lung_1_no.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedAirEntryTable.addCell(nested1);
      }
      if(airEntry.contains("4")){
          String relativeWebPath2 = "/img/lung_4_yes.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedAirEntryTable.addCell(nested2);
      }else{
            String relativeWebPath2 = "/img/lung_4_no.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedAirEntryTable.addCell(nested2);
      }  
      if(airEntry.contains("2")){
          String relativeWebPath3 = "/img/lung_2_yes.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedAirEntryTable.addCell(nested3); 
      }else{
          String relativeWebPath3 = "/img/lung_2_no.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedAirEntryTable.addCell(nested3); 
      } 
      if(airEntry.contains("5")){
          String relativeWebPath4 = "/img/lung_5_yes.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedAirEntryTable.addCell(nested4);
      }else{
          String relativeWebPath4 = "/img/lung_5_no.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedAirEntryTable.addCell(nested4);
      } 
      if(airEntry.contains("3")){
          String relativeWebPath5 = "/img/lung_3_yes.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedAirEntryTable.addCell(nested5);
      }else{
          String relativeWebPath5 = "/img/lung_3_no.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedAirEntryTable.addCell(nested5);
      } 
      if(airEntry.contains("6")){
          String relativeWebPath6 = "/img/lung_6_yes.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedAirEntryTable.addCell(nested6);
      }else{
            String relativeWebPath6 = "/img/lung_6_no.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedAirEntryTable.addCell(nested6);
      } 
       

      PdfPCell cell245 = new PdfPCell(new Paragraph("Air Entry Area"));             
      
      PdfPCell cell246 = new PdfPCell(nestedAirEntryTable);
            
            PdfPCell cell181 = new PdfPCell(new Paragraph("VB"));
            PdfPCell cell182 = new PdfPCell(new Paragraph(vb));
            PdfPCell cell183 = new PdfPCell(new Paragraph("BB"));
            PdfPCell cell184 = new PdfPCell(new Paragraph(bb));
            PdfPCell cell185 = new PdfPCell(new Paragraph("Rhonchi"));
            PdfPCell cell186 = new PdfPCell(new Paragraph(rhonchi));
            
            // Creating nested table for Added Sounds Rhonchi

             PdfPTable nestedAddedSoundsRhonchiTable = new PdfPTable(2); 
      
      String addedsoundsrhonchi = "addedSoundsRhonchi";
            List<String> addedSoundsRhonchi = new ArrayList<String>();
            addedSoundsRhonchi = PDFRepo.getListOfItems(id, addedsoundsrhonchi);
            
      if(addedSoundsRhonchi.contains("1")){
          String relativeWebPath1 = "/img/lung_1_yes.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested1);
      }else{
          String relativeWebPath1 = "/img/lung_1_no.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested1);
      }
      if(addedSoundsRhonchi.contains("4")){
          String relativeWebPath2 = "/img/lung_4_yes.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested2);
      }else{
            String relativeWebPath2 = "/img/lung_4_no.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested2);
      }  
      if(addedSoundsRhonchi.contains("2")){
          String relativeWebPath3 = "/img/lung_2_yes.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested3); 
      }else{
          String relativeWebPath3 = "/img/lung_2_no.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested3); 
      } 
      if(addedSoundsRhonchi.contains("5")){
          String relativeWebPath4 = "/img/lung_5_yes.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested4);
      }else{
          String relativeWebPath4 = "/img/lung_5_no.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested4);
      } 
      if(addedSoundsRhonchi.contains("3")){
          String relativeWebPath5 = "/img/lung_3_yes.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested5);
      }else{
          String relativeWebPath5 = "/img/lung_3_no.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested5);
      } 
      if(addedSoundsRhonchi.contains("6")){
          String relativeWebPath6 = "/img/lung_6_yes.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested6);
      }else{
            String relativeWebPath6 = "/img/lung_6_no.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedAddedSoundsRhonchiTable.addCell(nested6);
      } 
       

      PdfPCell cell345 = new PdfPCell(new Paragraph("Added Sounds Rhonchi"));             
      
      PdfPCell cell346 = new PdfPCell(nestedAddedSoundsRhonchiTable);
            
            PdfPCell cell187 = new PdfPCell(new Paragraph("Crepts"));
            PdfPCell cell188 = new PdfPCell(new Paragraph(crepts));
            
             // Creating nested table for Added Sounds Crepts

             PdfPTable nestedAddedSoundsCreptsTable = new PdfPTable(2); 
      
      String addedsoundscrepts = "addedSoundsCrepts";
            List<String> addedSoundsCrepts = new ArrayList<String>();
            addedSoundsCrepts = PDFRepo.getListOfItems(id, addedsoundscrepts);
            
      if(addedSoundsCrepts.contains("1")){
          String relativeWebPath1 = "/img/lung_1_yes.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedAddedSoundsCreptsTable.addCell(nested1);
      }else{
          String relativeWebPath1 = "/img/lung_1_no.png";
            String absoluteDiskPath1 = getServletContext().getRealPath(relativeWebPath1);
            Image img1 = Image.getInstance(absoluteDiskPath1);
            PdfPCell  nested1 = new PdfPCell(img1 , true);
            nestedAddedSoundsCreptsTable.addCell(nested1);
      }
      if(addedSoundsCrepts.contains("4")){
          String relativeWebPath2 = "/img/lung_4_yes.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedAddedSoundsCreptsTable.addCell(nested2);
      }else{
            String relativeWebPath2 = "/img/lung_4_no.png";
            String absoluteDiskPath2 = getServletContext().getRealPath(relativeWebPath2);
            Image img2 = Image.getInstance(absoluteDiskPath2);
            PdfPCell  nested2 = new PdfPCell(img2 , true);
            nestedAddedSoundsCreptsTable.addCell(nested2);
      }  
      if(addedSoundsCrepts.contains("2")){
          String relativeWebPath3 = "/img/lung_2_yes.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedAddedSoundsCreptsTable.addCell(nested3); 
      }else{
          String relativeWebPath3 = "/img/lung_2_no.png";
            String absoluteDiskPath3 = getServletContext().getRealPath(relativeWebPath3);
            Image img3 = Image.getInstance(absoluteDiskPath3);
            PdfPCell  nested3 = new PdfPCell(img3 , true);
            nestedAddedSoundsCreptsTable.addCell(nested3); 
      } 
      if(addedSoundsCrepts.contains("5")){
          String relativeWebPath4 = "/img/lung_5_yes.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedAddedSoundsCreptsTable.addCell(nested4);
      }else{
          String relativeWebPath4 = "/img/lung_5_no.png";
            String absoluteDiskPath4 = getServletContext().getRealPath(relativeWebPath4);
            Image img4 = Image.getInstance(absoluteDiskPath4);
            PdfPCell  nested4 = new PdfPCell(img4 , true);
            nestedAddedSoundsCreptsTable.addCell(nested4);
      } 
      if(addedSoundsCrepts.contains("3")){
          String relativeWebPath5 = "/img/lung_3_yes.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedAddedSoundsCreptsTable.addCell(nested5);
      }else{
          String relativeWebPath5 = "/img/lung_3_no.png";
            String absoluteDiskPath5 = getServletContext().getRealPath(relativeWebPath5);
            Image img5 = Image.getInstance(absoluteDiskPath5);
            PdfPCell  nested5 = new PdfPCell(img5 , true);
            nestedAddedSoundsCreptsTable.addCell(nested5);
      } 
      if(addedSoundsCrepts.contains("6")){
          String relativeWebPath6 = "/img/lung_6_yes.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedAddedSoundsCreptsTable.addCell(nested6);
      }else{
            String relativeWebPath6 = "/img/lung_6_no.png";
            String absoluteDiskPath6 = getServletContext().getRealPath(relativeWebPath6);
            Image img6 = Image.getInstance(absoluteDiskPath6);
            PdfPCell  nested6 = new PdfPCell(img6 , true);
            nestedAddedSoundsCreptsTable.addCell(nested6);
      } 
       

      PdfPCell cell445 = new PdfPCell(new Paragraph("Added Sounds Crepts"));             
      
      PdfPCell cell446 = new PdfPCell(nestedAddedSoundsCreptsTable);
            
            PdfPCell cell189 = new PdfPCell(new Paragraph("Pleural"));
            PdfPCell cell190 = new PdfPCell(new Paragraph(pleural));
            PdfPCell cell191 = new PdfPCell(new Paragraph("Other Detail"));
            PdfPCell cell192 = new PdfPCell(new Paragraph(other_detail));
            PdfPCell cell193 = new PdfPCell(new Paragraph("Breath Sound"));
            PdfPCell cell194 = new PdfPCell(new Paragraph(breath_sound));
            PdfPCell cell195 = new PdfPCell(new Paragraph("Vocal Resonance"));
            PdfPCell cell196 = new PdfPCell(new Paragraph(vocal_resonance));
            PdfPCell cell197 = new PdfPCell(new Paragraph("Precussion Note"));
            PdfPCell cell198 = new PdfPCell(new Paragraph(precussion_note));
            PdfPCell cell199 = new PdfPCell(new Paragraph("Precussion Note Value"));
            PdfPCell cell200 = new PdfPCell(new Paragraph(precussion_note_val));
            PdfPCell cell201 = new PdfPCell(new Paragraph("Other"));
            PdfPCell cell202 = new PdfPCell(new Paragraph(other_resp));
            table9.addCell(cell167);
            table9.addCell(cell168);
            table9.addCell(cell169);
            table9.addCell(cell170);
            table9.addCell(cell171);
            table9.addCell(cell172);
            table9.addCell(cell173);
            table9.addCell(cell174);
            table9.addCell(cell175);
            table9.addCell(cell176);
            table9.addCell(cell177);
            table9.addCell(cell178);
            table9.addCell(cell179);
            table9.addCell(cell180);
            table9.addCell(cell245);
            table9.addCell(cell246);
            table9.addCell(cell181);
            table9.addCell(cell182);
            table9.addCell(cell183);
            table9.addCell(cell184);
            table9.addCell(cell185);
            table9.addCell(cell186);
            table9.addCell(cell345);
            table9.addCell(cell346);
            table9.addCell(cell187);
            table9.addCell(cell188);
            table9.addCell(cell445);
            table9.addCell(cell446);
            table9.addCell(cell189);
            table9.addCell(cell190);
            table9.addCell(cell191);
            table9.addCell(cell192);
            table9.addCell(cell193);
            table9.addCell(cell194);
            table9.addCell(cell195);
            table9.addCell(cell196);
            table9.addCell(cell197);
            table9.addCell(cell198);
            table9.addCell(cell199);
            table9.addCell(cell200);
            table9.addCell(cell201);
            table9.addCell(cell202);
            
            
            PdfPTable table10 = new PdfPTable(1);
            PdfPCell cell204 = new PdfPCell(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table10.addCell(cell204);
            
            
            PdfPTable table11 = new PdfPTable(2);
            String height= patientListt[91];
            String weight= patientListt[92];
            
            PdfPCell cell205 = new PdfPCell(new Paragraph("Height"));
            PdfPCell cell206 = new PdfPCell(new Paragraph(height));
            PdfPCell cell207 = new PdfPCell(new Paragraph("Weight"));
            PdfPCell cell208 = new PdfPCell(new Paragraph(weight));
            table11.addCell(cell205);
            table11.addCell(cell206);
            table11.addCell(cell207);
            table11.addCell(cell208);
            
            PdfPTable table12 = new PdfPTable(1);
            PdfPCell cell304 = new PdfPCell(new Paragraph("Investigation Report",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table12.addCell(cell304);
            
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            PDFRepo pdfrepo = new PDFRepo();
            
            List<String> investigationReport1 = new ArrayList<String>();
            investigationReport1 = pdfrepo.investigationReport1(id);
            int size = investigationReport1.size();
            int realSize = size+1;
            out.println(size);
            
            PdfPTable tableIx1 = new PdfPTable(realSize);
            PdfPCell cell = new PdfPCell(new Paragraph("Data1"));
            tableIx1.addCell(cell);
            for(String i : investigationReport1){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx1.addCell(cells);
            }
            
            List<String> investigationReport2 = new ArrayList<String>();
            investigationReport2 = pdfrepo.investigationReport2(id);
            PdfPTable tableIx2 = new PdfPTable(realSize);
            PdfPCell cellIx2 = new PdfPCell(new Paragraph("Data2"));
            tableIx2.addCell(cellIx2);
            for(String i : investigationReport2){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx2.addCell(cells);
            }
            
            List<String> investigationReport3 = new ArrayList<String>();
            investigationReport3 = pdfrepo.investigationReport3(id);
            PdfPTable tableIx3 = new PdfPTable(realSize);
            PdfPCell cellIx3 = new PdfPCell(new Paragraph("Data2"));
            tableIx3.addCell(cellIx3);
            for(String i : investigationReport3){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx3.addCell(cells);
            }
            
            List<String> investigationReport4 = new ArrayList<String>();
            investigationReport4 = pdfrepo.investigationReport4(id);
            PdfPTable tableIx4 = new PdfPTable(realSize);
            PdfPCell cellIx4 = new PdfPCell(new Paragraph("Data4"));
            tableIx4.addCell(cellIx4);
            for(String i : investigationReport4){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx4.addCell(cells);
            }
            
            List<String> investigationReport5 = new ArrayList<String>();
            investigationReport5 = pdfrepo.investigationReport5(id);
            PdfPTable tableIx5 = new PdfPTable(realSize);
            PdfPCell cellIx5 = new PdfPCell(new Paragraph("Data5"));
            tableIx5.addCell(cellIx5);
            for(String i : investigationReport5){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx5.addCell(cells);
            }
            
            List<String> investigationReport6 = new ArrayList<String>();
            investigationReport6 = pdfrepo.investigationReport6(id);
            PdfPTable tableIx6 = new PdfPTable(realSize);
            PdfPCell cellIx6 = new PdfPCell(new Paragraph("Data6"));
            tableIx6.addCell(cellIx6);
            for(String i : investigationReport6){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx6.addCell(cells);
            }
            
            List<String> investigationReport7 = new ArrayList<String>();
            investigationReport7 = pdfrepo.investigationReport7(id);
            PdfPTable tableIx7 = new PdfPTable(realSize);
            PdfPCell cellIx7 = new PdfPCell(new Paragraph("Data7"));
            tableIx7.addCell(cellIx7);
            for(String i : investigationReport7){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx7.addCell(cells);
            }
            
            List<String> investigationReport8 = new ArrayList<String>();
            investigationReport8 = pdfrepo.investigationReport8(id);
            PdfPTable tableIx8 = new PdfPTable(realSize);
            PdfPCell cellIx8 = new PdfPCell(new Paragraph("Data8"));
            tableIx8.addCell(cellIx8);
            for(String i : investigationReport8){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx8.addCell(cells);
            }
            
            List<String> investigationReport9 = new ArrayList<String>();
            investigationReport9 = pdfrepo.investigationReport9(id);
            PdfPTable tableIx9 = new PdfPTable(realSize);
            PdfPCell cellIx9 = new PdfPCell(new Paragraph("Data9"));
            tableIx9.addCell(cellIx9);
            for(String i : investigationReport9){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx9.addCell(cells);
            }
            
            List<String> investigationReport10 = new ArrayList<String>();
            investigationReport10 = pdfrepo.investigationReport10(id);
            PdfPTable tableIx10 = new PdfPTable(realSize);
            PdfPCell cellIx10 = new PdfPCell(new Paragraph("Data10"));
            tableIx10.addCell(cellIx10);
            for(String i : investigationReport10){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx10.addCell(cells);
            }
            
            List<String> investigationReport11 = new ArrayList<String>();
            investigationReport11 = pdfrepo.investigationReport11(id);
            PdfPTable tableIx11 = new PdfPTable(realSize);
            PdfPCell cellIx11 = new PdfPCell(new Paragraph("Data11"));
            tableIx11.addCell(cellIx11);
            for(String i : investigationReport11){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx11.addCell(cells);
            }
            
            List<String> investigationReport12 = new ArrayList<String>();
            investigationReport12 = pdfrepo.investigationReport12(id);
            PdfPTable tableIx12 = new PdfPTable(realSize);
            PdfPCell cellIx12 = new PdfPCell(new Paragraph("Data12"));
            tableIx12.addCell(cellIx12);
            for(String i : investigationReport12){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx12.addCell(cells);
            }
            
            List<String> investigationReport13 = new ArrayList<String>();
            investigationReport13 = pdfrepo.investigationReport13(id);
            PdfPTable tableIx13 = new PdfPTable(realSize);
            PdfPCell cellIx13 = new PdfPCell(new Paragraph("Data13"));
            tableIx13.addCell(cellIx13);
            for(String i : investigationReport13){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx13.addCell(cells);
            }
            
            List<String> investigationReport14 = new ArrayList<String>();
            investigationReport14 = pdfrepo.investigationReport14(id);
            PdfPTable tableIx14 = new PdfPTable(realSize);
            PdfPCell cellIx14 = new PdfPCell(new Paragraph("Data14"));
            tableIx14.addCell(cellIx14);
            for(String i : investigationReport14){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx14.addCell(cells);
            }
            
            List<String> investigationReport15 = new ArrayList<String>();
            investigationReport15 = pdfrepo.investigationReport15(id);
            PdfPTable tableIx15 = new PdfPTable(realSize);
            PdfPCell cellIx15 = new PdfPCell(new Paragraph("Data15"));
            tableIx15.addCell(cellIx15);
            for(String i : investigationReport15){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx15.addCell(cells);
            }
            
            List<String> investigationReport16 = new ArrayList<String>();
            investigationReport16 = pdfrepo.investigationReport16(id);
            PdfPTable tableIx16 = new PdfPTable(realSize);
            PdfPCell cellIx16 = new PdfPCell(new Paragraph("Data16"));
            tableIx16.addCell(cellIx16);
            for(String i : investigationReport16){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx16.addCell(cells);
            }
            
            List<String> investigationReport17 = new ArrayList<String>();
            investigationReport17 = pdfrepo.investigationReport17(id);
            PdfPTable tableIx17 = new PdfPTable(realSize);
            PdfPCell cellIx17 = new PdfPCell(new Paragraph("Data17"));
            tableIx17.addCell(cellIx17);
            for(String i : investigationReport17){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx17.addCell(cells);
            }
            
            List<String> investigationReport18 = new ArrayList<String>();
            investigationReport18 = pdfrepo.investigationReport18(id);
            PdfPTable tableIx18 = new PdfPTable(realSize);
            PdfPCell cellIx18 = new PdfPCell(new Paragraph("Data18"));
            tableIx18.addCell(cellIx18);
            for(String i : investigationReport18){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx18.addCell(cells);
            }
            
            List<String> investigationReport19 = new ArrayList<String>();
            investigationReport19 = pdfrepo.investigationReport19(id);
            PdfPTable tableIx19 = new PdfPTable(realSize);
            PdfPCell cellIx19 = new PdfPCell(new Paragraph("Data19"));
            tableIx19.addCell(cellIx19);
            for(String i : investigationReport19){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx19.addCell(cells);
            }
            
            List<String> investigationReport20 = new ArrayList<String>();
            investigationReport20 = pdfrepo.investigationReport20(id);
            PdfPTable tableIx20 = new PdfPTable(realSize);
            PdfPCell cellIx20 = new PdfPCell(new Paragraph("Data20"));
            tableIx20.addCell(cellIx20);
            for(String i : investigationReport20){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx20.addCell(cells);
            }
            
            List<String> investigationReport21 = new ArrayList<String>();
            investigationReport21 = pdfrepo.investigationReport21(id);
            PdfPTable tableIx21 = new PdfPTable(realSize);
            PdfPCell cellIx21 = new PdfPCell(new Paragraph("Data21"));
            tableIx21.addCell(cellIx21);
            for(String i : investigationReport21){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx21.addCell(cells);
            }
            
            List<String> investigationReport22 = new ArrayList<String>();
            investigationReport22 = pdfrepo.investigationReport22(id);
            PdfPTable tableIx22 = new PdfPTable(realSize);
            PdfPCell cellIx22 = new PdfPCell(new Paragraph("Data22"));
            tableIx22.addCell(cellIx22);
            for(String i : investigationReport22){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx22.addCell(cells);
            }
            
            List<String> investigationReport23 = new ArrayList<String>();
            investigationReport23 = pdfrepo.investigationReport23(id);
            PdfPTable tableIx23 = new PdfPTable(realSize);
            PdfPCell cellIx23 = new PdfPCell(new Paragraph("Data23"));
            tableIx23.addCell(cellIx23);
            for(String i : investigationReport23){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx23.addCell(cells);
            }
            
            List<String> investigationReport24 = new ArrayList<String>();
            investigationReport24 = pdfrepo.investigationReport24(id);
            PdfPTable tableIx24 = new PdfPTable(realSize);
            PdfPCell cellIx24 = new PdfPCell(new Paragraph("Data24"));
            tableIx24.addCell(cellIx24);
            for(String i : investigationReport24){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx24.addCell(cells);
            }
            
            List<String> investigationReport25 = new ArrayList<String>();
            investigationReport25 = pdfrepo.investigationReport25(id);
            PdfPTable tableIx25 = new PdfPTable(realSize);
            PdfPCell cellIx25 = new PdfPCell(new Paragraph("Data25"));
            tableIx25.addCell(cellIx25);
            for(String i : investigationReport25){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx25.addCell(cells);
            }
            
            List<String> investigationReport26 = new ArrayList<String>();
            investigationReport26 = pdfrepo.investigationReport26(id);
            PdfPTable tableIx26 = new PdfPTable(realSize);
            PdfPCell cellIx26 = new PdfPCell(new Paragraph("Data26"));
            tableIx26.addCell(cellIx26);
            for(String i : investigationReport26){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx26.addCell(cells);
            }
            
            List<String> investigationReport27 = new ArrayList<String>();
            investigationReport27 = pdfrepo.investigationReport27(id);
            PdfPTable tableIx27 = new PdfPTable(realSize);
            PdfPCell cellIx27 = new PdfPCell(new Paragraph("Data27"));
            tableIx27.addCell(cellIx27);
            for(String i : investigationReport27){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx27.addCell(cells);
            }
            
            List<String> investigationReport28 = new ArrayList<String>();
            investigationReport28 = pdfrepo.investigationReport28(id);
            PdfPTable tableIx28 = new PdfPTable(realSize);
            PdfPCell cellIx28 = new PdfPCell(new Paragraph("Data28"));
            tableIx28.addCell(cellIx28);
            for(String i : investigationReport28){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx28.addCell(cells);
            }
            
            List<String> investigationReport29 = new ArrayList<String>();
            investigationReport29 = pdfrepo.investigationReport29(id);
            PdfPTable tableIx29 = new PdfPTable(realSize);
            PdfPCell cellIx29 = new PdfPCell(new Paragraph("Data29"));
            tableIx29.addCell(cellIx29);
            for(String i : investigationReport29){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx29.addCell(cells);
            }
            
            List<String> investigationReport30 = new ArrayList<String>();
            investigationReport30 = pdfrepo.investigationReport30(id);
            PdfPTable tableIx30 = new PdfPTable(realSize);
            PdfPCell cellIx30 = new PdfPCell(new Paragraph("Data30"));
            tableIx30.addCell(cellIx30);
            for(String i : investigationReport30){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx30.addCell(cells);
            }
            
            List<String> investigationReport31 = new ArrayList<String>();
            investigationReport31 = pdfrepo.investigationReport31(id);
            PdfPTable tableIx31 = new PdfPTable(realSize);
            PdfPCell cellIx31 = new PdfPCell(new Paragraph("Data31"));
            tableIx31.addCell(cellIx31);
            for(String i : investigationReport31){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx31.addCell(cells);
            }
            
            List<String> investigationReport32 = new ArrayList<String>();
            investigationReport32 = pdfrepo.investigationReport32(id);
            PdfPTable tableIx32 = new PdfPTable(realSize);
            PdfPCell cellIx32 = new PdfPCell(new Paragraph("Data32"));
            tableIx32.addCell(cellIx32);
            for(String i : investigationReport32){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx32.addCell(cells);
            }
            
            List<String> investigationReport33 = new ArrayList<String>();
            investigationReport33 = pdfrepo.investigationReport33(id);
            PdfPTable tableIx33 = new PdfPTable(realSize);
            PdfPCell cellIx33 = new PdfPCell(new Paragraph("Data33"));
            tableIx33.addCell(cellIx33);
            for(String i : investigationReport33){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx33.addCell(cells);
            }
            
            List<String> investigationReport34 = new ArrayList<String>();
            investigationReport34 = pdfrepo.investigationReport34(id);
            PdfPTable tableIx34 = new PdfPTable(realSize);
            PdfPCell cellIx34 = new PdfPCell(new Paragraph("Data34"));
            tableIx34.addCell(cellIx34);
            for(String i : investigationReport34){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx34.addCell(cells);
            }
            
            List<String> investigationReport35 = new ArrayList<String>();
            investigationReport35 = pdfrepo.investigationReport35(id);
            PdfPTable tableIx35 = new PdfPTable(realSize);
            PdfPCell cellIx35 = new PdfPCell(new Paragraph("Data35"));
            tableIx35.addCell(cellIx35);
            for(String i : investigationReport35){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx35.addCell(cells);
            }
            
            List<String> investigationReport36 = new ArrayList<String>();
            investigationReport36 = pdfrepo.investigationReport36(id);
            PdfPTable tableIx36 = new PdfPTable(realSize);
            PdfPCell cellIx36 = new PdfPCell(new Paragraph("Data36"));
            tableIx36.addCell(cellIx36);
            for(String i : investigationReport36){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx36.addCell(cells);
            }
            
            List<String> investigationReport37 = new ArrayList<String>();
            investigationReport37 = pdfrepo.investigationReport37(id);
            PdfPTable tableIx37 = new PdfPTable(realSize);
            PdfPCell cellIx37 = new PdfPCell(new Paragraph("Data37"));
            tableIx37.addCell(cellIx37);
            for(String i : investigationReport37){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx37.addCell(cells);
            }
            
            List<String> investigationReport38 = new ArrayList<String>();
            investigationReport38 = pdfrepo.investigationReport38(id);
            PdfPTable tableIx38 = new PdfPTable(realSize);
            PdfPCell cellIx38 = new PdfPCell(new Paragraph("Data38"));
            tableIx38.addCell(cellIx38);
            for(String i : investigationReport38){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx38.addCell(cells);
            }
            
            List<String> investigationReport39 = new ArrayList<String>();
            investigationReport39 = pdfrepo.investigationReport39(id);
            PdfPTable tableIx39 = new PdfPTable(realSize);
            PdfPCell cellIx39 = new PdfPCell(new Paragraph("Data39"));
            tableIx39.addCell(cellIx39);
            for(String i : investigationReport39){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx39.addCell(cells);
            }
            
            List<String> investigationReport40 = new ArrayList<String>();
            investigationReport40 = pdfrepo.investigationReport40(id);
            PdfPTable tableIx40 = new PdfPTable(realSize);
            PdfPCell cellIx40 = new PdfPCell(new Paragraph("Data40"));
            tableIx40.addCell(cellIx40);
            for(String i : investigationReport40){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx40.addCell(cells);
            }
            
            List<String> investigationReport41 = new ArrayList<String>();
            investigationReport41 = pdfrepo.investigationReport41(id);
            PdfPTable tableIx41 = new PdfPTable(realSize);
            PdfPCell cellIx41 = new PdfPCell(new Paragraph("Data41"));
            tableIx41.addCell(cellIx41);
            for(String i : investigationReport41){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx41.addCell(cells);
            }
            
            List<String> investigationReport42 = new ArrayList<String>();
            investigationReport42 = pdfrepo.investigationReport42(id);
            PdfPTable tableIx42 = new PdfPTable(realSize);
            PdfPCell cellIx42 = new PdfPCell(new Paragraph("Data42"));
            tableIx42.addCell(cellIx42);
            for(String i : investigationReport42){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableIx42.addCell(cells);
            }
            
            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            List<String> bgaReport1 = new ArrayList<String>();
            bgaReport1 = pdfrepo.bloodGasAnalysisReport1(id);
            int cap = bgaReport1.size();
            int realCap = cap+1;
            out.println(realCap);
            
            PdfPTable tableBGA1 = new PdfPTable(realCap);
            PdfPCell cellBGA1 = new PdfPCell(new Paragraph("BGA1"));
            tableBGA1.addCell(cellBGA1);
            for(String i : bgaReport1){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA1.addCell(cells);
            }
            
            List<String> bgaReport2 = new ArrayList<String>();
            bgaReport2 = pdfrepo.bloodGasAnalysisReport2(id);
            PdfPTable tableBGA2 = new PdfPTable(realCap);
            PdfPCell cellBGA2 = new PdfPCell(new Paragraph("BGA2"));
            tableBGA2.addCell(cellBGA2);
            for(String i : bgaReport2){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA2.addCell(cells);
            }
            
            List<String> bgaReport3 = new ArrayList<String>();
            bgaReport3 = pdfrepo.bloodGasAnalysisReport3(id);
            PdfPTable tableBGA3 = new PdfPTable(realCap);
            PdfPCell cellBGA3 = new PdfPCell(new Paragraph("BGA3"));
            tableBGA3.addCell(cellBGA3);
            for(String i : bgaReport3){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA3.addCell(cells);
            }
            
            List<String> bgaReport4 = new ArrayList<String>();
            bgaReport4 = pdfrepo.bloodGasAnalysisReport4(id);
            PdfPTable tableBGA4 = new PdfPTable(realCap);
            PdfPCell cellBGA4 = new PdfPCell(new Paragraph("BGA4"));
            tableBGA4.addCell(cellBGA4);
            for(String i : bgaReport4){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA4.addCell(cells);
            }
            
            List<String> bgaReport5 = new ArrayList<String>();
            bgaReport5 = pdfrepo.bloodGasAnalysisReport5(id);
            PdfPTable tableBGA5 = new PdfPTable(realCap);
            PdfPCell cellBGA5 = new PdfPCell(new Paragraph("BGA5"));
            tableBGA5.addCell(cellBGA5);
            for(String i : bgaReport5){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA5.addCell(cells);
            }
            
            List<String> bgaReport6 = new ArrayList<String>();
            bgaReport6 = pdfrepo.bloodGasAnalysisReport6(id);
            PdfPTable tableBGA6 = new PdfPTable(realCap);
            PdfPCell cellBGA6 = new PdfPCell(new Paragraph("BGA6"));
            tableBGA6.addCell(cellBGA6);
            for(String i : bgaReport6){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA6.addCell(cells);
            }
            
            List<String> bgaReport7 = new ArrayList<String>();
            bgaReport7 = pdfrepo.bloodGasAnalysisReport7(id);
            PdfPTable tableBGA7 = new PdfPTable(realCap);
            PdfPCell cellBGA7 = new PdfPCell(new Paragraph("BGA7"));
            tableBGA7.addCell(cellBGA7);
            for(String i : bgaReport7){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA7.addCell(cells);
            }
            
            List<String> bgaReport8 = new ArrayList<String>();
            bgaReport8 = pdfrepo.bloodGasAnalysisReport8(id);
            PdfPTable tableBGA8 = new PdfPTable(realCap);
            PdfPCell cellBGA8 = new PdfPCell(new Paragraph("BGA8"));
            tableBGA8.addCell(cellBGA8);
            for(String i : bgaReport8){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA8.addCell(cells);
            }
            
            List<String> bgaReport9 = new ArrayList<String>();
            bgaReport9 = pdfrepo.bloodGasAnalysisReport9(id);
            PdfPTable tableBGA9 = new PdfPTable(realCap);
            PdfPCell cellBGA9 = new PdfPCell(new Paragraph("BGA9"));
            tableBGA9.addCell(cellBGA9);
            for(String i : bgaReport9){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA9.addCell(cells);
            }
            
            List<String> bgaReport10 = new ArrayList<String>();
            bgaReport10 = pdfrepo.bloodGasAnalysisReport10(id);
            PdfPTable tableBGA10 = new PdfPTable(realCap);
            PdfPCell cellBGA10 = new PdfPCell(new Paragraph("BGA10"));
            tableBGA10.addCell(cellBGA10);
            for(String i : bgaReport10){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA10.addCell(cells);
            }
            
            List<String> bgaReport11 = new ArrayList<String>();
            bgaReport11 = pdfrepo.bloodGasAnalysisReport11(id);
            PdfPTable tableBGA11 = new PdfPTable(realCap);
            PdfPCell cellBGA11 = new PdfPCell(new Paragraph("BGA11"));
            tableBGA11.addCell(cellBGA11);
            for(String i : bgaReport11){
            PdfPCell cells = new PdfPCell(new Paragraph(i));
            tableBGA11.addCell(cells);
            }
            
            
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            PdfPTable table13 = new PdfPTable(1);
            PdfPCell cell305 = new PdfPCell(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table13.addCell(cell305);
            
            PdfPTable table14 = new PdfPTable(1);
            PdfPCell cell404 = new PdfPCell(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table14.addCell(cell404);
            
            PdfPTable table15 = new PdfPTable(1);
            PdfPCell cell405 = new PdfPCell(new Paragraph("Blood Gas Analysis Report",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table15.addCell(cell405);
            
            PdfPTable table16 = new PdfPTable(1);
            PdfPCell cell505 = new PdfPCell(new Paragraph("Problems",FontFactory.getFont(FontFactory.TIMES_ROMAN,25, Font.BOLD, BaseColor.BLACK)));
            table16.addCell(cell505);
            
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            PdfPTable table17 = new PdfPTable(2);
            
            String current_problems = pdfrepo.current_problems(id);
            String past_problems = pdfrepo.past_problems(id);
            PdfPCell cellprob1 = new PdfPCell(new Paragraph(current_problems));
            PdfPCell cellprob2 = new PdfPCell(new Paragraph(past_problems));
            
            table17.addCell(cellprob1);
            table17.addCell(cellprob2);
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            PdfPTable table18 = new PdfPTable(2);
            String mx= patientListt[93];
            String system= patientListt[94]; 
            
            PdfPCell cell209 = new PdfPCell(new Paragraph("Mx"));
            PdfPCell cell210 = new PdfPCell(new Paragraph(mx));
            PdfPCell cell211 = new PdfPCell(new Paragraph("System"));
            PdfPCell cell212 = new PdfPCell(new Paragraph(system));
            table18.addCell(cell209);
            table18.addCell(cell210);
            table18.addCell(cell211);
            table18.addCell(cell212);
            
            
             doc.add(table1);
             doc.add(table2);
             doc.add(table3);
             doc.add(table4);
             doc.add(table5);
             doc.add(table6);
             doc.add(table7);
             doc.add(table8);
             doc.add(table9);
             doc.add(table10);
             doc.add(table11);
             doc.add(table13);
             doc.add(table12);
             
             doc.add(tableIx1);
             doc.add(tableIx2);
             doc.add(tableIx3);
             doc.add(tableIx4);
             doc.add(tableIx5);
             doc.add(tableIx6);
             doc.add(tableIx7);
             doc.add(tableIx8);
             doc.add(tableIx9);
             doc.add(tableIx10);
             doc.add(tableIx11);
             doc.add(tableIx12);
             doc.add(tableIx13);
             doc.add(tableIx14);
             doc.add(tableIx15);
             doc.add(tableIx16);
             doc.add(tableIx17);
             doc.add(tableIx18);
             doc.add(tableIx19);
             doc.add(tableIx20);
             doc.add(tableIx21);
             doc.add(tableIx22);
             doc.add(tableIx23);
             doc.add(tableIx24);
             doc.add(tableIx25);
             doc.add(tableIx26);
             doc.add(tableIx27);
             doc.add(tableIx28);
             doc.add(tableIx29);
             doc.add(tableIx30);
             doc.add(tableIx31);
             doc.add(tableIx32);
             doc.add(tableIx33);
             doc.add(tableIx34);
             doc.add(tableIx35);
             doc.add(tableIx36);
             doc.add(tableIx37);
             doc.add(tableIx38);
             doc.add(tableIx39);
             doc.add(tableIx40);
             doc.add(tableIx41);
             doc.add(tableIx42);
             
             doc.add(table14);
             doc.add(table15);
             doc.add(tableBGA1);
             doc.add(tableBGA2);
             doc.add(tableBGA3);
             doc.add(tableBGA4);
             doc.add(tableBGA5);
             doc.add(tableBGA6);
             doc.add(tableBGA7);
             doc.add(tableBGA8);
             doc.add(tableBGA9);
             doc.add(tableBGA10);
             doc.add(tableBGA11);
             
             doc.add(table16);
             doc.add(table17);
             doc.add(table18);
             
             doc.close();
   
//   response.sendRedirect("dashboard.jsp");

  }catch(DocumentException e){
   e.printStackTrace();
  }
  catch(Exception e){
   e.printStackTrace();
  }

 }

}
<%-- 
    Document   : organTypePatientView
    Created on : Jan 4, 2018, 11:09:11 AM
    Author     : ROBIN
--%>
  
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="repository.PatientRepositoty"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" href="css/form.css"/>
        
        <style>
            .divtext
            {
                font-family:    Agency FB;
                font-size:      40px;
                width: 1000px; 
                word-wrap:break-word;
            }
        </style>
                <style>
            .divtext
            {
                
                font-size:      30px;
                width: 1000px; 
                word-wrap:break-word;
            }
            
            .td
            {
                background-color:  #04f;
                width: 80px;
                word-wrap:  normal;
                height: 35px;
                border-radius: 5px;
            }
            .tdofproblems
            {
                background-color:  #04f;
                width: 500px;
                word-wrap:  normal;
                height: 35px;
                border-radius: 5px;
            }
            .tr
            {
                background-color: #4CF573;
            }
        </style>
        
    </head>
    <body>
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
        <div id="contentwrap">
        <div id="content">
        <table border="0">  
            <font color="#111100" size="15" face="Agency FB"> View Patient</font>
            <div>_________________________________</div>
        <%
            try {
                    int id = Integer.parseInt(request.getParameter("id"));
             PatientRepositoty patientRepository = new PatientRepositoty();
                    List<String> allPatients1 = (List<String>) patientRepository.getPatientBasicDetails(id);
                    for (String string : allPatients1) {
                        out.print(string);
                    }
                    List<String> allPatients2 = (List<String>) patientRepository.getPatientOrganTypes(id);
                    for (String string : allPatients2) {
                        out.print(string);
                    }
                    List<String> allPatients3 = (List<String>) patientRepository.getPatientOtherDetails(id);
                    for (String string : allPatients3) {
                        out.print(string);
                    }
                   /* List<String> examinationPart1 = (List<String>) patientRepository.getGeneralExaminationPart1(id);
                    for (String string : examinationPart1) {
                        out.print(string);
                    }*/
                    List<String> respiratoryDistress = (List<String>) patientRepository.getPatientRespiratoryDistress(id);
                    for (String string : respiratoryDistress) {
                        out.print(string);
                    }
                    List<String> examinationPart2 = (List<String>) patientRepository.getGeneralExaminationPart2(id);
                    for (String string : examinationPart2) {
                        out.print(string);
                    }
                    List<String> patientOedema = (List<String>) patientRepository.getPatientOedema(id);
                    for (String string : patientOedema) {
                        out.print(string);
                    }
                    List<String> examinationPart3 = (List<String>) patientRepository.getGeneralExaminationPart3(id);
                    for (String string : examinationPart3) {
                        out.print(string);
                    }
                    List<String> PatientLymphadenopathy = (List<String>) patientRepository.getPatientLymphadenopathy(id);
                    for (String string : PatientLymphadenopathy) {
                        out.print(string);
                    }
                    List<String> examinationPart4 = (List<String>) patientRepository.getGeneralExaminationPart4(id);
                    for (String string : examinationPart4) {
                        out.print(string);
                    }
                   /* List<String> cvs = (List<String>) patientRepository.getCvsPart1(id);
                    for (String string : cvs) {
                        out.print(string);
                    }*/
                   /* List<String> AbdomenPart1 = (List<String>) patientRepository.getAbdomenPart1(id);
                    for (String string : AbdomenPart1) {
                        out.print(string);
                    }*/
                    
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        <table>
            <tr><td id="1"><img src=  <% int id1 = Integer.parseInt(request.getParameter("id"));   List <String> listt1 =new ArrayList();PatientRepositoty patientRepository1 = new PatientRepositoty();listt1=patientRepository1.getPalpationAreaForPatintViewGrid(id1) ;if(listt1.contains("1" )  ){out.println("img/pal_aria_1_yes.png");}else{out.println("img/pal_aria_1_no.png");} %>  height="100" width="100" /></td>
                <td id="2"><img src=  <% int id2 = Integer.parseInt(request.getParameter("id"));   List <String> listt2 =new ArrayList();PatientRepositoty patientRepository2 = new PatientRepositoty();listt2=patientRepository2.getPalpationAreaForPatintViewGrid(id2) ;if(listt2.contains("2" )  ){out.println("img/pal_aria_2_yes.png");}else{out.println("img/pal_aria_2_no.png");} %> height="100" width="100" /></td>
                <td id="3"><img src=  <% int id3 = Integer.parseInt(request.getParameter("id"));   List <String> listt3 =new ArrayList();PatientRepositoty patientRepository3 = new PatientRepositoty();listt3=patientRepository3.getPalpationAreaForPatintViewGrid(id3) ;if(listt2.contains("3" )  ){out.println("img/pal_aria_3_yes.png");}else{out.println("img/pal_aria_3_no.png");} %> height="100" width="100" /></td>
            </tr>
            <tr><td id="4"><img src=  <% int id4 = Integer.parseInt(request.getParameter("id"));   List <String> listt4 =new ArrayList();PatientRepositoty patientRepository4 = new PatientRepositoty();listt4=patientRepository4.getPalpationAreaForPatintViewGrid(id4) ;if(listt2.contains("4" )  ){out.println("img/pal_aria_4_yes.png");}else{out.println("img/pal_aria_4_no.png");} %> height="100" width="100" /></td>
                <td id="5"><img src=  <% int id5 = Integer.parseInt(request.getParameter("id"));   List <String> listt5 =new ArrayList();PatientRepositoty patientRepository5 = new PatientRepositoty();listt5=patientRepository5.getPalpationAreaForPatintViewGrid(id5) ;if(listt2.contains("5" )  ){out.println("img/pal_aria_5_yes.png");}else{out.println("img/pal_aria_5_no.png");} %> height="100" width="100" /></td>
                <td id="6"><img src=  <% int id6 = Integer.parseInt(request.getParameter("id"));   List <String> listt6 =new ArrayList();PatientRepositoty patientRepository6 = new PatientRepositoty();listt6=patientRepository6.getPalpationAreaForPatintViewGrid(id6) ;if(listt2.contains("6" )  ){out.println("img/pal_aria_6_yes.png");}else{out.println("img/pal_aria_6_no.png");} %> height="100" width="100" /></td>
            </tr>
            <tr><td id="7"><img src=  <% int id7 = Integer.parseInt(request.getParameter("id"));   List <String> listt7 =new ArrayList();PatientRepositoty patientRepository7 = new PatientRepositoty();listt7=patientRepository7.getPalpationAreaForPatintViewGrid(id7) ;if(listt2.contains("7" )  ){out.println("img/pal_aria_7_yes.png");}else{out.println("img/pal_aria_7_no.png");} %> height="100" width="100" /></td>
                <td id="8"><img src=  <% int id8 = Integer.parseInt(request.getParameter("id"));   List <String> listt8 =new ArrayList();PatientRepositoty patientRepository8 = new PatientRepositoty();listt8=patientRepository8.getPalpationAreaForPatintViewGrid(id8) ;if(listt2.contains("8" )  ){out.println("img/pal_aria_8_yes.png");}else{out.println("img/pal_aria_8_no.png");} %> height="100" width="100" /></td>
                <td id="9"><img src=  <% int id9 = Integer.parseInt(request.getParameter("id"));   List <String> listt9 =new ArrayList();PatientRepositoty patientRepository9 = new PatientRepositoty();listt9=patientRepository9.getPalpationAreaForPatintViewGrid(id9) ;if(listt2.contains("9" )  ){out.println("img/pal_aria_9_yes.png");}else{out.println("img/pal_aria_9_no.png");} %> height="100" width="100" /></td>
            </tr>
            </table>
            
        <%
          try {
                    int id = Integer.parseInt(request.getParameter("id"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    
                    List<String> AbdomenPart2 = (List<String>) patientRepository.getAbdomenPart2(id);
                    for (String string : AbdomenPart2) {
                        out.print(string);
                    }
                    List<String> Kidney = (List<String>) patientRepository.getKidney(id);
                    for (String string : Kidney) {
                        out.print(string);
                    }
                    List<String> AbdomenPart3 = (List<String>) patientRepository.getAbdomenPart3(id);
                    for (String string : AbdomenPart3) {
                        out.print(string);
                    }
                    List<String> RespiratoryPart1 = (List<String>) patientRepository.getRespiratoryPart1(id);
                    for (String string : RespiratoryPart1) {
                        out.print(string);
                    }
                    
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        <table>
            <tr><td id="11"><img src=  <% int id11 = Integer.parseInt(request.getParameter("id"));   List <String> listt11 =new ArrayList();PatientRepositoty patientRepository11 = new PatientRepositoty();listt11=patientRepository11.getAirntryForPatintViewGrid(id11);if(listt11.contains("1" )  ){out.println("img/lung_1_yes.png");}else{out.println("img/lung_1_no.png");} %>  height="100" width="150" /></td>
                <td id="44"><img src=  <% int id44 = Integer.parseInt(request.getParameter("id"));   List <String> listt44 =new ArrayList();PatientRepositoty patientRepository44 = new PatientRepositoty();listt44=patientRepository44.getAirntryForPatintViewGrid(id44) ;if(listt44.contains("4" )  ){out.println("img/lung_4_yes.png");}else{out.println("img/lung_4_no.png");} %> height="100" width="150" /></td>
            </tr>
            <tr><td id="22"><img src=  <% int id22 = Integer.parseInt(request.getParameter("id"));   List <String> listt22 =new ArrayList();PatientRepositoty patientRepository22 = new PatientRepositoty();listt22=patientRepository22.getAirntryForPatintViewGrid(id22) ;if(listt22.contains("2" )  ){out.println("img/lung_2_yes.png");}else{out.println("img/lung_2_no.png");} %> height="100" width="150" /></td>
                <td id="55"><img src=  <% int id55 = Integer.parseInt(request.getParameter("id"));   List <String> listt55 =new ArrayList();PatientRepositoty patientRepository55 = new PatientRepositoty();listt55=patientRepository55.getAirntryForPatintViewGrid(id55) ;if(listt55.contains("5" )  ){out.println("img/lung_5_yes.png");}else{out.println("img/lung_5_no.png");} %> height="100" width="150" /></td>
            </tr>
            <tr><td id="33"><img src=  <% int id33 = Integer.parseInt(request.getParameter("id"));   List <String> listt33 =new ArrayList();PatientRepositoty patientRepository33 = new PatientRepositoty();listt33=patientRepository33.getAirntryForPatintViewGrid(id33) ;if(listt33.contains("3" )  ){out.println("img/lung_3_yes.png");}else{out.println("img/lung_3_no.png");} %> height="100" width="150" /></td>
                <td id="66"><img src=  <% int id66 = Integer.parseInt(request.getParameter("id"));   List <String> listt66 =new ArrayList();PatientRepositoty patientRepository66 = new PatientRepositoty();listt66=patientRepository66.getAirntryForPatintViewGrid(id66) ;if(listt66.contains("6" )  ){out.println("img/lung_6_yes.png");}else{out.println("img/lung_6_no.png");} %> height="100" width="150" /></td>
            </tr>
        </table>  
            <%
          try {
                    int id = Integer.parseInt(request.getParameter("id"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    
                    List<String> RespiratoryPart2 = (List<String>) patientRepository.getRespiratoryPart2(id);
                    for (String string : RespiratoryPart2) {
                        out.print(string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>   
        
        <table>
            <tr><td id="101"><img src=  <% int id101 = Integer.parseInt(request.getParameter("id"));   List <String> listt101 =new ArrayList();PatientRepositoty patientRepository101 = new PatientRepositoty();listt101=patientRepository101.getAddedSoundsRhonchiForPatintViewGrid(id101);if(listt101.contains("1" )  ){out.println("img/lung_1_yes.png");}else{out.println("img/lung_1_no.png");} %>  height="100" width="150" /></td>
                <td id="404"><img src=  <% int id404 = Integer.parseInt(request.getParameter("id"));   List <String> listt404 =new ArrayList();PatientRepositoty patientRepository404 = new PatientRepositoty();listt404=patientRepository404.getAddedSoundsRhonchiForPatintViewGrid(id404) ;if(listt404.contains("4" )  ){out.println("img/lung_4_yes.png");}else{out.println("img/lung_4_no.png");} %> height="100" width="150" /></td>
            </tr>
            <tr><td id="202"><img src=  <% int id202 = Integer.parseInt(request.getParameter("id"));   List <String> listt202 =new ArrayList();PatientRepositoty patientRepository202 = new PatientRepositoty();listt202=patientRepository202.getAddedSoundsRhonchiForPatintViewGrid(id202) ;if(listt202.contains("2" )  ){out.println("img/lung_2_yes.png");}else{out.println("img/lung_2_no.png");} %> height="100" width="150" /></td>
                <td id="505"><img src=  <% int id505 = Integer.parseInt(request.getParameter("id"));   List <String> listt505 =new ArrayList();PatientRepositoty patientRepository505 = new PatientRepositoty();listt505=patientRepository505.getAddedSoundsRhonchiForPatintViewGrid(id505) ;if(listt505.contains("5" )  ){out.println("img/lung_5_yes.png");}else{out.println("img/lung_5_no.png");} %> height="100" width="150" /></td>
            </tr>
            <tr><td id="303"><img src=  <% int id303 = Integer.parseInt(request.getParameter("id"));   List <String> listt303 =new ArrayList();PatientRepositoty patientRepository303 = new PatientRepositoty();listt303=patientRepository303.getAddedSoundsRhonchiForPatintViewGrid(id303) ;if(listt303.contains("3" )  ){out.println("img/lung_3_yes.png");}else{out.println("img/lung_3_no.png");} %> height="100" width="150" /></td>
                <td id="606"><img src=  <% int id606 = Integer.parseInt(request.getParameter("id"));   List <String> listt606 =new ArrayList();PatientRepositoty patientRepository606 = new PatientRepositoty();listt606=patientRepository606.getAddedSoundsRhonchiForPatintViewGrid(id606) ;if(listt606.contains("6" )  ){out.println("img/lung_6_yes.png");}else{out.println("img/lung_6_no.png");} %> height="100" width="150" /></td>
            </tr>
        </table>
        
                     <%
          try {
                    int id = Integer.parseInt(request.getParameter("id"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    
                    List<String> RespiratoryPart3 = (List<String>) patientRepository.getRespiratoryPart3(id);
                    for (String string : RespiratoryPart3) {
                        out.print(string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>   
        
        <table>
            <tr><td id="10"><img src=  <% int id10 = Integer.parseInt(request.getParameter("id"));   List <String> listt10 =new ArrayList();PatientRepositoty patientRepository10 = new PatientRepositoty();listt10=patientRepository10.getAddedSoundsCreptsForPatintViewGrid(id10);if(listt10.contains("1" )  ){out.println("img/lung_1_yes.png");}else{out.println("img/lung_1_no.png");} %>  height="100" width="150" /></td>
                <td id="40"><img src=  <% int id40 = Integer.parseInt(request.getParameter("id"));   List <String> listt40 =new ArrayList();PatientRepositoty patientRepository40 = new PatientRepositoty();listt40=patientRepository40.getAddedSoundsCreptsForPatintViewGrid(id40) ;if(listt40.contains("4" )  ){out.println("img/lung_4_yes.png");}else{out.println("img/lung_4_no.png");} %> height="100" width="150" /></td>
            </tr>
            <tr><td id="20"><img src=  <% int id20 = Integer.parseInt(request.getParameter("id"));   List <String> listt20 =new ArrayList();PatientRepositoty patientRepository20 = new PatientRepositoty();listt20=patientRepository20.getAddedSoundsCreptsForPatintViewGrid(id20) ;if(listt20.contains("2" )  ){out.println("img/lung_2_yes.png");}else{out.println("img/lung_2_no.png");} %> height="100" width="150" /></td>
                <td id="50"><img src=  <% int id50 = Integer.parseInt(request.getParameter("id"));   List <String> listt50 =new ArrayList();PatientRepositoty patientRepository50 = new PatientRepositoty();listt50=patientRepository50.getAddedSoundsCreptsForPatintViewGrid(id50) ;if(listt50.contains("5" )  ){out.println("img/lung_5_yes.png");}else{out.println("img/lung_5_no.png");} %> height="100" width="150" /></td>
            </tr>
            <tr><td id="30"><img src=  <% int id30 = Integer.parseInt(request.getParameter("id"));   List <String> listt30 =new ArrayList();PatientRepositoty patientRepository30 = new PatientRepositoty();listt30=patientRepository30.getAddedSoundsCreptsForPatintViewGrid(id30) ;if(listt30.contains("3" )  ){out.println("img/lung_3_yes.png");}else{out.println("img/lung_3_no.png");} %> height="100" width="150" /></td>
                <td id="60"><img src=  <% int id60 = Integer.parseInt(request.getParameter("id"));   List <String> listt60 =new ArrayList();PatientRepositoty patientRepository60 = new PatientRepositoty();listt60=patientRepository60.getAddedSoundsCreptsForPatintViewGrid(id60) ;if(listt60.contains("6" )  ){out.println("img/lung_6_yes.png");}else{out.println("img/lung_6_no.png");} %> height="100" width="150" /></td>
            </tr>
        </table> 
        <%
          try {
                    int id = Integer.parseInt(request.getParameter("id"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    
                    List<String> RespiratoryPart4 = (List<String>) patientRepository.getRespiratoryPart4(id);
                    for (String string : RespiratoryPart4) {
                        out.print(string);
                    }
                    List<String> HeightAndWeight = (List<String>) patientRepository.getHeightAndWeight(id);
                    for (String string : HeightAndWeight) {
                        out.print(string);
                    }
                    List<String> investigation = (List<String>) patientRepository.getInvestigationReport(id);
                    for (String string : investigation) {
                        out.print(string);
                    }
                    List<String> investigation1 = (List<String>) patientRepository.investigationReport1(id);
                    for (String string : investigation1) {
                        out.print(string);
                    }
                    List<String> investigation2 = (List<String>) patientRepository.investigationReport2(id);
                    for (String string : investigation2) {
                        out.print(string);
                    }
                    List<String> investigation3 = (List<String>) patientRepository.investigationReport3(id);
                    for (String string : investigation3) {
                        out.print(string);
                    }
                    List<String> investigation4 = (List<String>) patientRepository.investigationReport4(id);
                    for (String string : investigation4) {
                        out.print(string);
                    }
                    List<String> investigation5 = (List<String>) patientRepository.investigationReport5(id);
                    for (String string : investigation5) {
                        out.print(string);
                    }
                    List<String> investigation6 = (List<String>) patientRepository.investigationReport6(id);
                    for (String string : investigation6) {
                        out.print(string);
                    }
                    List<String> investigation7 = (List<String>) patientRepository.investigationReport7(id);
                    for (String string : investigation7) {
                        out.print(string);
                    }
                    List<String> investigation8 = (List<String>) patientRepository.investigationReport8(id);
                    for (String string : investigation8) {
                        out.print(string);
                    }
                    List<String> investigation9 = (List<String>) patientRepository.investigationReport9(id);
                    for (String string : investigation9) {
                        out.print(string);
                    }
                    List<String> investigation10 = (List<String>) patientRepository.investigationReport10(id);
                    for (String string : investigation10) {
                        out.print(string);
                    }
                    List<String> investigation11 = (List<String>) patientRepository.investigationReport11(id);
                    for (String string : investigation11) {
                        out.print(string);
                    }
                    List<String> investigation12 = (List<String>) patientRepository.investigationReport12(id);
                    for (String string : investigation12) {
                        out.print(string);
                    }
                    List<String> investigation13 = (List<String>) patientRepository.investigationReport13(id);
                    for (String string : investigation13) {
                        out.print(string);
                    }
                    List<String> investigation14 = (List<String>) patientRepository.investigationReport14(id);
                    for (String string : investigation14) {
                        out.print(string);
                    }
                    List<String> investigation15 = (List<String>) patientRepository.investigationReport15(id);
                    for (String string : investigation15) {
                        out.print(string);
                    }
                    List<String> investigation16 = (List<String>) patientRepository.investigationReport16(id);
                    for (String string : investigation16) {
                        out.print(string);
                    }
                    List<String> investigation17 = (List<String>) patientRepository.investigationReport17(id);
                    for (String string : investigation17) {
                        out.print(string);
                    }
                    List<String> investigation18 = (List<String>) patientRepository.investigationReport18(id);
                    for (String string : investigation18) {
                        out.print(string);
                    }
                    List<String> investigation19 = (List<String>) patientRepository.investigationReport19(id);
                    for (String string : investigation19) {
                        out.print(string);
                    }
                    List<String> investigation20 = (List<String>) patientRepository.investigationReport20(id);
                    for (String string : investigation20) {
                        out.print(string);
                    }
                    List<String> investigation21 = (List<String>) patientRepository.investigationReport21(id);
                    for (String string : investigation21) {
                        out.print(string);
                    }
                    List<String> investigation22 = (List<String>) patientRepository.investigationReport22(id);
                    for (String string : investigation22) {
                        out.print(string);
                    }
                    List<String> investigation23 = (List<String>) patientRepository.investigationReport23(id);
                    for (String string : investigation23) {
                        out.print(string);
                    }
                    List<String> investigation24 = (List<String>) patientRepository.investigationReport24(id);
                    for (String string : investigation24) {
                        out.print(string);
                    }
                    List<String> investigation25 = (List<String>) patientRepository.investigationReport25(id);
                    for (String string : investigation25) {
                        out.print(string);
                    }
                    List<String> investigation26 = (List<String>) patientRepository.investigationReport26(id);
                    for (String string : investigation26) {
                        out.print(string);
                    }
                    List<String> investigation27 = (List<String>) patientRepository.investigationReport27(id);
                    for (String string : investigation27) {
                        out.print(string);
                    }
                    List<String> investigation28 = (List<String>) patientRepository.investigationReport28(id);
                    for (String string : investigation28) {
                        out.print(string);
                    }
                    List<String> investigation29 = (List<String>) patientRepository.investigationReport29(id);
                    for (String string : investigation29) {
                        out.print(string);
                    }
                    List<String> investigation30 = (List<String>) patientRepository.investigationReport30(id);
                    for (String string : investigation30) {
                        out.print(string);
                    }
                    List<String> investigation31 = (List<String>) patientRepository.investigationReport31(id);
                    for (String string : investigation31) {
                        out.print(string);
                    }
                    List<String> investigation32 = (List<String>) patientRepository.investigationReport32(id);
                    for (String string : investigation32) {
                        out.print(string);
                    }
                    List<String> investigation33 = (List<String>) patientRepository.investigationReport33(id);
                    for (String string : investigation33) {
                        out.print(string);
                    }
                    List<String> investigation34 = (List<String>) patientRepository.investigationReport34(id);
                    for (String string : investigation34) {
                        out.print(string);
                    }
                    List<String> investigation35 = (List<String>) patientRepository.investigationReport35(id);
                    for (String string : investigation35) {
                        out.print(string);
                    }
                    List<String> investigation36 = (List<String>) patientRepository.investigationReport36(id);
                    for (String string : investigation36) {
                        out.print(string);
                    }
                    List<String> investigation37 = (List<String>) patientRepository.investigationReport37(id);
                    for (String string : investigation37) {
                        out.print(string);
                    }
                    List<String> investigation38 = (List<String>) patientRepository.investigationReport38(id);
                    for (String string : investigation38) {
                        out.print(string);
                    }
                    List<String> investigation39 = (List<String>) patientRepository.investigationReport39(id);
                    for (String string : investigation39) {
                        out.print(string);
                    }
                    List<String> investigation40 = (List<String>) patientRepository.investigationReport40(id);
                    for (String string : investigation40) {
                        out.print(string);
                    }
                    List<String> investigation41 = (List<String>) patientRepository.investigationReport41(id);
                    for (String string : investigation41) {
                        out.print(string);
                    }
                    List<String> investigation42 = (List<String>) patientRepository.investigationReport42(id);
                    for (String string : investigation42) {
                        out.print(string);
                    }
                    
                    List<String> bloodGasAnalysis = (List<String>) patientRepository.getBloodGasAnalysis(id);
                    for (String string : bloodGasAnalysis) {
                        out.print(string);
                    }
                    
                    List<String> bloodGasAnalysisReport1 = (List<String>) patientRepository.bloodGasAnalysisReport1(id);
                    for (String string : bloodGasAnalysisReport1) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport2 = (List<String>) patientRepository.bloodGasAnalysisReport2(id);
                    for (String string : bloodGasAnalysisReport2) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport3 = (List<String>) patientRepository.bloodGasAnalysisReport3(id);
                    for (String string : bloodGasAnalysisReport3) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport4 = (List<String>) patientRepository.bloodGasAnalysisReport4(id);
                    for (String string : bloodGasAnalysisReport4) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport5 = (List<String>) patientRepository.bloodGasAnalysisReport5(id);
                    for (String string : bloodGasAnalysisReport5) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport6 = (List<String>) patientRepository.bloodGasAnalysisReport6(id);
                    for (String string : bloodGasAnalysisReport6) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport7 = (List<String>) patientRepository.bloodGasAnalysisReport7(id);
                    for (String string : bloodGasAnalysisReport7) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport8 = (List<String>) patientRepository.bloodGasAnalysisReport8(id);
                    for (String string : bloodGasAnalysisReport8) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport9 = (List<String>) patientRepository.bloodGasAnalysisReport9(id);
                    for (String string : bloodGasAnalysisReport9) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport10 = (List<String>) patientRepository.bloodGasAnalysisReport10(id);
                    for (String string : bloodGasAnalysisReport10) {
                        out.print(string);
                    }
                    List<String> bloodGasAnalysisReport11 = (List<String>) patientRepository.bloodGasAnalysisReport11(id);
                    for (String string : bloodGasAnalysisReport11) {
                        out.print(string);
                    }
                    List<String> problem = (List<String>) patientRepository.getProblems();
                    for (String string : problem) {
                        out.print(string);
                    }
                    List<String> problems = (List<String>) patientRepository.problems(id);
                    for (String string : problems) {
                        out.print(string);
                    }
                    
                    List<String> last = (List<String>) patientRepository.getpatientLastDetails(id);
                    for (String string : last) {
                        out.print(string);
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        <div style="height:10px;"></div>
        <div>_________________________________</div>
        <div><a href="searchPatientByOrganTypeResults.jsp?&o_type=<%
                String organ1 = request.getParameter("organ");
                out.print(organ1);
                %>&start=<%
                String start = request.getParameter("start");
                out.println(start);
                %>"><button class="button">Back</button></a></div>
        </table>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>

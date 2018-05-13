<%-- 
    Document   : updatePatient2
    Created on : Apr 28, 2018, 11:16:04 PM
    Author     : ROBIN
--%>


<%@page import="java.util.List"%>
<%@page import="repository.PatientRepositoty"%>
<!DOCTYPE html>
<html>
<head>
<title>User</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" type="text/css" href="css/form.css"/>
        <script>
            function myFunction() {
            alert(<% request.getParameter("msg");%>);
            }
        </script>
                <style>
            .divtext
            {
                
                font-size:      30px;
                width: 1000px; 
                word-wrap:break-word;
            }
            
            .td
            {
                background-color: #96d1f8;
                width: 80px;
                word-wrap:  normal;
                height: 35px;
                border-radius: 5px;
            }
            .tdofproblems
            {
                background-color:  #96d1f8;
                width: 500px;
                word-wrap:  normal;
                height: 35px;
                border-radius: 5px;
            }
            .tr
            {
                background-color: white;
            }
        </style>
</head>

<body>
    <div id="wrapper">
		
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>

	<div id="contentwrap">
            <div id="content">
                <div class="form">
                    <form  method="POST" action="EnterIx" >
                        <div class="form_description">
				<h2>  Enter Investigation Report</h2>
				<p>Use This Form To Enter An Investigation Report</p>
			</div>
                        <ul><li style="height:20px"></li></ul>
			<div class="container" style="width:100%;"> 
                            <ul style = ' width: 450px'>
                            <li style="height: 10px"></li>
                            <li>
                                <input  type="hidden" name="num" value="<%
                                    try {
                                        int num = Integer.parseInt(request.getParameter("num"));
                                        out.print(num);
                                                     
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        %>">
                            </li>
                            <li>
                                <input  type="hidden" name="type" value="<%
                                    try {
                                        String type = request.getParameter("type");
                                        out.print(type);
                                                     
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        %>">
                            </li>
                            <li>
                                <input  type="hidden" name="low" value="<%
                                    try {
                                        String low = request.getParameter("low");
                                        out.print(low);
                                                     
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        %>">
                            </li>
                            <li>
                                <span><label class="description" for="day_ix" style="width: 100px">DAY</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="day_ix" style="width: 200px" pattern="[0-9]" maxlength="2" /></span>
                            </li>
                            <li>
                                <span><label class="description" for="date_ix" style="width: 100px">DATE</label></span>
                                <!--<span><div style="width: 100px"></div></span>-->
                                <span style="width: 100px"></span>
                                <span><input type="date" name="date_ix" style="width: 200px" /></span>
                            </li>
                            <li>
                                <span><label class="description" for="time_ix" style="width: 100px">TIME</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="time_ix" style="width: 200px" maxlength="10"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="bldtx" style="width: 100px">BLD Tx</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="bldtx" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="hb" style="width: 100px">Hb %</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="hb" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="plt" style="width: 100px">PLT</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="plt" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="pcv" style="width: 100px">PCV</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="pcv" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="wbc" style="width: 100px">WBC</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="wbc" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="n" style="width: 100px">-N</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="n" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="l" style="width: 100px">-L</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="l" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="esr" style="width: 100px">ESR</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="esr" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="crp" style="width: 100px">CRP</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="crp" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="bu" style="width: 100px">BU</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="bu" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="scr" style="width: 100px">S.Cr</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="scr" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="na" style="width: 100px">Na+</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="na" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="k" style="width: 100px">K+</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="k" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="ca" style="width: 100px">Ca</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="ca" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="mg" style="width: 100px">Mg</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="mg" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="cl" style="width: 100px">Cl</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="cl" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="rbs" style="width: 100px">RBS</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="rbs" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="cbs" style="width: 100px">CBS</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="cbs" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="ast" style="width: 100px">AST</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="ast" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="alt" style="width: 100px">ALT</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="alt" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="alp" style="width: 100px">ALP</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="alp" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="sprotien" style="width: 100px">S.protien</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="sprotien" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="alb" style="width: 100px">Alb</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="alb" style="width: 200px" maxlength="20"/></span>
                            <li>
                            <li>
                                <span><label class="description" for="glob" style="width: 100px">Glob</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="glob" style="width: 200px" maxlength="20"/></span>
                            <li>
                            <li>
                                <span><label class="description" for="inr" style="width: 100px">INR</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="inr" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="pt" style="width: 100px">PT</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="pt" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="aptt" style="width: 100px">APTT</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="aptt" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="sbrtot" style="width: 100px">SBR-Tot</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="sbrtot" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="dir" style="width: 100px">SBR-Dir</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="dir" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="urine" style="width: 100px">URINE</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="urine" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="cxr" style="width: 100px">CXR</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="cxr" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="us" style="width: 100px">US</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="us" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="ct" style="width: 100px">CT</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="ct" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="ecg" style="width: 100px">ECG</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="ecg" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="cultures" style="width: 100px">CULTURES</label></span>
                                <span style="width: 100px"></span>
                            </li>
                            <li>
                                <span><label class="description" for="cultures_blood" style="width: 100px">Blood</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="cultures_blood" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="cultures_sputum" style="width: 100px">Sputum</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="cultures_sputum" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="cultures_urine" style="width: 100px">Urine</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="cultures_urine" style="width: 200px" maxlength="20"/></span>
                            </li>
                            <li>
                                <span><label class="description" for="otherix" style="width: 100px">Other ix</label></span>
                                <span style="width: 100px"></span>
                                <span><textarea name="otherix" rows="4" cols="23"  placeholder="Enter Other ix Here...(Max 400 Characters)"  maxlength="400" ></textarea></span>
                            </li>
                            <li>
                                <span><label class="description" for="planned" style="width: 100px">Planned ix</label></span>
                                <span style="width: 100px"></span>
                                <span><input type="text" name="planned" style="width: 200px" maxlength="45"/></span>
                            </li>


                                </ul>
                            
			</div>
                        <ul>
                            <li style="height:40px"></li>
                   
                            <li>
                                <span>
                                    <input type="submit" class="button" value="     Submit     "  />
                                </span>
                                <span>
                                    <input type="reset"  class="button" onclick="resetText();"/>
                                </span>

                            </li>
                        </ul>
                        
                </form>
                          
            <div>
                                
            <%
                try {
                    int id = Integer.parseInt(request.getParameter("num"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    
                    
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
                } catch (Exception e) {
                    e.printStackTrace();
                }

            %>
                                
                                
                                
                            </div>
                            
                        </div>
                   

              
            </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>



<%-- 
    Document   : updatePatient3Organ
    Created on : May 27, 2018, 11:50:44 PM
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
                    <form  method="POST" action="EnterBGA" >
                        <div class="form_description">
				<h2>  Enter Blood Gas Analysis Report</h2>
				<p>Use This Form To Enter A Blood Gas Analysis Report</p>
			</div>
                        <ul><li style="height:20px"></li></ul>
			<div class="container" style="width:100%;"> 
                         <ul style = ' width: 450px'>
            <li style="height: 30px"></li>
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
                                <input  type="hidden" name="organ" value="<%
                                    try {
                                         String organ = request.getParameter("organ");
                                        out.print(organ);
                                                     
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        %>">
                            </li>
                            <li>
                                <input  type="hidden" name="start" value="<%
                                    try {
                                         String start = request.getParameter("start");
                                        out.print(start);
                                                     
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
                    <span><label class="description" for="day_bga" style="width: 100px">DAY</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="day_bga" pattern="[0-9]" maxlength="2" /></span>
                </li>
                <li>
                    <span><label class="description" for="date_bga" style="width: 100px">DATE</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="date" name="date_bga"/></span>
                </li>
                <li>
                    <span><label class="description" for="time_bga" style="width: 100px">TIME</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="time_bga" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="abg" style="width: 100px">ABG</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="abg" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="vbg" style="width: 100px">VBG</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="vbg" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="ph" style="width: 100px">PH</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="ph" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="pco2" style="width: 100px">pCO2</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="pco2" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="hco3" style="width: 100px">HCO3-</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="hco3" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="po2" style="width: 100px">pO2</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="po2" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="so2" style="width: 100px">sO2</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="so2" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="be" style="width: 100px">BE</label></span>
                    <span style="width: 100px"></span>
                    <span><input type="text" name="be" maxlength="20"/></span>
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
                <%
                try {
                    int id = Integer.parseInt(request.getParameter("num"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                
                
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
                    } catch (Exception e) {
                    e.printStackTrace();
                }
                %>
                
                        </div>
                 <div><a href="searchPatientByOrganTypeResults.jsp?&o_type=<%  String o_type = request.getParameter("organ"); 
                                                out.println(o_type);%>&start=<%   String start = request.getParameter("start");
                                                out.println(start);
                                                %>"><button class="button">Back</button></a></div> 
              
            </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>



<%-- 
    Document   : searchPatientByAgeResults
    Created on : Dec 20, 2017, 1:09:13 AM
    Author     : ROBIN
--%>

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
    tr {
  background-color: rgb(204,204,204);
  height:20px;
  
}

.tr {
    background-color: rgb(204,204,204);
    height:30px;
}
.td {
    background-color: gray;
    height:30px;
}
.td1 {
    background-color: violet;
    height:30px;
}
.td2 {
    background-color:#96d1f8;
    height:30px;
}
.td3 {
    background-color: turquoise;
    height:30px;
}

.td4 {
    background-color: transparent;
    height:30px;
}

td {
    width: 120px;
    border-radius: 5px;
    background-color: lightgray;
    color: black;
    border: 1px solid black;
    text-align: center;
}
</style>
<script type="text/javascript">
function confirm_alert(node) {
    return confirm("Do you want to remove this patient ?");
}

function confirm_print(node) {
    return confirm("Do you want to print details of this patient ?");
}
</script>        
    </head>

    <body>
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
        <div id="contentwrap">
        <div id="content">
        <table border="0">  
            <font color="#111100" size="15" face="Agency FB"> View Patients</font>
            <div>_________________________________</div>
            <tr class="tr"><td class="td">Initials</td><td class="td">Surname</td><td class="td">Age</td><td class="td">Gender</td><td class="td">Guardian's NIC</td><td class="td">Telephone No</td><td class="td">View</td><td class="td">Edit</td><td class="td">Enter Ix</td><td class="td">Enter BGA</td><td class="td">Delete</td><td class="td">Print</td></tr>  
        <%
          try {
                    int age = Integer.parseInt(request.getParameter("age"));
                    String index =request.getParameter("index");
                    //out.print(o_type);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    List<String> allPatients = (List<String>) patientRepository.getPatientByAge(age,index);
                    for (String string : allPatients) {
                        out.print("<tr>");
                        out.print(string);
                        out.print("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        
        </table>
        <table>
            <tr>
                <td><br><a href="searchPatientByAgeResults.jsp?&age=<% String age = request.getParameter("age");
                                                                        out.println(age);%>&index=<% String index =request.getParameter("index");
                                                                        int pre_page = Integer.parseInt(index);
                                                                        int previous = pre_page-3;
                                                                        out.println(previous);
                    %>">back</a>
                </td>
                <td><br><a href="searchPatientByAgeResults.jsp?&age=<% String age1 = request.getParameter("age");
                                                                        out.println(age1);%>&index=<% int next = pre_page+3;
                                                                        out.println(next);
                    %>">next</a>
                </td>
            </tr>
        </table>

        <div style="height:10px;"></div>
        <div>_________________________________</div>
        <div><a href="searchPatientPanel.jsp"><button class="button">Back To Search Panel</button></a></div>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>



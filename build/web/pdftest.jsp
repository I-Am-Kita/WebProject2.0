<%-- 
    Document   : pdftest
    Created on : Jan 24, 2018, 8:32:06 PM
    Author     : ROBIN
--%>

<%@page import="repository.PatientRepositoty"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
            <tr class="tr"><td class="td">Initials</td><td class="td">Surname</td><td class="td">Age</td><td class="td">Gender</td><td class="td">Guardian's NIC</td><td class="td">Telephone No</td><td class="td">View</td><td class="td">Edit</td><td class="td">Enter Ix</td><td class="td">Enter BGA</td><td class="td">Delete</td><td class="td">Print</td></tr>  
        <%
          try {     
                    String low = request.getParameter("low");
                    int begining = Integer.parseInt(low);
                    PatientRepositoty patientRepositoty = new PatientRepositoty();
                    List<String> allPatients = (List<String>) patientRepositoty.getAllPatientss(begining);
                    for (String string : allPatients) {
                        out.print("<tr>");
                        out.print(string);
                        out.print("</tr>");
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        <% 
            out.println("");
            out.print("");
            out.println("");
            out.print("");
            out.println("");
            
        %>
        </table>
        
        <table>
            <tr>
                <td><br><a href="viewAllPatients.jsp?&low=<%
                    String low = request.getParameter("low");
                    int begining = Integer.parseInt(low);
                    int previouss = begining-10;
                    String previous = Integer.toString(previouss);
                    out.println(previouss);
                    %>">back</a>
                </td>
                <td><br><a href="viewAllPatients.jsp?&low=<%
                    int nextt = begining+10;
                    String next = Integer.toString(nextt);
                    out.println(nextt);
                    %>">next</a>
                </td>
            </tr>
        </table>
        <form id="myForm" name="myForm " method="post" action="PDF" />
        <input type="hidden" name="id" value="<% String iddd = request.getParameter("id");
                                                int ids = Integer.parseInt(iddd);  
                                                out.print(ids);%>" />
        </form>
    <script>
        window.onload = function() {
            document.getElementById("myForm").submit();
        }
    </script>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>

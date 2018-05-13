<%-- 
    Document   : deleteUser
    Created on : Nov 18, 2017, 8:05:44 PM
    Author     : ROBIN
--%>

<%@page import="repository.PatientRepositoty"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
          try {
                    int num = Integer.parseInt(request.getParameter("num"));
                    String type = request.getParameter("type");
                    String organ = request.getParameter("organ");
                    String low = request.getParameter("low");
                    String index = request.getParameter("index");
                    String begin = request.getParameter("begin");
                    String start = request.getParameter("start");

                    PatientRepositoty patientRepositoty = new PatientRepositoty();
                    String nic_no = patientRepositoty.getGuardianNIC(num);
                    String age = patientRepositoty.getPatientAge(num);
                    patientRepositoty.deletePatient(num);
                    
                    if("nic".equals(type)){
                        String site = new String("searchPatientByGuardianNICResults.jsp?&begin="+begin+"&nic_no="+nic_no);
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", site);
                    
                    }
                    else if("age".equals(type)){
                        String site = new String("searchPatientByAgeResults.jsp?&index="+index+"&age="+age);
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", site);
                    }
                    else if("organ".equals(type)){
                        String site = new String("searchPatientByOrganTypeResults.jsp?&o_type="+organ+"&start="+start);
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", site);
                        
                    }else{
                        String site = new String("viewAllPatients.jsp?&low="+low);
                        response.setStatus(response.SC_MOVED_TEMPORARILY);
                        response.setHeader("Location", site);
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
    </body>
</html>

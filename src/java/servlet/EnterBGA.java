/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.PatientRepositoty;

/**
 *
 * @author ROBIN
 */
public class EnterBGA extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EnterBGA</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EnterBGA at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String numm = request.getParameter("num");
        int num = Integer.parseInt(numm);
        String day_ixx= request.getParameter("day_bga");
        int day_ix = Integer.parseInt(day_ixx);
        String date_ix= request.getParameter("date_bga");
        String time_ix= request.getParameter("time_bga");
        String abg= request.getParameter("abg");
        String vbg= request.getParameter("vbg");
        String ph= request.getParameter("ph");
        String pco2= request.getParameter("pco2");
        String hco3= request.getParameter("hco3");
        String po2= request.getParameter("po2");
        String so2= request.getParameter("so2");
        String be= request.getParameter("be");
        
        String type= request.getParameter("type");
        
        String age = request.getParameter("age");
        String organ = request.getParameter("organ");
        String nic_no = request.getParameter("nic_no");
        
        String low   = request.getParameter("low");
        String index = request.getParameter("index");
        String begin = request.getParameter("begin");
        String start = request.getParameter("start");
        
        
        PatientRepositoty patientRepository = new PatientRepositoty();
        patientRepository.insertBloodGasAnalysis(num, day_ix, date_ix, time_ix, abg, vbg, ph, pco2, hco3, po2, so2, be);
        //response.sendRedirect("updatePatient3.jsp?num="+numm); 
        
        if("nic".equals(type)){
            response.sendRedirect("updatePatient3Nic.jsp?&num="+numm+"&begin="+begin+"&nic_no="+nic_no+"&type="+type); 
        }
        else if("age".equals(type)){
            response.sendRedirect("updatePatient3Age.jsp?&num="+numm+"&index="+index+"&age="+age+"&type="+type); 
        }
        else if("organ".equals(type)){
            response.sendRedirect("updatePatient3Organ.jsp?&num="+numm+"&start="+start+"&organ="+organ+"&type="+type); 
        }
        else{
            response.sendRedirect("updatePatient3.jsp?&num="+numm+"&low="+low); 
        } 
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

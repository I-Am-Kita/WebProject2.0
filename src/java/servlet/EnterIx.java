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
public class EnterIx extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EnterIx</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EnterIx at " + request.getContextPath() + "</h1>");
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
        String day_ixx= request.getParameter("day_ix");
        int day_ix = Integer.parseInt(day_ixx);
        String date_ix= request.getParameter("date_ix");
        String time_ix= request.getParameter("time_ix");
        String bldtx= request.getParameter("bldtx");
        String hb= request.getParameter("hb");
        String plt= request.getParameter("plt");
        String pcv= request.getParameter("pcv");
        String wbc= request.getParameter("wbc");
        String n= request.getParameter("n");
        String l= request.getParameter("l");
        String esr= request.getParameter("esr");
        String crp= request.getParameter("crp");
        String bu= request.getParameter("bu");
        String scr= request.getParameter("scr");
        String na= request.getParameter("na");
        String k= request.getParameter("k");
        String ca= request.getParameter("ca");
        String mg= request.getParameter("mg");
        String cl= request.getParameter("cl");
        String rbs= request.getParameter("rbs");
        String cbs= request.getParameter("cbs");
        String ast= request.getParameter("ast");
        String alt= request.getParameter("alt");
        String alp= request.getParameter("alp");
        String sprotien= request.getParameter("sprotien");
        String alb= request.getParameter("alb");
        String glob= request.getParameter("glob");
        String inr= request.getParameter("inr");
        String pt= request.getParameter("pt");
        String aptt= request.getParameter("aptt");
        String sbrtot= request.getParameter("sbrtot");
        String dir= request.getParameter("dir");
        String urine= request.getParameter("urine");
        String cxr= request.getParameter("cxr");
        String us= request.getParameter("us");
        String ct= request.getParameter("ct");
        String ecg= request.getParameter("ecg");
        String cultures_blood= request.getParameter("cultures_blood");
        String cultures_sputum= request.getParameter("cultures_sputum");
        String cultures_urine= request.getParameter("cultures_urine");
        String otherix= request.getParameter("otherix");
        String planned= request.getParameter("planned");
        
        String type= request.getParameter("type");
        String low   = request.getParameter("low");
        String index = request.getParameter("index");
        String begin = request.getParameter("begin");
        String start = request.getParameter("start");
        
        PatientRepositoty patientRepository = new PatientRepositoty();
        boolean isExecuted = patientRepository.insertInvestigationReport(num, day_ix, date_ix, time_ix, bldtx, hb, plt, pcv, wbc, n, l, esr, crp, bu, scr, na, k, ca, mg, cl, rbs, cbs, ast, alt, alp, sprotien, alb, glob, inr, pt, aptt, sbrtot, dir, urine, cxr, us, ct, ecg, cultures_blood, cultures_sputum, cultures_urine, otherix, planned);
        response.sendRedirect("updatePatient2.jsp?&num="+numm);
      /*  if("nic".equals(type)){
            response.sendRedirect("updatePatient2.jsp?&num="+numm+"&begin="+begin); 
        }
        else if("age".equals(type)){
            response.sendRedirect("updatePatient2.jsp?&num="+numm+"&index="+index); 
        }
        else if("organ".equals(type)){
            response.sendRedirect("updatePatient2.jsp?&num="+numm+"&start="+start); 
        }
        else{
            response.sendRedirect("updatePatient2.jsp?&num="+numm+"&low="+low); 
        } */
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

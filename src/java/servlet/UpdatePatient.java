package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.PatientRepositoty;

public class UpdatePatient extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdatePatient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePatient at " + request.getContextPath() + "</h1>");
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
        
        int num = Integer.parseInt(request.getParameter("num"));
        int new_age = Integer.parseInt(request.getParameter("age"));
        String new_tel_no = request.getParameter("tel_no");
        String new_diagnosis = request.getParameter("diagnosis");
        String new_p_co = request.getParameter("p_co");
        String new_hx_p_co = request.getParameter("hx_p_co");
        String new_pmhx = request.getParameter("pmhx");
        String new_pshx = request.getParameter("pshx");
        String new_aihx = request.getParameter("aihx");
        String new_drughx = request.getParameter("drughx");
        String new_immunizationhx = request.getParameter("immunizationhx");
        String new_socialhx = request.getParameter("socialhx");
        String new_familyhx = request.getParameter("familyhx");
        String new_spo2 = request.getParameter("spo2");
        String new_pob = request.getParameter("pob");
        String new_gait = request.getParameter("gait");
        String new_others = request.getParameter("others");
        String new_other = request.getParameter("other");
        String new_blood_high = request.getParameter("blood_high");
        String new_blood_low = request.getParameter("blood_low");
        String new_pulse = request.getParameter("pulse");
        String new_characterr = request.getParameter("characterr");
        String new_rhythm = request.getParameter("rhythm");
        String new_jvp = request.getParameter("jvp");
        String new_precordium_scars = request.getParameter("precordium_scars");
        String new_deformalities_val = request.getParameter("deformalities_val");
        String new_pulsation_val = request.getParameter("pulsation_val");
        String new_apex_beat = request.getParameter("apex_beat");
        String new_murmurs = request.getParameter("murmurs");
        String new_othercvs = request.getParameter("othercvs");
        String new_scars_val = request.getParameter("scars_val");
        String new_liver = request.getParameter("liver");
        String new_spleen = request.getParameter("spleen");
        String new_masses = request.getParameter("masses");
        String new_dullness = request.getParameter("dullness");
        String new_otherabdomen = request.getParameter("otherabdomen");
        String new_respiratory_rate = request.getParameter("respiratory_rate");
        String new_chest_wall_deformities = request.getParameter("chest_wall_deformities");
        String new_other_lung_expansion = request.getParameter("other_lung_expansion");
        String new_respiratory_scars = request.getParameter("respiratory_scars");
        String new_other_detail = request.getParameter("other_detail");
        String new_breath_sound = request.getParameter("breath_sound");
        String new_vocal_resonance = request.getParameter("vocal_resonance");
        String new_percussion_note_val = request.getParameter("percussion_note_val");
        String new_other_resp = request.getParameter("other_resp");
        String new_height = request.getParameter("height");
        String new_weight = request.getParameter("weight");
        String new_current_problems = request.getParameter("current_problems");
        String new_past_problems = request.getParameter("past_problems");
        String new_mx = request.getParameter("mx");
        String new_system = request.getParameter("system");
        
        String type = request.getParameter("type");
        int currentAge = Integer.parseInt(request.getParameter("currentAge"));
        String organ = request.getParameter("organ");
        String low = request.getParameter("low");
        String index = request.getParameter("index");
        String begin = request.getParameter("begin");
        String start =request.getParameter("start");
                
        PatientRepositoty patientRepository = new PatientRepositoty();
        String msg = patientRepository.updatePatients(num, new_age, new_tel_no, new_diagnosis, new_p_co, new_hx_p_co, new_pmhx, new_pshx, new_aihx, new_drughx, new_immunizationhx, new_socialhx, new_familyhx, new_spo2, new_pob, new_gait, new_others, new_other, new_blood_high, new_blood_low, new_pulse, new_characterr, new_rhythm, new_jvp, new_precordium_scars, new_deformalities_val, new_pulsation_val, new_apex_beat, new_murmurs, new_othercvs, new_scars_val, new_liver, new_spleen, new_masses, new_dullness, new_otherabdomen, new_respiratory_rate, new_chest_wall_deformities, new_other_lung_expansion, new_respiratory_scars, new_other_detail, new_breath_sound, new_vocal_resonance, new_percussion_note_val, new_other_resp, new_height, new_weight, new_current_problems, new_past_problems, new_mx, new_system);
    
                if(msg=="success"){
                   // response.sendRedirect("patientUpdateSuccessNic.jsp?&num="+num);
                   if("nic".equals(type)){
                        response.sendRedirect("patientUpdateSuccessNic.jsp?&num="+num+"&begin="+begin);
                   }
                   else if("age".equals(type)){
                       response.sendRedirect("patientUpdateSuccessAge.jsp?&age="+currentAge+"&index="+index);
                    }
                   else if("organ".equals(type)){
                       response.sendRedirect("patientUpdateSuccessOrgan.jsp?o_type="+organ+"&start="+start);
                    }else{
                        response.sendRedirect("patientUpdateSuccess.jsp?low="+low);
                    }
                }else if(msg=="Patient data update query did not executed"){
                    response.sendRedirect("patientUpdateError.jsp");
                }else{
                    response.sendRedirect("patientUpdateRequestError.jsp");
                }
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.PatientRepositoty;

public class RegisterPatient extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterPatient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterPatient at " + request.getContextPath() + "</h1>");
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
        
        
        String initials = request.getParameter("initials");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");
        int age = Integer.parseInt(request.getParameter("age"));
        String parentOrguardian = request.getParameter("parentOrguardian");
        String guard = request.getParameter("guard");
        int id = Integer.parseInt(request.getParameter("id"));
        String tel_no = request.getParameter("tel_no");
        String [] o_type = request.getParameterValues("o_type");
        String diagnosis = request.getParameter("diagnosis");
        String p_co = request.getParameter("p_co");
        String hx_p_co = request.getParameter("hx_p_co");
        String pmhx = request.getParameter("pmhx");
        String pshx = request.getParameter("pshx");
        String aihx = request.getParameter("aihx");
        String drughx = request.getParameter("drughx");
        String immunizationhx = request.getParameter("immunizationhx");
        String socialhx = request.getParameter("socialhx");
        String familyhx = request.getParameter("familyhx");
        double height = Double.parseDouble(request.getParameter("height")) ;
        double weight = Double.parseDouble(request.getParameter("weight")) ;
        String mx = request.getParameter("mx");
        String system = request.getParameter("system");
        
        
        /*          PatientRepositoty patientRepository = new PatientRepositoty();
            if(patientRepository.savePatient(initials, surname, gender, birthday, age,  parentOrguardian, guard, id,
                    tel_no, diagnosis, p_co, hx_p_co, pmhx, pshx, aihx, drughx, immunizationhx, socialhx, familyhx, 
                    height, weight, mx, system)){

                String last_id = patientRepository.getLastIds();
                int lastId = Integer.parseInt(last_id);
                String msg = patientRepository.insert_type(lastId,o_type);
                
                if(msg=="Patient successfully registered"){
                    response.sendRedirect("patientRegSuccess.jsp");
                }else if(msg=="Patient registration unsuccessful"){
                    response.sendRedirect("patientRegError.jsp");
                }else{
                    response.sendRedirect("patientRegRequestError.jsp");
                }
            }else{
                response.sendRedirect("patientRegRequestError.jsp");
                System.out.println("noooooooooooooooo");
            }*/
        
        
        //General Examination
        
        String active = request.getParameter("active");
        String alert = request.getParameter("alert");
        String dehydrated = request.getParameter("dehydrated");
        String pallor = request.getParameter("pallor");
        String ill = request.getParameter("ill");
        String icteric = request.getParameter("icteric");
        String growth = request.getParameter("growth");
        String cyanois = request.getParameter("cyanois");
        String spo2 = request.getParameter("spo2");
        String [] r_distress = request.getParameterValues("r_distress");
        String pob = request.getParameter("pob");
        String clubbing = request.getParameter("clubbing");
        String [] oedema = request.getParameterValues("oedema");
        String pitt = request.getParameter("pitt");
        String ab_movement = request.getParameter("ab_movement");
        String muscle_w = request.getParameter("muscle_w");
        String strabismus = request.getParameter("strabismus");
        String gait = request.getParameter("gait");
        String [] lymphadenopathy = request.getParameterValues("lymphadenopathy");
        String others = request.getParameter("others");
        String tenderness = request.getParameter("tenderness");
        String other = request.getParameter("other");
        
        
        // CVS
        
        String cayanosis_cvs = request.getParameter("cayanosis_cvs");
        String blood_high = request.getParameter("blood_high");
        String blood_low = request.getParameter("blood_low");
        String pulse = request.getParameter("pulse");
        String volume = request.getParameter("volume");
        String characterr = request.getParameter("characterr");
        String rhythm = request.getParameter("rhythm");
        String jvp = request.getParameter("jvp");
        String crft = request.getParameter("crft");
        String peripheral = request.getParameter("peripheral");
        String precordium_scars = request.getParameter("precordium_scars");
        String deformalities = request.getParameter("deformalities");
        String deformalities_val = request.getParameter("deformalities_val");
        String pulsation = request.getParameter("pulsation");
        String pulsation_val = request.getParameter("pulsation_val");
        String apex_beat = request.getParameter("apex_beat");
        String dual_rhythm = request.getParameter("dual_rhythm");
        String thirdhsound = request.getParameter("3hsound");
        String forthhsound = request.getParameter("4hsound");
        String murmurs = request.getParameter("murmurs");
        String othercvs = request.getParameter("othercvs");
        
        
        // Abdomen
        
        String distended = request.getParameter("distended");
        String scars = request.getParameter("scars");
        String scars_val = request.getParameter("scars_val");
        String vbmovements = request.getParameter("vbmovements");
        String dvessels = request.getParameter("dvessels");
        String palpation = request.getParameter("palpation");
        String [] palpation_val = request.getParameterValues("palpation_val");
        String liver = request.getParameter("liver");
        String spleen = request.getParameter("spleen");
        String masses = request.getParameter("masses");
        String [] kidney_side = request.getParameterValues("side");
        String ballotable = request.getParameter("ballotable");
        String free_fluid = request.getParameter("free_fluid");
        String dullness = request.getParameter("dullness");
        String bowel_sounds = request.getParameter("bowel_sounds");
        String otherabdomen = request.getParameter("otherabdomen");
        
        
        // Respiratory
        
        String respiratory_rate = request.getParameter("respiratory_rate");
        String bcg_scar = request.getParameter("bcg_scar");
        String chest_wall_deformities = request.getParameter("chest_wall_deformities");
        String lung_expansion = request.getParameter("lung_expansion");
        String other_lung_expansion = request.getParameter("other_lung_expansion");
        String respiratory_scars = request.getParameter("respiratory_scars");
        String air_entry = request.getParameter("air_entry");
        String [] air_entry_val = request.getParameterValues("air_entry_val");
        String vb = request.getParameter("vb");
        String bb = request.getParameter("bb");
        String rhonchi = request.getParameter("rhonchi");
        String [] rhonchi_val = request.getParameterValues("rhonchi_val");
        String crepts = request.getParameter("crepts");
        String [] crepts_val = request.getParameterValues("crepts_val");
        String pleural = request.getParameter("pleural");
        String other_detail = request.getParameter("other_detail");
        String breath_sound = request.getParameter("breath_sound");
        String vocal_resonance = request.getParameter("vocal_resonance");
        String percussion_note = request.getParameter("percussion_note");
        String percussion_note_val = request.getParameter("percussion_note_val");
        String other_resp = request.getParameter("other_resp");
        
        
        //  Investigation Summary
        
        String dayix = request.getParameter("day_ix");
        int day_ix = Integer.parseInt(dayix); 
        String date_ix = request.getParameter("date_ix");
        String time_ix = request.getParameter("time_ix");
        String bldtx = request.getParameter("bldtx");
        String hb = request.getParameter("hb");
        String plt = request.getParameter("plt");
        String pcv = request.getParameter("pcv");
        String wbc = request.getParameter("wbc");
        String n = request.getParameter("n");
        String l = request.getParameter("l");
        String esr = request.getParameter("esr");
        String crp = request.getParameter("crp");
        String bu = request.getParameter("bu");
        String scr = request.getParameter("scr");
        String na = request.getParameter("na");
        String k = request.getParameter("k");
        String ca = request.getParameter("ca");
        String mg = request.getParameter("mg");
        String cl = request.getParameter("cl");
        String rbs = request.getParameter("rbs");
        String cbs = request.getParameter("cbs");
        String ast = request.getParameter("ast");
        String alt = request.getParameter("alt");
        String alp = request.getParameter("alp");
        String sprotien = request.getParameter("sprotien");
        String alb = request.getParameter("alb");
        String glob = request.getParameter("glob");
        String inr = request.getParameter("inr");
        String pt = request.getParameter("pt");
        String aptt = request.getParameter("aptt");
        String sbrtot = request.getParameter("sbrtot");
        String dir = request.getParameter("dir");
        String urine = request.getParameter("urine");
        String cxr = request.getParameter("cxr");
        String us = request.getParameter("us");
        String ct = request.getParameter("ct");
        String ecg = request.getParameter("ecg");
        String cultures_blood = request.getParameter("cultures_blood");
        String cultures_sputum = request.getParameter("cultures_sputum");
        String cultures_urine = request.getParameter("cultures_urine");
        String otherix = request.getParameter("otherix");
        String planned = request.getParameter("planned");
        
        
        //  Blood Gas Analysis
        
        String daybga = request.getParameter("day_bga");
        int day_bga = Integer.parseInt(daybga);
        String date_bga = request.getParameter("date_bga");
        String time_bga = request.getParameter("time_bga");
        String abg = request.getParameter("abg");
        String vbg = request.getParameter("vbg");
        String ph = request.getParameter("ph");
        String pco2 = request.getParameter("pco2");
        String hco3 = request.getParameter("hco3");
        String po2 = request.getParameter("po2");
        String so2 = request.getParameter("so2");
        String be = request.getParameter("be");
        
        
        //  Problems
        
        String current_problems = request.getParameter("current_problems");
        String past_problems = request.getParameter("past_problems");
        
       

/*       PatientRepositoty patientRepository = new PatientRepositoty();
            if(patientRepository.savePatient(initials, surname, gender, birthday, age,  parentOrguardian, guard, id,
                    tel_no, diagnosis, p_co, hx_p_co, pmhx, pshx, aihx, drughx, immunizationhx, socialhx, familyhx, 
                    height, weight, mx, system)){

                String last_id = patientRepository.getLastIds();
                int lastId = Integer.parseInt(last_id);
                String msg = patientRepository.insert_type(lastId,o_type);
                
                if(msg=="Patient successfully registered"){
                    boolean isExecuted = patientRepository.insertInvestigationReport(lastId, day_ix, date_ix, time_ix, bldtx, hb, plt, pcv, wbc, n,
                            l, esr, crp, bu, scr, na, k, ca, mg, cl, rbs, cbs, ast, alt, alp, sprotien, alb, glob, inr,
                            pt, aptt, sbrtot, dir, urine, cxr, us, ct, ecg, cultures_blood, cultures_sputum, cultures_urine,
                            otherix, planned);
                    if(isExecuted==true){
                        boolean isInsertBloodGasAnalysisExecuted = patientRepository.insertBloodGasAnalysis(lastId, day_bga, date_bga, time_bga, abg, vbg, ph, pco2, hco3, po2, so2, be) ;
                        if(isInsertBloodGasAnalysisExecuted ==true){
                            boolean isCvsExecuted = patientRepository.insertCvs(lastId, cayanosis_cvs, blood_high, blood_low, pulse, volume, characterr, rhythm, jvp, crft, peripheral, precordium_scars, deformalities, deformalities_val, pulsation, pulsation_val, apex_beat, dual_rhythm, thirdhsound, forthhsound, murmurs, othercvs);
                            if(isCvsExecuted==true){
                                if(patientRepository.insertAbdomen(lastId, distended, scars, scars_val, vbmovements, dvessels,
                                  palpation, liver, spleen, masses, ballotable, free_fluid, dullness, bowel_sounds,otherabdomen)){
                                    
                                    String abdomenid = patientRepository.getLastAbdomenId();
                                    int abdomen_id = Integer.parseInt(abdomenid);
                                    String palpation_msg = patientRepository.insert_palpation_area(abdomen_id, palpation_val);
                                    String kidney_side_msg = patientRepository.insert_Kidney_Sides(abdomen_id, kidney_side);
                                        if(palpation_msg=="success"){
                                            if(kidney_side_msg=="success"){
                                                if(patientRepository.insertRespiratory(lastId, respiratory_rate, bcg_scar, chest_wall_deformities, lung_expansion, other_lung_expansion, 
                                                    respiratory_scars, air_entry, vb, bb, rhonchi, crepts, pleural, other_detail, breath_sound, vocal_resonance, percussion_note, percussion_note_val, other_resp))
                                                {
                                                    String respiratoryId = patientRepository.getLastRespiratoryId();
                                                    int respiratory_id = Integer.parseInt(respiratoryId);
                                                    String Air_Entry_msg = patientRepository.insert_Air_Entry(respiratory_id, air_entry_val);
                                                    String addedSoundsRhonchi_msg = patientRepository.insert_addedSoundsRhonchi(respiratory_id, rhonchi_val);
                                                    String addedSoundsCrepts_msg = patientRepository.insert_addedSoundsCrepts(respiratory_id, crepts_val);
                                                        if(Air_Entry_msg=="success"){
                                                            if(addedSoundsRhonchi_msg == "success"){
                                                                if(addedSoundsCrepts_msg=="success"){
                                                                    if(patientRepository.insertGeneralExamination(lastId, active, alert, dehydrated, pallor, ill, icteric, growth, cyanois, spo2, pob, clubbing, pitt, ab_movement, muscle_w, strabismus, gait, others, tenderness, other)){
                                                                        String generalExaminationId = patientRepository.getLastGeneralExaminationId();
                                                                        int generalExamination_id = Integer.parseInt(generalExaminationId);
                                                                        String Respiratory_distress_msg = patientRepository.insert_respiratory_distress(generalExamination_id, r_distress);
                                                                        String oedema_msg = patientRepository.insert_oedema(generalExamination_id, oedema);
                                                                        String lymphadenopathy_msg = patientRepository.insert_lymphadenopathy(generalExamination_id, lymphadenopathy);
                                                                        if(Respiratory_distress_msg == "success"){
                                                                            if(oedema_msg=="success"){
                                                                                if(lymphadenopathy_msg=="success"){
                                                                                    if(patientRepository.insertProblems(lastId, current_problems, past_problems)){
                                                                                    response.sendRedirect("patientRegSuccess.jsp");
                                                                                    }else{
                                                                                    patientRepository.deleteLymphadenopathy(generalExamination_id);
                                                                                    patientRepository.deleteOedemas(generalExamination_id);
                                                                                    patientRepository.deleteRespiratoryDistress(generalExamination_id);
                                                                                    patientRepository.deleteGeneralExamination(lastId);
                                                                                    patientRepository.deleteAddedSoundsCrepts(respiratory_id);
                                                                                    patientRepository.deleteAddedSoundsRhonchi(respiratory_id);
                                                                                    patientRepository.deleteAirEntry(respiratory_id);
                                                                                    patientRepository.deleteRespiratory(lastId);
                                                                                    patientRepository.deleteKidneySides(abdomen_id);
                                                                                    patientRepository.deletePalpationArea(abdomen_id);
                                                                                    patientRepository.deleteAbdomen(lastId);
                                                                                    patientRepository.deleteCvs(lastId);
                                                                                    patientRepository.deletePatient(lastId);
                                                                                    patientRepository.deleteInvestigationReport(lastId);
                                                                                    patientRepository.deleteBloodGasAnalys(lastId);
                                                                                    response.sendRedirect("patientRegError.jsp");
                                                                                    }
                                                                                }else{
                                                                                patientRepository.deleteOedemas(generalExamination_id);
                                                                                patientRepository.deleteRespiratoryDistress(generalExamination_id);
                                                                                patientRepository.deleteGeneralExamination(lastId);
                                                                                patientRepository.deleteAddedSoundsCrepts(respiratory_id);
                                                                                patientRepository.deleteAddedSoundsRhonchi(respiratory_id);
                                                                                patientRepository.deleteAirEntry(respiratory_id);
                                                                                patientRepository.deleteRespiratory(lastId);
                                                                                patientRepository.deleteKidneySides(abdomen_id);
                                                                                patientRepository.deletePalpationArea(abdomen_id);
                                                                                patientRepository.deleteAbdomen(lastId);
                                                                                patientRepository.deleteCvs(lastId);
                                                                                patientRepository.deletePatient(lastId);
                                                                                patientRepository.deleteInvestigationReport(lastId);
                                                                                patientRepository.deleteBloodGasAnalys(lastId);
                                                                                response.sendRedirect("patientRegError.jsp");
                                                                                }
                                                                            }else{
                                                                            patientRepository.deleteRespiratoryDistress(generalExamination_id);
                                                                            patientRepository.deleteGeneralExamination(lastId);
                                                                            patientRepository.deleteAddedSoundsCrepts(respiratory_id);
                                                                            patientRepository.deleteAddedSoundsRhonchi(respiratory_id);
                                                                            patientRepository.deleteAirEntry(respiratory_id);
                                                                            patientRepository.deleteRespiratory(lastId);
                                                                            patientRepository.deleteKidneySides(abdomen_id);
                                                                            patientRepository.deletePalpationArea(abdomen_id);
                                                                            patientRepository.deleteAbdomen(lastId);
                                                                            patientRepository.deleteCvs(lastId);
                                                                            patientRepository.deletePatient(lastId);
                                                                            patientRepository.deleteInvestigationReport(lastId);
                                                                            patientRepository.deleteBloodGasAnalys(lastId);
                                                                            response.sendRedirect("patientRegError.jsp");
                                                                            }
                                                                        }else{
                                                                        patientRepository.deleteGeneralExamination(lastId);
                                                                        patientRepository.deleteAddedSoundsCrepts(respiratory_id);
                                                                        patientRepository.deleteAddedSoundsRhonchi(respiratory_id);
                                                                        patientRepository.deleteAirEntry(respiratory_id);
                                                                        patientRepository.deleteRespiratory(lastId);
                                                                        patientRepository.deleteKidneySides(abdomen_id);
                                                                        patientRepository.deletePalpationArea(abdomen_id);
                                                                        patientRepository.deleteAbdomen(lastId);
                                                                        patientRepository.deleteCvs(lastId);
                                                                        patientRepository.deletePatient(lastId);
                                                                        patientRepository.deleteInvestigationReport(lastId);
                                                                        patientRepository.deleteBloodGasAnalys(lastId);
                                                                        response.sendRedirect("patientRegError.jsp");
                                                                        }
                                                                    }else{
                                                                    patientRepository.deleteAddedSoundsCrepts(respiratory_id);
                                                                    patientRepository.deleteAddedSoundsRhonchi(respiratory_id);
                                                                    patientRepository.deleteAirEntry(respiratory_id);
                                                                    patientRepository.deleteRespiratory(lastId);
                                                                    patientRepository.deleteKidneySides(abdomen_id);
                                                                    patientRepository.deletePalpationArea(abdomen_id);
                                                                    patientRepository.deleteAbdomen(lastId);
                                                                    patientRepository.deleteCvs(lastId);
                                                                    patientRepository.deletePatient(lastId);
                                                                    patientRepository.deleteInvestigationReport(lastId);
                                                                    patientRepository.deleteBloodGasAnalys(lastId);
                                                                    response.sendRedirect("patientRegError.jsp");
                                                                    }
                                                                }else{
                                                                patientRepository.deleteAddedSoundsRhonchi(respiratory_id);
                                                                patientRepository.deleteAirEntry(respiratory_id);
                                                                patientRepository.deleteRespiratory(lastId);
                                                                patientRepository.deleteKidneySides(abdomen_id);
                                                                patientRepository.deletePalpationArea(abdomen_id);
                                                                patientRepository.deleteAbdomen(lastId);
                                                                patientRepository.deleteCvs(lastId);
                                                                patientRepository.deletePatient(lastId);
                                                                patientRepository.deleteInvestigationReport(lastId);
                                                                patientRepository.deleteBloodGasAnalys(lastId);
                                                                response.sendRedirect("patientRegError.jsp");
                                                                }
                                                            }else{
                                                            patientRepository.deleteAirEntry(respiratory_id);
                                                            patientRepository.deleteRespiratory(lastId);
                                                            patientRepository.deleteKidneySides(abdomen_id);
                                                            patientRepository.deletePalpationArea(abdomen_id);
                                                            patientRepository.deleteAbdomen(lastId);
                                                            patientRepository.deleteCvs(lastId);
                                                            patientRepository.deletePatient(lastId);
                                                            patientRepository.deleteInvestigationReport(lastId);
                                                            patientRepository.deleteBloodGasAnalys(lastId);
                                                            response.sendRedirect("patientRegError.jsp");
                                                            }
                                                        }else{
                                                        patientRepository.deleteRespiratory(lastId);
                                                        patientRepository.deleteKidneySides(abdomen_id);
                                                        patientRepository.deletePalpationArea(abdomen_id);
                                                        patientRepository.deleteAbdomen(lastId);
                                                        patientRepository.deleteCvs(lastId);
                                                        patientRepository.deletePatient(lastId);
                                                        patientRepository.deleteInvestigationReport(lastId);
                                                        patientRepository.deleteBloodGasAnalys(lastId);
                                                        response.sendRedirect("patientRegError.jsp");
                                                        }
                                                }else{
                                                    patientRepository.deleteKidneySides(abdomen_id);
                                                    patientRepository.deletePalpationArea(abdomen_id);
                                                    patientRepository.deleteAbdomen(lastId);
                                                    patientRepository.deleteCvs(lastId);
                                                    patientRepository.deletePatient(lastId);
                                                    patientRepository.deleteInvestigationReport(lastId);
                                                    patientRepository.deleteBloodGasAnalys(lastId);
                                                    response.sendRedirect("patientRegError.jsp");
                                                }  
                                                
                                            }else{
                                                patientRepository.deletePalpationArea(abdomen_id);
                                                patientRepository.deleteAbdomen(lastId);
                                                patientRepository.deleteCvs(lastId);
                                                patientRepository.deletePatient(lastId);
                                                patientRepository.deleteInvestigationReport(lastId);
                                                patientRepository.deleteBloodGasAnalys(lastId);
                                                response.sendRedirect("patientRegError.jsp");
                                            }
                                        }
                                        else{
                                            patientRepository.deleteAbdomen(lastId);
                                            patientRepository.deleteCvs(lastId);
                                            patientRepository.deletePatient(lastId);
                                            patientRepository.deleteInvestigationReport(lastId);
                                            patientRepository.deleteBloodGasAnalys(lastId);
                                            response.sendRedirect("patientRegError.jsp");
                                        }
                                }else{
                                    patientRepository.deleteCvs(lastId);
                                    patientRepository.deletePatient(lastId);
                                    patientRepository.deleteInvestigationReport(lastId);
                                    patientRepository.deleteBloodGasAnalys(lastId);
                                    response.sendRedirect("patientRegError.jsp");
                                }
                            }
                            else{
                            patientRepository.deletePatient(lastId);
                            patientRepository.deleteInvestigationReport(lastId);
                            patientRepository.deleteBloodGasAnalys(lastId);
                            response.sendRedirect("patientRegError.jsp");
                            }
                        }
                        else{
                        patientRepository.deletePatient(lastId);
                        patientRepository.deleteInvestigationReport(lastId);
                        response.sendRedirect("patientRegError.jsp");
                        }
                    }
                    else{
                    patientRepository.deletePatient(lastId); 
                    response.sendRedirect("patientRegError.jsp");
                    }
                }else if(msg=="Patient registration unsuccessful"){
                    response.sendRedirect("patientRegError.jsp");
                }else{
                    response.sendRedirect("patientRegRequestError.jsp");
                }
            }else{
                response.sendRedirect("patientRegRequestError.jsp");
                System.out.println("noooooooooooooooo");
            }*/
        
        
        /*String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(birthday);  */
        
        
        

            
        //    response.sendRedirect("patientRegistration.jsp?msg="+msg);
        
        
PatientRepositoty patientRepository = new PatientRepositoty();
if(patientRepository.savePatient(initials, surname, gender, birthday, age, parentOrguardian, guard, id, tel_no, diagnosis,
        p_co, hx_p_co, pmhx, pshx, aihx, drughx, immunizationhx, socialhx, familyhx, active, alert, dehydrated, pallor, ill,
        icteric, growth, cyanois, spo2, pob, clubbing, pitt, ab_movement, muscle_w, strabismus, gait, others, tenderness,
        other, cayanosis_cvs, blood_high, blood_low, pulse, volume, characterr, rhythm, jvp, crft, peripheral, precordium_scars,
        deformalities, deformalities_val, pulsation, pulsation_val, apex_beat, dual_rhythm, thirdhsound, forthhsound, murmurs,
        othercvs, distended, scars, scars_val, vbmovements, dvessels, palpation, liver, spleen, masses, ballotable, free_fluid,
        dullness, bowel_sounds, otherabdomen, respiratory_rate, bcg_scar, chest_wall_deformities, lung_expansion, 
        other_lung_expansion, respiratory_scars, air_entry, vb, bb, rhonchi, crepts, pleural, other_detail, breath_sound, 
        vocal_resonance, percussion_note, percussion_note_val, other_resp, height, weight, mx, system)){
    
        String last_id = patientRepository.getLastIds();
        int lastId = Integer.parseInt(last_id);
        String msg = patientRepository.insert_type(lastId,o_type);
        
        if(msg == "Patient successfully registered"){
            String msg_respiratory_distress = patientRepository.insert_respiratory_distress(lastId, r_distress);
            
            if(msg_respiratory_distress == "success"){
                String msg_oedema = patientRepository.insert_oedema(lastId, oedema);
                
                if(msg_oedema == "success"){
                    String msg_lymphadenopathy = patientRepository.insert_lymphadenopathy(lastId, lymphadenopathy);
                    
                    if(msg_lymphadenopathy == "success"){
                        String msg_palpation_area = patientRepository.insert_palpation_area(lastId, palpation_val);
                        
                        if(msg_palpation_area == "success"){
                            String msg_Kidney_Sides = patientRepository.insert_Kidney_Sides(lastId, kidney_side);
                            
                            if(msg_Kidney_Sides == "success" ){
                                String msg_Air_Entry = patientRepository.insert_Air_Entry(lastId, air_entry_val);
                                
                                if(msg_Air_Entry == "success"){
                                    String msg_addedSoundsRhonchi = patientRepository.insert_addedSoundsRhonchi(lastId, rhonchi_val);
                                    
                                    if(msg_addedSoundsRhonchi == "success"){
                                        String msg_addedSoundsCrepts = patientRepository.insert_addedSoundsCrepts(lastId, crepts_val);
                                        
                                        if(msg_addedSoundsCrepts == "success"){
                                            if(patientRepository.insertInvestigationReport(lastId, day_ix, date_ix, time_ix,
                                                    bldtx, hb, plt, pcv, wbc, n, l, esr, crp, bu, scr, na, k, ca, mg, cl, rbs,
                                                    cbs, ast, alt, alp, sprotien, alb, glob, inr, pt, aptt, sbrtot, dir, urine,
                                                    cxr, us, ct, ecg, cultures_blood, cultures_sputum, cultures_urine, otherix,
                                                    planned)){
                                                
                                                if(patientRepository.insertBloodGasAnalysis(lastId, day_bga, date_bga, time_bga,
                                                        abg, vbg, ph, pco2, hco3, po2, so2, be)){
                                                    if(patientRepository.insertProblems(lastId, current_problems, past_problems)){
                                                        response.sendRedirect("patientRegSuccess.jsp");
                                                    }else{
                                                        patientRepository.deleteBloodGasAnalys(lastId);
                                                        patientRepository.deleteInvestigationReport(lastId);
                                                        patientRepository.deleteAddedSoundsCrepts(lastId);
                                                        patientRepository.deleteAddedSoundsRhonchi(lastId);
                                                        patientRepository.deleteAirEntry(lastId);
                                                        patientRepository.deleteKidneySides(lastId);
                                                        patientRepository.deletePalpationArea(lastId);
                                                        patientRepository.deleteLymphadenopathy(lastId);
                                                        patientRepository.deleteOedemas(lastId);
                                                        patientRepository.deleteRespiratoryDistress(lastId);
                                                        patientRepository.deleteOrganType(lastId);
                                                        patientRepository.delete(lastId);
                                                        response.sendRedirect("patientRegRequestError.jsp");
                                                    }
                                                }else{
                                                    patientRepository.deleteInvestigationReport(lastId);
                                                    patientRepository.deleteAddedSoundsCrepts(lastId);
                                                    patientRepository.deleteAddedSoundsRhonchi(lastId);
                                                    patientRepository.deleteAirEntry(lastId);
                                                    patientRepository.deleteKidneySides(lastId);
                                                    patientRepository.deletePalpationArea(lastId);
                                                    patientRepository.deleteLymphadenopathy(lastId);
                                                    patientRepository.deleteOedemas(lastId);
                                                    patientRepository.deleteRespiratoryDistress(lastId);
                                                    patientRepository.deleteOrganType(lastId);
                                                    patientRepository.delete(lastId);
                                                    response.sendRedirect("patientRegRequestError.jsp");
                                                }
                                            }else{
                                                patientRepository.deleteAddedSoundsCrepts(lastId);
                                                patientRepository.deleteAddedSoundsRhonchi(lastId);
                                                patientRepository.deleteAirEntry(lastId);
                                                patientRepository.deleteKidneySides(lastId);
                                                patientRepository.deletePalpationArea(lastId);
                                                patientRepository.deleteLymphadenopathy(lastId);
                                                patientRepository.deleteOedemas(lastId);
                                                patientRepository.deleteRespiratoryDistress(lastId);
                                                patientRepository.deleteOrganType(lastId);
                                                patientRepository.delete(lastId);
                                                response.sendRedirect("patientRegRequestError.jsp");
                                            }
                                        }else{
                                            patientRepository.deleteAddedSoundsRhonchi(lastId);
                                            patientRepository.deleteAirEntry(lastId);
                                            patientRepository.deleteKidneySides(lastId);
                                            patientRepository.deletePalpationArea(lastId);
                                            patientRepository.deleteLymphadenopathy(lastId);
                                            patientRepository.deleteOedemas(lastId);
                                            patientRepository.deleteRespiratoryDistress(lastId);
                                            patientRepository.deleteOrganType(lastId);
                                            patientRepository.delete(lastId);
                                            response.sendRedirect("patientRegRequestError.jsp");
                                        }
                                    }else{
                                        patientRepository.deleteAirEntry(lastId);
                                        patientRepository.deleteKidneySides(lastId);
                                        patientRepository.deletePalpationArea(lastId);
                                        patientRepository.deleteLymphadenopathy(lastId);
                                        patientRepository.deleteOedemas(lastId);
                                        patientRepository.deleteRespiratoryDistress(lastId);
                                        patientRepository.deleteOrganType(lastId);
                                        patientRepository.delete(lastId);
                                        response.sendRedirect("patientRegRequestError.jsp");
                                    }
                                }else{
                                    patientRepository.deleteKidneySides(lastId);
                                    patientRepository.deletePalpationArea(lastId);
                                    patientRepository.deleteLymphadenopathy(lastId);
                                    patientRepository.deleteOedemas(lastId);
                                    patientRepository.deleteRespiratoryDistress(lastId);
                                    patientRepository.deleteOrganType(lastId);
                                    patientRepository.delete(lastId);
                                    response.sendRedirect("patientRegRequestError.jsp");
                                }
                            }else{
                                patientRepository.deletePalpationArea(lastId);
                                patientRepository.deleteLymphadenopathy(lastId);
                                patientRepository.deleteOedemas(lastId);
                                patientRepository.deleteRespiratoryDistress(lastId);
                                patientRepository.deleteOrganType(lastId);
                                patientRepository.delete(lastId);
                                response.sendRedirect("patientRegRequestError.jsp");
                            }
                        }else{
                            patientRepository.deleteLymphadenopathy(lastId);
                            patientRepository.deleteOedemas(lastId);
                            patientRepository.deleteRespiratoryDistress(lastId);
                            patientRepository.deleteOrganType(lastId);
                            patientRepository.delete(lastId);
                            response.sendRedirect("patientRegRequestError.jsp");
                        }
                    }else{
                        patientRepository.deleteOedemas(lastId);
                        patientRepository.deleteRespiratoryDistress(lastId);
                        patientRepository.deleteOrganType(lastId);
                        patientRepository.delete(lastId);
                        response.sendRedirect("patientRegRequestError.jsp");
                    }
                }else{
                    patientRepository.deleteRespiratoryDistress(lastId);
                    patientRepository.deleteOrganType(lastId);
                    patientRepository.delete(lastId); 
                    response.sendRedirect("patientRegRequestError.jsp");
                }
            }else{
                patientRepository.deleteOrganType(lastId);
                patientRepository.delete(lastId); 
                response.sendRedirect("patientRegRequestError.jsp");
            }
        }else{
            patientRepository.delete(lastId); 
            response.sendRedirect("patientRegRequestError.jsp");
        }

}else{
response.sendRedirect("patientRegRequestError.jsp");
}
        
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

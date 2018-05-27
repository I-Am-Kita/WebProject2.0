package repository;

import db.DbConnection;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PatientRepositoty {
    

//////////////////////////////////////////   INSERT PATIENT  OLD VERSION ///////////////////////////////////////////       
    
        public boolean savePatient(String initials, String surname, String gender, String birthday, int age,String parentOrguardian,
                String guard, int id, String tel_no, String diagnosis, String p_co,String hx_p_co, String pmhx, String pshx,
                String aihx, String drughx, String immunizationhx,String socialhx, String familyhx,String active, String alert,
                String dehydrated, String pallor, String ill,String icteric, String growth, String cyanois, String spo2, String pob,
                String clubbing, String pitt, String ab_movement,String muscle_w, String strabismus, String gait, String others,
                String tenderness, String other,String cayanosis_cvs, String blood_high, String blood_low, String pulse, String volume,
                String characterr, String rhythm, String jvp, String crft, String peripheral, String precordium_scars,String deformalities,
                String deformalities_val, String pulsation, String pulsation_val, String apex_beat,String dual_rhythm, String thirdhsound,
                String forthhsound, String murmurs, String othercvs,String distended, String scars, String scars_val, String vbmovements,
                String dvessels,String palpation, String liver, String spleen, String masses, String ballotable, String free_fluid, 
                String dullness,String bowel_sounds, String otherabdomen,String respiratory_rate, String bcg_scar, 
                String chest_wall_deformities, String lung_expansion, String other_lung_expansion, String respiratory_scars, 
                String air_entry, String vb, String bb, String rhonchi, String crepts, String pleural, String other_detail,
                String breath_sound, String vocal_resonance, String percussion_note, String percussion_note_val, String other_resp,
                double height, double weight, String mx, String system){
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("INSERT INTO patient(initials, surname, gender, birthday, age,"
                    + "  parentOrguardian, guard, id, tel_no, diagnosis, p_co, hx_p_co, pmhx, pshx, aihx, drughx,"
                    + " immunizationhx, socialhx, familyhx,active, alert, dehydrated, pallor, ill,icteric, growth,"
                    + " cyanois, spo2, pob, clubbing, pitt, ab_movement, muscle_w, strabismus, gait, others, "
                    + "tenderness, other,cayanosis_cvs, blood_high, blood_low, pulse, volume, characterr, rhythm,"
                    + " jvp, crft, peripheral, precordium_scars, deformalities, deformalities_val, pulsation, pulsation_val,"
                    + " apex_beat, dual_rhythm, thirdhsound, forthhsound, murmurs, othercvs,distended, scars, scars_val,"
                    + " vbmovements, dvessels, palpation, liver, spleen, masses, ballotable, free_fluid, dullness,"
                    + " bowel_sounds, otherabdomen,respiratory_rate, bcg_scar, chest_wall_deformities, lung_expansion,"
                    + " other_lung_expansion, respiratory_scars, air_entry, vb, bb, rhonchi, crepts, pleural, other_detail,"
                    + " breath_sound, vocal_resonance, percussion_note, percussion_note_val, other_resp, height, weight, mx, system)"
                    + "VALUES('"+initials+"','"+surname+"','"+gender+"','"+birthday+"',"+age+",'"+parentOrguardian+"',"
                    + "'"+guard+"',"+id+",'"+tel_no+"','"+diagnosis+"','"+p_co+"','"+hx_p_co+"','"+pmhx+"','"+pshx+"',"
                    + "'"+aihx+"','"+drughx+"','"+immunizationhx+"','"+socialhx+"','"+familyhx+"','"+active+"','"+alert+"',"
                    + "'"+dehydrated+"','"+pallor+"','"+ill+"','"+icteric+"','"+growth+"','"+cyanois+"','"+spo2+"','"+pob+"',"
                    + "'"+clubbing+"','"+pitt+"','"+ab_movement+"','"+muscle_w+"','"+strabismus+"','"+gait+"','"+others+"',"
                    + "'"+tenderness+"','"+other+"','"+cayanosis_cvs+"','"+blood_high+"','"+blood_low+"','"+pulse+"',"
                    + "'"+volume+"','"+characterr+"','"+rhythm+"','"+jvp+"','"+crft+"','"+peripheral+"','"+precordium_scars+"',"
                    + "'"+deformalities+"','"+deformalities_val+"','"+pulsation+"','"+pulsation_val+"','"+apex_beat+"',"
                    + "'"+dual_rhythm+"','"+thirdhsound+"','"+forthhsound+"','"+murmurs+"','"+othercvs+"','"+distended+"','"+scars+"','"+scars_val+"','"+vbmovements+"',"
                    + "'"+dvessels+"','"+palpation+"','"+liver+"','"+spleen+"','"+masses+"','"+ballotable+"','"+free_fluid+"',"
                    + "'"+dullness+"','"+bowel_sounds+"','"+otherabdomen+"','"+respiratory_rate+"','"+bcg_scar+"',"
                    + "'"+chest_wall_deformities+"','"+lung_expansion+"','"+other_lung_expansion+"','"+respiratory_scars+"',"
                    + "'"+air_entry+"','"+vb+"','"+bb+"','"+rhonchi+"','"+crepts+"','"+pleural+"','"+other_detail+"',"
                    + "'"+breath_sound+"','"+vocal_resonance+"','"+percussion_note+"','"+percussion_note_val+"','"+other_resp+"','"+height+"','"+weight+"',"
                    + "'"+mx+"','"+system+"')");
            
            return isExecuted; 
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return false;
    }
        
        
    public String insert_type(int last ,String[]typ){
        String msg = null;
        try {
                for(String organ : typ){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO organType(num,organ)"
                                        + "VALUES("+last+",'"+organ+"')");    
                    if(isExecuted){
                        msg = "Patient successfully registered";
                    }else{
                        msg = "Patient registration unsuccessful";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "There is an error in the request.";
                System.out.print(msg);
            }
            return msg;
        } 
    
    public boolean insertInvestigationReport(int last, int day_ix, String date_ix, String time_ix, String bldtx, String hb, String plt,
            String pcv, String wbc, String n, String l, String esr, String crp, String bu, String scr, String na, String k, 
            String ca, String mg, String cl, String rbs, String cbs, String ast, String alt, String alp, String sprotien,
            String alb, String glob, String inr, String pt, String aptt, String sbrtot, String dir, String urine, String cxr, 
            String us, String ct, String ecg, String cultures_blood, String cultures_sputum, String cultures_urine, String otherix,
             String planned){
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("INSERT INTO investigationReport(num, day_ix, date_ix, time_ix, bldtx, hb,"
                    + " plt, pcv, wbc, n, l, esr, crp, bu, scr, na, k, ca, mg, cl, rbs, cbs, ast, alt, alp, sprotien, alb, glob,"
                    + " inr, pt, aptt, sbrtot, dir, urine, cxr, us, ct, ecg, cultures_blood, cultures_sputum, cultures_urine, "
                    + "otherix, planned)VALUES("+last+","+day_ix+",'"+date_ix+"','"+time_ix+"','"+bldtx+"','"+hb+"','"+plt+"',"
                            + "'"+pcv+"','"+wbc+"','"+n+"','"+l+"','"+esr+"','"+crp+"','"+bu+"','"+scr+"','"+na+"','"+k+"','"+ca+"',"
                            + "'"+mg+"','"+cl+"','"+rbs+"','"+cbs+"','"+ast+"','"+alt+"','"+alp+"','"+sprotien+"','"+alb+"',"
                            + "'"+glob+"','"+inr+"','"+pt+"','"+aptt+"','"+sbrtot+"','"+dir+"','"+urine+"','"+cxr+"',"
                            + "'"+us+"','"+ct+"','"+ecg+"','"+cultures_blood+"','"+cultures_sputum+"','"+cultures_urine+"',"
                                                    + "'"+otherix+"','"+planned+"')");
            
            return isExecuted; 
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return false;
    
    
    }
    
    public boolean insertBloodGasAnalysis(int last, int day_bga, String date_bga, String time_bga, String abg , String vbg, 
            String ph, String pco2, String hco3, String po2, String so2, String be){
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("INSERT INTO bloodGasAnalysis(num, day_bga, date_bga, time_bga, abg , vbg,"
                    + " ph, pco2, hco3, po2, so2,be)VALUES("+last+","+day_bga+",'"+date_bga+"','"+time_bga+"','"+abg+"','"+vbg+"',"
                            + "'"+ph+"','"+pco2+"','"+hco3+"','"+po2+"','"+so2+"','"+be+"')");
            
            return isExecuted; 
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return false;
    
    
    }  
    
    public String insert_respiratory_distress(int num ,String [] r_distress){
        String msg = null;
        try {
                for(String distress : r_distress){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO respiratoryDistress(num,r_distress)"
                                        + "VALUES("+num+",'"+distress+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }
    
        public String insert_oedema(int num ,String [] oedema){
        String msg = null;
        try {
                for(String value : oedema){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO oedema(num,oedema)"
                                        + "VALUES("+num+",'"+value+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }

        public String insert_lymphadenopathy(int num ,String [] lymphadenopathy){
        String msg = null;
        try {
                for(String value : lymphadenopathy){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO lymphadenopathy(num,lymphadenopathy)"
                                        + "VALUES("+num+",'"+value+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }
    
    public String insert_palpation_area(int num ,String [] palpation_val){
        String msg = null;
        try {
                for(String area : palpation_val){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO palpationArea(num,area)"
                                        + "VALUES("+num+",'"+area+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }
    
        public String insert_Kidney_Sides(int num ,String [] kidney_side){
        String msg = null;
        try {
                for(String sides : kidney_side){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO kidnySides(num,side)"
                                        + "VALUES("+num+",'"+sides+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }        

    public String insert_Air_Entry(int num ,String [] air_entry_val){
        String msg = null;
        try {
                for(String air : air_entry_val){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO airEntry(num,air_entry_val)"
                                        + "VALUES("+num+",'"+air+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }
    
    public String insert_addedSoundsRhonchi(int num ,String [] rhonchi_val){
        String msg = null;
        try {
                for(String rhonchi : rhonchi_val){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO addedSoundsRhonchi(num,rhonchi_val)"
                                        + "VALUES("+num+",'"+rhonchi+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }
    
    public String insert_addedSoundsCrepts(int num ,String [] crepts_val){
        String msg = null;
        try {
                for(String crepts : crepts_val){
                    DbConnection connection = new DbConnection();   
                    boolean isExecuted =connection.setData("INSERT INTO addedSoundsCrepts(num,crepts_val)"
                                        + "VALUES("+num+",'"+crepts+"')");    
                    if(isExecuted){
                        msg = "success";
                    }else{
                        msg = "unsuccess";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = "error";
                System.out.print(msg);
            }
            return msg;
        }

        public boolean insertProblems(int last, String current_problems, String past_problems ){
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("INSERT INTO problems(num, current_problems, past_problems)"
                    + "VALUES("+last+",'"+current_problems+"','"+past_problems+"')");
            
            return isExecuted; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    

    public String getLastIds(){
        String id = null;
        try{
            DbConnection connection = new DbConnection();
            ResultSet data = connection.getData("SELECT MAX(patient.num) FROM patient");
            System.out.println(connection);
        while(data.next()){
            id =data.getString(1);
                }    
            } catch(ClassNotFoundException | SQLException e){
                    e.printStackTrace();
            }
                return id;
        }
        
        
        
//////////////////////////////////////////////////     VIEW PATIENT    ///////////////////////////////////
    
    
  public List<String> getAllPatientss(int low) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    String current_low = Integer.toString(low);
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT  * FROM patient ORDER BY num DESC LIMIT 10 OFFSET "+current_low);
        System.out.println(connection);
    while(data.next()){
        patientList.add("<td>"+data.getString(2)+"</td><td>"+data.getString(3)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(9)+"</td><td>"+data.getString(10)+"</td><td><a href=\"viewPatient.jsp?id="+data.getString(1)+"&low="+current_low+"\" />"+"View"+"</td><td><a href=\"updatePatient1.jsp?&low="+current_low+"&num="+data.getString(1)+"&initials="+data.getString(2)+"&surname="+data.getString(3)+"&gender="+data.getString(4)+"&birthday="+data.getString(5)+"&age="+data.getString(6)+"&parentOrguardian="+data.getString(7)+"&guard="+data.getString(8)+"&id="+data.getString(9)+"&tel_no="+data.getString(10)+"&diagnosis="+data.getString(11)+"&p_co="+data.getString(12)+"&hx_p_co="+data.getString(13)+"&pmhx="+data.getString(14)+"&pshx="+data.getString(15)+"&aihx="+data.getString(16)+"&drughx="+data.getString(17)+"&immunizationhx="+data.getString(18)+"&socialhx="+data.getString(19)+"&familyhx="+data.getString(20)+"&active="+data.getString(21)+"&alert="+data.getString(22)+"&dehydrated="+data.getString(23)+"&pallor="+data.getString(24)+"&ill="+data.getString(25)+"&icteric="+data.getString(26)+"&growth="+data.getString(27)+"&cyanois="+data.getString(28)+"&spo2="+data.getString(29)+"&pob="+data.getString(30)+"&clubbing="+data.getString(31)+"&pitting="+data.getString(32)+"&ab_movement="+data.getString(33)+"&muscle_w="+data.getString(34)+"&strabismus="+data.getString(35)+"&gait="+data.getString(36)+"&tenderness="+data.getString(38)+"&others="+data.getString(37)+"&other="+data.getString(39)+"&cayanosis_cvs="+data.getString(40)+"&blood_high="+data.getString(41)+"&blood_low="+data.getString(42)+"&pulse="+data.getString(43)+"&volume="+data.getString(44)+"&characterr="+data.getString(45)+"&rhythm="+data.getString(46)+"&jvp="+data.getString(47)+"&crft="+data.getString(48)+"&peripheral="+data.getString(49)+"&precordium_scars="+data.getString(50)+"&deformalities="+data.getString(51)+"&deformalities_val="+data.getString(52)+"&pulsation="+data.getString(53)+"&pulsation_val="+data.getString(54)+"&apex_beat="+data.getString(55)+"&dual_rhythm="+data.getString(56)+"&3hsound="+data.getString(57)+"&4hsound="+data.getString(58)+"&murmurs="+data.getString(59)+"&othercvs="+data.getString(60)+"&distended="+data.getString(61)+"&scars="+data.getString(62)+"&scars_val="+data.getString(63)+"&vbmovements="+data.getString(64)+"&dvessels="+data.getString(65)+"&palpation="+data.getString(66)+"&liver="+data.getString(67)+"&spleen="+data.getString(68)+"&masses="+data.getString(69)+"&ballotable="+data.getString(70)+"&free_fluid="+data.getString(71)+"&dullness="+data.getString(72)+"&bowel_sounds="+data.getString(73)+"&otherabdomen="+data.getString(74)+"&respiratory_rate="+data.getString(75)+"&bcg_scar="+data.getString(76)+"&chest_wall_deformities="+data.getString(77)+"&lung_expansion="+data.getString(78)+"&other_lung_expansion="+data.getString(79)+"&respiratory_scars="+data.getString(80)+"&air_entry="+data.getString(81)+"&vb="+data.getString(82)+"&bb="+data.getString(83)+"&rhonchi="+data.getString(84)+"&crepts="+data.getString(85)+"&pleural="+data.getString(86)+"&other_detail="+data.getString(87)+"&breath_sound="+data.getString(88)+"&vocal_resonance="+data.getString(89)+"&percussion_note="+data.getString(90)+"&percussion_note_val="+data.getString(91)+"&other_resp="+data.getString(92)+"&height="+data.getString(93)+"&weight="+data.getString(94)+"&mx="+data.getString(95)+"&system="+data.getString(96)+"\" />"+"Edit"+"</td><td class=\"td3\"><a href=\"updatePatient2.jsp?num="+data.getString(1)+"&low="+current_low+"\" />"+"Enter Ix"+"</td><td class=\"td4\"><a href=\"updatePatient3.jsp?num="+data.getString(1)+"\" />"+"Enter BGA"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&num="+data.getString(1)+"&low="+current_low+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdftest.jsp?&low="+current_low+"&id="+data.getString(1)+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
  
/*  
public Patient getPatientDetails(int id){    //get details of the patient
    Patient patient = new Patient();
    try{
        DbConnection connection = new DbConnection();
        
        PatientRepositoty patientRepositoty = new PatientRepositoty();
        List<String> organTypes = patientRepositoty.getOrganTypes(id);
        String[] organ_Types = new String[organTypes.size()];
        organ_Types = organTypes.toArray(organ_Types);
        patient.setO_type(organ_Types); 
        
        ResultSet data1 = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
        while(data1.next()){
            
            String age =data1.getString(6);
            int set_Age = Integer.parseInt(age);
            
            String id_no = data1.getString(9);
            int set_id = Integer.parseInt(id_no);
            
            String height_val = data1.getString(21);
            double set_height = Double.parseDouble(height_val);
            
            String weight_val = data1.getString(22);
            double set_weight = Double.parseDouble(weight_val);
            
            patient.setInitials(data1.getString(2)); 
            patient.setSurname(data1.getString(3));
            patient.setGender(data1.getString(4));
            patient.setBirthday(data1.getString(5));
            patient.setAge(set_Age);
            patient.setParentOrguardian(data1.getString(7));
            patient.setGuard(data1.getString(8));
            patient.setId(set_id);
            patient.setTel_no(data1.getString(10));
            patient.setDiagnosis(data1.getString(11));
            patient.setP_co(data1.getString(12));
            patient.setHx_p_co(data1.getString(13));
            patient.setPmhx(data1.getString(14));
            patient.setPshx(data1.getString(15));
            patient.setAihx(data1.getString(16));
            patient.setDrughx(data1.getString(17));
            patient.setImmunizationhx(data1.getString(18));
            patient.setSocialhx(data1.getString(19));
            patient.setFamilyhx(data1.getString(20));
            patient.setHeight(set_height);
            patient.setWeight(set_weight);
            patient.setMx(data1.getString(23));
            patient.setSystem(data1.getString(24));
            
            
            
        }
        
        String gen_examination_id = patientRepositoty.getGeneralExaminationId(id);
        int general_examination_id = Integer.parseInt(gen_examination_id);
        List<String> respiratoryDistress = patientRepositoty.respiratoryDistres(general_examination_id);
        String [] r_distress = new String[respiratoryDistress.size()];
        r_distress = respiratoryDistress.toArray(r_distress);
        patient.setR_distress(r_distress);
        
        List<String> oedemaVal = patientRepositoty.getOedema(general_examination_id);
        String [] oedema = new String[oedemaVal.size()];
        oedema = oedemaVal.toArray(oedema);
        patient.setOedema(oedema);
        
        List<String> lymphadenopathyVal = patientRepositoty.getLymphadenopathy(general_examination_id);
        String [] lymphadenopathy = new String [lymphadenopathyVal.size()];
        lymphadenopathy = lymphadenopathyVal.toArray(lymphadenopathy);
        patient.setLymphadenopathy(lymphadenopathy); 
        
        ResultSet data2 = connection.getData("SELECT * FROM generalExamination WHERE generalExamination.num='"+id+"'");
        System.out.println(connection);
        while(data1.next()){
            patient.setActive(data2.getString(3));
            patient.setAlert(data2.getString(4));
            patient.setDehydrated(data2.getString(5));
            patient.setPallor(data2.getString(6));
            patient.setIll(data2.getString(7));
            patient.setIcteric(data2.getString(8));
            patient.setGrowth(data2.getString(9));
            patient.setCyanois(data2.getString(10));
            patient.setSpo2(data2.getString(11));
            patient.setPob(data2.getString(12));
            patient.setClubbing(data2.getString(13));
            patient.setPitt(data2.getString(14));
            patient.setAb_movement(data2.getString(15));
            patient.setMuscle_w(data2.getString(16));
            patient.setStrabismus(data2.getString(17));
            patient.setGait(data2.getString(18));
            patient.setOthers(data2.getString(19));
            patient.setTenderness(data2.getString(20));
            patient.setOther(data2.getString(21));
            
            
        }
        
        
        
        
        
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patient;
}   */

  public List<String> getOrganTypes(int id) throws SQLException{
    List<String> organTypes = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM organtype WHERE organtype.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        organTypes.add(data.getString(3));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return organTypes;
}

  public List<String> respiratoryDistres(int general_examination_id) throws SQLException{
    List<String> organTypes = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM respiratoryDistress WHERE respiratoryDistress.generalExamination_id='"+general_examination_id+"'");
        System.out.println(connection);
    while(data.next()){
        organTypes.add(data.getString(3));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return organTypes;
}

  public List<String> getOedema(int general_examination_id) throws SQLException{
    List<String> oedema = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM oedema WHERE oedema.generalExamination_id='"+general_examination_id+"'");
        System.out.println(connection);
    while(data.next()){
        oedema.add(data.getString(3));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return oedema;
}

  public List<String> getLymphadenopathy(int general_examination_id) throws SQLException{
    List<String> lymphadenopathy = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM lymphadenopathy WHERE lymphadenopathy.generalExamination_id='"+general_examination_id+"'");
        System.out.println(connection);
    while(data.next()){
        lymphadenopathy.add(data.getString(3));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return lymphadenopathy;
}  
        
public List<String> getPatientBasicDetails(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Initials         :   "+data.getString(2)+"</div><div class=\"divtext\">  Surname   :   "+data.getString(3)+"</div><div class=\"divtext\"> Gender    :   " +data.getString(4)+ "</div><div class=\"divtext\"> Birthday    :   " +data.getString(5)+ "</div><div class=\"divtext\">  Age   :   "+data.getString(6)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">  Parent / Guardian                                          :   "+data.getString(7)+"</div><div class=\"divtext\">  Name Of The "+data.getString(7)+"   :   "+data.getString(8)+"</div><div class=\"divtext\"> "+data.getString(7)+"'s NIC   :   " +data.getString(9)+ "</div><div class=\"divtext\"> "+data.getString(7)+"'s Tel    :   " +data.getString(10)+ "</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

  
  public List<String> getPatientOrganTypes(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM organType WHERE organType.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">  SYSTEM TYPES         :  </div><div class=\"divtext\"></div>");
        patientList.add("");
    while(data.next()){
        patientList.add("<div class=\"divtext\">           *   "+data.getString(3)+"</div>");
        
    } 
    
    patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
  

  public List<String> getPatientOtherDetails(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Diagnosis         :   "+data.getString(11)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  P:CO   :   "+data.getString(12)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\"> HX:P:CO    :   " +data.getString(13)+ "</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\"> PMHX    :   " +data.getString(14)+ "</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  PSHX   :   "+data.getString(15)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  AIHX   :   "+data.getString(16)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  DRUGHX         :   "+data.getString(17)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  IMMUNIZATIONHX         :   "+data.getString(18)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  SOCIALHX         :   "+data.getString(19)+"</div><div class=\"divtext\">________________________________________________________</div><div class=\"divtext\">  FAMILYHX         :   "+data.getString(20)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">General Examination</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>"); 
        patientList.add("<div class=\"divtext\">  Active         :   "+data.getString(21)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Alert   :   "+data.getString(22)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Dehydrated    :   " +data.getString(23)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Pallor    :   " +data.getString(14)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  Ill-Looking   :   "+data.getString(25)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Icteric   :   "+data.getString(26)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Growth         :   "+data.getString(27)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Cyanois         :   "+data.getString(28)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Spo2         :   "+data.getString(29)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">__________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

  
/*  public List<String> getGeneralExaminationPart1(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">General Examination</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Active         :   "+data.getString(21)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Alert   :   "+data.getString(22)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Dehydrated    :   " +data.getString(23)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Pallor    :   " +data.getString(14)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  Ill-Looking   :   "+data.getString(25)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Icteric   :   "+data.getString(26)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Growth         :   "+data.getString(27)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Cyanois         :   "+data.getString(28)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Spo2         :   "+data.getString(29)+"</div>");
        
    } 
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">__________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}*/

  public List<String> getPatientRespiratoryDistress(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM respiratoryDistress WHERE respiratoryDistress.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">  Respiratory Distress         :  </div><div class=\"divtext\"></div>");
        patientList.add("");
    while(data.next()){
        patientList.add("<div class=\"divtext\">           *   "+data.getString(3)+"</div>");
        
    } 
    
    patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">__________________________</div>");
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
  
  public List<String> getGeneralExaminationPart2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Pattern Of Breathing         :   "+data.getString(30)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Clubbing   :   "+data.getString(31)+"</div><div class=\"divtext\">__________________________</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

  public List<String> getPatientOedema(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM oedema WHERE oedema.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">  Oedema         :  </div><div class=\"divtext\"></div>");
        patientList.add("");
    while(data.next()){
        patientList.add("<div class=\"divtext\">           *   "+data.getString(3)+"</div>");
        
    } 
    
    patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\" style=\"height=20px\"></div>");
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

    public List<String> getGeneralExaminationPart3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div style=\" height:40px\"></div>");
        patientList.add("<div class=\"divtext\">  Pitting / Non-Pitting         :   "+data.getString(32)+"</div><div class=\"divtext\">__________________________</div><div class=\"divtext\">  Abnormal Movements   :   "+data.getString(33)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Muscle Wasting   :   "+data.getString(34)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Strabismus   :   "+data.getString(35)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Gait   :   "+data.getString(36)+"</div><div class=\"divtext\">__________________________</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
    
  public List<String> getPatientLymphadenopathy(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM lymphadenopathy WHERE lymphadenopathy.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">  Lymphadenopathy         :  </div><div class=\"divtext\"></div>");
        patientList.add("");
    while(data.next()){
        patientList.add("<div class=\"divtext\">           *   "+data.getString(3)+"</div>");
        
    } 
    
    patientList.add("<div style=\" height:20px\"></div>");
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
  
    public List<String> getGeneralExaminationPart4(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  If Other         :   "+data.getString(37)+"</div><div style=\" height:20px\"></div><div class=\"divtext\">  Tenderness   :   "+data.getString(38)+"</div><div class=\"divtext\">__________________________</div><div style=\" height:20px\"></div><div class=\"divtext\">  Other General Examination   :   "+data.getString(39)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">CVS</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");
        patientList.add("<div class=\"divtext\">  Cayanosis         :   "+data.getString(40)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Blood Pressure High   :   "+data.getString(41)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Blood Pressure Low    :   " +data.getString(42)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Pulse Rate    :   " +data.getString(43)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  Volume   :   "+data.getString(44)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Character   :   "+data.getString(45)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Rhythm         :   "+data.getString(46)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  JVP         :   "+data.getString(47)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  CRFT         :   "+data.getString(48)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Peripheral         :   "+data.getString(49)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Precordium Scars         :   "+data.getString(50)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Chest Wall Deformalities         :   "+data.getString(51)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  If yes         :   "+data.getString(52)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Visible Pulsation         :   "+data.getString(53)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  If yes        :   "+data.getString(54)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Apex Beat         :   "+data.getString(55)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Dual Rhythm         :   "+data.getString(56)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  3rd Heart Sound         :   "+data.getString(57)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  4th Heart Sound         :   "+data.getString(58)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Murmurs         :   "+data.getString(59)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Other         :   "+data.getString(60)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
    //    patientList.add("<div class=\"divtext\">__________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">Abdomen</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");
        patientList.add("<div class=\"divtext\">  Distended         :   "+data.getString(61)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Scars   :   "+data.getString(62)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> If Yes    :   " +data.getString(63)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Visible Bowel Movements    :   " +data.getString(64)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  Dilated Vessels   :   "+data.getString(65)+"</div><div class=\"divtext\">__________________________</div><div class=\"divtext\">  Palpation   :   "+data.getString(66)+"</div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
        patientList.add("<div class=\"divtext\">  Area         :  </div><div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\" style=\"height=20px\"></div>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
    
    
/*  public List<String> getCvsPart1(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">CVS</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Cayanosis         :   "+data.getString(40)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Blood Pressure High   :   "+data.getString(41)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Blood Pressure Low    :   " +data.getString(42)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Pulse Rate    :   " +data.getString(43)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  Volume   :   "+data.getString(44)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Character   :   "+data.getString(45)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Rhythm         :   "+data.getString(46)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  JVP         :   "+data.getString(47)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  CRFT         :   "+data.getString(48)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Peripheral         :   "+data.getString(49)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Precordium Scars         :   "+data.getString(50)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Chest Wall Deformalities         :   "+data.getString(51)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  If yes         :   "+data.getString(52)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Visible Pulsation         :   "+data.getString(53)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  If yes        :   "+data.getString(54)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Apex Beat         :   "+data.getString(55)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Dual Rhythm         :   "+data.getString(56)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  3rd Heart Sound         :   "+data.getString(57)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  4th Heart Sound         :   "+data.getString(58)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Murmurs         :   "+data.getString(59)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Other         :   "+data.getString(60)+"</div>");
        
    } 
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">__________________________</div>");
        patientList.add("<div class=\"divtext\"></div>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}*/

 /* public List<String> getAbdomenPart1(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">Abdomen</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Distended         :   "+data.getString(61)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Scars   :   "+data.getString(62)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> If Yes    :   " +data.getString(63)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Visible Bowel Movements    :   " +data.getString(64)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  Dilated Vessels   :   "+data.getString(65)+"</div><div class=\"divtext\">__________________________</div><div class=\"divtext\">  Palpation   :   "+data.getString(66)+"</div>");
        
    } 
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
        patientList.add("<div class=\"divtext\">  Area         :  </div><div class=\"divtext\"></div>");
    patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\" style=\"height=20px\"></div>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}*/


  public List<String> getPalpationAreaForPatintViewGrid(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM palpationArea WHERE palpationArea.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 
      
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
  
    public List<String> getAbdomenPart2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div style=\"height=20px\"></div>");
        patientList.add("<div class=\"divtext\">__________________________</div>");
        patientList.add("<div class=\"divtext\">  Liver         :   "+data.getString(67)+"</div><div style=\" height:20px\"></div><div class=\"divtext\">  Spleen   :   "+data.getString(68)+"</div><div class=\"divtext\"></div><div style=\" height:20px\"></div><div class=\"divtext\">  Masses   :   "+data.getString(69)+"</div><div class=\"divtext\">__________________________</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
    
  public List<String> getKidney(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM kidnySides WHERE kidnySides.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">  Kidney        :  </div><div class=\"divtext\"></div>");
        patientList.add("");
    while(data.next()){
        patientList.add("<div class=\"divtext\">           *   "+data.getString(3)+"</div>");
        
    } 
    
    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

    public List<String> getAbdomenPart3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Ballotable         :   "+data.getString(70)+"</div><div style=\" height:20px\"></div><div >______________________________</div><div class=\"divtext\">  Free Fluid   :   "+data.getString(71)+"</div><div class=\"divtext\"></div><div style=\" height:20px\"></div><div class=\"divtext\">  Dullness   :   "+data.getString(72)+"</div><div class=\"divtext\"></div><div style=\" height:20px\"></div><div class=\"divtext\">  Bowel Sounds   :   "+data.getString(73)+"</div><div class=\"divtext\"></div><div style=\" height:20px\"></div><div class=\"divtext\">  Other Abdomen   :   "+data.getString(74)+"</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

  public List<String> getRespiratoryPart1(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">________________________________________________________</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">Respiratory</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Respiratory Rate         :   "+data.getString(75)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  BCG Scar   :   "+data.getString(76)+"</div><div class=\"divtext\"></div><div class=\"divtext\"> Chest Wall Deformities    :   " +data.getString(77)+ "</div><div class=\"divtext\"></div><div class=\"divtext\"> Lung Expansion    :   " +data.getString(78)+ "</div><div class=\"divtext\"></div><div class=\"divtext\">  If Lung Expansion Is Other   :   "+data.getString(79)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Respiratory Scars   :   "+data.getString(80)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Air Entry   :   "+data.getString(81)+"</div>");
        
    } 
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
        patientList.add("<div class=\"divtext\">  Area         :  </div><div class=\"divtext\"></div>");
    patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\" style=\"height=20px\"></div>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

  public List<String> getAirntryForPatintViewGrid(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM airEntry WHERE airEntry.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 
      
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

    public List<String> getRespiratoryPart2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  VB         :   "+data.getString(82)+"</div><div style=\" height:20px\"></div><div ></div><div class=\"divtext\">  BB   :   "+data.getString(83)+"</div><div style=\"height=20px\"></div><div class=\"divtext\">_______________________________</div><div class=\"divtext\"> Added Sounds : </div><div class=\"divtext\">  Rhonchi         :   "+data.getString(84)+"</div><div style=\" height:20px\"></div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}  

  public List<String> getAddedSoundsRhonchiForPatintViewGrid(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM addedSoundsRhonchi WHERE addedSoundsRhonchi.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 
      
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}    
    
    public List<String> getRespiratoryPart3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  Crepts         :   "+data.getString(85)+"</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

  public List<String> getAddedSoundsCreptsForPatintViewGrid(int id) throws SQLException{
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM addedsoundscrepts WHERE addedsoundscrepts.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 
      
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}     

    public List<String> getRespiratoryPart4(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div style=\" height:40px\"></div>");
        patientList.add("<div class=\"divtext\">  Pleural Rub         :   "+data.getString(86)+"</div><div class=\"divtext\"></div><div class=\"divtext\">  Other Details   :   "+data.getString(87)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Breath Sound   :   "+data.getString(88)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Vocal Resonance   :   "+data.getString(89)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Percussion Note   :   "+data.getString(90)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  If \"Hyperresonant\" or \"Dull\"   :   "+data.getString(91)+"</div><div class=\"divtext\"> </div><div class=\"divtext\">  Other Respiratory   :   "+data.getString(92)+"</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
    
    
        public List<String> getHeightAndWeight(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div style=\"height=20px\"></div>");
    while(data.next()){
        
        patientList.add("<div class=\"divtext\">  Height         :   "+data.getString(93)+"</div><div style=\" height:20px\"></div><div ></div><div class=\"divtext\">  Weight   :   "+data.getString(94)+"</div><div style=\"height=20px\"></div><div class=\"divtext\"></div><div style=\" height:20px\"></div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
    
    

      public List<String> getInvestigationReport(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
       
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">-------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">Investigation Report</div>");
        patientList.add("<div class=\"divtext\">-------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");

        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
    } catch(Exception  e){
    e.printStackTrace();
    }
    return patientList;
}
     
      
    public List<String> investigationReport1(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
        DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Day</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(3)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}  
    
   public List<String> investigationReport2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Date</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(4)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}
   
    public List<String> investigationReport3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Time</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(5)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport4(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >BLD Tx</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(6)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport5(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Hb %</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(7)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport6(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >PLT</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(8)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport7(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >PCV</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(9)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport8(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >WBC</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(10)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport9(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >-N</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(11)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport10(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >-L</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(12)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport11(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >ESR</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(13)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport12(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >CRP</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(14)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport13(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >BU</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(15)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport14(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >S.Cr</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(16)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport15(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Na+</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(17)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport16(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >K+</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(18)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport17(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Ca</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(19)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport18(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Mg</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(20)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport19(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Cl</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(21)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport20(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >RBS</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(22)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport21(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >CBS</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(23)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport22(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >AST</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(24)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport23(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >ALT</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(25)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport24(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >ALP</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(26)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport25(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >S.protien</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(27)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport26(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Alb</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(28)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport27(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Glob</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(29)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport28(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >INR</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(30)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport29(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >PT</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(31)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport30(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >APTT</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(32)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport31(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >SBR-Tot</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(33)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport32(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >-Dir</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(34)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport33(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >URINE</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(35)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport34(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >CXR</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(36)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport35(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >US</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(37)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport36(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >CT</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(38)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport37(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >ECG</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(39)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport38(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Blood</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(40)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport39(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Sputum</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(41)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport40(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Urine</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(42)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport41(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Other ix</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(43)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 
    public List<String> investigationReport42(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM investigationReport WHERE investigationReport.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Planned ix</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(44)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

     public List<String> getBloodGasAnalysis(int id){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
       
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">-------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">Blood Gas Analysis</div>");
        patientList.add("<div class=\"divtext\">-------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");

        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
    } catch(Exception  e){
    e.printStackTrace();
    }
    return patientList;
}    

    public List<String> bloodGasAnalysisReport1(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >Day</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(3)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}     

    
public List<String> bloodGasAnalysisReport2(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >DATE</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(4)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport3(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >TIME</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(5)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
} 

public List<String> bloodGasAnalysisReport4(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >ABG</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(6)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport5(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >VBG</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(7)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport6(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >PH</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(8)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport7(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >pCO2</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(9)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport8(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >HCO3</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(10)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport9(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >pO2</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(11)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport10(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >sO2</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(12)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

public List<String> bloodGasAnalysisReport11(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM bloodGasAnalysis WHERE bloodGasAnalysis.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"td\" >BE</td>");
    while(data.next()){
        
        patientList.add("<td class=\"td\">"+data.getString(13)+"</td>");
        
    }  
    patientList.add("</tr></table>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

     public List<String> getProblems(){    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    try{
       
        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\">Problems</div>");
        patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");

        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
    } catch(Exception  e){
    e.printStackTrace();
    }
    return patientList;
} 

     
     public List<String> problems(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM problems WHERE problems.num='"+id+"'");
        System.out.println(connection);
        patientList.add("<table><tr class=\"tr\"><td class=\"tdofproblems\" >Current Problems</td><td class=\"tdofproblems\" >Chronic / Past Problems</td></tr>");
    while(data.next()){
        
        patientList.add("<tr><td class=\"tdofproblems\">"+data.getString(3)+"</td><td class=\"tdofproblems\">"+data.getString(4)+"</td></tr>");
        
    }
    
    patientList.add("</tr></table>");
    patientList.add("<div class=\"divtext\">--------------------------------------------------------------------------------------</div>");
        patientList.add("<div class=\"divtext\"> </div>");

        patientList.add("<div class=\"divtext\"></div>");
        patientList.add("<div style=\"height=20px\"></div>");
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}

    public List<String> getpatientLastDetails(int id) throws SQLException{    //get details of the patient
    List<String> patientList = new ArrayList<String>();
    DbConnection connection = null ;
    try{
        connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        patientList.add("<div class=\"divtext\">  MX         :   "+data.getString(95)+"</div><div style=\" height:20px\"></div><div >_______________________________</div><div class=\"divtext\">  Current Updates   :   "+data.getString(96)+"</div><div style=\"height=20px\"></div><div class=\"divtext\">_______________________________</div>");
        
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    finally{
        if(connection != null){
        connection.closeConnection();
        out.println("closed");
        }
    }
    return patientList;
}      
     
/////////////////////////////////////////////////////////////////UPDATE//////////////////////////////////////////  
  public List<String> getOrganTypesForUpdatePanel(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM organType WHERE organType.num='"+id+"'");
        System.out.println(connection);
        
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 

    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}

  public List<String> getMultipleValuesForUpdatePanel(String table,int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM "+table+" WHERE "+table+".num='"+id+"'");
        System.out.println(connection);
        
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 

    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}

  public List<String> getCurrentProblemValuesForUpdatePanel(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM problems WHERE problems.num='"+id+"'");
        System.out.println(connection);
        
    while(data.next()){
        patientList.add(data.getString(3));
        
    } 

    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  

  public List<String> getPastProblemValuesForUpdatePanel(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM problems WHERE problems.num='"+id+"'");
        System.out.println(connection);
        
    while(data.next()){
        patientList.add(data.getString(4));
        
    } 

    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  public List<String> getPatientForPdf(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(2));
        patientList.add(data.getString(3));
        patientList.add(data.getString(4));
        patientList.add(data.getString(5));
        patientList.add(data.getString(6));
        patientList.add(data.getString(7));
        patientList.add(data.getString(8));
        patientList.add(data.getString(9));
        patientList.add(data.getString(10));
        patientList.add(data.getString(11));
        patientList.add(data.getString(12));
        patientList.add(data.getString(13));
        patientList.add(data.getString(14));
        patientList.add(data.getString(15));
        patientList.add(data.getString(16));
        patientList.add(data.getString(17));
        patientList.add(data.getString(18));
        patientList.add(data.getString(19));
        patientList.add(data.getString(20));
        patientList.add(data.getString(21));
        patientList.add(data.getString(22));
        patientList.add(data.getString(23));
        patientList.add(data.getString(24));
        patientList.add(data.getString(25));
        patientList.add(data.getString(26));
        patientList.add(data.getString(27));
        patientList.add(data.getString(28));
        patientList.add(data.getString(29));
        patientList.add(data.getString(30));
        patientList.add(data.getString(31));
        patientList.add(data.getString(32));
        patientList.add(data.getString(33));
        patientList.add(data.getString(34));
        patientList.add(data.getString(35));
        patientList.add(data.getString(36));
        patientList.add(data.getString(37));
        patientList.add(data.getString(38));
        patientList.add(data.getString(39));
        patientList.add(data.getString(40));
        patientList.add(data.getString(41));
        patientList.add(data.getString(42));
        patientList.add(data.getString(43));
        patientList.add(data.getString(44));
        patientList.add(data.getString(45));
        patientList.add(data.getString(46));
        patientList.add(data.getString(47));
        patientList.add(data.getString(48));
        patientList.add(data.getString(49));
        patientList.add(data.getString(50));
        patientList.add(data.getString(51));
        patientList.add(data.getString(52));
        patientList.add(data.getString(53));
        patientList.add(data.getString(54));
        patientList.add(data.getString(55));
        patientList.add(data.getString(56));
        patientList.add(data.getString(57));
        patientList.add(data.getString(58));
        patientList.add(data.getString(59));
        patientList.add(data.getString(60));
        patientList.add(data.getString(61));
        patientList.add(data.getString(62));
        patientList.add(data.getString(63));
        patientList.add(data.getString(64));
        patientList.add(data.getString(65));
        patientList.add(data.getString(66));
        patientList.add(data.getString(67));
        patientList.add(data.getString(68));
        patientList.add(data.getString(69));
        patientList.add(data.getString(70));
        patientList.add(data.getString(71));
        patientList.add(data.getString(72));
        patientList.add(data.getString(73));
        patientList.add(data.getString(74));
        patientList.add(data.getString(75));
        patientList.add(data.getString(76));
        patientList.add(data.getString(77));
        patientList.add(data.getString(78));
        patientList.add(data.getString(79));
        patientList.add(data.getString(80));
        patientList.add(data.getString(81));
        patientList.add(data.getString(82));
        patientList.add(data.getString(83));
        patientList.add(data.getString(84));
        patientList.add(data.getString(85));
        patientList.add(data.getString(86));
        patientList.add(data.getString(87));
        patientList.add(data.getString(88));
        patientList.add(data.getString(89));
        patientList.add(data.getString(90));
        patientList.add(data.getString(91));
        patientList.add(data.getString(92));
        patientList.add(data.getString(93));
        patientList.add(data.getString(94));
        patientList.add(data.getString(95));
        patientList.add(data.getString(96));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}

/*public List<String> getOrganTypesForPdf(int id){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
        System.out.println(connection);
    while(data.next()){
        
        patientList.add(data.getString(3));
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}*/
  
  public List<String> getPatientByGuardianNIC(int id ,String begin){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        //ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.id='"+id+"'");
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.id='"+id+"' ORDER BY num DESC LIMIT 3 OFFSET "+begin);
        System.out.println(connection);
        String nic= "nic";
    while(data.next()){
       patientList.add("<td>"+data.getString(2)+"</td><td>"+data.getString(3)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(9)+"</td><td>"+data.getString(10)+"</td><td><a href=\"guardianNicPatientView.jsp?&begin="+begin+"&id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updatePatient1.jsp?&begin="+begin+"&num="+data.getString(1)+"&type="+nic+"&initials="+data.getString(2)+"&surname="+data.getString(3)+"&gender="+data.getString(4)+"&birthday="+data.getString(5)+"&age="+data.getString(6)+"&parentOrguardian="+data.getString(7)+"&guard="+data.getString(8)+"&id="+data.getString(9)+"&tel_no="+data.getString(10)+"&diagnosis="+data.getString(11)+"&p_co="+data.getString(12)+"&hx_p_co="+data.getString(13)+"&pmhx="+data.getString(14)+"&pshx="+data.getString(15)+"&aihx="+data.getString(16)+"&drughx="+data.getString(17)+"&immunizationhx="+data.getString(18)+"&socialhx="+data.getString(19)+"&familyhx="+data.getString(20)+"&active="+data.getString(21)+"&alert="+data.getString(22)+"&dehydrated="+data.getString(23)+"&pallor="+data.getString(24)+"&ill="+data.getString(25)+"&icteric="+data.getString(26)+"&growth="+data.getString(27)+"&cyanois="+data.getString(28)+"&spo2="+data.getString(29)+"&pob="+data.getString(30)+"&clubbing="+data.getString(31)+"&pitting="+data.getString(32)+"&ab_movement="+data.getString(33)+"&muscle_w="+data.getString(34)+"&strabismus="+data.getString(35)+"&gait="+data.getString(36)+"&tenderness="+data.getString(38)+"&others="+data.getString(37)+"&other="+data.getString(39)+"&cayanosis_cvs="+data.getString(40)+"&blood_high="+data.getString(41)+"&blood_low="+data.getString(42)+"&pulse="+data.getString(43)+"&volume="+data.getString(44)+"&characterr="+data.getString(45)+"&rhythm="+data.getString(46)+"&jvp="+data.getString(47)+"&crft="+data.getString(48)+"&peripheral="+data.getString(49)+"&precordium_scars="+data.getString(50)+"&deformalities="+data.getString(51)+"&deformalities_val="+data.getString(52)+"&pulsation="+data.getString(53)+"&pulsation_val="+data.getString(54)+"&apex_beat="+data.getString(55)+"&dual_rhythm="+data.getString(56)+"&3hsound="+data.getString(57)+"&4hsound="+data.getString(58)+"&murmurs="+data.getString(59)+"&othercvs="+data.getString(60)+"&distended="+data.getString(61)+"&scars="+data.getString(62)+"&scars_val="+data.getString(63)+"&vbmovements="+data.getString(64)+"&dvessels="+data.getString(65)+"&palpation="+data.getString(66)+"&liver="+data.getString(67)+"&spleen="+data.getString(68)+"&masses="+data.getString(69)+"&ballotable="+data.getString(70)+"&free_fluid="+data.getString(71)+"&dullness="+data.getString(72)+"&bowel_sounds="+data.getString(73)+"&otherabdomen="+data.getString(74)+"&respiratory_rate="+data.getString(75)+"&bcg_scar="+data.getString(76)+"&chest_wall_deformities="+data.getString(77)+"&lung_expansion="+data.getString(78)+"&other_lung_expansion="+data.getString(79)+"&respiratory_scars="+data.getString(80)+"&air_entry="+data.getString(81)+"&vb="+data.getString(82)+"&bb="+data.getString(83)+"&rhonchi="+data.getString(84)+"&crepts="+data.getString(85)+"&pleural="+data.getString(86)+"&other_detail="+data.getString(87)+"&breath_sound="+data.getString(88)+"&vocal_resonance="+data.getString(89)+"&percussion_note="+data.getString(90)+"&percussion_note_val="+data.getString(91)+"&other_resp="+data.getString(92)+"&height="+data.getString(93)+"&weight="+data.getString(94)+"&mx="+data.getString(95)+"&system="+data.getString(96)+"\" />"+"Edit"+"</td><td class=\"td3\"><a href=\"updatePatient2Nic.jsp?&num="+data.getString(1)+"&begin="+begin+"&type="+nic+"&nic_no="+data.getString(9)+"\" />"+"Enter Ix"+"</td><td class=\"td4\"><a href=\"updatePatient3.jsp?num="+data.getString(1)+"\" />"+"Enter BGA"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&begin="+begin+"&num="+data.getString(1)+"&type="+nic+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByGuardianNICResults.jsp?id="+data.getString(1)+"&nic_no="+data.getString(9)+"&begin="+begin+"\" />"+"Print"+"</td>");
    
       // patientList.add("<td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"guardianNicPatientView.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updatePatient.jsp??&num="+data.getString(1)+"&type="+nic+"&initials="+data.getString(3)+"&surname="+data.getString(4)+"&id="+data.getString(2)+"&guard="+data.getString(5)+"&age="+data.getString(6)+"&tel_no="+data.getString(7)+"&diagnosis="+data.getString(8)+"&p_co="+data.getString(9)+"&hx_p_co="+data.getString(10)+"&pmhx="+data.getString(11)+"&pshx="+data.getString(12)+"&aihx="+data.getString(13)+"&drughx="+data.getString(14)+"&immunizationhx="+data.getString(15)+"&socialhx="+data.getString(16)+"&familyhx="+data.getString(17)+"&examination="+data.getString(18)+"&system="+data.getString(19)+"&ix="+data.getString(20)+"&mx="+data.getString(21)+"\" />"+"Edit"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&type="+nic+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByGuardianNICResults.jsp?patientid="+data.getString(1)+"&id="+id+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
  public String getGuardianNIC(int id){
  
              String nic = null;
        try{
            DbConnection connection = new DbConnection();
            ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
            System.out.println(connection);
        while(data.next()){
            nic =data.getString(9);
                }    
            } catch(ClassNotFoundException | SQLException e){
                    e.printStackTrace();
            }
                return nic;
  
  }
  
    public String getPatientAge(int id){
  
              String age = null;
        try{
            DbConnection connection = new DbConnection();
            ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.num='"+id+"'");
            System.out.println(connection);
        while(data.next()){
            age =data.getString(6);
                }    
            } catch(ClassNotFoundException | SQLException e){
                    e.printStackTrace();
            }
                return age;
  
  }
  

  public List<String> getPatientByOrganType(String o_type,String start){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT patient.num,patient.initials,  patient.surname,  patient.gender,  patient.birthday,  patient.age,  patient.parentOrguardian,  patient.guard, patient.id, patient.tel_no, patient.diagnosis, patient.p_co, patient.hx_p_co, patient.pmhx, patient.pshx, patient.aihx, patient.drughx, patient.immunizationhx, patient.socialhx, patient.familyhx, patient.active, patient.alert, patient.dehydrated, patient.pallor, patient.ill, patient.icteric, patient.growth, patient.cyanois, patient.spo2, patient.pob, patient.clubbing, patient.pitt, patient.ab_movement, patient.muscle_w, patient.strabismus, patient.gait, patient.others, patient.tenderness, patient.other, cayanosis_cvs, patient.blood_high, patient.blood_low, patient.pulse, patient.volume, patient.characterr, patient.rhythm, patient.jvp, patient.crft, patient.peripheral, patient.precordium_scars, patient.deformalities, patient.deformalities_val, patient.pulsation, patient.pulsation_val, patient.apex_beat, patient.dual_rhythm, patient.thirdhsound, patient.forthhsound, patient.murmurs, patient.othercvs, patient.distended, patient.scars, patient.scars_val, patient.vbmovements, patient.dvessels, patient.palpation, patient.liver, patient.spleen, patient.masses, patient.ballotable, patient.free_fluid, patient.dullness, patient.bowel_sounds, patient.otherabdomen, patient.respiratory_rate, patient.bcg_scar, patient.chest_wall_deformities, patient.lung_expansion, patient.other_lung_expansion, patient.respiratory_scars, patient.air_entry, patient.vb, patient.bb, patient.rhonchi, patient.crepts, patient.pleural, patient.other_detail, patient.breath_sound, patient.vocal_resonance, patient.percussion_note, patient.percussion_note_val, patient.other_resp, patient.height, patient.weight, patient.mx, patient.system FROM organType RIGHT JOIN patient ON organType.num = patient.num Where organ ='"+o_type+"' ORDER BY num DESC LIMIT 3 OFFSET "+start);
        System.out.println(connection);
        String organ = o_type;
        String or_type = "organ";
    while(data.next()){
          patientList.add("<td>"+data.getString(2)+"</td><td>"+data.getString(3)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(9)+"</td><td>"+data.getString(10)+"</td><td><a href=\"organTypePatientView.jsp?&start="+start+"&id="+data.getString(1)+"&organ="+organ+"\" />"+"View"+"</td><td><a href=\"updatePatient1.jsp?&start="+start+"&num="+data.getString(1)+"&organ="+organ+"&type="+or_type+"&initials="+data.getString(2)+"&surname="+data.getString(3)+"&gender="+data.getString(4)+"&birthday="+data.getString(5)+"&age="+data.getString(6)+"&parentOrguardian="+data.getString(7)+"&guard="+data.getString(8)+"&id="+data.getString(9)+"&tel_no="+data.getString(10)+"&diagnosis="+data.getString(11)+"&p_co="+data.getString(12)+"&hx_p_co="+data.getString(13)+"&pmhx="+data.getString(14)+"&pshx="+data.getString(15)+"&aihx="+data.getString(16)+"&drughx="+data.getString(17)+"&immunizationhx="+data.getString(18)+"&socialhx="+data.getString(19)+"&familyhx="+data.getString(20)+"&active="+data.getString(21)+"&alert="+data.getString(22)+"&dehydrated="+data.getString(23)+"&pallor="+data.getString(24)+"&ill="+data.getString(25)+"&icteric="+data.getString(26)+"&growth="+data.getString(27)+"&cyanois="+data.getString(28)+"&spo2="+data.getString(29)+"&pob="+data.getString(30)+"&clubbing="+data.getString(31)+"&pitting="+data.getString(32)+"&ab_movement="+data.getString(33)+"&muscle_w="+data.getString(34)+"&strabismus="+data.getString(35)+"&gait="+data.getString(36)+"&tenderness="+data.getString(38)+"&others="+data.getString(37)+"&other="+data.getString(39)+"&cayanosis_cvs="+data.getString(40)+"&blood_high="+data.getString(41)+"&blood_low="+data.getString(42)+"&pulse="+data.getString(43)+"&volume="+data.getString(44)+"&characterr="+data.getString(45)+"&rhythm="+data.getString(46)+"&jvp="+data.getString(47)+"&crft="+data.getString(48)+"&peripheral="+data.getString(49)+"&precordium_scars="+data.getString(50)+"&deformalities="+data.getString(51)+"&deformalities_val="+data.getString(52)+"&pulsation="+data.getString(53)+"&pulsation_val="+data.getString(54)+"&apex_beat="+data.getString(55)+"&dual_rhythm="+data.getString(56)+"&3hsound="+data.getString(57)+"&4hsound="+data.getString(58)+"&murmurs="+data.getString(59)+"&othercvs="+data.getString(60)+"&distended="+data.getString(61)+"&scars="+data.getString(62)+"&scars_val="+data.getString(63)+"&vbmovements="+data.getString(64)+"&dvessels="+data.getString(65)+"&palpation="+data.getString(66)+"&liver="+data.getString(67)+"&spleen="+data.getString(68)+"&masses="+data.getString(69)+"&ballotable="+data.getString(70)+"&free_fluid="+data.getString(71)+"&dullness="+data.getString(72)+"&bowel_sounds="+data.getString(73)+"&otherabdomen="+data.getString(74)+"&respiratory_rate="+data.getString(75)+"&bcg_scar="+data.getString(76)+"&chest_wall_deformities="+data.getString(77)+"&lung_expansion="+data.getString(78)+"&other_lung_expansion="+data.getString(79)+"&respiratory_scars="+data.getString(80)+"&air_entry="+data.getString(81)+"&vb="+data.getString(82)+"&bb="+data.getString(83)+"&rhonchi="+data.getString(84)+"&crepts="+data.getString(85)+"&pleural="+data.getString(86)+"&other_detail="+data.getString(87)+"&breath_sound="+data.getString(88)+"&vocal_resonance="+data.getString(89)+"&percussion_note="+data.getString(90)+"&percussion_note_val="+data.getString(91)+"&other_resp="+data.getString(92)+"&height="+data.getString(93)+"&weight="+data.getString(94)+"&mx="+data.getString(95)+"&system="+data.getString(96)+"\" />"+"Edit"+"</td><td class=\"td3\"><a href=\"updatePatient2Organ.jsp?&num="+data.getString(1)+"&start="+start+"&organ="+organ+"&type="+or_type+"\" />"+"Enter Ix"+"</td><td class=\"td4\"><a href=\"updatePatient3.jsp?num="+data.getString(1)+"\" />"+"Enter BGA"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&start="+start+"&organ="+organ+"&type="+or_type+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByOrganTypeResults.jsp?id="+data.getString(1)+"&o_type="+o_type+"&start="+start+"\" />"+"Print"+"</td>");
    
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
    public List<String> getPatientByAge(int age,String indexx){
    List<String> patientList = new ArrayList<String>();
    try{
        DbConnection connection = new DbConnection();
        ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.age='"+age+"' ORDER BY num DESC LIMIT 3 OFFSET "+indexx);
        //SELECT * FROM pms.patient where age = 10 ORDER BY num DESC LIMIT 3 OFFSET 0;
       // ResultSet data = connection.getData("SELECT * FROM patient WHERE patient.age='"+age+"'");
        System.out.println(connection);
        String ageOfPatient = "age";
    while(data.next()){
        patientList.add("<td>"+data.getString(2)+"</td><td>"+data.getString(3)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(9)+"</td><td>"+data.getString(10)+"</td><td><a href=\"agePatientView.jsp?id="+data.getString(1)+"&index="+indexx+"\" />"+"View"+"</td><td><a href=\"updatePatient1.jsp?&index="+indexx+"&num="+data.getString(1)+"&type="+ageOfPatient+"&initials="+data.getString(2)+"&surname="+data.getString(3)+"&gender="+data.getString(4)+"&birthday="+data.getString(5)+"&age="+data.getString(6)+"&parentOrguardian="+data.getString(7)+"&guard="+data.getString(8)+"&id="+data.getString(9)+"&tel_no="+data.getString(10)+"&diagnosis="+data.getString(11)+"&p_co="+data.getString(12)+"&hx_p_co="+data.getString(13)+"&pmhx="+data.getString(14)+"&pshx="+data.getString(15)+"&aihx="+data.getString(16)+"&drughx="+data.getString(17)+"&immunizationhx="+data.getString(18)+"&socialhx="+data.getString(19)+"&familyhx="+data.getString(20)+"&active="+data.getString(21)+"&alert="+data.getString(22)+"&dehydrated="+data.getString(23)+"&pallor="+data.getString(24)+"&ill="+data.getString(25)+"&icteric="+data.getString(26)+"&growth="+data.getString(27)+"&cyanois="+data.getString(28)+"&spo2="+data.getString(29)+"&pob="+data.getString(30)+"&clubbing="+data.getString(31)+"&pitting="+data.getString(32)+"&ab_movement="+data.getString(33)+"&muscle_w="+data.getString(34)+"&strabismus="+data.getString(35)+"&gait="+data.getString(36)+"&tenderness="+data.getString(38)+"&others="+data.getString(37)+"&other="+data.getString(39)+"&cayanosis_cvs="+data.getString(40)+"&blood_high="+data.getString(41)+"&blood_low="+data.getString(42)+"&pulse="+data.getString(43)+"&volume="+data.getString(44)+"&characterr="+data.getString(45)+"&rhythm="+data.getString(46)+"&jvp="+data.getString(47)+"&crft="+data.getString(48)+"&peripheral="+data.getString(49)+"&precordium_scars="+data.getString(50)+"&deformalities="+data.getString(51)+"&deformalities_val="+data.getString(52)+"&pulsation="+data.getString(53)+"&pulsation_val="+data.getString(54)+"&apex_beat="+data.getString(55)+"&dual_rhythm="+data.getString(56)+"&3hsound="+data.getString(57)+"&4hsound="+data.getString(58)+"&murmurs="+data.getString(59)+"&othercvs="+data.getString(60)+"&distended="+data.getString(61)+"&scars="+data.getString(62)+"&scars_val="+data.getString(63)+"&vbmovements="+data.getString(64)+"&dvessels="+data.getString(65)+"&palpation="+data.getString(66)+"&liver="+data.getString(67)+"&spleen="+data.getString(68)+"&masses="+data.getString(69)+"&ballotable="+data.getString(70)+"&free_fluid="+data.getString(71)+"&dullness="+data.getString(72)+"&bowel_sounds="+data.getString(73)+"&otherabdomen="+data.getString(74)+"&respiratory_rate="+data.getString(75)+"&bcg_scar="+data.getString(76)+"&chest_wall_deformities="+data.getString(77)+"&lung_expansion="+data.getString(78)+"&other_lung_expansion="+data.getString(79)+"&respiratory_scars="+data.getString(80)+"&air_entry="+data.getString(81)+"&vb="+data.getString(82)+"&bb="+data.getString(83)+"&rhonchi="+data.getString(84)+"&crepts="+data.getString(85)+"&pleural="+data.getString(86)+"&other_detail="+data.getString(87)+"&breath_sound="+data.getString(88)+"&vocal_resonance="+data.getString(89)+"&percussion_note="+data.getString(90)+"&percussion_note_val="+data.getString(91)+"&other_resp="+data.getString(92)+"&height="+data.getString(93)+"&weight="+data.getString(94)+"&mx="+data.getString(95)+"&system="+data.getString(96)+"\" />"+"Edit"+"</td><td class=\"td3\"><a href=\"updatePatient2Age.jsp?&num="+data.getString(1)+"&type="+ageOfPatient+"&age="+age+"&index="+indexx+"\" />"+"Enter Ix"+"</td><td class=\"td4\"><a href=\"updatePatient3.jsp?num="+data.getString(1)+"&type="+ageOfPatient+"&age="+age+"&index="+indexx+"\" />"+"Enter BGA"+"</td><td class=\"td1\"><a href=\"deletePatient.jsp?&age='"+age+"'&index="+indexx+"&type="+ageOfPatient+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByAgeResults.jsp?id="+data.getString(1)+"&age="+age+"&index="+indexx+"\" />"+"Print"+"</td>");
    
        
        //patientList.add("<td>"+data.getString(3)+"</td><td>"+data.getString(4)+"</td><td>"+data.getString(5)+"</td><td>"+data.getString(2)+"</td><td>"+data.getString(6)+"</td><td>"+data.getString(7)+"</td><td><a href=\"agePatientView.jsp?id="+data.getString(1)+"\" />"+"View"+"</td><td><a href=\"updatePatient.jsp??&num="+data.getString(1)+"&type="+ageOfPatient+"&initials="+data.getString(3)+"&surname="+data.getString(4)+"&id="+data.getString(2)+"&guard="+data.getString(5)+"&age="+data.getString(6)+"&tel_no="+data.getString(7)+"&diagnosis="+data.getString(8)+"&p_co="+data.getString(9)+"&hx_p_co="+data.getString(10)+"&pmhx="+data.getString(11)+"&pshx="+data.getString(12)+"&aihx="+data.getString(13)+"&drughx="+data.getString(14)+"&immunizationhx="+data.getString(15)+"&socialhx="+data.getString(16)+"&familyhx="+data.getString(17)+"&examination="+data.getString(18)+"&system="+data.getString(19)+"&ix="+data.getString(20)+"&mx="+data.getString(21)+"\" />"+"Edit"+"</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  <td class=\"td1\"><a href=\"deletePatient.jsp?&type="+ageOfPatient+"&num="+data.getString(1)+"\" onclick=\"return confirm_alert(this);\"/>"+"Delete"+"</td><td class=\"td2\"><a href=\"pdfsearchPatientByAgeResults.jsp?id="+data.getString(1)+"&age="+age+"\" />"+"Print"+"</td>");
    }    
    } catch(ClassNotFoundException | SQLException e){
    e.printStackTrace();
    }
    return patientList;
}
  
  
public void delete(int num){
    
	try {
            DbConnection connection = new DbConnection();
            connection.setData("DELETE FROM patient WHERE num='"+num+"'");
          
	} catch (Exception e) {
            e.printStackTrace();
        }
        
}
public boolean deleteOrganType(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM organType WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}  

public boolean deleteInvestigationReport(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM investigationReport WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}


public boolean deleteBloodGasAnalys(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM bloodGasAnalysis WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}

public boolean deleteProblems(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM problems WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}
/*public boolean deleteCvs(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM cvs WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}*/

/*public boolean deleteAbdomen(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM abdomen WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}*/

public boolean deletePalpationArea(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM palpationArea WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}

public boolean deleteKidneySides(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM kidnySides WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}

/*public boolean deleteRespiratory(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM respiratory WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}*/

public boolean deleteAirEntry(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM airEntry WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}


public boolean deleteAddedSoundsRhonchi(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM addedSoundsRhonchi WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}

public boolean deleteAddedSoundsCrepts(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM addedSoundsCrepts WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}
        
/*public boolean deleteGeneralExamination(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM generalExamination WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}*/

public boolean deleteRespiratoryDistress(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM respiratoryDistress WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}

public boolean deleteOedemas(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM oedema WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}

public boolean deleteLymphadenopathy(int num){
    
    	try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("DELETE FROM lymphadenopathy WHERE num='"+num+"'");
            return isExecuted;
          
	} catch (Exception e) {
            e.printStackTrace();
        }
            return false;
}


public void deletePatient(int num){

    try{
    if(deleteProblems(num)){
        if(deleteBloodGasAnalys(num)){
            if(deleteInvestigationReport(num)){
                if(deleteAddedSoundsCrepts(num)){
                    if(deleteAddedSoundsRhonchi(num)){
                        if(deleteAirEntry(num)){
                            if(deleteKidneySides(num)){
                                if(deletePalpationArea(num)){
                                    if(deleteLymphadenopathy(num)){
                                        if(deleteOedemas(num)){
                                            if(deleteRespiratoryDistress(num)){
                                                if(deleteOrganType(num)){
                                                    delete(num);
                                                    
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    }catch (Exception e){
        e.printStackTrace();
    }

}
		
        

    public String updatePatient(int num, int new_age, String new_tel_no, String new_diagnosis, String new_p_co, String new_hx_p_co, String new_pmhx, String new_pshx, String new_aihx, String new_drughx, String new_immunizationhx, String new_socialhx, String new_familyhx, String new_spo2, String new_pob, String new_gait, String new_others, String new_other, String new_blood_high, String new_blood_low, String new_pulse, String new_characterr, String new_rhythm, String new_jvp, String new_precordium_scars, String new_deformalities_val, String new_pulsation_val, String new_apex_beat, String new_murmurs, String new_othercvs, String new_scars_val, String new_liver, String new_spleen, String new_masses, String new_dullness, String new_otherabdomen, String new_respiratory_rate, String new_chest_wall_deformities, String new_other_lung_expansion, String new_respiratory_scars, String new_other_detail, String new_breath_sound, String new_vocal_resonance, String new_percussion_note_val, String new_other_resp, String new_height, String new_weight, String new_current_problems, String new_past_problems, String new_mx, String new_system) {
              String msg = "";
        try {
            DbConnection connection = new DbConnection();
            boolean isExecuted = connection.setData("UPDATE patient SET age='"+new_age+"' , tel_no='"+new_tel_no+"' , diagnosis='"+new_diagnosis+"' , p_co='"+new_p_co+"', hx_p_co='"+new_hx_p_co+"', pmhx='"+new_pmhx+"', pshx='"+new_pshx+"', aihx='"+new_aihx+"', drughx='"+new_drughx+"', immunizationhx='"+new_immunizationhx+"', socialhx='"+new_socialhx+"', familyhx='"+new_familyhx+"', spo2='"+new_spo2+"' , pob ='"+new_pob+"' , gait='"+new_gait+"', others='"+new_others+"' , other='"+new_other+"' , blood_high='"+new_blood_high+"', blood_low='"+new_blood_low+"' , pulse='"+new_pulse+"', characterr='"+new_characterr+"', rhythm='"+new_rhythm+"', jvp='"+new_jvp+"', precordium_scars='"+new_precordium_scars+"', deformalities_val='"+new_deformalities_val+"', pulsation_val='"+new_pulsation_val+"', apex_beat='"+new_apex_beat+"', murmurs='"+new_murmurs+"', othercvs='"+new_othercvs+"', scars_val='"+new_scars_val+"', liver='"+new_liver+"', spleen='"+new_spleen+"', masses='"+new_masses+"', dullness='"+new_dullness+"', otherabdomen='"+new_otherabdomen+"', respiratory_rate='"+new_respiratory_rate+"', chest_wall_deformities='"+new_chest_wall_deformities+"', other_lung_expansion='"+new_other_lung_expansion+"', respiratory_scars='"+new_respiratory_scars+"', other_detail='"+new_other_detail+"', breath_sound='"+new_breath_sound+"', vocal_resonance='"+new_vocal_resonance+"', percussion_note_val='"+new_percussion_note_val+"', other_resp='"+new_other_resp+"', height='"+new_height+"',weight='"+new_weight+"' ,mx='"+new_mx+"', system='"+new_system+"' WHERE patient.num ='"+num+"'");
            if(isExecuted){
                    msg = "success";
                
            }else {
                msg = "Patient data update query did not executed";
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = "There is error in the student update process";
            
        }
      return msg;

    }


public boolean updatePatientProblems(int num,String new_current_problems, String new_past_problems) {
        
        try {
            DbConnection connection = new DbConnection();
                boolean over = connection.setData("UPDATE problems SET current_problems='"+new_current_problems+"', past_problems='"+new_past_problems+"' WHERE problems.num ='"+num+"' ");
                return over;
        } catch (Exception e) {
            e.printStackTrace();  
        }
            return false;

    }

public String updatePatients(int num, int new_age, String new_tel_no, String new_diagnosis, String new_p_co, String new_hx_p_co, String new_pmhx, String new_pshx, String new_aihx, String new_drughx, String new_immunizationhx, String new_socialhx, String new_familyhx, String new_spo2, String new_pob, String new_gait, String new_others, String new_other, String new_blood_high, String new_blood_low, String new_pulse, String new_characterr, String new_rhythm, String new_jvp, String new_precordium_scars, String new_deformalities_val, String new_pulsation_val, String new_apex_beat, String new_murmurs, String new_othercvs, String new_scars_val, String new_liver, String new_spleen, String new_masses, String new_dullness, String new_otherabdomen, String new_respiratory_rate, String new_chest_wall_deformities, String new_other_lung_expansion, String new_respiratory_scars, String new_other_detail, String new_breath_sound, String new_vocal_resonance, String new_percussion_note_val, String new_other_resp, String new_height, String new_weight, String new_current_problems, String new_past_problems, String new_mx, String new_system){
    String msg = "";
    PatientRepositoty patientRepository = new PatientRepositoty();
    boolean status = patientRepository.updatePatientProblems(num, new_current_problems, new_past_problems);
    if(status){
        msg = patientRepository.updatePatient(num, new_age, new_tel_no, new_diagnosis, new_p_co, new_hx_p_co, new_pmhx, new_pshx, new_aihx, new_drughx, new_immunizationhx, new_socialhx, new_familyhx, new_spo2, new_pob, new_gait, new_others, new_other, new_blood_high, new_blood_low, new_pulse, new_characterr, new_rhythm, new_jvp, new_precordium_scars, new_deformalities_val, new_pulsation_val, new_apex_beat, new_murmurs, new_othercvs, new_scars_val, new_liver, new_spleen, new_masses, new_dullness, new_otherabdomen, new_respiratory_rate, new_chest_wall_deformities, new_other_lung_expansion, new_respiratory_scars, new_other_detail, new_breath_sound, new_vocal_resonance, new_percussion_note_val, new_other_resp, new_height, new_weight, new_current_problems, new_past_problems, new_mx, new_system);
    }else{
        msg = "Patient data update query did not executed";
    }
    return msg;

}

}
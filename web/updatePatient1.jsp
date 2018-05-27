<%-- 
    Document   : updatePatient1
    Created on : Apr 28, 2018, 10:01:41 AM
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
</head>
<script>
    function myFunction() {
    alert(<% request.getParameter("msg");%>);
}
</script>
<body>
    <div id="wrapper">
		
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>

	<div id="contentwrap">
            <div id="content">
                <div class="form">
                    <form  method="POST" action="UpdatePatient" >
                        <div class="form_description">
				<h2>  Update Patient</h2>
				<p>Use This Form To Update A  Patient</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul >
                                    <li>
                                        <input  type="hidden" name="low" value="<%
                                                try {
                                                        int low = Integer.parseInt(request.getParameter("low"));
                                                        out.print(low);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="index" value="<%
                                                try {
                                                        int index = Integer.parseInt(request.getParameter("index"));
                                                        out.print(index);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="begin" value="<%
                                                try {
                                                        int begin = Integer.parseInt(request.getParameter("begin"));
                                                        out.print(begin);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="start" value="<%
                                                try {
                                                        int start = Integer.parseInt(request.getParameter("start"));
                                                        out.print(start);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
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
                                                        out.print( type);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="organ" value="<%
                                                try {
                                                        String organ = request.getParameter("organ");
                                                        out.print( organ);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="currentAge" value="<%
                                                try {
                                                        int currentAge = Integer.parseInt(request.getParameter("age"));
                                                        out.print( currentAge);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <%
                                    try {
                                                        String type = request.getParameter("type");
                                                       // out.print( type);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                    
                                    %>
                                    <li>
					<label class="description">Name </label>
                                            <span>
					<%
                                                try {
                                                        String initials = request.getParameter("initials");
                                                        out.print(initials);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %><label for="street">FirstName</label>
                                            </span>
                                            <span>
					<%
                                                try {
                                                        String surname = request.getParameter("surname");
                                                        out.print(surname);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %>
                                                <label for="street">Surname</label>
                                            </span>
                                    </li>
                                    <li style="height:15px;" ></li>
                                    <li >
                                        <label class="description">Gender </label>
                                        <%
                                                try {
                                                        String gender = request.getParameter("gender");
                                                        out.print(gender);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %>
                                    </li>
                                
                                    <li style="height:15px;" > </li> 
                                    <li>
                                        <label class="description" for="birthday">Birthday</label>
                                        <%
                                                try {
                                                        String birthday = request.getParameter("birthday");
                                                        out.print(birthday);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %>
                                    </li>
                                    <li style="height:15px;" > </li>
                                    <li>
					<label class="description" for="age">Age</label>
                                        <input id="age" type="text" class="large text" name="age" value="<%
                                                try {
                                                        String age = request.getParameter("age");
                                                        out.print(age);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" pattern="[0-9]">
                                    </li>
                                    <li style="height:40px;" > </li> 
                                    
                                </ul>
                            <ul style = 'border: 1px solid gray; width: 450px'>
                                <li><label class="description" for="parentOrguardian"><center>Parent / Guardian  Details</center></label></li>
                                    <li style="height:15px;" > </li>
                                    <li>
                                        <label class="description">Parent / Guardian</label>
                                            <%
                                                try {
                                                        String parentOrguardian = request.getParameter("parentOrguardian");
                                                        out.print(parentOrguardian);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %>
                                    </li>
                                
                                    <li style="height:15px;" ></li>
                                    <li>
                                        <label class="description" for="guard">Name of the Parent/Guardian</label></li>
                                        <%
                                                try {
                                                        String guard = request.getParameter("guard");
                                                        out.print(guard);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %>
                                    <li>
					<label class="description" for="id">Parent's/Guardian's NIC Number</label>
                                        <%
                                                try {
                                                        String id = request.getParameter("id");
                                                        out.print(id);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                        %>
                                    </li>
                                    <li>
                                        <label class="description" for="tel_no">Tel No</label>
                                        <input id="tel_no" type="text" class="large text" name="tel_no" value="<%
                                                try {
                                                        String tel_no = request.getParameter("tel_no");
                                                        out.print(tel_no);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" pattern="[0-9]{10}">
                                    </li>
                                </ul>
                                <ul>
        			</ul>
                            </div>
                            


                    <table>
                        <li style="height:15px;" > </li>
                        
                        <li style="border:1px solid gray;width:360px ">
                                <label id = "systemcheck" class="description">System Type</label>
                                    <span>
                                        <%
                                                try {
                                                        int num = Integer.parseInt(request.getParameter("num"));
                                                        PatientRepositoty patientRepositoty = new PatientRepositoty();
                                                        List<String> patientList = patientRepositoty.getOrganTypesForUpdatePanel(num);
                                                        
                                                                for(String organ : patientList) {
                                                                out.println(organ);
                                                                out.print("</br>");
        }
                                                        
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                                    </span>
                        </li>
		
			<li>
                            <label class="description" for="diagnosis">Diagnosis</label>
                            <textarea rows="4" cols="50" name="diagnosis"  required="required" placeholder="Enter Diagnosis Here...(Max 200 Characters)" maxlength="200"><%
                                                try {
                                                        String diagnosis = request.getParameter("diagnosis");
                                                        out.print(diagnosis);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>

			<li>
                            <label class="description" for="p_co">P:Co</label>
                            <textarea rows="4" cols="50" name="p_co" required="required" placeholder="Enter p:co Here...(Max 300 Characters)" maxlength="300"><%
                                                try {
                                                        String p_co = request.getParameter("p_co");
                                                        out.print(p_co);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
                        <li>
                            <label class="description" for="hx_p_co">Hx Of P:Co</label>
                            <textarea name="hx_p_co" rows="10" cols="50" required="required" placeholder="Enter Hx P:Co Here...(Max 1500 Characters)" maxlength="1500" ><%
                                                try {
                                                        String hx_p_co = request.getParameter("hx_p_co");
                                                        out.print(hx_p_co);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="pmhx">PMHx</label>
                            <textarea name="pmhx" rows="10" cols="50" required="required" placeholder="Enter PMHx Here...(Max 1000 Characters)" maxlength="1000"><%
                                                try {
                                                        String pmhx = request.getParameter("pmhx");
                                                        out.print(pmhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="pshx">PSHx</label>
                            <textarea name="pshx" rows="10" cols="50" required="required" placeholder="Enter PSHx Here...(Max 750 Characters)" maxlength="750"><%
                                                try {
                                                        String pshx = request.getParameter("pshx");
                                                        out.print(pshx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="aihx">AIHx</label>
                            <textarea name="aihx" rows="10" cols="50" required="required" placeholder="Enter AIHx Here...(Max 300 Characters)" maxlength="300"><%
                                                try {
                                                        String aihx = request.getParameter("aihx");
                                                        out.print(aihx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="drughx">Drug Hx</label>
				 <textarea name="drughx" rows="10" cols="50" required="required" Placeholder="Enter Drug Hx Here...(Max 1000 Characters)" maxlength="1000" ><%
                                                try {
                                                        String drughx = request.getParameter("drughx");
                                                        out.print(drughx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="immunizationhx">Immunization Hx</label>
                            <textarea name="immunizationhx" rows="10" cols="50" required="required" placeholder="Enter Immunization Hx Here...(Max 500 Characters)" maxlength="500"><%
                                                try {
                                                        String immunizationhx = request.getParameter("immunizationhx");
                                                        out.print(immunizationhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="socialhx">Social Hx</label>
                            <textarea name="socialhx" rows="10" cols="50" required="required" placeholder="Enter Social Hx Here...(Max 1000 Characters)" maxlength="1000"><%
                                                try {
                                                        String socialhx = request.getParameter("socialhx");
                                                        out.print(socialhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
					<label class="description" for="familyhx">Family Hx</label>
                                        <textarea name="familyhx" rows="10" cols="50" required="required" placeholder="Enter Family Hx Here...(Max 500 Characters)" maxlength="500"><%
                                                try {
                                                        String familyhx = request.getParameter("familyhx");
                                                        out.print(familyhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
                </table>
                    
                    <li style="height:30px"></li>
                    
                    <ul style = 'border: 1px solid gray; width: 450px'>
                        <middle><label class="description" >General Examination </label></middle>
                        <li style="height: 30px"></li>
                        <table>
                            <tr><td><li style="width: 5px"></li></td><td>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Active</label>
                                    <%
                                                try {
                                                        String active = request.getParameter("active");
                                                        out.print(active);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Alert</label>
                                    <%
                                                try {
                                                        String alert = request.getParameter("alert");
                                                        out.print(alert);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Dehydrated</label>
                                    <%
                                                try {
                                                        String dehydrated = request.getParameter("dehydrated");
                                                        out.print(dehydrated);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Pallor</label>
                                    <%
                                                try {
                                                        String pallor = request.getParameter("pallor");
                                                        out.print(pallor);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Ill-Looking</label>
                                    <%
                                        try {
                                            String ill = request.getParameter("ill");
                                            out.print(ill);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Icteric</label>
                                    <%
                                        try {
                                            String icteric = request.getParameter("icteric");
                                            out.print(icteric);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Growth</label>
                                    <%
                                        try {
                                            String growth = request.getParameter("growth");
                                            out.print(growth);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Cyanois</label>
                                    <%
                                        try {
                                            String cyanois = request.getParameter("cyanois");
                                            out.print(cyanois);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li></td></tr>
                            </table>
                            <li style="height:10px"></li>
                            <li>
                                <span><label class="description" for="spo2" style="width: 100px">Spo2</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="spo2" style="width: 400px" maxlength="3" value="<%
                                        try {
                                            String spo2 = request.getParameter("spo2");
                                            out.print(spo2);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>"/></span>
                            </li>
                            <li style="height:10px"></li>
                            <li style="border:1px solid gray;width:360px ">
                                <label id = "distress_check" class="description">Respiratory Distress</label>
                                    <%
                                                try {
                                                        int num = Integer.parseInt(request.getParameter("num"));
                                                        PatientRepositoty patientRepositoty = new PatientRepositoty();
                                                        String table = "respiratoryDistress";
                                                        List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                                                for(String organ : patientList) {
                                                                out.println(organ);
                                                                out.print("</br>");
        }
                                                        
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                            </li>
                            <li style="height:10px"></li>
                            <li>
                                <span><label class="description" for="pob" style="width: 300px">Pattern Of Breathing</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="pob" style="width: 400px" value="<%
                                        try {
                                            String pob = request.getParameter("pob");
                                            out.print(pob);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>"  maxlength="10"/></span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Clubbing</label>
                                    <%
                                        try {
                                            String clubbing = request.getParameter("clubbing");
                                            out.print(clubbing);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style="border:1px solid gray;width:360px ">
                                <table>
                                    <tr>
                                        <td>
                                            <div>
                                            <label id = "oedema_check" class="description">Oedema</label>
                                            <%
                                                try {
                                                        int num = Integer.parseInt(request.getParameter("num"));
                                                        PatientRepositoty patientRepositoty = new PatientRepositoty();
                                                        String table = "oedema";
                                                        List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                                                for(String organ : patientList) {
                                                                out.println(organ);
                                                                out.print("</br>");
        }
                                                        
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="width: 40px"></div>
                                        </td>
                                        <td>
                                            <div>
                                            <span>
                                                <label for="street">Pitting / Non Pitting</label>
                                            </span>
                                                <span style="width: 20px"></span>
                                            <span>
                                                <%
                                                    try {
                                                            String pitting = request.getParameter("pitting");
                                                            out.print(pitting);
                                                     
                                                        } catch (Exception e) {
                                                            e.printStackTrace();
                                                        }
                                    %>
                                            </span> 
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Abnormal Movements</label>
                                    <%
                                        try {
                                            String ab_movement = request.getParameter("ab_movement");
                                            out.print(ab_movement);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Muscle Wasting</label>
                                    <%
                                        try {
                                            String muscle_w = request.getParameter("muscle_w");
                                            out.print(muscle_w);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Strabismus</label>
                                    <%
                                        try {
                                            String strabismus = request.getParameter("strabismus");
                                            out.print(strabismus);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>
                            </li>
                            <li style="height:10px"></li>
                            <li>
                                <span><label class="description" for="gait" style="width: 300px">Gait</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="gait" style="width: 400px"  maxlength="40" value="<%
                                        try {
                                            String gait = request.getParameter("gait");
                                            out.print(gait);
                                                     
                                            } catch (Exception e) {
                                            e.printStackTrace();
                                            }
                                    %>"/></span>
                            </li>
                            <li style="height:10px"></li>
                            <li style="border:1px solid gray;width:360px ">
                                <table>
                                    <tr>
                                        <td>
                                            <div>
                                            <label id = "lymphadenopathy_check" class="description">Lymphadenopathy</label>
                                            <%
                                                try {
                                                        int num = Integer.parseInt(request.getParameter("num"));
                                                        PatientRepositoty patientRepositoty = new PatientRepositoty();
                                                        String table = "lymphadenopathy";
                                                        List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                                                for(String organ : patientList) {
                                                                out.println(organ);
                                                                out.print("</br>");
        }
                                                        
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                                            
                                            </div>
                                        </td>
                                        <td>
                                            <div style="width: 40px"></div>
                                        </td>
                                        <td>
                                            <div>
                                            <label id = "tenderness_check" class="description">Tenderness</label>
                                                <%
                                                    try {
                                                        String tenderness = request.getParameter("tenderness");
                                                        out.print(tenderness);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %> 
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            
                                <span><label class="description" for="others" style="width: 300px"> If Other</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="others" style="width: 350px" maxlength="40" value="<%
                                                    try {
                                                        String others = request.getParameter("others");
                                                        out.print(others);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span>
                            
                            </li>
                            <li style="height:10px"></li>
                            <li>
					<label class="description" for="other">Other</label>
                                        <textarea name="other" rows="10" cols="50"  placeholder="Enter other examinations Here...(Max 200 Characters)" maxlength="200"><%
                                                    try {
                                                        String other = request.getParameter("other");
                                                        out.print(other);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %></textarea>
                            </li>
                            <li style="height:10px"></li>
                    </ul>
                <li style="height:30px"></li>
                
                
                
                
                
                
                
            <ul style = 'border: 1px solid gray; width: 450px'>
                <middle><label class="description" >CVS</label></middle>
                    <li style="height: 30px"></li>
                <li style = 'border: 1px solid gray; width: 200px' >
                    <label class="description">Cayanosis</label>
                        <%
                            try {
                                String cayanosis_cvs = request.getParameter("cayanosis_cvs");
                                out.print(cayanosis_cvs);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                        %>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <span><label class="description" for="blood" style="width: 100px">Blood Pressure</label></span>
                    <span><div style="width: 30px"></div></span>
                    <span><input type="text" name="blood_high" style="width: 200px" maxlength="3" value="<%
                                                    try {
                                                        String blood_high = request.getParameter("blood_high");
                                                        out.print(blood_high);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span>
                </li>
                <li>
                    <span><label class="description" for="blood" style="width: 100px"></label></span>
                    <span><div style="width: 30px"></div></span>
                    <span><input type="text" name="blood_low" style="width: 200px" maxlength="3" value="<%
                                                    try {
                                                        String blood_low = request.getParameter("blood_low");
                                                        out.print(blood_low);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span>
                </li>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 400px'>
                    
                    <li>
                        <span><label class="description" for="pulse" style="width: 100px">Pulse Rate</label></span>
                        <span><div style="width: 30px"></div></span>
                        <span><input type="text" name="pulse" style="width: 200px" maxlength="3" value="<%
                                                    try {
                                                        String pulse = request.getParameter("pulse");
                                                        out.print(pulse);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span>
                    </li>
                    <li>
                        <label class="description">Volume</label>
                        <%
                            try {
                                String volume = request.getParameter("volume");
                                out.print(volume);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %>
                    </li>
                    <li>
                        <span><label class="description" for="characterr" style="width: 100px">Character</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="characterr" style="width: 200px"  maxlength="30" value="<%
                                                    try {
                                                        String characterr = request.getParameter("characterr");
                                                        out.print(characterr);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span>
                    </li>
                    <li>
                        <span><label class="description" for="rhythm" style="width: 100px">Rhythm</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="rhythm" style="width: 200px"  maxlength="30" value="<%
                                                    try {
                                                        String rhythm = request.getParameter("rhythm");
                                                        out.print(rhythm);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span> 
                    </li>
                </ul>
                <li style="height: 30px"></li>
                    <li>
                        <span><label class="description" for="jvp" style="width: 100px">JVP</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="jvp" style="width: 200px"  maxlength="20" value="<%
                                                    try {
                                                        String jvp = request.getParameter("jvp");
                                                        out.print(jvp);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span> 
                    </li>
                <li style="height: 30px"></li>
                <li style = 'border: 1px solid gray; width: 200px' >
                    <label class="description">CRFT</label>
                        <span>
                        
                        <%
                            try {
                                String crft = request.getParameter("crft");
                                out.print(crft);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                        %>
                </li>
                <li style="height: 30px"></li>
                <li style = 'border: 1px solid gray; width: 200px' >
                    <label class="description">Peripheral</label>
                        <%
                            try {
                                String peripheral = request.getParameter("peripheral");
                                out.print(peripheral);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                        %>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <span><label class="description" for="precordium_scars" style="width: 100px">Precordium  scars</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="precordium_scars" style="width: 200px"  maxlength="50" value="<%
                                                    try {
                                                        String precordium_scars = request.getParameter("precordium_scars");
                                                        out.print(precordium_scars);

                                                        } catch (Exception e) {
                                                        e.printStackTrace();
                                                        }
                                                %>"/></span> 
                </li>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 350px' >
                <li>
                    <label class="description">Chest Wall Deformalities</label>
                        
                            <%
                                try {
                                    String deformalities = request.getParameter("deformalities");
                                    out.print(deformalities);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>
                </li>
                <li style="height: 10px"></li>
                <li>
                    <span><label class="description" for="deformalities_val" style="width: 100px">If yes</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="deformalities_val" style="width: 200px"  maxlength="50" value="<%
                                try {
                                    String deformalities_val = request.getParameter("deformalities_val");
                                    out.print(deformalities_val);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>"/></span> 
                </li>
                </ul>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 350px' >
                <li>
                    <label class="description">Visible Pulsation</label>
                            <%
                                try {
                                    String pulsation = request.getParameter("pulsation");
                                    out.print(pulsation);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>
                </li>
                <li style="height: 10px"></li>
                <li>
                    <span><label class="description" for="pulsation_val" style="width: 100px">If yes</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="pulsation_val" style="width: 200px"  maxlength="50" value="<%
                                try {
                                    String pulsation_val = request.getParameter("pulsation_val");
                                    out.print(pulsation_val);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>"/></span> 
                </li>

                </ul>
                <li style="height: 30px"></li>
                <li>
                    <span><label class="description" for="apex_beat" style="width: 100px">Apex Beat</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="apex_beat" style="width: 200px"  maxlength="50" value="<%
                                try {
                                    String apex_beat = request.getParameter("apex_beat");
                                    out.print(apex_beat);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>"/></span> 
                </li>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 350px' >
                <li>
                    <label class="description">Dual Rhythm</label>
                        
                            <%
                                try {
                                    String dual_rhythm = request.getParameter("dual_rhythm");
                                    out.print(dual_rhythm);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <label class="description">3rd Heart Sound</label>
                            <%
                                try {
                                    String hsound = request.getParameter("3hsound");
                                    out.print(hsound);

                                    } catch (Exception e) {
                                    e.printStackTrace();
                                    }
                            %>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <label class="description">4th Heart Sound</label>
                        <%
                            try {
                                String fhsound = request.getParameter("4hsound");
                                out.print(fhsound);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                        %>
                </li>
                </ul>
                <li style="height: 30px"></li>
		<li>
                    <label class="description" for="murmurs">Murmurs</label>
                    <textarea name="murmurs" rows="10" cols="50"  placeholder="Max 200 Characters" maxlength="200"><%
                            try {
                                String murmurs = request.getParameter("murmurs");
                                out.print(murmurs);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                        %></textarea>
		</li>
                <li>
                    <label class="description" for="othercvs">Other</label>
                    <textarea name="othercvs" rows="10" cols="50"  placeholder="Max 200 Characters" maxlength="200"><%
                            try {
                                String othercvs = request.getParameter("othercvs");
                                out.print(othercvs);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                        %></textarea>
		</li>
                <li style="height: 30px"></li>
                
                </ul>
                
                
                <li style="height:30px"></li>
                
                
                
                
                
                
                <ul style = 'border: 1px solid gray; width: 450px'>
                    <middle><label class="description" >Abdomen</label></middle>
                    <li style="height: 30px"></li>
                    <li>
                        <label class="description">Distended</label>
                            <%
                            try {
                                String distended = request.getParameter("distended");
                                out.print(distended);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Scars</label>
                            <%
                            try {
                                String scars = request.getParameter("scars");
                                out.print(scars);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="scars_val">If Yes</label>
                        <textarea name="scars_val" rows="5" cols="35"  placeholder="Max 80 Characters" maxlength="80"><%
                            try {
                                String scars_val = request.getParameter("scars_val");
                                out.print(scars_val);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:30px"></li>
                    </ul>
                    <li>
                        <label class="description">Visible Bowel Movements</label>
                            <%
                            try {
                                String vbmovements = request.getParameter("vbmovements");
                                out.print(vbmovements);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height: 20px"></li>
                    <li>
                        <label class="description">Dilated Vessels</label>
                            <%
                            try {
                                String dvessels = request.getParameter("dvessels");
                                out.print(dvessels);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height: 20px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Palpation</label>
                            <span>
                            <%
                            try {
                                String palpation = request.getParameter("palpation");
                                out.print(palpation);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                            </span>
                                <span style="width: 100px"></span>
                            <span>
                                <img src="img/abd.png" height="140" width="140" />
                            </span>
                    </li>
                    <li style="height: 5px"></li>
                    <label class="description">Area</label>
                    <li style="height: 10px"></li>
                    <li>
                        <%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                String table = "palpationArea";
                                List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
        }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %>
                        
                    
                    <li style="height:5px"></li>
                    </ul>
                    <li style="height:30px"></li>
                    <li>
                        <label class="description" for="liver">Liver</label>
                        <textarea name="liver" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"><%
                            try {
                                String liver = request.getParameter("liver");
                                out.print(liver);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li>
                        <label class="description" for="spleen">Spleen</label>
                        <textarea name="spleen" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"><%
                            try {
                                String spleen = request.getParameter("spleen");
                                out.print(spleen);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li>
                        <label class="description" for="masses">Masses</label>
                        <textarea name="masses" rows="5" cols="35"  placeholder="Max 150 Characters" maxlength="150"><%
                            try {
                                String masses = request.getParameter("masses");
                                out.print(masses);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:30px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Kidney</label>
                            <%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                String table = "kidnySides";
                                List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
        }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="ballotable">Ballotable</label>
                            <%
                            try {
                                String ballotable = request.getParameter("ballotable");
                                out.print(ballotable);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    </ul>
                    <li style="height:30px"></li>
                    <li>
                        <label class="description" for="free_fluid">Free Fluid</label>
                            <%
                            try {
                                String free_fluid = request.getParameter("free_fluid");
                                out.print(free_fluid);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height:20px"></li>
                    <li>
                        <label class="description" for="dullness">Dullness</label>
                        <textarea name="dullness" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50" ><%
                            try {
                                String dullness = request.getParameter("dullness");
                                out.print(dullness);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:20px"></li>
                    <li>
                        <label class="description" for="bowel_sounds">Bowel Sounds</label>
                            <%
                            try {
                                String bowel_sounds = request.getParameter("bowel_sounds");
                                out.print(bowel_sounds);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height:20px"></li>
                    <li>
                        <label class="description" for="otherabdomen">Other</label>
                        <textarea name="otherabdomen" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"><%
                            try {
                                String otherabdomen = request.getParameter("otherabdomen");
                                out.print(otherabdomen);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:30px"></li>
                </ul>
                <li style="height:30px"></li>
                
                
                
                
                
                
                <ul style = 'border: 1px solid gray; width: 450px'>
                    <middle><label class="description" >Respiratory</label></middle>
                    <li style="height: 30px"></li>
                    
                    <li>
                        <span><label class="description" for="respiratory_rate" style="width: 100px">Respiratory Rate</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="respiratory_rate" style="width: 200px"  maxlength="2" value="<%
                            try {
                                String respiratory_rate = request.getParameter("respiratory_rate");
                                out.print(respiratory_rate);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>"/></span> 
                    </li>
                    <li>
                        <label class="description" for="bcg_scar">BCG Scar</label>
                            <%
                            try {
                                String bcg_scar = request.getParameter("bcg_scar");
                                out.print(bcg_scar);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li>
                        <span><label class="description" for="chest_wall_deformities" style="width: 100px">Chest Wall Deformities</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="chest_wall_deformities" style="width: 200px" maxlength="6" value="<%
                            try {
                                String chest_wall_deformities = request.getParameter("chest_wall_deformities");
                                out.print(chest_wall_deformities);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>"/></span> 
                    </li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Lung Expansion</label>
                            <%
                            try {
                                String lung_expansion = request.getParameter("lung_expansion");
                                out.print(lung_expansion);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="other_lung_expansion">If Other</label>
                        <textarea name="other_lung_expansion" rows="5" cols="35"  placeholder="Max 50 Characters" maxlength="50"><%
                            try {
                                String other_lung_expansion = request.getParameter("other_lung_expansion");
                                out.print(other_lung_expansion);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:30px"></li>
                    </ul>
                    <li>
                        <label class="description" for="respiratory_scars">Respiratory Scars</label>
                        <textarea name="respiratory_scars" rows="5" cols="35"  placeholder="Max 100 Characters" maxlength="100"><%
                            try {
                                String respiratory_scars = request.getParameter("respiratory_scars");
                                out.print(respiratory_scars);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:30px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description" style="height:40px ">Air Entry</label>
                            <span>
                            <%
                            try {
                                String air_entry = request.getParameter("air_entry");
                                out.print(air_entry);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                            </span>
                                <span style="width: 60px"></span>
                            <span>
                                <img src="img/resp.png" height="140" width="140" />
                            </span>
                    </li>
                    <li style="height: 5px"></li>
                    <label class="description">If Low , Low In</label>
                    <li style="height: 4px"></li>
                    <li>
                        <%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                String table = "airEntry";
                                List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
                                }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %>
                        
                        
                    
                    <li style="height:20px"></li>
                    <li style = 'border: 1px solid gray; width: 300px'>
                        <label class="description">VB</label>
                            <%
                            try {
                                String vb = request.getParameter("vb");
                                out.print(vb);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height:20px"></li>
                    <li style = 'border: 1px solid gray; width: 300px'>
                        <label class="description">BB</label>
                            <%
                            try {
                                String bb = request.getParameter("bb");
                                out.print(bb);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height:20px"></li>
                    </ul>
                    <li style="height:20px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px'>
                        <li style="height:10px"></li>
                        <label class="description">Added Sounds</label>
                        <li style="height:10px"></li>
                        <ul style = 'border: 1px solid gray; width: 300px' >
                        <li>
                            <label class="description">Rhonchi</label>
                                <%
                            try {
                                String rhonchi = request.getParameter("rhonchi");
                                out.print(rhonchi);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                        </li>
                    <li style="height: 5px"></li>
                    <label class="description">If yes :      Area</label>
                    <li style="height: 10px"></li>
                    <li>
                        <%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                String table = "addedSoundsRhonchi";
                                List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
                                }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %>
                    
                    <li style="height:5px"></li>
                    </ul>
                        <li style="height:20px"></li>
                    <ul style = 'border: 1px solid gray; width: 300px' >
                        <li>
                            <label class="description">Crepts</label>
                            <%
                            try {
                                String crepts = request.getParameter("crepts");
                                out.print(crepts);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                        </li>
                    <li style="height: 5px"></li>
                    <label class="description">If yes :      Area</label>
                    <li style="height: 10px"></li>
                    <li>
                        <%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                String table = "addedSoundsCrepts";
                                List<String> patientList = patientRepositoty.getMultipleValuesForUpdatePanel(table,num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
                                }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %>
                        
                    
                    
                    </ul>
                    <li style="height:5px"></li>
                    </ul>
                    <li>
                        <label class="description">Pleural Rub</label>
                            <%
                            try {
                                String pleural = request.getParameter("pleural");
                                out.print(pleural);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li>
                        <label class="description" for="other_detail">Other Details</label>
                        <textarea name="other_detail" rows="2" cols="35"   maxlength="100"><%
                            try {
                                String other_detail = request.getParameter("other_detail");
                                out.print(other_detail);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li>
                        <label class="description" for="breath_sound">Breath Sound</label>
                        <textarea name="breath_sound" rows="2" cols="35"  maxlength="50"><%
                            try {
                                String breath_sound = request.getParameter("breath_sound");
                                out.print(breath_sound);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li>
                        <label class="description" for="vocal_resonance">Vocal Resonance</label>
                        <textarea name="vocal_resonance" rows="2" cols="35"  maxlength="50"><%
                            try {
                                String vocal_resonance = request.getParameter("vocal_resonance");
                                out.print(vocal_resonance);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height: 20px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Percussion Note</label>
                            <%
                            try {
                                String percussion_note = request.getParameter("percussion_note");
                                out.print(percussion_note);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="percussion_note_val">If   "Hyperresonant"   or  "Dull"</label>
                        <textarea name="percussion_note_val" rows="2" cols="35"  maxlength="20"><%
                            try {
                                String percussion_note_val = request.getParameter("percussion_note_val");
                                out.print(percussion_note_val);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>
                    <li style="height:5px"></li>
                    </ul>
                    <li style="height:30px"></li>
                    <li>
                        <label class="description" for="other_resp">Other</label>
                        <textarea name="other_resp" rows="5" cols="35"   maxlength="200"><%
                            try {
                                String other_resp = request.getParameter("other_resp");
                                out.print(other_resp);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                    </li>    
                    <li style="height:30px"></li>
                </ul>
                
                
                
                
                
                
                
                
                
                
                <table >           
                        <li style="height:30px"></li>
                        <li>
                                <label class="description" for="height">Height</label>
                                <div><input type="text" name="height" maxlength="6" value="<%
                            try {
                                String height = request.getParameter("height");
                                out.print(height);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>"/></div>
                        </li>
                        <li>
				<label class="description" for="weight">Weight</label>
                                <div><input type="text" name="weight" maxlength="6" value="<%
                            try {
                                String weight = request.getParameter("weight");
                                out.print(weight);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %>"/></div>
                        </li>
                </table>
                            
       
 

        <li style="height:40px"></li>  
        
        <ul style="border: 1px solid gray; width: 750px">
            <label class="description"><center>Problems</center> </label>
            <li style="height: 30px"></li>
                <li>
                    <span>
                        <label class="description" for="current_problems" >Current Problems</label>
                        <textarea name="current_problems" rows="15" cols="40"  maxlength="500" ><%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                List<String> patientList = patientRepositoty.getCurrentProblemValuesForUpdatePanel(num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
                                }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %></textarea>
                    </span>
                    <span>
                        <label class="description" for="past_problems" >Chronic / Past Problems</label>
                        <textarea name="past_problems" rows="15" cols="40"   maxlength="500" ><%
                            try {
                                int num = Integer.parseInt(request.getParameter("num"));
                                PatientRepositoty patientRepositoty = new PatientRepositoty();
                                List<String> patientList = patientRepositoty.getPastProblemValuesForUpdatePanel(num);
                                                        
                                    for(String organ : patientList) {
                                        out.println(organ);
                                        out.print("</br>");
                                }
                                                        
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                        %></textarea>
                    </span>
                </li>
            
        </ul>
        
        <ul style="border: 1px solid gray">
            
        </ul>
                            
                <ul>
                        
                        <li>
                            <label class="description" for="mx">Mx</label>
				<textarea rows="20" cols="50" name="mx"  maxlength="2000"><%
                            try {
                                String mx = request.getParameter("mx");
                                out.print(mx);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>	
			</li>
                        
                        <li style="height:40px"></li>
                        
                        <div style="border:1px solid gray;width:500px ">
                            <label id = "systemcheck" class="description">Changes</label>
				<span>
                                    <li>
					<label class="description" for="system">Current Updates</label>
                                            <textarea name="system" rows="20" cols="50"  maxlength="2000" ><%
                            try {
                                String system = request.getParameter("system");
                                out.print(system);

                                } catch (Exception e) {
                                e.printStackTrace();
                                }
                            %></textarea>
                                    </li>

                                </span>
			</div>
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
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>



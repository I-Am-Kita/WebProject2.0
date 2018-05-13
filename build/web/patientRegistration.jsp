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
                    <form  method="POST" action="RegisterPatient" >
                        <div class="form_description">
				<h2>  Patient Registration</h2>
				<p>Use This Form To Register A New Patient</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul >
                                    <li>
					<label class="description">Name </label>
                                            <span>
						<input name= "initials" class="text" maxlength="45" size="10" value="" required="required"  pattern="[A-Za-z]+"/>
						<label for="street">First</label>
                                            </span>
                                            <span>
						<input name= "surname" class="text" maxlength="45" size="26" value="" required="required" pattern="[A-Za-z]+" />
						<label for="street">Surname</label>
                                            </span>
                                    </li>
                                    <li style="height:15px;" ></li>
                                    <li >
                                        <label class="description">Gender </label>
                                            <span>
						<input type="radio" name="gender" value="Male" checked />
						<label for="street">Male</label>
                                            </span>
                                        <span style="width: 20px"> 
						
                                            </span>
                                            <span>
						<input type="radio" name="gender" value="Female" />
						<label for="street">Female</label>
                                            </span>
                                    </li>
                                
                                    <li style="height:15px;" > </li> 
                                    <li>
                                        <input type="date" name="birthday"  />
                                        <label class="description" for="birthday">Birthday</label>
                                    </li>
                                    <li style="height:15px;" > </li>
                                    <li>
                                        <div><input type="number" name="age" maxlength="2"/></div>
					<label class="description" for="age">Age</label>
                                    </li>
                                    <li style="height:40px;" > </li> 
                                    
                                </ul>
                            <ul style = 'border: 1px solid gray; width: 450px'>
                                <li><label class="description" for="parentOrguardian"><center>Parent / Guardian  Details</center></label></li>
                                    <li style="height:15px;" > </li>
                                    <li>
                                        <label class="description">Parent / Guardian</label>
                                            <span>
						<input type="radio" name="parentOrguardian" value="Parent" checked />
						<label for="street">Parent</label>
                                            </span>
                                        <span style="width: 20px"> 
						
                                            </span>
                                            <span>
						<input type="radio" name="parentOrguardian" value="Guardian" />
						<label for="street">Guardian</label>
                                            </span>
                                    </li>
                                
                                    <li style="height:15px;" ></li>
                                    <li>
                                        <label class="description" for="guard">Name of the Parent/Guardian</label>
                                        <textarea name="guard" rows="1" cols="50" required="required"  placeholder="Name of the Guardian" maxlength="45"></textarea>
                                    </li>
                                    <li>
					<label class="description" for="id">Parent's/Guardian's NIC Number</label>
        				<div><input type="text" name="id" pattern="[0-9]{9}" placeholder="NIC Without V" /></div>
                                    </li>
                                    <li>
                                        <label class="description" for="tel_no">Tel No</label>
                                        <div><input type="text" id="tel_no" class="large text" name="tel_no" style="width:420px" required="required"  pattern="[0-9]{10}"></div>
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
                                        <input  name="o_type" class="checkbox" type="checkbox" value="cardiovascularSystem" />
                                            <label class="choice" for="o_type">Cardiovascular System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="respiratorySystem" />
                                            <label class="choice" for="o_type">Respiratory System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="endocrineSystem" />
                                            <label class="choice" for="o_type">Endocrine System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="urinarySystem" />
                                            <label class="choice" for="o_type">Urinary System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="reproductiveSystem" />
                                            <label class="choice" for="o_type">Reproductive System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="nervousSystem" />
                                            <label class="choice" for="o_type">Nervous System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="gastrointestinalSystem" />
                                            <label class="choice" for="o_type">Gastrointestinal System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="musculoskeletalSystem" />
                                            <label class="choice" for="o_type">Musculoskeletal System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="dermatologySystem" />
                                            <label class="choice" for="o_type">Dermatological Conditions</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="psychiatry" />
                                            <label class="choice" for="o_type">Psychiatry</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="nutrition" />
                                            <label class="choice" for="o_type">Nutrition</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="syndromes" />
                                            <label class="choice" for="o_type">Syndromes</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="infections" />
                                            <label class="choice" for="o_type">Infections</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="haematology" />
                                            <label class="choice" for="o_type">Haematology</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="cancers" />
                                            <label class="choice" for="o_type">Cancers</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="eye&ent" />
                                            <label class="choice" for="o_type">Eye & ENT</label>

                                    </span>
                        </li>
		
			<li>
                            <label class="description" for="diagnosis">Diagnosis</label>
                            <textarea rows="4" cols="50" name="diagnosis"  required="required" placeholder="Enter Diagnosis Here...(Max 200 Characters)" maxlength="200"></textarea>
			</li>

			<li>
                            <label class="description" for="p_co">P:Co</label>
                            <textarea rows="4" cols="50" name="p_co" required="required" placeholder="Enter p:co Here...(Max 300 Characters)" maxlength="300"></textarea>
			</li>
                        <li>
                            <label class="description" for="hx_p_co">Hx Of P:Co</label>
                            <textarea name="hx_p_co" rows="10" cols="50" required="required" placeholder="Enter Hx P:Co Here...(Max 1500 Characters)" maxlength="1500" ></textarea>
			</li>
			<li>
                            <label class="description" for="pmhx">PMHx</label>
                            <textarea name="pmhx" rows="10" cols="50" required="required" placeholder="Enter PMHx Here...(Max 1000 Characters)" maxlength="1000"></textarea>
			</li>
			<li>
                            <label class="description" for="pshx">PSHx</label>
                            <textarea name="pshx" rows="10" cols="50" required="required" placeholder="Enter PSHx Here...(Max 750 Characters)" maxlength="750"></textarea>
			</li>
			<li>
                            <label class="description" for="aihx">AIHx</label>
                            <textarea name="aihx" rows="10" cols="50" required="required" placeholder="Enter AIHx Here...(Max 300 Characters)" maxlength="300"></textarea>
			</li>
			<li>
                            <label class="description" for="drughx">Drug Hx</label>
				 <textarea name="drughx" rows="10" cols="50" required="required" Placeholder="Enter Drug Hx Here...(Max 1000 Characters)" maxlength="1000" ></textarea>
			</li>
			<li>
                            <label class="description" for="immunizationhx">Immunization Hx</label>
                            <textarea name="immunizationhx" rows="10" cols="50" required="required" placeholder="Enter Immunization Hx Here...(Max 500 Characters)" maxlength="500"></textarea>
			</li>
			<li>
                            <label class="description" for="socialhx">Social Hx</label>
                            <textarea name="socialhx" rows="10" cols="50" required="required" placeholder="Enter Social Hx Here...(Max 1000 Characters)" maxlength="1000"></textarea>
			</li>
			<li>
					<label class="description" for="familyhx">Family Hx</label>
                                        <textarea name="familyhx" rows="10" cols="50" required="required" placeholder="Enter Family Hx Here...(Max 500 Characters)" maxlength="500"></textarea>
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
                                    <span>
					<input type="radio" name="active" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="active" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Alert</label>
                                    <span>
					<input type="radio" name="alert" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="alert" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Dehydrated</label>
                                    <span>
					<input type="radio" name="dehydrated" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="dehydrated" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Pallor</label>
                                    <span>
					<input type="radio" name="pallor" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="pallor" value="no" checked  />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Ill-Looking</label>
                                    <span>
					<input type="radio" name="ill" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="ill" value="no" checked  />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Icteric</label>
                                    <span>
					<input type="radio" name="icteric" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="icteric" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Growth</label>
                                    <span>
					<input type="radio" name="growth" value="adequate"/>
					<label for="street">Adequate</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="growth" value="inadequate"/>
					<label for="street">Inadequate</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="growth" value="obese"  checked />
					<label for="street">Obese</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Cyanois</label>
                                    <span>
					<input type="radio" name="cyanois" value="central"/>
					<label for="street">Central</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="cyanois" value="peripheral"  checked />
					<label for="street">Peripheral</label>
                                    </span>
                            </li></td></tr>
                            </table>
                            <li style="height:10px"></li>
                            <li>
                                <span><label class="description" for="spo2" style="width: 100px">Spo2</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="spo2" style="width: 400px" placeholder="Enter Spo2 Here...(Max 3 Characters)" maxlength="3"/></span>
                            </li>
                            <li style="height:10px"></li>
                            <li style="border:1px solid gray;width:360px ">
                                <label id = "distress_check" class="description">Respiratory Distress</label>
                                    <span>
                                        <input  name="r_distress" class="checkbox" type="checkbox" value="alaNasal" />
                                            <label class="choice" for="r_distress">Ala Nasal</label>
                                        <input  name="r_distress" class="checkbox" type="checkbox" value="wheezing" />
                                            <label class="choice" for="r_distress">Wheezing</label>
                                        <input  name="r_distress" class="checkbox" type="checkbox" value="stridor" />
                                            <label class="choice" for="r_distress">Stridor</label>
                                        <input  name="r_distress" class="checkbox" type="checkbox" value="grunting" />
                                            <label class="choice" for="r_distress">Grunting</label>
                                        <input  name="r_distress" class="checkbox" type="checkbox" value="dyspnoeic" />
                                            <label class="choice" for="r_distress">Dyspnoeic</label>
                                       

                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li>
                                <span><label class="description" for="pob" style="width: 300px">Pattern Of Breathing</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="pob" style="width: 400px" placeholder="Pattern Of Breathing...(Max 10 Characters)" maxlength="10"/></span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Clubbing</label>
                                    <span>
					<input type="radio" name="clubbing" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="clubbing" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style="border:1px solid gray;width:360px ">
                                <table>
                                    <tr>
                                        <td>
                                            <div>
                                            <label id = "oedema_check" class="description">Oedema</label>
                                            <span>
                                                <input  name="oedema" class="checkbox" type="checkbox" value="ankle" />
                                                    <label class="choice" for="oedema">Ankle</label>
                                                <input  name="oedema" class="checkbox" type="checkbox" value="sacral" />
                                                    <label class="choice" for="oedema">Sacral</label>
                                                <input  name="oedema" class="checkbox" type="checkbox" value="periOrbital" />
                                                    <label class="choice" for="oedema">Peri Orbital</label>
                                            </span>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="width: 40px"></div>
                                        </td>
                                        <td>
                                            <div>
                                            <span>
                                                <input type="radio" name="pitt" value="pitting"/>
                                                <label for="street">Pitting</label>
                                            </span>
                                                <span style="width: 20px"></span>
                                            <span>
                                                <input type="radio" name="pitt" value="nonPitting"  checked />
                                                <label for="street">Non Pitting</label>
                                            </span> 
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Abnormal Movements</label>
                                    <span>
					<input type="radio" name="ab_movement" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="ab_movement" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Muscle Wasting</label>
                                    <span>
					<input type="radio" name="muscle_w" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="muscle_w" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li style = 'border: 1px solid gray; width: 200px' >
                                <label class="description">Strabismus</label>
                                    <span>
					<input type="radio" name="strabismus" value="yes"/>
					<label for="street">Yes</label>
                                    </span>
                                        <span style="width: 20px"></span>
                                    <span>
					<input type="radio" name="strabismus" value="no"  checked />
					<label for="street">No</label>
                                    </span>
                            </li>
                            <li style="height:10px"></li>
                            <li>
                                <span><label class="description" for="gait" style="width: 300px">Gait</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="gait" style="width: 400px" placeholder="Enter Gait Here...(Max 40 Characters)" maxlength="40"/></span>
                            </li>
                            <li style="height:10px"></li>
                            <li style="border:1px solid gray;width:360px ">
                                <table>
                                    <tr>
                                        <td>
                                            <div>
                                            <label id = "lymphadenopathy_check" class="description">Lymphadenopathy</label>
                                            <span>
                                                <input  name="lymphadenopathy" class="checkbox" type="checkbox" value="cervicle" />
                                                    <label class="choice" for="lymphadenopathy">Cervicle</label>
                                                <input  name="lymphadenopathy" class="checkbox" type="checkbox" value="axillary" />
                                                    <label class="choice" for="lymphadenopathy">Axillary</label>
                                                <input  name="lymphadenopathy" class="checkbox" type="checkbox" value="inguinal" />
                                                    <label class="choice" for="lymphadenopathy">Inguinal</label>
                                                <input  name="lymphadenopathy" class="checkbox" type="checkbox" value="supraclavicular" />
                                                    <label class="choice" for="lymphadenopathy">Supraclavicular</label>
                                                <input  name="lymphadenopathy" class="checkbox" type="checkbox" value="other" />
                                                    <label class="choice" for="lymphadenopathy">Other</label>
                                            </span>
                                            
                                            </div>
                                        </td>
                                        <td>
                                            <div style="width: 40px"></div>
                                        </td>
                                        <td>
                                            <div>
                                            <label id = "tenderness_check" class="description">Tenderness</label>
                                            <span>
                                                <input type="radio" name="tenderness" value="yes"/>
                                                <label for="street">Yes</label>
                                            </span>
                                                <span style="width: 20px"></span>
                                            <span>
                                                <input type="radio" name="tenderness" value="no"  checked />
                                                <label for="street">No</label>
                                            </span> 
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            
                                <span><label class="description" for="others" style="width: 300px"> If Other</label></span>
                                <span><div style="width: 100px"></div></span>
                                <span><input type="text" name="others" style="width: 350px" placeholder="Other...(Max 40 Characters)" maxlength="40"/></span>
                            
                            </li>
                            <li style="height:10px"></li>
                            <li>
					<label class="description" for="other">Other</label>
                                        <textarea name="other" rows="10" cols="50"  placeholder="Enter other examinations Here...(Max 200 Characters)" maxlength="200"></textarea>
                            </li>
                            <li style="height:10px"></li>
                    </ul>
                <li style="height:30px"></li>
                
                
                
                
                
                
                
            <ul style = 'border: 1px solid gray; width: 450px'>
                <middle><label class="description" >CVS</label></middle>
                    <li style="height: 30px"></li>
                <li style = 'border: 1px solid gray; width: 200px' >
                    <label class="description">Cayanosis</label>
                        <span>
                            <input type="radio" name="cayanosis_cvs" value="yes"/>
                            <label for="street">Yes</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="cayanosis_cvs" value="no"  checked />
                            <label for="street">No</label>
                        </span>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <span><label class="description" for="blood" style="width: 100px">Blood Pressure</label></span>
                    <span><div style="width: 30px"></div></span>
                    <span><input type="text" name="blood_high" style="width: 200px" maxlength="3"/></span>
                </li>
                <li>
                    <span><label class="description" for="blood" style="width: 100px"></label></span>
                    <span><div style="width: 30px"></div></span>
                    <span><input type="text" name="blood_low" style="width: 200px" maxlength="3"/></span>
                </li>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 400px'>
                    
                    <li>
                        <span><label class="description" for="pulse" style="width: 100px">Pulse Rate</label></span>
                        <span><div style="width: 30px"></div></span>
                        <span><input type="text" name="pulse" style="width: 200px" maxlength="3"/></span>
                    </li>
                    <li>
                        <label class="description">Volume</label>
                        <span>
                            <input type="radio" name="volume" value="low"/>
                            <label for="street">Low</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="volume" value="good"  checked />
                            <label for="street">Good</label>
                        </span>
                    </li>
                    <li>
                        <span><label class="description" for="characterr" style="width: 100px">Character</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="characterr" style="width: 200px" placeholder="(Max 30 Characters)" maxlength="30"/></span>
                    </li>
                    <li>
                        <span><label class="description" for="rhythm" style="width: 100px">Rhythm</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="rhythm" style="width: 200px" placeholder="(Max 30 Characters)" maxlength="30"/></span> 
                    </li>
                </ul>
                <li style="height: 30px"></li>
                    <li>
                        <span><label class="description" for="jvp" style="width: 100px">JVP</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="jvp" style="width: 200px" placeholder="(Max 20 Characters)" maxlength="20"/></span> 
                    </li>
                <li style="height: 30px"></li>
                <li style = 'border: 1px solid gray; width: 200px' >
                    <label class="description">CRFT</label>
                        <span>
                            <input type="radio" name="crft" value="<2S"/>
                            <label for="street"><2S</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="crft" value=">2S"  checked />
                            <label for="street">>2S</label>
                        </span>
                </li>
                <li style="height: 30px"></li>
                <li style = 'border: 1px solid gray; width: 200px' >
                    <label class="description">Peripheral</label>
                        <span>
                            <input type="radio" name="peripheral" value="warm"/>
                            <label for="street">Warm</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="peripheral" value="cold"  checked />
                            <label for="street">Cold</label>
                        </span>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <span><label class="description" for="precordium_scars" style="width: 100px">Precordium  scars</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="precordium_scars" style="width: 200px" placeholder="(Max 50 Characters)" maxlength="50"/></span> 
                </li>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 350px' >
                <li>
                    <label class="description">Chest Wall Deformalities</label>
                        <span>
                            <input type="radio" name="deformalities" value="yes"/>
                            <label for="street">Yes</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="deformalities" value="no"  checked />
                            <label for="street">No</label>
                        </span>
                </li>
                <li style="height: 10px"></li>
                <li>
                    <span><label class="description" for="deformalities_val" style="width: 100px">If yes</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="deformalities_val" style="width: 200px" placeholder="(Max 50 Characters)" maxlength="50"/></span> 
                </li>
                </ul>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 350px' >
                <li>
                    <label class="description">Visible Pulsation</label>
                        <span>
                            <input type="radio" name="pulsation" value="present"/>
                            <label for="street">Present</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="pulsation" value="absent"  checked />
                            <label for="street">Absent</label>
                        </span>
                </li>
                <li style="height: 10px"></li>
                <li>
                    <span><label class="description" for="pulsation_val" style="width: 100px">If yes</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="pulsation_val" style="width: 200px" placeholder="(Max 50 Characters)" maxlength="50"/></span> 
                </li>

                </ul>
                <li style="height: 30px"></li>
                <li>
                    <span><label class="description" for="apex_beat" style="width: 100px">Apex Beat</label></span>
                    <span><div style="width: 80px"></div></span>
                    <span><input type="text" name="apex_beat" style="width: 200px" placeholder="(Max 50 Characters)" maxlength="50"/></span> 
                </li>
                <li style="height: 30px"></li>
                <ul style = 'border: 1px solid gray; width: 350px' >
                <li>
                    <label class="description">Dual Rhythm</label>
                        <span>
                            <input type="radio" name="dual_rhythm" value="yes"/>
                            <label for="street">Yes</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="dual_rhythm" value="no"  checked />
                            <label for="street">No</label>
                        </span>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <label class="description">3rd Heart Sound</label>
                        <span>
                            <input type="radio" name="3hsound" value="yes"/>
                            <label for="street">Yes</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="3hsound" value="no"  checked />
                            <label for="street">No</label>
                        </span>
                </li>
                <li style="height: 30px"></li>
                <li>
                    <label class="description">4th Heart Sound</label>
                        <span>
                            <input type="radio" name="4hsound" value="yes"/>
                            <label for="street">Yes</label>
                        </span>
                            <span style="width: 20px"></span>
                        <span>
                            <input type="radio" name="4hsound" value="no"  checked />
                            <label for="street">No</label>
                        </span>
                </li>
                </ul>
                <li style="height: 30px"></li>
		<li>
                    <label class="description" for="murmurs">Murmurs</label>
                    <textarea name="murmurs" rows="10" cols="50"  placeholder="Max 200 Characters" maxlength="200"></textarea>
		</li>
                <li>
                    <label class="description" for="othercvs">Other</label>
                    <textarea name="othercvs" rows="10" cols="50"  placeholder="Max 200 Characters" maxlength="200"></textarea>
		</li>
                <li style="height: 30px"></li>
                
                </ul>
                
                
                <li style="height:30px"></li>
                
                
                
                
                
                
                <ul style = 'border: 1px solid gray; width: 450px'>
                    <middle><label class="description" >Abdomen</label></middle>
                    <li style="height: 30px"></li>
                    <li>
                        <label class="description">Distended</label>
                            <span>
                                <input type="radio" name="distended" value="yes"/>
                                <label for="street">Yes</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="distended" value="no"  checked />
                                <label for="street">No</label>
                            </span>
                    </li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Scars</label>
                            <span>
                                <input type="radio" name="scars" value="yes"/>
                                <label for="street">yes</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="scars" value="no"  checked />
                                <label for="street">No</label>
                            </span>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="scars_val">If Yes</label>
                        <textarea name="scars_val" rows="5" cols="35"  placeholder="Max 80 Characters" maxlength="80"></textarea>
                    </li>
                    <li style="height:30px"></li>
                    </ul>
                    <li>
                        <label class="description">Visible Bowel Movements</label>
                            <span>
                                <input type="radio" name="vbmovements" value="yes"/>
                                <label for="street">yes</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="vbmovements" value="no"  checked />
                                <label for="street">No</label>
                            </span>
                    </li>
                    <li style="height: 20px"></li>
                    <li>
                        <label class="description">Dilated Vessels</label>
                            <span>
                                <input type="radio" name="dvessels" value="yes"/>
                                <label for="street">yes</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="dvessels" value="no"  checked />
                                <label for="street">No</label>
                            </span>
                    </li>
                    <li style="height: 20px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Palpation</label>
                            <span>
                                <label for="street">Soft</label>
                                <input type="radio" name="palpation" value="soft"  checked />
                                <label for="street">Firm</label>
                                <input type="radio" name="palpation" value="firm"/>
                                <label for="street">Hard</label>
                                <input type="radio" name="palpation" value="hard"/>
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
                        
                            <span>
                                <input  name="palpation_val" class="checkbox" type="checkbox" value="1" />
                                <label class="choice" for="palpation_val">1</label>
                            </span>
                            <span>
                                <input  name="palpation_val" class="checkbox" type="checkbox" value="2" />
                                <label class="choice" for="palpation_val">2</label>
                            </span>
                            <span>
                                <input  name="palpation_val" class="checkbox" type="checkbox" value="3" />
                                <label class="choice" for="palpation_val">3</label>
                            </span>
                            <span>
                                <input  name="palpation_val" class="checkbox" type="checkbox" value="4" />
                                <label class="choice" for="palpation_val">4</label>
                            </span>
                            <span>
                                <input  name="palpation_val" class="checkbox" type="checkbox" value="5" />
                                <label class="choice" for="palpation_val">5</label>
                            </span>
                            <span>
                                <input  name="palpation_val" class="checkbox" type="checkbox" value="6" />
                                <label class="choice" for="palpation_val">6</label>
                            </span>
                        
                    
                    <li style="height:5px"></li>
                    </ul>
                    <li style="height:30px"></li>
                    <li>
                        <label class="description" for="liver">Liver</label>
                        <textarea name="liver" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
                    </li>
                    <li>
                        <label class="description" for="spleen">Spleen</label>
                        <textarea name="spleen" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
                    </li>
                    <li>
                        <label class="description" for="masses">Masses</label>
                        <textarea name="masses" rows="5" cols="35"  placeholder="Max 150 Characters" maxlength="150"></textarea>
                    </li>
                    <li style="height:30px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Kidney</label>
                            <span>
                                <input  name="side" class="checkbox" type="checkbox" value="RightSide" />
                                <label for="street">Right Side</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input  name="side" class="checkbox" type="checkbox" value="LeftSide" />
                                <label for="street">Left Side</label>
                            </span>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="ballotable">Ballotable</label>
                            <span>
                                <label for="street">Yes</label>
                                <input type="radio" name="ballotable" value="yes"/>
                            </span>
                            <span>
                                <label for="street">No</label>
                                <input type="radio" name="ballotable" value="no"  checked />
                            </span>
                    </li>
                    </ul>
                    <li style="height:30px"></li>
                    <li>
                        <label class="description" for="free_fluid">Free Fluid</label>
                            <span>
                                <label for="street">Yes</label>
                                <input type="radio" name="free_fluid" value="yes"  checked />
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <label for="street">No</label>
                                <input type="radio" name="free_fluid" value="no"/>
                            </span>
                    </li>
                    <li style="height:20px"></li>
                    <li>
                        <label class="description" for="dullness">Dullness</label>
                        <textarea name="dullness" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
                    </li>
                    <li style="height:20px"></li>
                    <li>
                        <label class="description" for="bowel_sounds">Bowel Sounds</label>
                            <span>
                                <label for="street">Normal</label>
                                <input type="radio" name="bowel_sounds" value="normal"  checked />
                            </span>
                                <span style="width: 60px"></span>
                            <span>
                                <label for="street">Deminished</label>
                                <input type="radio" name="bowel_sounds" value="deminished"/>
                            </span>
                                <span style="width: 60px"></span>
                            <span>
                                <label for="street">Exaggerated</label>
                                <input type="radio" name="bowel_sounds" value="exaggerated"/>
                            </span>
                    </li>
                    <li style="height:20px"></li>
                    <li>
                        <label class="description" for="otherabdomen">Other</label>
                        <textarea name="otherabdomen" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
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
                        <span><input type="text" name="respiratory_rate" style="width: 200px" placeholder="(Max 2 Characters)" maxlength="2"/></span> 
                    </li>
                    <li>
                        <label class="description" for="bcg_scar">BCG Scar</label>
                            <span>
                                <label for="street">Yes</label>
                                <input type="radio" name="bcg_scar" value="yes"/>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <label for="street">No</label>
                                <input type="radio" name="bcg_scar" value="no"  checked />
                            </span>
                    </li>
                    <li>
                        <span><label class="description" for="chest_wall_deformities" style="width: 100px">Chest Wall Deformities</label></span>
                        <span><div style="width: 80px"></div></span>
                        <span><input type="text" name="chest_wall_deformities" style="width: 200px" placeholder="(Max 6 Characters)" maxlength="6"/></span> 
                    </li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Lung Expansion</label>
                            <span>
                                <input type="radio" name="lung_expansion" value="normal" checked />
                                <label for="street">Normal</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="lung_expansion" value="other" />
                                <label for="street">Other</label>
                            </span>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="other_lung_expansion">If Other</label>
                        <textarea name="other_lung_expansion" rows="5" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
                    </li>
                    <li style="height:30px"></li>
                    </ul>
                    <li>
                        <label class="description" for="respiratory_scars">Respiratory Scars</label>
                        <textarea name="respiratory_scars" rows="5" cols="35"  placeholder="Max 100 Characters" maxlength="100"></textarea>
                    </li>
                    <li style="height:30px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description" style="height:40px ">Air Entry</label>
                            <span>
                                <div style="height: 20px"></div>
                                <label for="street">R/L Equal</label>
                                <input type="radio" name="air_entry" value="Equal"  checked />
                                <label for="street">Low</label>
                                <input type="radio" name="air_entry" value="Low"/>
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
                        
                            <span>
                                <input  name="air_entry_val" class="checkbox" type="checkbox" value="1" />
                                <label class="choice" for="air_entry_val">1</label>
                            </span>
                            <span>
                                <input  name="air_entry_val" class="checkbox" type="checkbox" value="2" />
                                <label class="choice" for="air_entry_val">2</label>
                            </span>
                            <span>
                                <input  name="air_entry_val" class="checkbox" type="checkbox" value="3" />
                                <label class="choice" for="air_entry_val">3</label>
                            </span>
                            <span>
                                <input  name="air_entry_val" class="checkbox" type="checkbox" value="4" />
                                <label class="choice" for="air_entry_val">4</label>
                            </span>
                            <span>
                                <input  name="air_entry_val" class="checkbox" type="checkbox" value="5" />
                                <label class="choice" for="air_entry_val">5</label>
                            </span>
                            <span>
                                <input  name="air_entry_val" class="checkbox" type="checkbox" value="6" />
                                <label class="choice" for="air_entry_val">6</label>
                            </span>
                        
                    
                    <li style="height:20px"></li>
                    <li style = 'border: 1px solid gray; width: 300px'>
                        <label class="description">VB</label>
                            <span>
                                <input type="radio" name="vb" value="yes"/>
                                <label for="street">Yes</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="vb" value="no"  checked />
                                <label for="street">No</label>
                            </span>
                    </li>
                    <li style="height:20px"></li>
                    <li style = 'border: 1px solid gray; width: 300px'>
                        <label class="description">BB</label>
                            <span>
                                <input type="radio" name="bb" value="yes"/>
                                <label for="street">Yes</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="bb" value="no"  checked />
                                <label for="street">No</label>
                            </span>
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
                                <span>
                                    <label for="street">Yes</label>
                                    <input type="radio" name="rhonchi" value="yes"/>
                                </span>
                                <span>
                                    <label for="street">No</label>
                                    <input type="radio" name="rhonchi" value="no"  checked />
                                </span>
                        </li>
                    <li style="height: 5px"></li>
                    <label class="description">If yes :      Area</label>
                    <li style="height: 10px"></li>
                    <li>
                        
                            <span>
                                <input  name="rhonchi_val" class="checkbox" type="checkbox" value="1" />
                                <label class="choice" for="rhonchi_val">1</label>
                            </span>
                            <span>
                                <input  name="rhonchi_val" class="checkbox" type="checkbox" value="2" />
                                <label class="choice" for="rhonchi_val">2</label>
                            </span>
                            <span>
                                <input  name="rhonchi_val" class="checkbox" type="checkbox" value="3" />
                                <label class="choice" for="rhonchi_val">3</label>
                            </span>
                            <span>
                                <input  name="rhonchi_val" class="checkbox" type="checkbox" value="4" />
                                <label class="choice" for="rhonchi_val">4</label>
                            </span>
                            <span>
                                <input  name="rhonchi_val" class="checkbox" type="checkbox" value="5" />
                                <label class="choice" for="rhonchi_val">5</label>
                            </span>
                            <span>
                                <input  name="rhonchi_val" class="checkbox" type="checkbox" value="6" />
                                <label class="choice" for="rhonchi_val">6</label>
                            </span>
                        
                    
                    <li style="height:5px"></li>
                    </ul>
                        <li style="height:20px"></li>
                    <ul style = 'border: 1px solid gray; width: 300px' >
                        <li>
                            <label class="description">Crepts</label>
                                <span>
                                    <label for="street">Yes</label>
                                    <input type="radio" name="crepts" value="yes"/>
                                </span>
                                <span>
                                    <label for="street">No</label>
                                    <input type="radio" name="crepts" value="no"  checked />
                                </span>
                        </li>
                    <li style="height: 5px"></li>
                    <label class="description">If yes :      Area</label>
                    <li style="height: 10px"></li>
                    <li>
                        
                            <span>
                                <input  name="crepts_val" class="checkbox" type="checkbox" value="1" />
                                <label class="choice" for="crepts_val">1</label>
                            </span>
                            <span>
                                <input  name="crepts_val" class="checkbox" type="checkbox" value="2" />
                                <label class="choice" for="crepts_val">2</label>
                            </span>
                            <span>
                                <input  name="crepts_val" class="checkbox" type="checkbox" value="3" />
                                <label class="choice" for="crepts_val">3</label>
                            </span>
                            <span>
                                <input  name="crepts_val" class="checkbox" type="checkbox" value="4" />
                                <label class="choice" for="crepts_val">4</label>
                            </span>
                            <span>
                                <input  name="crepts_val" class="checkbox" type="checkbox" value="5" />
                                <label class="choice" for="crepts_val">5</label>
                            </span>
                            <span>
                                <input  name="crepts_val" class="checkbox" type="checkbox" value="6" />
                                <label class="choice" for="crepts_val">6</label>
                            </span>
                        
                    
                    
                    </ul>
                    <li style="height:5px"></li>
                    </ul>
                    <li>
                        <label class="description">Pleural Rub</label>
                            <span>
                                <label for="street">Yes</label>
                                <input type="radio" name="pleural" value="yes"/>
                            </span>
                            <span>
                                <label for="street">No</label>
                                <input type="radio" name="pleural" value="no"  checked />
                            </span>
                    </li>
                    <li>
                        <label class="description" for="other_detail">Other Details</label>
                        <textarea name="other_detail" rows="2" cols="35"  placeholder="Max 100 Characters" maxlength="100"></textarea>
                    </li>
                    <li>
                        <label class="description" for="breath_sound">Breath Sound</label>
                        <textarea name="breath_sound" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
                    </li>
                    <li>
                        <label class="description" for="vocal_resonance">Vocal Resonance</label>
                        <textarea name="vocal_resonance" rows="2" cols="35"  placeholder="Max 50 Characters" maxlength="50"></textarea>
                    </li>
                    <li style="height: 20px"></li>
                    <ul style = 'border: 1px solid gray; width: 350px' >
                    <li>
                        <label class="description">Percussion Note</label>
                            <span>
                                <input type="radio" name="percussion_note" value="resonant" checked />
                                <label for="street">Resonant</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="percussion_note" value="hyperresonant" />
                                <label for="street">Hyperresonant</label>
                            </span>
                                <span style="width: 20px"></span>
                            <span>
                                <input type="radio" name="percussion_note" value="dull" />
                                <label for="street">Dull</label>
                            </span>
                    </li>
                    <li style="height: 10px"></li>
                    <li>
                        <label class="description" for="percussion_note_val">If   "Hyperresonant"   or  "Dull"</label>
                        <textarea name="percussion_note_val" rows="2" cols="35"  placeholder="Max 20 Characters" maxlength="20"></textarea>
                    </li>
                    <li style="height:5px"></li>
                    </ul>
                    <li style="height:30px"></li>
                    <li>
                        <label class="description" for="other_resp">Other</label>
                        <textarea name="other_resp" rows="5" cols="35"  placeholder="Max 200 Characters" maxlength="200"></textarea>
                    </li>    
                    <li style="height:30px"></li>
                </ul>
                
                
                
                
                
                
                
                
                
                
                <table >           
                        <li style="height:30px"></li>
                        <li>
                                <label class="description" for="height">Height</label>
                                <div><input type="text" name="height" maxlength="6"/></div>
                        </li>
                        <li>
				<label class="description" for="weight">Weight</label>
                                <div><input type="text" name="weight" maxlength="6"/></div>
                        </li>
                </table>
                            
                <li style="height:30px"></li>           
                <center><ul style = 'border: 1px solid gray; width: 450px'>
                <label class="description" > Investigation Summary </label>
                <li style="height: 30px"></li>    
                <li>
                    <span><label class="description" for="day_ix" style="width: 100px">DAY</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="day_ix" style="width: 200px" pattern="[0-9]" maxlength="2" value="1"/></span>
                </li>
                <li>
                    <span><label class="description" for="date_ix" style="width: 100px">DATE</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="date" name="date_ix" style="width: 200px" /></span>
                </li>
                <li>
                    <span><label class="description" for="time_ix" style="width: 100px">TIME</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="time_ix" style="width: 200px" maxlength="10"/></span>
                </li>
                <li>
                    <span><label class="description" for="bldtx" style="width: 100px">BLD Tx</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="bldtx" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="hb" style="width: 100px">Hb %</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="hb" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="plt" style="width: 100px">PLT</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="plt" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="pcv" style="width: 100px">PCV</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="pcv" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="wbc" style="width: 100px">WBC</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="wbc" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="n" style="width: 100px">-N</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="n" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="l" style="width: 100px">-L</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="l" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="esr" style="width: 100px">ESR</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="esr" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="crp" style="width: 100px">CRP</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="crp" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="bu" style="width: 100px">BU</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="bu" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="scr" style="width: 100px">S.Cr</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="scr" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="na" style="width: 100px">Na+</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="na" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="k" style="width: 100px">K+</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="k" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="ca" style="width: 100px">Ca</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="ca" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="mg" style="width: 100px">Mg</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="mg" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="cl" style="width: 100px">Cl</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="cl" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="rbs" style="width: 100px">RBS</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="rbs" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="cbs" style="width: 100px">CBS</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="cbs" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="ast" style="width: 100px">AST</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="ast" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="alt" style="width: 100px">ALT</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="alt" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="alp" style="width: 100px">ALP</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="alp" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="sprotien" style="width: 100px">S.protien</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="sprotien" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="alb" style="width: 100px">Alb</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="alb" style="width: 200px" maxlength="20"/></span>
                <li>
                <li>
                    <span><label class="description" for="glob" style="width: 100px">Glob</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="glob" style="width: 200px" maxlength="20"/></span>
                <li>
                <li>
                    <span><label class="description" for="inr" style="width: 100px">INR</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="inr" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="pt" style="width: 100px">PT</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="pt" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="aptt" style="width: 100px">APTT</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="aptt" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="sbrtot" style="width: 100px">SBR-Tot</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="sbrtot" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="dir" style="width: 100px">-Dir</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="dir" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="urine" style="width: 100px">URINE</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="urine" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="cxr" style="width: 100px">CXR</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="cxr" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="us" style="width: 100px">US</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="us" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="ct" style="width: 100px">CT</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="ct" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="ecg" style="width: 100px">ECG</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="ecg" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="cultures" style="width: 100px">CULTURES</label></span>
                    <span><div style="width: 100px"></div></span>
                </li>
                <li>
                    <span><label class="description" for="cultures_blood" style="width: 100px">Blood</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="cultures_blood" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="cultures_sputum" style="width: 100px">Sputum</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="cultures_sputum" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="cultures_urine" style="width: 100px">Urine</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="cultures_urine" style="width: 200px" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="otherix" style="width: 100px">Other ix</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><textarea name="otherix" rows="4" cols="23"  placeholder="Enter Other ix Here...(Max 400 Characters)"  maxlength="400" ></textarea></span>
                </li>
                <li>
                    <span><label class="description" for="planned" style="width: 100px">Planned ix</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="planned" style="width: 200px" maxlength="45"/></span>
                </li>
                    
            
                    </ul></center>
                
         <li style="height: 40px"></li>       
 
        <ul style = 'border: 1px solid gray; width: 450px'>
            <label class="description" ><center>Blood Gas Analysis</center> </label>
            <li style="height: 30px"></li> 
                <li>
                    <span><label class="description" for="day_bga" style="width: 100px">DAY</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="day_bga" pattern="[0-9]" maxlength="2" value="1"/></span>
                </li>
                <li>
                    <span><label class="description" for="date_bga" style="width: 100px">DATE</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="date" name="date_bga"/></span>
                </li>
                <li>
                    <span><label class="description" for="time_bga" style="width: 100px">TIME</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="time_bga" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="abg" style="width: 100px">ABG</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="abg" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="vbg" style="width: 100px">VBG</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="vbg" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="ph" style="width: 100px">PH</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="ph" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="pco2" style="width: 100px">pCO2</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="pco2" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="hco3" style="width: 100px">HCO3-</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="hco3" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="po2" style="width: 100px">pO2</label></span>
                    <span><div  style="width: 100px"></div></span>
                    <span><input type="text" name="po2" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="so2" style="width: 100px">sO2</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="so2" maxlength="20"/></span>
                </li>
                <li>
                    <span><label class="description" for="be" style="width: 100px">BE</label></span>
                    <span><div style="width: 100px"></div></span>
                    <span><input type="text" name="be" maxlength="20"/></span>
                </li>
                
        </ul>
        <li style="height:40px"></li>  
        
        <ul style="border: 1px solid gray; width: 750px">
            <label class="description"><center>Problems</center> </label>
            <li style="height: 30px"></li>
                <li>
                    <span>
                        <label class="description" for="current_problems" >Current Problems</label>
                        <textarea name="current_problems" rows="15" cols="40"  placeholder="Enter Current Problems Here...(Max 500 Characters)"  maxlength="500" ></textarea>
                    </span>
                    <span>
                        <label class="description" for="past_problems" >Chronic / Past Problems</label>
                        <textarea name="past_problems" rows="15" cols="40"  placeholder="Enter Chronic / Past Problems Here...(Max 500 Characters)"  maxlength="500" ></textarea>
                    </span>
                </li>
            
        </ul>
        
        <ul style="border: 1px solid gray">
            
        </ul>
                            
                <ul>
                        
                        <li>
                            <label class="description" for="mx">Mx</label>
				<textarea rows="20" cols="50" name="mx"  placeholder="Enter Mx Here...(Max 2000 Characters)"  maxlength="2000"></textarea>	
			</li>
                        
                        <li style="height:40px"></li>
                        
                        <div style="border:1px solid gray;width:500px ">
                            <label id = "systemcheck" class="description">Changes</label>
				<span>
                                    <li>
					<label class="description" for="system">Current Updates</label>
                                            <textarea name="system" rows="20" cols="50"  placeholder="Enter Current Updates Here...(Max 2000 Characters)"  maxlength="2000" ></textarea>
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


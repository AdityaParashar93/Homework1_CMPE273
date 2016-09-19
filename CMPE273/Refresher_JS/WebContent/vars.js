/**
 * 
 */
function genOTP()
{
	var name=document.getElementById("name").value;
	var surname=document.getElementById("surname").value;
	var email=(document.getElementById("email").value).toString();
	var telnum=(document.getElementById("telnum").value).toString();
	//document.write((parseInt(document.getElementById("field1").value)+parseInt(document.getElementById("field2").value)).toString());
	//document.write(s+"\t\n"+name+"\t\n"+surname+"\t\n");
	var OTP=new String();
	OTP=name.slice(0,3)+surname.slice(0,3)+telnum.slice(0,3)+email.slice(1,4);
	document.write("Dear User your one time password is\t"+OTP);
	
};
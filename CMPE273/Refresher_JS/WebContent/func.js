/**
 * 
 */
function encry()
{	
	var msg=document.getElementById("msg").value;
	var i;
	var encrypted_msg="";
	var decrypted_msg="";
	for(i=msg.length;i>=0;i--)
	{
		encrypted_msg=encrypted_msg+msg.charAt(i);
	};
	for(i=encrypted_msg.length;i>=0;i--)
	{
		decrypted_msg=decrypted_msg+encrypted_msg.charAt(i);
	};
	document.write("Encrypted Message is:\t"+encrypted_msg+"\n"+"Decrypted Message is:\t"+decrypted_msg);
};
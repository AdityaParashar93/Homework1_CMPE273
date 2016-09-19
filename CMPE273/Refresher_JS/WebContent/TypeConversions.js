/**
 * 
 */
function calc()
{
	var dist=parseInt(document.getElementById("Dist").value);
	var mile=parseInt(document.getElementById("Mile").value);
	document.write("If you wish to travel\t"+dist+"\tin metric system. You will have to travel\t"+(dist*1.6)+"\twith\t"+(((dist*1.6)*3.79)/mile)+"\tltrs of fuel.");
}

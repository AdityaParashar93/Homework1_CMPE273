/**
 * 
 */
function search1()
{
	var temp_str=document.getElementById("Input").value;
	document.getElementById("Output").innerHTML=temp_str.match(/[aeiou]/gi);
}
function search2()
{
	var temp_str=document.getElementById("Input").value;
	document.getElementById("Output").innerHTML=temp_str.match(/[^aeiou]/gi);
}
function Repl()
{
	var temp_str=document.getElementById("Input").value;
	document.getElementById("Output").innerHTML="Number of Vowels:\t"+(temp_str.match(/[aeiou]/gi)).length+"\t\t\nNumber of consonants:\t"+(temp_str.match(/[^aeiou]/gi)).length;
}
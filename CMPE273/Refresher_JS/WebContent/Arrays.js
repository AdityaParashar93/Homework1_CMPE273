/**
 * 
 */
var Veggies=[];
function addItems()
{
var temp=(document.getElementById("name").value).toString();
Veggies.push(temp);
document.getElementById("Push").innerHTML=Veggies;
}
function deleteItems()
{
	Veggies.pop();
	document.getElementById("Pop").innerHTML=Veggies;
}
/**
 * 
 */
function getTime()
{
	var d=new Date();
	if(d.getHours()>8 && d.getHours()<20)
	{
		document.write("Hey you can visit the library now");
	}
	else
	{
		document.write("Library is closed now");
	}
};

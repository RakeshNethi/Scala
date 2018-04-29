class multiplication 
{
  def multab(tblnum: Int) =  
{
   var tab = 0
	 for (i <-(1 to 10)) 
	  {
  		tab = tblnum*i
  		println(+tblnum + "*" + i + "=" + tab)
	  }
 }
}

object multi 
{
def main(args:Array[String])
  {
    var x = new multiplication
    x.multab(2)
  }
}




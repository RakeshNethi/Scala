class simple_class {
  var somebody ="Hello Joe"
  def print() = {
  println(somebody)
  }
}

object Call_class {
def main(args:Array[String])
  {
    var x = new simple_class
    x.print()
  }
}




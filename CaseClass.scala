object CaseClass extends App{

  import scala.io.StdIn.{readInt} //For getting inputs from console
    case class  Point(a:Int,b:Int){
          def x:Int=a
          def y:Int=b

           def +(that:Point) = Point(this.x + that.x, this.y + that.y) //Q1)add(+) should add two given points
           def move(dx:Int=0,dy:Int=0)=Point(this.x+dx,this.y+dy) //Q2)move should move a point by a given distance dx and dy
           def distance(dis:Point)=math.sqrt(math.pow((this.x - dis.x),2) + math.pow((this.y - dis.y),2)) //Q3)distance should return the distance between two given points
           def invert()=Point(this.y,this.x) //Q4)invert should switch the x and y coordinates.
          }
//take inputs
          println("Enter points you want: ")
          println("Enter x of P1: ")
              val  i=readInt();
          println("Enter y of P1: ")
              val  j=readInt();
            val p1=Point(i,j)
          println("Enter x of P2: ")
              val p=readInt();
          println("Enter y of P2: ")
              val q=readInt();
            val p2=Point(p,q)
//display points
      println("\n****Display p1 and p2 pointers****")
      println("p1 : " + p1)
      println("p2 : " + p2)

//Answer for Q1
      println("\n****Add two given pointers****")
      val p3=p1+p2
      println("p1+p2: " + p3)

//Answer for Q2
      println("\n****Move a point by a given distance dx and dy****")
      println("Enter distance dx for P1: ")
      val k=readInt();
      println("Enter distance dy for P1: ")
      val l=readInt();
      val p4=p1.move(k,l)
      println("Enter distance dx for P2: ")
      val m=readInt();
      println("Enter distance dy for P2: ")
      val n=readInt();
      val p5=p2.move(m,n)

      println("Move p1 by a given distance : " + p4)
      println("Move p1 by a given distance : " + p5)

//Answer for Q3
      println("\n****Get distance between given two pointers****")
      val p6=p1.distance(p2)
      println("Distance between p1 and p2 : " + p6)

//Answer for Q4
      println("\n****Get invert of given pointer(switch the x and y coordinates)****")
      val p7=p1.invert()
      println("p1\' : " + p7)

      val p8=p2.invert()
      println("p2\' : " + p8)

}

class Box
{
double height;
double length;
double breadth;
}
Class Box1
{
public static void main(String args[])
{
Box b=new Box();
double area;
b.height=14.5;
b.length=12.6;
b.breadth=17.6;
area=(2*b.height*b.length*b.breadth);
System.out.println("area is:"+area);
}
}
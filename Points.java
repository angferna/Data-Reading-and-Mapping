//Angel Natalina Fernandes
//Kandace Wilkins
//Project 4

public class Points{
 private double myX;
 private double myY;
  
 public Points(double x,double y) {
  myX=x;
  myY=y;
 }
 
 public double getX() {
  return myX;
 }
 public double getY() {
  return myY;
 }
 
 public void draw() {
  StdDraw.point(myX,myY);
 }
}

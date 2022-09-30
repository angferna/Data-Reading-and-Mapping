//Angel Natalina Fernandes
//Kandace Wilkins
//Project 4

import java.util.Scanner;
import java.io.FileInputStream;
public class Project4 {
 public static void main(String [] args){
  StdDraw.setPenRadius(0.05);
 
  Scanner s=null;
  try {
   FileInputStream f=new FileInputStream("teapotData.txt");
   s=new Scanner(f);
  }
  catch (Exception ex){
   ex.printStackTrace();
  }
  
  String label1=s.next();
  int numberOfVertices=s.nextInt();
  String label2=s.next();
  int numberOfFaces=s.nextInt();
  
  Points[] thePoints=new Points[numberOfVertices];
  for(int i=0;i<numberOfVertices;i++) {
   String label3=s.next();
   double x1=s.nextDouble();
   double y1=s.nextDouble();
   double z1=s.nextDouble();
   thePoints[i]=new Points(x1,y1);
  }
  
  StdDraw.setCanvasSize(800,800);
  StdDraw.setScale(-3.5,3.5); 
 
  for( int j=0;j<numberOfVertices; j++) {
   thePoints[j].draw();
  } 
   
  for(int k=0;k<numberOfFaces;k++) {
   String label4=s.next();
   int x2=s.nextInt();
   int y2=s.nextInt();
   int z2=s.nextInt();
    
   StdDraw.line(thePoints[x2].getX(),thePoints[x2].getY(),thePoints[y2].getX(),thePoints[y2].getY());
   StdDraw.line(thePoints[y2].getX(),thePoints[y2].getY(),thePoints[z2].getX(),thePoints[z2].getY());
   StdDraw.line(thePoints[z2].getX(),thePoints[z2].getY(),thePoints[x2].getX(),thePoints[x2].getY());
  }
   
  StdDraw.show(10); 
 }
}
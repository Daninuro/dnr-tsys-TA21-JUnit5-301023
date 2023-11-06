package Geometria;

public class GeometriaApp 
{
    public static void main( String[] args )
    {
	   
	   Geometria gm=new Geometria(2);
	   double areaCirc= gm.areaCirculo(2);
	   gm.setArea(areaCirc);    
	   System.out.println(gm);
    }
    
}
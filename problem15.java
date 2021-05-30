package prg;
interface xyz
{    
	 void input();
     void volume();
}
class Cone implements xyz
{
    int r = 0, h = 0;
    double pi = 3.14, ar = 0;
    public void input()
    {
        r = 5;
        h = 5;
    }
    public void volume()
    {
        ar = (pi * r * r * h)/3;
        System.out.println("Volume of Cone:"+ ar);
    }
}
class Hemisphere extends Cone
{
    int r = 0;
    double ar = 0, pi = 3.14;
    public void input()
    {
        super.input();
        r = 5;
    }
    public void volume()
    {
        super.volume();
        ar =  ((pi * r * r * r)*2)/3 ;
        System.out.println("Volume of Hemisphere:"+ar);
    }
}
class Cylinder extends Hemisphere
{
    int r = 0, h = 0;
    double ar = 0, pi = 3.14;
    public void input()
    {
        super.input();
        r = 5;
        h = 5;
    }
    public void volume()
    {
        super.volume();
        ar = pi * r * r * h;
        System.out.println("Volume of Cylinder:"+ar);
    }
}
public class problem15
{
    public static void main(String[] args)
    {
        Cylinder obj = new Cylinder();
        obj.input();
        obj.volume();       
        
    }
}
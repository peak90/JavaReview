import java.util.*;
public class test
{
    public static void main(String[] args)
    {
        ArrayList<Apple> apples=new ArrayList();
	for(int i=0;i<4;i++)
	{
	    apples.add(new Apple());
	}
	apples.add(new FuApple());
/*	for(int i=0;i<4;i++)
	{
	    apples.add(new Orange());
	}*/
	for(Apple a:apples)
	    System.out.println(a.getId());
    }
}
class Apple
{
    private static int count=0;
    private int id=count++;
    public int getId()
    {
        return id;
    }
}
class FuApple extends Apple
{
    
}

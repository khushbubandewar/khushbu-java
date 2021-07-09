import java.util.WeakHashMap;

public class WeakHashMapdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WeakHashMap h =new WeakHashMap();
		Temp t= new Temp();
		h.put(t, "Durga");
		System.out.println(h);
		t=null;
//		System.gc();
//		Thread.sleep(500);
		System.out.println(h);		
	}

}
class Temp{
	public String toString()
	{
		return "temp";
	}

}
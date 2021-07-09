
public class CloneExa implements Cloneable {
	int i =10;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExa ce = new CloneExa();
		Object obj = ce.clone();
		CloneExa ecCopy = (CloneExa)obj;
		
				}

}

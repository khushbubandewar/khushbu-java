
public class StringExa3 {
	int i;
	StringExa3(int i){
		this.i=i;
	}
	public int hashcode() {
		return i;
	}
	public String toString() {
		return i+" ";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExa3 s = new StringExa3(15);
		StringExa3 s1 = new StringExa3(150);
		System.out.println(s);
		System.out.println(s1);
		
	
	}
	

}

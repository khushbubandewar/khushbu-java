
public class ReverseLoopPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		for(int i=length;i>=0;i--) {
			for(int k=0; k>i-length;k--) {
				System.out.print(" ");	
			}
			for(int j=i; j>=1;j--) {
				
				System.out.print(" *");

				
			}
			System.out.println(" ");
		}
	}

}

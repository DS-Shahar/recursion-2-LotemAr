package lotem1;

public class mainre2 {
	public static int exe14(int[]a, int i) {
		if(i==0) {
			return a[i];
			
		}
		return a[i]+exe14(a,i-1);
	}
	public static int exe15(int[]a, int i) {
		if(i ==-1) {
			return 0;
		}
		if(a[i]>0)
			return 1+exe15(a,i-1);
		return exe15(a,i-1);
		
	}
	public static int exe16(int[]a,int num, int i) {
		if(i==-1) {
			return -1;
		}
		if(a[i]==num) {
			return i;
			
		}
		return exe16(a, num, i-1);
		
		
	}
	public static boolean exe17(int[]a, int i) {
		if(i==a.length-1) {
			return true;
		}
		if(a[i]<a[i+1]){
			return exe17(a, i+1);
		}
		else {
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,2,3,4};
		int result= exe16(a,3, 3);
		System.out.println(result);
		boolean result1= exe17(a,0);
		System.out.println(result1);
		for(int i=0;i<a.length-1; i++) {
			if(a[i]>a[i+1]) {
				System.out.println("llll");
			}
		}
		

	}

}

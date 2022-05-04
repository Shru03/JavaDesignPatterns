
public class DesignPatternsYT {
	public static void rectangle() {
		 int n = 4;
		 int m = 5;
		 for ( int i = 1; i <= n; i ++) {
			 for (int j=1; j <= m; j++) {
				 System.out.print("* ");
			 }
			System.out.println(); 
		 }
	}
	
	public static void hollowrectangle() {
		 int n = 4;
		 int m = 5;
		 for (int i = 1; i <= n; i ++) {
			 for (int j=1; j <= m; j++) {
				 if (i ==1 || j==1|| i ==n|| j ==m) {
				 System.out.print("* ");
			 } else {
				 System.out.print("  ");
			 }
			 }
			System.out.println(); 
			 }
	}
	
	public static void halfPyramid() {
		 int n = 4;
		 for ( int i = 1; i <= n; i ++) {
			 for (int j=1; j <= i; j++) {
				 System.out.print("* ");
			 }
			System.out.println(); 
		 }
		
	}
	
	public static void invertedHalfPyramid() {
		 int n = 4;
		 for ( int i = n; i >= 1; i--) {
			 for (int j=1; j <= i; j++) {
				 System.out.print("* ");
			 }
			System.out.println(); 
		 }
		
	}
	
	public static void upperhalfPyramid() {
		 int n = 4;
		 for ( int i = 1; i <= n; i++) {
			 for (int j=1; j <=n-i; j++) {
				 System.out.print("  ");
			 }
			 for (int j=1; j<=i; j++ ) {
				 System.out.print("* ");
			 }
			System.out.println(); 
		 }
		
	}
	
	public static void numHalfPyramid() {
		 int n = 5;
		 for ( int i = 1; i <=n; i++) {
			 for (int j=1; j <= i; j++) {
				 System.out.print(j + " ");
			 }
			System.out.println(); 
		 }
		
	}
	
	public static void invNumHalfPyramid() {
		 int n = 5;
		 for ( int i = 1; i <= n; i++) {
			 for (int j=1; j <=n-i+1; j++) {
				 System.out.print(j + " ");
			 }
			System.out.println(); 
		 }
		
	}
	
	public static void floydsTriangle() {
		int n = 5;
		int num=1;
		 for ( int i = 1; i <=n; i++) {
			 for (int j=1; j <= i; j++) {
				 System.out.print(num + " ");
				 num++;
			 }
			 
			System.out.println(); 
		 }
	}
	
	public static void zero1Triangle() {
		int n = 5;
		 for ( int i = 1; i <=n; i++) {
			 for (int j=1; j <= i; j++) {
				 if ((i+j)%2 ==0) {
				 System.out.print("1 ");}
				 else { System.out.print("0 "); }
			 }
			System.out.println(); 
		 }
	}
	
	public static void main(String[] args) {
		rectangle();
		System.out.println("-----------------");
		hollowrectangle();
		System.out.println("-----------------");
		halfPyramid();
		System.out.println("-----------------");
		invertedHalfPyramid();
		System.out.println("-----------------");
		upperhalfPyramid(); 
		System.out.println("-----------------");
		numHalfPyramid(); 
		System.out.println("-----------------");
		invNumHalfPyramid();
		System.out.println("-----------------");
		floydsTriangle();
		zero1Triangle();
  }
}

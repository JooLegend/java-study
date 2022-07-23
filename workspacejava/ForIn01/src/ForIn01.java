
public class ForIn01 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
				
				// 기본 for 문
				for(int i=0; i<d.length; i++) {
					System.out.println("a["+ i + "] = " +d[i]);
				}
				System.out.println();
				
				// 확장 for 문
				for(double x : d) {
					System.out.println(x);
					
				}
	}
}

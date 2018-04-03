import java.util.Scanner;
public class ScannerAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in 3 numbers");
int[] one = {input.nextInt(),input.nextInt(),input.nextInt()};
System.out.println("Put in 3 numbers");
int[] two = {input.nextInt(),input.nextInt(),input.nextInt()};
int[] sum = new int[3];
System.out.println("The sum of the arrays is");
for(int c = 0; c<=sum.length-1;c++) {
	sum[c] = (one[c]+ two[c]);
	System.out.println(sum[c]);
}
}

}
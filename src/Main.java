import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int dC, dE, t;
		Scanner sc = new Scanner(System.in);
		dC = sc.nextInt();
		dE = dC * 2 + 4;
		t = (dC + dE) / 5;
		
		if (t<=20){
			System.out.println(dC + " " + dE + " " + t + "\nuno");
			}
		else if (t<=30){
			System.out.println(dC + " " + dE + " " + t + "\ndos");
			}
		else if (t<=50){
			System.out.println(dC + " " + dE + " " + t + "\ntres");
			}
		else{
			System.out.println(dC + " " + dE + " " + t + "\ncuatro");
			}
	}
}
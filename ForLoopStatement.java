public class LoopStatement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		System.out.print("Enter the Number: ");
		int n=scanner.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}System.out.println();
		}
	}
}

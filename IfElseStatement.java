public class ElseIfStatement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=scanner.nextInt();
		if(n%2==0) {
			System.out.println("Given number is Even");
		}else {
			System.out.println("Given number is Odd");
		}
	}
}

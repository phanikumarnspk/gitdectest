public class WhileLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=scanner.nextInt();
		int i=1;
		while (i<=n) {
			System.out.println(i);
			i++;
		}
	}
}

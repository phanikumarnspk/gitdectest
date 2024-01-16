public class NestedIfStatement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int marks=scanner.nextInt();
		if(marks>0) {
			if(marks>75) {
				System.out.println("A Grade");
			}else if(marks>50){
				System.out.println("B Grade");
			}else {
				System.out.println("E Grade");
			}
		}
	}
}

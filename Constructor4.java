public class TestCons {
	public static void main(String[] args) {
		Department d = new Department("Communication", 456, "Puttaparthi");
		employee e =new employee(423, "Charan", d);
		System.out.println(e.getEid()+" = "+e.getEname()+" = "+e.geteDept());
		Department f = e.geteDept();
		System.out.println(f.getDname()+" = "+f.getDnum()+" = "+f.getDloc());
	}
}

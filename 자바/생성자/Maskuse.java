package 생성자;

public class Maskuse {

	public static void main(String[] args) {
		Mask m1 = new Mask("흰색",3000,5);
		System.out.println(Mask.total+"개");
		
		Mask m2 = new Mask("검정색",2500,2);
		System.out.println(Mask.total+"개");
		
		System.out.println(Mask.COMPANY + m1.toString());
		System.out.println(Mask.COMPANY + m2.toString());
	}

}

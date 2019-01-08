package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = { 10, 30, 40, 50 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("-----------------");

		int b[] = new int[5];
		b[0] = 10;
		b[1] = 30;

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
		System.out.println("--------------");
		String[] name = new String[6];
		name[0] = "arif";
		name[1] = "dhruba";
		for (int k = 0; k < name.length; k++) {
			System.out.println(name[k]);
		}

	}

}

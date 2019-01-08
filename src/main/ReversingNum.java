package main;

public class ReversingNum {

	public static void reverse(int a) {
		int num = a;
		int reverse = 0;
		while (num != 0) {//123456 -->  12345  ---1234  123  12 1
			reverse = reverse * 10 + num % 10; // 0*10+123456%10 = 0+6 = 6    6*10+12345%10  = 60+5 =65 65*10+1234%10 = 650+4 = 654   654*10+3= 6543   65430+2 = 65432 654321
			num = num / 10;  //12345    1234 //123 //12 1 0
		}
		
		System.out.println(reverse+" is the reverse of: "+a);

	}
	
	public static void main(String[] args) {
		
		reverse(123456);
		
		reverse(987654);
	}

}
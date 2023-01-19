class Armstrong{
public static void main(String[]args){
int n=153;
int temp=n;
int p=0;
while (n>0){
int rem=n%10;
p=(p)+(rem*rem*rem);
n=n/10;
}
if(temp==p){
System.out.println("yes.its a armstrong number");
}
else{
System.out.println("no. its not an armstrong num");
}
}}
public class Duplicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//initialize array
		int arr[]=new int[] {1,1,2,3,3,4,4,5,89,89,66};
		
		System.out.println("duplicate values");
		
		//searches for duplicate element
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					System.out.println(arr[j]);
			}
		}
public class Otp_generate_program {


	public static void main(String[] args)throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		System.out.println("enter the otp");
		Thread.sleep(1000);
		//generate the otp
		double otp=9999*Math.random()+9999;
		int store=(int)otp;
		System.out.println(store);

		
	}

}

	String s="sakthi";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

}

public class Inheritance1{
	float salary=8000;

}
class programmer extends Inheritance1{
	int bonus=10000;

public static void main(String[]args) {

	programmer p=new programmer();
	System.out.println(p.salary);
	System.out.println(p.bonus);
}
}


class bike{
	void run() {		
	  System.out.println("running");
    }
}
public class polymorphism1 extends bike{
	void run () {
		System.out.println("running in 60 miles");
	}
	public static void main(String[]args) {
		bike b=new polymorphism1();// upcasting
		b.run();		
	}
}
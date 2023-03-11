import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int a,b,d;
    System.out.println("enter first num");
    a=sc.nextInt();
    System.out.println("enter second num");
    b=sc.nextInt();
    char sign;
    System.out.println("enter opreator");
    sign=sc.next().charAt(0);
    if(sign=='+'){
    	d=a+b;
    	System.out.println(a+" "+sign+" "+b+"="+" "+d);
    }else if(sign=='-'){
    	d=a-b;
    	System.out.println(a+" "+ sign +" "+b+" = "+d);
    }else if(sign=='*'){
    	d=a*b;
    	System.out.println(a+" "+sign+" "+b+" = "+d);
    	
    }else if(sign=='/'){
    	d=a/b;
    	System.out.println(a+" "+sign+" "+b+" = "+d);
    	
    }else if(sign=='%'){
    	d=a%b;
    	System.out.println(a+" "+sign+" "+b+ " = "+d);
    }else{
    	System.out.println("invalid ");
    }

	}
}


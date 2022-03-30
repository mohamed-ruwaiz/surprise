package myjava1;
import java.util.Random;
public class GameSurprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start main= new start();
		main.execute();	
   }
}
class start{

	Random random= new Random();
	int value1=random.nextInt(1,9);
	int value2=random.nextInt(1,9);
	int value3=random.nextInt(1,9);
	int value4=random.nextInt(1,9);
	///System.out.println(value1);

	
	public char getoperator() {
		int opr=random.nextInt(3);
		switch(opr) {
		case 0:
			return '+';
		case 1:
			return '-';
		case 2:
			return '*';
		case 3:
			return '/';	
		}
		return 0;
		
	}
	
	
	public void execute() {
		int sum=0;
		int temp=0;
		sum=value1;
		for(int i=2;i<5;i++) {
			if(i==2) temp=value2;
			if(i==3) temp=value3;
			if(i==4) temp=value4;
		
		char ch=getoperator();
		System.out.println("Ch"+ch);
		switch(ch) {
		case '+':
			sum=sum+temp;
			break;
		case '-':
			sum=sum-temp;
			break;
		case '*':
			sum=sum*temp;
			break;
		case '/':
			sum=sum/temp;break;
		}
		
	}
		System.out.println("sum " + sum);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		}
}
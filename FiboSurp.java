package myjava1;

public class FiboSurp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int n=10;
				int n1=2,n2=3,n3;
				System.out.print(n1+" "+n2+" ");
				int i=2;
				while(i<n) {
					n3=n1+n2;
					int m=n3/2;
					int flag=0;
					for(int j=2;j<=m;j++) {
						if(n3%j==0) {
							//System.out.print(n3+" ");
							flag=1;
							break;
						}
					}
					if(flag==0) {
						System.out.print(n3+" ");
						i++;
					}
					n1=n2;
					n2=n3;	
				}	
			}
		}
	

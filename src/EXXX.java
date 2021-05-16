
public class EXXX {
public static void main(String[] args) {
	int n =630;
	int r,s=0;
	/*while (n>0) {
		r = n%10;
		if(r==0 ||r==4 ||r==6 ||r==9){
			System.out.println("----");
			s =s+1;
		}else  {
			r=8;
			s=s+2;
			n=n/10;
		}*/
	while (n>0) {
		r = n % 10;//1,2,1
		//s = s*10+r;//1,12,12*10+1=121
		if(r==0 ||r==4 ||r==6 ||r==9){
			System.out.println("----");
			s =s+1;
		}else  {
			r=8;
			s=s+2;
			n = n/10;
		
		System.out.println("s="+s+"------"+"r="+r+"------"+"n="+n);
	}
		
	}
	System.out.println(s);
}
}

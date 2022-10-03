package lt.Ihu.unit04.main;

public class Lesson6_3 {

	public static void main(String[] args) {
		int b;
		for (int a=1; a<1000; a++) {
			b=stufe(a);
			armstrong(a,b);
			
		}

	}
	public static int stufe(int a) {
		int b=0, c=0, f=0, g, k, l, m, n, o, p, q, r, s;
		if (a>=100) {
			b=a/100;
			c=(int)Math.pow(b, 3);
			k=a%100;
			m=k/10;
			l=(int)Math.pow(m, 3);
			n=k%10;
			o=(int)Math.pow(n, 3);
			g=c+l+o;
		} else if(a>=10) {
			p=a/10;
			q=a%10;
			r=(int)Math.pow(p, 2);
			s=(int)Math.pow(q, 2);
			g=r+s;
		}else {
			f=(a%10)/1;
			g=f;
		}
		return g;
	}
	public static void armstrong(int a, int b) {
		if (a==b) {
			System.out.println(a+"\t");
		} else {
			
		}
	}

}

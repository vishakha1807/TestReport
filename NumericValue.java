//2. Given a number 654231, calculate the actual numerical value

public class NumericValue {

	public static void main(String[] args) {
		String a[]={"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		String b[]={"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINTEEN"};
		String c[]={"TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY"};
		int no=654231;
		int t;
		if(no>10000)
		{
		 if(no>100000)
		 {
		  t=no/100000;
		  no=no%100000;
		  System.out.print(a[t-1]+" LAKH ");
		 }
		 if(no>10000)
		 {
			 t=no/1000;
			 no=no%1000;
			 System.out.print(c[(t/10)-1]+" "+a[t%10-1]+" THOUSAND ");
		 }
		 if(no>100)
		 {
		  t=no/100;
		  no=no%100;
		  System.out.print(a[t-1]+" HUNDRED AND ");
		 }
		 if(no>=10 && no<20)
		 {
		  t=no/10;
		  System.out.print(b[t-1]+" ");
		 }
		 if(no>19 && no<=100)
		 {
		  t=no/10;
		  no=no%10;
		  System.out.print(c[t-1]+" ");
		 }
		 if(no<10)
		 {
			 System.out.println(a[no-1]+" ");
		 }	
	}
		else
		 {
			 if(no<9999)
			 {
				 t=no/1000;
				 no=no%1000;
				 System.out.print(a[t-1]+" THOUSAND ");
			 }
			 if(no>100)
			 {
			  t=no/100;
			  no=no%100;
			  System.out.print(a[t-1]+" HUNDRED AND ");
			 }
			 if(no>=10 && no<20)
			 {
			  t=no/10;
			  System.out.print(b[t-1]+" ");
			 }
			 if(no>19 && no<=100)
			 {
			  t=no/10;
			  no=no%10;
			  System.out.print(c[t-1]+" ");
			 }
			 if(no<10)
			 {
				 System.out.println(a[no-1]+" ");
			 }
			}

	}

}

class New22{
	int i;
 New22(){
i=0;
 System.out.println("Value of Constractor with no parameter : "+i);
 }
 New22(int i){
	 this.i=i;
 System.out.println("Value of paramatric Constractor : "+i);
 }
 public static void main(String[] args){
	 New22 obj= new New22();
	 New22 obj1= new New22(20);
 }
}
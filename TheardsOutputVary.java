package Sorting;


public class TheardsOutputVary extends Thread {  
 int code=7;
	
	public void run(){
		this.code=9;
	}
   public static void main(String[] args) {
	   
	   Test t=new Test();
	   t.start();
	   for(int i=0;i<5;i++){
		   System.out.println(t.code);
	   }
   }
static void badmethod(){
	throw new RuntimeException();
}
}

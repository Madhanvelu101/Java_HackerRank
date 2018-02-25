package Sorting;

import java.util.Scanner;

public class Test {  public static int numberNeeded(String first, String second) {
    StringBuilder sb=new StringBuilder(first);
	
	
	StringBuilder sb1=new StringBuilder(second);
	
	StringBuilder newchar=new StringBuilder(); 
	/*sb.deleteCharAt(2);
	System.out.println(sb);*/
	for(int i=0;i<sb.length();i++){
		for(int j=0;j<sb1.length();j++){
			if(sb.charAt(i)==sb1.charAt(j)){
				
				sb1.deleteCharAt(j);
				break;
			}
			if(j==sb1.length()-1){
				newchar.append(sb.charAt(i));
				break;
			}
		}
	}
       return sb1.length()+newchar.length();
   }
 
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String a = in.next();
       String b = in.next();
       System.out.println(numberNeeded(a, b));
   }}

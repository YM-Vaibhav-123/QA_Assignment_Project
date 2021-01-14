package Arrays;

public class ArraySortingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mark = new int [] {70,80,50,40,90,10};
		int num = 0;
		
		  System.out.println("Array mark");    
	        for (int i = 0; i < mark.length; i++) {     
	            System.out.print(mark[i]+ " ");    
	        }   

	        for (int i = 0; i < mark.length; i++) {     
	        	for (int j = i+1; j < mark.length; j++) {     
	                if(mark[i] > mark[j]) {    
	                    num = mark[i];    
	                    mark[i] = mark[j];    
	                    mark[j] = num;    
	                }     
	             }     
	         }    
	           
	         System.out.println();    
	             
	         //Displaying elements of array after sorting    
	         System.out.println("Elements of array sorted in ascending order: ");    
	         for (int i = 0; i < mark.length; i++) {     
	             System.out.print(mark[i] + " ");    
	         }    
	     }    
	 }    
	

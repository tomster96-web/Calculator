


public class Main {
	    
	 
	    public static void main(String[] args) {
	    	 DataReader reader = new DataReader();
	    	 while(true) {
		            try {
		                reader.read();
		            } catch (RuntimeException e) {
		            	System.err.println(e.getMessage());
		            	System.exit(0);
		                
		                
		            }
		            System.out.println(reader.getVar1());
	           
	    	 }
	        
	    	
	        
  }
}

	 
	
	 
	
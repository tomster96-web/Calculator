import java.util.Scanner;
	 
	public class DataReader {
		
	   private int number1  ;
	   private int number2  ;
	   private char operation;
	   private int res;
	   private String otvet ;
	   
	   
	  
	
	    public void read() {
	 
	        String[] arabic = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
	        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
	 
	     
	        Scanner scanner = new Scanner(System.in);
	        String text = scanner.nextLine();
	        String[] blocks = text.split("[+-/*]");
	        boolean flag1 = true;
	        boolean flag = false;
	            for (int i = 0; i < 10; i++){
	                if (roman[i].equals(blocks[0]) || roman[i].equals(blocks[1])){
	                    flag = true;
	                }
	                
	                if(flag){
	                    number1 = romanToNumber(blocks[0]);
	                    number2 = romanToNumber(blocks[1]);
	                    operation = text.charAt(blocks[0].length());
	                     res = Calculator.calculate(number1,number2,operation);
	                     otvet = arabToRom(res);
	                     flag1 = false;
	                }
	                }  
	                 if(flag1) {                 
	                number1 = Integer.parseInt(blocks[0]);
	                operation = text.charAt(blocks[0].length());
	                number2 = Integer.parseInt(blocks[1]);
	                res = Calculator.calculate(number1,number2,operation);
	                otvet = String.valueOf(res);
	                
	                }
	                
	                
	                
	             if ((number1 > 10 || number1 < 0) || (number2 > 10 || number2 < 0)) {
	            	System.out.print("eror");
	                System.exit(0);
	              } 

	            
	    }
	    
	    

	    String arabToRom(int otvet) {
	    	String romm = "";
	         int N = (int) otvet;
	         String[] romi = {"I","II", "III","IV", "V", "VI", "VII", "VIII", "IX", "X"};
	        
	         
	         while (N == 100) {
	               
	        	 romm += "C";
	            N -= 100;
	            
	         }
	         while (N >= 90) {
	               
	        	 romm += "XC";
		            N -= 90;
		            
		         }
	         while (N >= 80) {
	               
	        	 romm += "LXXX";
		            N -= 80;
		            
		         }
	         while (N >= 70) {
	               
	        	 romm += "LXX";
		            N -= 70;
		            
		         }
	         while (N >= 60) {
	               
	        	 romm += "LX";
		            N -= 60;
		            
		         }
	         while (N >= 50) {
	               
	        	 romm += "L";
		            N -= 50;
		            
		         }
	         while (N >= 40) {
	               
	        	 romm += "XL";
		            N -= 40;
		            
		         }
	         while (N >= 30) {
	               
	        	 romm += "XXX";
		            N -= 30;
		            
		         }
	         while (N >= 20) {
	               
	        	 romm += "XX";
		            N -= 20;
		            
		         }
	         while (N >= 10) {
	               
	        	 romm += "X";
		            N -= 10;
		            
		         }
	         while (N > 0) {
	               
	        	 romm += romi[N-1];
		            N -= otvet;
		           
		         }
	        
	       return romm;
	    }
	    	
	 
	    private static int romanToNumber(String roman) {
	        if (roman.equals("I")) {
	            return 1;
	        } else if (roman.equals("II")) {
	            return 2;
	        } else if (roman.equals("III")) {
	            return 3;
	        } else if (roman.equals("IV")) {
	            return 4;
	        } else if (roman.equals("V")) {
	            return 5;
	        } else if (roman.equals("VI")) {
	            return 6;
	        } else if (roman.equals("VII")) {
	            return 7;
	        } else if (roman.equals("VIII")) {
	            return 8;
	        } else if (roman.equals("IX")) {
	            return 9;
	        } else if (roman.equals("X")) {
	            return 10;
	        } else {
	            return -1;
	        }
	    }
	    public String getVar1() {
	        return otvet;
	    }
	 
	   
	}
	  

	
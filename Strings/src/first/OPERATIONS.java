package first;

public class OPERATIONS {

	public static void main(String[] args) {
		
		String str = "This is my coding challenge";
		
		char str1 = str.charAt(6);
		String str2 = str.substring(5);
		boolean str3 = str.equals("This is my coding challenge");
		int str4 = str.indexOf("my");
		int str5 = str.lastIndexOf("coding");
		
		boolean str6 = str.equalsIgnoreCase("This IS MY CODiNG CHALLENGE");
		
		String str7 = str.concat("practice");
		String str8 = str.toLowerCase();
		String str9 = str.toUpperCase();
		
		boolean str10 = str.startsWith("This");
		boolean str11 = str.startsWith("challenge");
		
		
	
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);
            System.out.println(str5);
            System.out.println(str6);
            System.out.println(str7);
            System.out.println(str8);
            System.out.println(str9);
            System.out.println(str10);
            System.out.println(str11);
            
            
        
		

	}

}

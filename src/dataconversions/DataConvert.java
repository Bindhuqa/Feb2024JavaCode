package dataconversions;

public class DataConvert {

	public static void main(String[] args) {
		
        String x = "100";
        int i = Integer.parseInt(x);
        System.out.println(i+20);
        
//        String y = "200A";
//       
//        int i1 = Integer.parseInt(y);
//        System.out.println(i1+20);
        
        String flag = "true";
       boolean flag1 =  Boolean.parseBoolean(flag);
       if(flag1) {
    	   System.out.println("run the test case");
       }
       else {
    	   System.out.println("exit");
       }
       
       String value = "12.33";
      double value1 =  Double.parseDouble(value);
      System.out.println(value1+20);
      
      //int to string
      int a = 200;
      System.out.println(a+20);
      
     String a1 = String.valueOf(a);
     System.out.println(a1+20);    //concatenated value
     
     //boolean to string
     boolean execute = false;
    String execute1= String.valueOf(execute);
    System.out.println(execute1.length());
    
    String tr = "";
    System.out.println(tr.isBlank());
    System.out.println(tr.isEmpty());
    
    String tr1 = " ";
    System.out.println(tr1.isBlank());
    System.out.println(tr1.isEmpty());
    
    
    
    
    
     
     
     
        
        
        
        
	}

}

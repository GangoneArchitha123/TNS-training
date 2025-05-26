public class RBI{
   public  void rateofinterest() {
		System.out.println("The rate of interest for RBI 6.7%");
	}
 
}
public class Axis extends RBI{
    public void rateofinterest() {
		System.out.println("The rate of interest for Axis is 8.0%");
	}	   
}
public class HDFc {
    	public void rateofinterest() {
		System.out.println("The rate of interest for HDFC 8.2%");
	}

    
}
public class Main {
   public static void main(String[] args) {
     RBI ob=new RBI();
     ob.rateofinterest();
    
     Axis ob1=new Axis();
     ob1.rateofinterest();
  
		
     HDFc ob2=new HDFc();
     ob2.rateofinterest();
		
			
	}

}

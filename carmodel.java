import java.util.Arrays;
import java.util.*;
public class carmodel {
	private String carname;
	private String driver=null;
	private String  Cdistance;
	private String Driver[]= {"A","B","C","D","E"};
	private String Model[]= {"Sedan","HatchBack","5 Seater","Sedan","HatchBack"};
	private double Rating[]= {4,4.3,4.8,4.1,4.7};
	private String DfCustomer[]= {"500m","1km","200m","700m","430m"};
	private float convertedDistance[]=new float[DfCustomer.length];
	public String getCdistance() {
		return Cdistance;
	}
	public void setCdistance(String Cdistance) {
		this.Cdistance=Cdistance;
	}

	public String getCname(){
		return carname;
	}
	public void setCname(String carname) {
		this.carname=carname;
	}

   public void Details() {
	    System.out.println(Driver[0]+"\t"+ Model[0]+"\t\t"+Rating[0]+"\t"+DfCustomer[0]);
		System.out.println(Driver[1]+"\t"+ Model[1]+"\t"+Rating[1]+"\t"+DfCustomer[1]);
		System.out.println(Driver[2]+"\t"+ Model[2]+"\t"+Rating[2]+"\t"+DfCustomer[2]);
		System.out.println(Driver[3]+"\t"+ Model[3]+"\t\t"+Rating[3]+"\t"+DfCustomer[3]);
		System.out.println(Driver[4]+"\t"+ Model[4]+"\t"+Rating[4]+"\t"+DfCustomer[4]); 
	}
	public void Distance() {
		
		for(int i=0;i<DfCustomer.length;i++)
		{  
			String distance=DfCustomer[i];
			if(distance.endsWith("km")) {
				float ConvertedDistance=Float.valueOf(distance.replace("km",""));
				convertedDistance[i]=ConvertedDistance;
				
			}
			else 
			{   
				float  ConvertedDistance=Float.valueOf(distance.replace("m",""))/1000;
				convertedDistance[i]=ConvertedDistance;
				
				
			}
		}
	}
		double mindistance=9999;
		public void finalDriver() {
			  for(int i=0;i<Driver.length;i++) {
			    	if(getCname().equalsIgnoreCase(Model[i])&& Rating[i]>=4.0){
			    		if(convertedDistance[i]<mindistance) {
			    			driver=Driver[i];
			    			mindistance=convertedDistance[i];
			    		}
			    	}
			   
			  }
			  int dis;
			  if(Cdistance.endsWith("km")) {
				   dis=Integer.valueOf(getCdistance().replace("km","")); 
				
					
				}
				else if(Cdistance.endsWith("m"))
				{   
					 dis=Integer.valueOf(getCdistance().replace("m",""));
					
				}else {
					dis=Integer.valueOf(getCdistance());
				}
			    
			    long charge = dis* 8;
			    System.out.println("Driver "+driver+" will get you to the destination");
		    	System.out.println("you charge will be Rs "+charge+"("+dis+"* 8)"); 
		
		
		}
		
	    
	
	
}

import java.util.Scanner;
public class Driver extends carmodel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        carmodel c=new carmodel();
        System.out.print("Customer Ride Distance: ");
        c.setCdistance(sc.nextLine());
        System.out.print("Car Requested: ");
        c.setCname(sc.nextLine());
        String carname=c.getCname();
        System.out.println("List of Drivers with Details:");
        System.out.println("");
        System.out.println("Driver\tCar Model\tRating\tDistance From Customer");
        c.Details();
        c.Distance();
    	c.finalDriver();
       
        	
      }

}

package najah.edu.acceptance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TenantClass {
	private final static List <TenantClass> Tenant= new ArrayList<TenantClass>();
	
  public static String name;
  public static  String phone;
  public static String location;
public static String getName() {
	return name;
}
public static void setName(String name) {
	TenantClass.name = name;
}
public static String getPhone() {
	return phone;
}
public static void setPhone(String phone) {
	TenantClass.phone = phone;
}
public static String getLocation() {
	return location;
}
public static void setLocation(String location) {
	TenantClass.location = location;
}
  
public TenantClass(String name,String phone,String location) {
	this.name=name;
	this.phone=phone;
	this.location=location;
}
public TenantClass() {
	super();
}

public static  void  inti() {
	Tenant.add(new TenantClass("Ahmad","087899","nabluse"));
	Tenant.add(new TenantClass("Baraa","087899","ramalah"));
}
private static  Units n1=new Units();
public static  void payprice () {
		n1.viewunit();
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter number unit to reseve : ");
    String number = scanner.nextLine();
    System.out.print("Enterinformation phone number or any thing to connect  : ");
    String phone = scanner.nextLine();
    
  
}

}

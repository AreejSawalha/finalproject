package najah.edu.acceptance;

import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addphotoTest {
	
	Main n=new Main();
	Units u=new Units();
	OwnerClass O1=new OwnerClass();
	@When("I add a photo to unit")
	public void iAddAPhotoToUnit() {
	 n.unitlist();
		Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOwner Dashboard");
           
            System.out.println("4. Add photo to unit house");
           
            System.out.println("0. Logout");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
               
                case 4: 
                    System.out.println("Add photo to unit house");
                 u.addphoto();
                u.viewphotounit();
                   
                    break;
              
                case 0:
                    exit = true;
                    System.out.println("Logged out successfully");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    
		
		
	}
	@Then("the photo unit should be added")
	public void thePhotoUnitShouldBeAdded() {
		  equals(O1.getFlagepicture()==true);
	}



}

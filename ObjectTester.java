//Ariel Penaloza
//02/04/2026
//Object Testing class for my Dog and Pizza objects

public class ObjectTester {
	
	public static void main (String [] args) {
		
		// A1: Create a Dog with no constructors defined.
		Dog dog1 = new Dog();

		// A2: Print the object directly.
		System.out.println("Printing dog1 directly:");
		System.out.println(dog1);
		
		// test data variables as public
		Dog dog2 = new Dog();
		
		System.out.println("\nDefaults for d1 fields (before any assignment):");
		System.out.println("name = " + dog2.getName());   // expected: null
		System.out.println("age = " + dog2.getAge());     // expected: 0
		System.out.println("breed = " + dog2.getBreed()); // expected: null
		
		//test the contructors for the default and non-default -- dv still public
		Dog d2 = new Dog(); // uses default constructor values
		System.out.println("\nd2 after default constructor:");
		System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

		Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
		System.out.println("\nd3 after parameterized constructor:");
		System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());
		
		System.out.println("\nPrinting objects after overriding toString():");
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		System.out.println("\nMutating public fields directly:");
		d3.setAge(5);     // direct write
		d3.setName("Max"); // direct write
		System.out.println("After mutation, d3 = " + d3); // uses toString()
		
		System.out.println("\nMutating via setters after making fields private:");
		d3.setAge(6);
		d3.setName("Maxwell");
		d3.setBreed("Border Collie");
		System.out.println("d3 age via getter = " + d3.getAge());
		System.out.println("d3 now = " + d3);
		
		//Pizza
		
		System.out.println("\n\n=== Pizza Sale ===");

		// a Pizza without constructor
		Pizza pizza1 = new Pizza();

		// A2: print object
		System.out.println("\"Printing pizza1 directly:\"");
		System.out.println(pizza1);

		// default values
		Pizza p1 = new Pizza();
		System.out.println("\nDefaults for pizza1 fields (before any assignment):");
		System.out.println("type = " + p1.getType());        
		System.out.println("price = " + p1.getPrice());   
		System.out.println("Size = " + p1.getSize());    

		// default constructor
		Pizza p2 = new Pizza();
		System.out.println("\nd2 after default constructor:");
		System.out.println("tiype = " + p2.getType() + ", precio = " + p2.getPrice() + 
		                   ", tamaño = " + p2.getSize());

		// constructor 
		Pizza p3 = new Pizza("Pepperoni", 20.50, "Grande");
		System.out.println("\nd3 after parameterized constructor:");
		System.out.println("type = " + p3.getType() + ", price = " + p3.getPrice() + 
		                   ", size = " + p3.getSize());

		// print using toString()
		System.out.println("\nPrinting objects after overriding toString():");
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);

		System.out.println("\nMutating public fields directly:");
		p3.setPrice(19.99);
		p3.setType("Hawaiana");
		p3.setSize("Extra Large");
		System.out.println("After mutation, d3 = " + p3);

		
		System.out.println("\n Vlidation on setPrice():");
		System.out.println("Actual Price p3: " + p3.getPrice());
		p3.setPrice(-5.00);
		System.out.println("After try with a negative value: " + p3.getPrice());
		p3.setPrice(19.99); 
		System.out.println("Valid Price: " + p3.getPrice());
		
	}//End of Main
	
}//End of Class

package dinesh_restaurant;

import java.util.ArrayList;


class Manager 
{
	String order;
       public void menu()
       {
    	   System.out.println("Manager gives menu card to the Customer");
    	   System.out.println("MENU CARD");
    	   
    	   ArrayList<Menu> a=new ArrayList<Menu>();
    	   System.out.println("**Starters       Price**");
    	   a.add(new Menu("Veg corn Soup",80.00));
    	   a.add(new Menu("Manchuria",120.00));
      	   a.add(new Menu("Crispy Corn",120.00));
      	   a.get(0).display();
      	   a.get(1).display();
      	   a.get(2).display();
      	   System.out.println("**Main Course     Price**");
      	   a.add(new Menu("Veg Biryani ",150.00));
      	   a.add(new Menu("Chicken Biryani",170.00));
       	   a.add(new Menu("Mutton Biryani",190.00));
      	   a.get(3).display();
      	   a.get(4).display();
      	   a.get(5).display();
      	   System.out.println("**Desserts     Price**");
      	   a.add(new Menu("Carrot halwa ",100.00));
    	   a.add(new Menu("Double-ka-mita",90.00));
     	   a.add(new Menu("kaju halwa",150.00));
     	   a.get(6).display();
     	   a.get(7).display();
     	   a.get(8).display();
       }
       public void takesOrder()
       {
    	   System.out.println("Manager takes the order from customer");
       }
       public void feedback()
       {
    	System.out.println("Manager takes the feedback from the Customer");   
       }
       public void prepareBill()
       {
    	   System.out.println("Manager prepares the bill and gives the bill to the customer");   
       }
      
       
}

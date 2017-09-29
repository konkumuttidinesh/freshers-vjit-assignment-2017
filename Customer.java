package dinesh_restaurant;


class Customer 
{
     public void enter()
     {
    	 System.out.println("Customer enters the Restaurant ");
    	 Host h=new Host();
    	     h.allotsTable();
    	 BusBoy b=new BusBoy();
   	         b.servesWater();
   	     Manager m= new Manager();
   	        m.menu();
   	        System.out.println();
   	        m.takesOrder();
   	     System.out.println();
   	     Order o=new Order();
   	        o.registerOrder();
   	     Chef c=new Chef();
   	        c.getOrder();
   	     System.out.println();
   	     LineCooks lc=new LineCooks();
   	        lc.prepareFood();
   	     System.out.println();
   	     Server s=new Server();
   	       s.servesFood();
   	     System.out.println("Customer takes the food ");
   	     System.out.println();
   	       m.feedback();
   	       m.prepareBill();
   	     System.out.println("Customer pays the bill and leaves the restaurant");
   	     System.out.println();
   	     b.cleansTable();
     }  
}

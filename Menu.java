package dinesh_restaurant;



class Menu
{
	String item;
	double price;
	public Menu(String item,double price)
	{
		this.item=item;
		this.price=price;
	}
    public void display()
    {
      System.out.println(item+"    "+price);	
    }
}

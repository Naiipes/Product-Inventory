public class Product extends Inventory
{
    protected double price;
    protected String id;
    protected int quantity; // Quantity available at the warehouse

    public Product()
    {

    }

    public Product(double price, String id, int quantity)
    {
        setProduct(price, id, quantity);
    }

    public void setProduct(double price, String id, int quantity)
    {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public String getId()
    {
        return id;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getTotalPrice()
    {
        return price * quantity;
    }

    public void getInfo()
    {
        System.out.println
                ("ID: " + getId() + "\n" +
                "Price: $" + getPrice() + "\n" +
                "Quantity: " + getQuantity());
    }

}

public class Product
{
    private double price;
    private int id;
    private int quantity; // Quantity available at the warehouse

    public Product()
    {

    }

    public Product(double price, int id, int quantity)
    {
        setProduct(price, id, quantity);
    }

    public void setProduct(double price, int id, int quantity)
    {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public int getId()
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
}

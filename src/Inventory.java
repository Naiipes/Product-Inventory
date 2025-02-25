public class Inventory
{
    private double value; // Total value of the inventory
    private int items; // Quantity of items stored at the inventory

    public Inventory()
    {

    }

    public void setValue(double price)
    {
        this.value += price;
    }

    public double getValue()
    {
        return value;
    }

    public void setItems(int quantity)
    {
        items += quantity;
    }

    public double getItems()
    {
        return items;
    }

}

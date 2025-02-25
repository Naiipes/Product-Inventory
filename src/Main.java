//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Inventory main = new Inventory();

        Product milk = new Product(0.25, "001", 50);
        Product eggs = new Product(0.8, "002", 40);

        milk.getInfo();
        System.out.println();

        main.setValue(milk.getTotalPrice());
        main.setItems(milk.getQuantity());

        main.setValue(eggs.getTotalPrice());
        main.setItems(eggs.getQuantity());

        System.out.println("$" + main.getValue());
        System.out.println("Quantity: " + main.getItems());

    }
}
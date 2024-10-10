
// Abstract class that will add the toppings

abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    // Constructor
    public ToppingDecorator(Pizza newPizza) {
        self.tempPizza = newPizza;
    }

}
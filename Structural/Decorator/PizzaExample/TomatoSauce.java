
// This is a concrete class
// Extends ToppingDecorator and adds additional functionaly at runtime
class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }


    // Getting description from given pizza
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }
 
    // Getting cost from given pizza
    public double getCost() {
        return tempPizza.getCost() + 0.35;
    }


}
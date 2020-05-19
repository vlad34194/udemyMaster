package constructor.carpetCostCalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    protected double getTotalCost(){
        return (floor.getArea() * carpet.getCost());
    }
}

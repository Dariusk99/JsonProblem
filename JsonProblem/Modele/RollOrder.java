public class RollOrder extends Order {

    private float width;
    private int length;
    private float weight;

    public RollOrder(Long id, int orderStatus, String customerName, String type, String description, int amountActual, int amountGoal, GroupOrder groupOrder, String comments, float width, int length, float weight) {
        super(id, orderStatus, customerName, type, description, amountActual, amountGoal, groupOrder, comments);
        this.width = width;
        this.length = length;
        this.weight = weight;
    }
}

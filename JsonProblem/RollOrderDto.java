public class RollOrderDto extends OrderDto {

    private float width;
    private int length;
    private float weight;

    public RollOrderDto(Long id, int orderStatus, String customerName, String type, String description, int amountActual, int amountGoal, Long groupOrderId, String comments, float width, int length, float weight) {
        super(id, orderStatus, customerName, type, description, amountActual, amountGoal, groupOrderId, comments);
        this.width = width;
        this.length = length;
        this.weight = weight;
    }
}

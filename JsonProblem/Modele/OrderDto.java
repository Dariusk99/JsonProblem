public class OrderDto {

    private Long id;
    private int orderStatus;
    private String customerName;
    private String type;
    private String description;
    private int amountActual;
    private int amountGoal;
    private Long groupOrderId;
    private String comments;

    public OrderDto(Long id, int orderStatus, String customerName, String type, String description, int amountActual, int amountGoal, Long groupOrderId, String comments) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.customerName = customerName;
        this.type = type;
        this.description = description;
        this.amountActual = amountActual;
        this.amountGoal = amountGoal;
        this.groupOrderId = groupOrderId;
        this.comments = comments;
    }
}

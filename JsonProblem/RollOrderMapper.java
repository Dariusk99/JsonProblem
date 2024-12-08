public class RollOrderMapper {

    private final GroupOrderServiceImpl groupOrderService;

    public RollOrder toEntity(RollOrderDto rollOrderDto) {

        GroupOrder groupOrderFromDb = groupOrderService.findById(rollOrderDto.getGroupOrderId())
                .orElseThrow(() -> new IllegalArgumentException("No group in database"));

        return new RollOrder(
                rollOrderDto.getId(),
                rollOrderDto.getOrderStatus(),
                rollOrderDto.getCustomerName(),
                rollOrderDto.getType(),
                rollOrderDto.getDescription(),
                rollOrderDto.getAmountActual(),
                rollOrderDto.getAmountGoal(),
                groupOrderFromDb,
                rollOrderDto.getComments(),
                rollOrderDto.getWidth(),
                rollOrderDto.getLength(),
                rollOrderDto.getWeight()
        );
    }
}
public class JsonOrderGetter {

    private final RollOrderMapper rollOrderMapper;

    public Order getEntity(OrderDtoWrapper orderDtoWrapper) {
        if (orderDtoWrapper.rollOrderDto() != null) {
            return rollOrderMapper.toEntity(orderDtoWrapper.rollOrderDto());
        }
        return null;
    }
}

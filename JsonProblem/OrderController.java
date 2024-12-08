class OrderController {

    private final JsonOrderGetter jsonOrderGetter;

    @PostMapping("/order")
    public Order createOrder(@RequestBody OrderDtoWrapper orderDtoWrapper) {

        Order order = jsonOrderGetter.getEntity(orderDtoWrapper);


	...dalsza logika i zapisanie do bazy
    }
}

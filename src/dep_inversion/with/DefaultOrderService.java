package dep_inversion.with;

public class DefaultOrderService implements OrderService {

  private OrderRepository orderRepository;

  public DefaultOrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }
}

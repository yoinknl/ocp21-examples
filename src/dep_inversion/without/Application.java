package dep_inversion.without;

public class Application {

  private OrderService service = new OrderService();

  public static void main(String[] args) {
    new Application();
  }

}

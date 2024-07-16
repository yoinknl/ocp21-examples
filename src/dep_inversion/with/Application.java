package dep_inversion.with;

public class Application {


  public Application() {
    final DefaultOrderRepository defaultOrderRepository = new DefaultOrderRepository();
    final DefaultOrderService defaultOrderService = new DefaultOrderService(defaultOrderRepository);

  }



}

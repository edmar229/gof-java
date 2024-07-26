package subsystem1.crm;

public class CrmService {
  private CrmService() {
    super();
  }
  public static void recordClient(String name, String cep, String state, String city) {
    System.out.println("Cliente salvo.");
  }
}

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {
  public void migrateClient(String name, String cep) {
    String city = CepApi.getInstance().getCity(cep);
    String state = CepApi.getInstance().getState(cep);

    CrmService.recordClient(name, cep, state, city);
  }
}
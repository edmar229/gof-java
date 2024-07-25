public class SingletonLazyHolder {

  private static class InistanceHolder {
    public static SingletonLazyHolder instance = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstance() {
    return InistanceHolder.instance;
  }
}

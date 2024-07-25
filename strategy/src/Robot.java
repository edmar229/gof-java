public class Robot {
  private Behavior strategy;

  public void setBehavior(Behavior behavior) {
    this.strategy = behavior;
  }

  public void move() {
    strategy.move();
  }
}

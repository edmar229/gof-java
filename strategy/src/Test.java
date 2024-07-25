public class Test {
  public static void main(String[] args) {
    Behavior normal = new NormalBehavior();
    Behavior aggressive = new AggressiveBahavior();

    Robot robot = new Robot();
    robot.setBehavior(aggressive);

    robot.move();
  }
}

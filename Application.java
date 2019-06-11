public class Application {
    public static void main(String[] args) {

        CoffeRobot cof = new CoffeRobot();
        cof.work("варю каву", "CoffeRobot");

        RobotDancer dance = new RobotDancer();
        dance.work("просто танцюю", "RobotDancer");

        Robot robot = new Robot();
        System.out.println(robot.getName());

        RobotCocker cocker = new RobotCocker();
        cocker.work("просто готую", "RobotCoocker ");

        String[] arr = {"cof.work()", "robot.work()", "dance.work()", "cocker.work()"};


        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "cof.work()":
                    cof.work("варю каву", "CoffeRobot");
                    break;
                case "robot.work()":
                    robot.work("просто робот", "Robot");
                    break;
                case "dance.work()":
                    dance.work("просто танцюю", "RobotDancer");
                    break;
                case "cocker.work()":
                    cocker.work("просто готую", "RobotCoocker ");
                    break;
            }


        }
    }}


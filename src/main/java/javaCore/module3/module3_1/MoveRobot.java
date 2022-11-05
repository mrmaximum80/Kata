package javaCore.module3.module3_1;

public class MoveRobot {

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.RIGHT);

        moveRobot(robot, 10, 12);

        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (toX - robot.getX() < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        while (toX - robot.getX() != 0) {
            robot.stepForward();
        }

        if (toY - robot.getY() < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        while (toY - robot.getY() != 0) {
            robot.stepForward();
        }
    }
}

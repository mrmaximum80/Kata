package javaCore.module3.module3_1;

public class MoveRobot {

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.RIGHT);

        moveRobot(robot,10, 12);

        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (toX - robot.getX() < 0) {
            switch (robot.getDirection()) {
                case UP: {
                    robot.turnLeft();
                    break;
                }
                case DOWN: {
                    robot.turnRight();
                    break;
                }
                case RIGHT: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
            }
        } else {
            switch (robot.getDirection()) {
                case UP: {
                    robot.turnRight();
                    break;
                }
                case DOWN: {
                    robot.turnLeft();
                    break;
                }
                case LEFT: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
            }
        }

        while (toX - robot.getX() != 0) {
            robot.stepForward();
        }

        if (toY - robot.getY() < 0) {
            switch (robot.getDirection()) {
                case UP: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
                case RIGHT: {
                    robot.turnRight();
                    break;
                }
                case LEFT: {
                    robot.turnLeft();
                    break;
                }
            }
        } else {
            switch (robot.getDirection()) {
                case DOWN: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
                case RIGHT: {
                    robot.turnLeft();
                    break;
                }
                case LEFT: {
                    robot.turnRight();
                    break;
                }
            }
        }

        while (toY - robot.getY() != 0) {
            robot.stepForward();
        }

    }
}

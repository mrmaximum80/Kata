package javaCore.module4.module4_2.m4_2_9;

import java.util.Random;

public class MoveRobot {

    public static void main(String[] args) throws RobotConnectionException {

        RobotConnectionManager r = new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return new RobotConnection() {
                    @Override
                    public void moveRobotTo(int x, int y) throws RobotConnectionException {
                        boolean b = new Random().nextBoolean();
                        if (b) {
                            System.out.println("X=" + x + " Y=" + y);
                        } else {
                            throw new RobotConnectionException("Ошибка!");
                        }
                    }

                    ;

                    @Override
                    public void close() {

                    }
                };
            }
        };

        int x = 1;
        int y = 7;

        moveRobot(r, x, y);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {

        for (int i = 0; i < 3; i++) {
            try (RobotConnection rc = robotConnectionManager.getConnection()){
                rc.moveRobotTo(toX, toY);
                i = 5;
            }
            catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
            }
        }
    }
}

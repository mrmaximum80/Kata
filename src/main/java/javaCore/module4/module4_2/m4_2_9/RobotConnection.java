package javaCore.module4.module4_2.m4_2_9;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y) throws RobotConnectionException;

    @Override
    void close();
}

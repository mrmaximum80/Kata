package javaCore.module3.module3_1;

public class Robot {

    private int x;
    private int y;
    private Direction dir;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (dir) {
            case UP: {
                dir = Direction.LEFT;
                break;
            }
            case LEFT: {
                dir = Direction.DOWN;
                break;
            }
            case DOWN: {
                dir = Direction.RIGHT;
                break;
            }
            case RIGHT: {
                dir = Direction.UP;
                break;
            }
        }
        System.out.println("Поворот против часовой");
        System.out.println("Робот смотрит " + dir);
    }

    public void turnRight() {
        switch (dir) {
            case UP: {
                dir = Direction.RIGHT;
                break;
            }
            case LEFT: {
                dir = Direction.UP;
                break;
            }
            case DOWN: {
                dir = Direction.LEFT;
                break;
            }
            case RIGHT: {
                dir = Direction.DOWN;
                break;
            }
        }
        System.out.println("Поворот по часовой");
        System.out.println("Робот смотрит " + dir);
    }

    public void stepForward() {
        switch (dir) {
            case UP: {
                y++;
                break;
            }
            case LEFT: {
                x--;
                break;
            }
            case DOWN: {
                y--;
                break;
            }
            case RIGHT: {
                x++;
                break;
            }
        }
        System.out.println("Шаг " + dir);
    }
}

package lesson1;

public class Wall {
    public int height;
    public void anyJumps(CanJump any) {
        any.jump(height);
    }
}

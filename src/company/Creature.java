package company;

public interface Creature {
    boolean run(Treadmil way);
    boolean jump(Wall wall);
    String getName();
}
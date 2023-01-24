package service;

public class Condition implements Icondition {
    public boolean jump(int height, int maxheight) {
        if (height<maxheight) return true;
        return false;
    }

    public boolean run(int distance, int maxdistance) {
        if (distance<maxdistance) return true;
        return false;
    }

}

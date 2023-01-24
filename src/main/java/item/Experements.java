package item;

import service.Condition;
import service.Icondition;

public class Experements {
    protected String info;
    protected int maxdistance;
    protected int maxheight;
    protected String successRun;
    protected String failureRun;
    protected String successJump;
    protected String failureJump;
    private boolean condition;
    private Icondition icondition;

    protected Experements(int maxdistance, int maxheight){
        this.info = "";
        this.maxdistance=maxdistance;
        this.maxheight=maxheight;
        this.successRun = "";
        this.failureRun = "";
        this.successJump = "";
        this.failureJump = "";
        this.condition = true;
        this.icondition = new Condition();
    }
    public String getInfo(){
        return info;
    }
    public String getRunResult(int distance){
        if (icondition.run(distance,maxdistance) && condition){
            return info  +  successRun + distance + " м";}
        condition=false;
        return  info + failureRun;
    }
    public String getJumpResult(int height){
        if (icondition.jump(height,maxheight) && condition){
            return info  +  successJump + height + " м";}
        condition=false;
        return  info + failureJump;
    }
    public boolean getCondition(){
        return condition;
    }
}

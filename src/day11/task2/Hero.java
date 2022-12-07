package day11.task2;

public abstract class Hero {
    private double health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    public Hero() {
        this.health = 100;

    }

    public double getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    @Override
    public String toString() {
        return "Hero [health=" + health + ", physDef=" + physDef + ", magicDef=" + magicDef + ", physAtt=" + physAtt
                + ", magicAtt=" + magicAtt + "]";
    }

}

package day11.task2;

public abstract class Hero {
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;

    private double health;
    private double physDef;
    private double magicDef;
    private double physAtt;
    private double magicAtt;
    private double healerHimSelf;
    private double healerTeamMate;

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

    public double getMagicAtt() {
        return magicAtt;
    }

    public double getPhysAtt() {
        return physAtt;
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

    public void setPhysAtt(double physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(double magicAtt) {
        this.magicAtt = magicAtt;
    }

    public double getHealerHimSelf() {
        return healerHimSelf;
    }

    public double getHealerTeamMate() {
        return healerTeamMate;
    }

    public void setHealerHimSelf(double healerHimSelf) {
        this.healerHimSelf = healerHimSelf;
    }

    public void setHealerTeamMate(double healerTeamMate) {
        this.healerTeamMate = healerTeamMate;
    }

    public void physicalAttack(Hero hero) {
        if(hero.getHealth() == MIN_HEALTH) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        double healthAfterDamage = hero.getHealth() - (physAtt - (physAtt * hero.getPhysDef()));
        if(healthAfterDamage < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        } else {
            hero.setHealth(healthAfterDamage);
        }

    }

    public void magicalAttack(Hero hero) {
        if(hero.getHealth() == MIN_HEALTH) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        double healthAfterDamage = hero.getHealth() - (magicAtt - (magicAtt * hero.getPhysDef()));
        if(healthAfterDamage < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        } else {
            hero.setHealth(healthAfterDamage);
        }

    }

    public void healHimself() {
        double health = getHealth();
        double heal = health + healerHimSelf;

        if (health == MAX_HEALTH) {
            System.out.println("The hero is healthy! Don't pretend!");
        } else if (heal > MAX_HEALTH) {
            setHealth(MAX_HEALTH);
        } else {
            setHealth(heal);
        }

    }

    public void healTeammate(Hero hero) {
        double healthTeammate = hero.getHealth();
        double healTeammate = healthTeammate + healthTeammate;

        if (healthTeammate == MAX_HEALTH) {
            System.out.println("Bastard! You are healthy! Don't pretend!");
        } else if (healTeammate > MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
        } else {
            hero.setHealth(healTeammate);
        }
    }



    @Override
    public String toString() {
        return "Hero [health=" + health + ", physDef=" + physDef + ", magicDef=" + magicDef + ", physAtt=" + physAtt
                + "]";
    }

}

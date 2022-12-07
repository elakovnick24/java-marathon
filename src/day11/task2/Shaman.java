package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    int physicalAttack;
    int magicalAttack;

    public Shaman() {
        super();
        super.setPhysAtt(10);
        super.setMagicAtt(15);
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        this.physicalAttack = getPhysAtt();
        this.magicalAttack = getMagicAtt();
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.getHealth() == 0) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        double healthAfterDamage = hero.getHealth() - (physicalAttack - (physicalAttack * hero.getPhysDef()));
        if(healthAfterDamage < 0) {
            hero.setHealth(0);
        } else {
            hero.setHealth(healthAfterDamage);
        }

    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.getHealth() == 0) {
            System.out.println("Hero alredy death! Don't hit the dead");
            return;
        }

        double healthAfterDamage = hero.getHealth() - (magicalAttack - (magicalAttack * hero.getPhysDef()));
        if(healthAfterDamage < 0) {
            hero.setHealth(0);
        } else {
            hero.setHealth(healthAfterDamage);
        }

    }

    @Override
    public void healHimself() {
        double health = getHealth();
        double heal = health + 50;

        if (health == 100) {
            System.out.println("The hero is healthy! Don't pretend!");
        } else if (heal > 100) {
            setHealth(100);
        } else {
            setHealth(heal);
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        double healthTeammate = hero.getHealth();
        double healTeammate = healthTeammate + 30;

        if (healthTeammate == 100) {
            System.out.println("Bastard! You are healthy! Don't pretend!");
        } else if (healTeammate > 100) {
            hero.setHealth(100);
        } else {
            hero.setHealth(healTeammate);
        }

    }

    @Override
    public String toString() {
        return "Shaman {health = " + getHealth() + " }";
    }

}

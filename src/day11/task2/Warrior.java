package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    int physicalAttack;

    public Warrior() {
        super();
        super.setPhysAtt(30);
        super.setPhysDef(0.8);
        super.setMagicDef(0.0);
        this.physicalAttack = getPhysAtt();
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
    public String toString() {
        return "Warrior {health = " + getHealth() + " }";
    }

}

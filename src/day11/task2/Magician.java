package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    int physicalAttack;
    int magicalAttack;

    public Magician() {
        super();
        super.setPhysAtt(5);
        super.setMagicAtt(20);
        super.setPhysDef(0.0);
        super.setMagicDef(0.8);
        this.physicalAttack = getPhysAtt();
        this.magicalAttack = getMagicAtt();
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.getHealth() == 0) {
            System.out.println("Hero alredy death!");
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
    public String toString() {
        return "Magician {health = " + getHealth() + " }";
    }

}

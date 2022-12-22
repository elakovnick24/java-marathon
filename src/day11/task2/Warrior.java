package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    final double PHYS_ATTACK = 30;
    final double PHYS_DEFENSE = 0.8;
    final double MAGIC_DEFENSE = 0.0;
    
    public Warrior() {
        super();
        super.setPhysAtt(PHYS_ATTACK);
        super.setPhysDef(PHYS_DEFENSE);
        super.setMagicDef(MAGIC_DEFENSE);
    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

    @Override
    public String toString() {
        return "Warrior {health = " + getHealth() + " }";
    }

}

package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    final double PHYS_ATTACK = 5;
    final double MAGIC_ATTACK = 20;
    final double PHYS_DEFENSE = 0.0;
    final double MAGIC_DEFENSE = 0.8;

    public Magician() {
        super();
        super.setPhysAtt(PHYS_ATTACK);
        super.setMagicAtt(MAGIC_ATTACK);
        super.setPhysDef(PHYS_DEFENSE);
        super.setMagicDef(MAGIC_DEFENSE);
    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

     @Override
    public void magicalAttack(Hero hero) {
        super.magicalAttack(hero);
    }

    @Override
    public String toString() {
        return "Magician {health = " + getHealth() + " }";
    }

}

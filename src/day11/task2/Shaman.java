package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    final int HEALER_SELF = 50;
    final int HEALER_TEAMMATE = 50;
    final double PHYS_ATTACK = 10;
    final double MAGIC_ATTACK = 15;
    final double MAGIC_DAMAGE = 50;
    double magicalAttack;

    public Shaman() {
        super();
        super.setPhysAtt(10);
        super.getPhysAtt();
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        super.setMagicAtt(MAGIC_ATTACK);
        super.setHealerHimSelf(HEALER_SELF);
        super.setHealerTeamMate(HEALER_TEAMMATE);
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
    public void healHimself() {
        super.healHimself();
    }

    @Override
    public void healTeammate(Hero hero) {
        super.healTeammate(hero);
    }

    @Override
    public String toString() {
        return "Shaman {health = " + getHealth() + " }";
    }

}

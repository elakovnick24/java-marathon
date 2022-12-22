package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    final int HEALER_SELF = 25;
    final int HEALER_TEAMMATE = 10;
    final double PHYS_ATTACK = 15;
    final double PHYS_DEFENSE = 0.5;
    final double MAGIC_DEFENSE = 0.2;

    public Paladin() {
        super();
        super.setPhysAtt(PHYS_ATTACK);
        super.setPhysDef(PHYS_DEFENSE);
        super.setMagicDef(MAGIC_DEFENSE);
        super.setHealerHimSelf(HEALER_SELF);
        super.setHealerTeamMate(HEALER_TEAMMATE);
    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
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
        return "Paladin {health = " + getHealth() + " }";
    }

}

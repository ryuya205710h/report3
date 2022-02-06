package jp.ac.uryukyu.ie.e205710;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing skillDamage){
        int damage = (int)(attack * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, skillDamage.getName(), damage);
        skillDamage.wounded(damage);
    }
}

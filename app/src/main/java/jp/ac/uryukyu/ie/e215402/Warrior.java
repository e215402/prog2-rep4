package jp.ac.uryukyu.ie.e215402;


public class Warrior extends Hero{
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }
    
    
    public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}

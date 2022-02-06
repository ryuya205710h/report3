package jp.ac.uryukyu.ie.e205710;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * attackWithWeponSkillがしっかり機能しているかを検証
     * 検証手順
     * 　⑴WarriorとEnemyを用意。
     * 　⑵Warriorの攻撃力の1.5倍とEnemyの最初のHP-攻撃された後のHpを比較
     */
    @Test
    void warriorTest(){
        Enemy enemy = new Enemy("テスト敵", 100, 0);
        Warrior warrior = new Warrior("テストキャラ", 100, 10);
        for(int i=0; i<3; i++){
            int hikakuHP = enemy.hitPoint ;
            warrior.attackWithWeponSkill(enemy);
            assertEquals((int)(warrior.getAttack()*1.5), hikakuHP-enemy.getHP());
        }
    }
}

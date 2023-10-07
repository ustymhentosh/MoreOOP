package kick;

import java.util.Random;
import lotr.Character;

public class KingStrategy implements KickStrategy {

    @Override
    public void kick(Character whoKicks, Character opponent) {
        int damage = new Random().nextInt(whoKicks.getPower()) + 1;
        System.out.println(whoKicks.toString() + " deals " + damage + " damage to the " + opponent.toString());
        opponent.decreaseHP(damage);
    }

}

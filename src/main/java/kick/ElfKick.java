package kick;

import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character whoKicks, Character opponent) {
        if (opponent.getPower() < whoKicks.getPower()) {
            System.out.println(whoKicks.toString() + " kills " + opponent.toString());
            opponent.setHp(0);

        } else {
            System.out.println(whoKicks.toString() + " deals 1 damage to the " + opponent.toString());
            opponent.decreaseHP(1);

        }

    }

}

package kick;

import lotr.Character;

public class Cry implements KickStrategy {

    @Override
    public void kick(Character whoKicks, Character opponent) {
        System.out.println(whoKicks.toString() + " is crying");
    }

}

package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println(c1.toString()+ " and " + c2.toString() + " are created");
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c1.toString() + " wins!");
                break;
            }
            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c2.toString() + " wins!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}
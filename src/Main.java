import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a Player
        Player player = new Player("Tim", 10, 15);
        System.out.println("Player:");
        System.out.println(player);

        // Save the player's data
        List<String> playerData = player.write();

        // Create a new Player instance and load the saved data
        Player newPlayer = new Player("", 0, 0);
        newPlayer.read(playerData);
        System.out.println("New Player (loaded from saved data):");
        System.out.println(newPlayer);

        System.out.println();

        // Create a Monster
        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println("Monster:");
        System.out.println(monster);

        // Save the monster's data
        List<String> monsterData = monster.write();

        // Create a new Monster instance and load the saved data
        Monster newMonster = new Monster("", 0, 0);
        newMonster.read(monsterData);
        System.out.println("New Monster (loaded from saved data):");
        System.out.println(newMonster);
    }
}

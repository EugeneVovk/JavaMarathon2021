package day7;

public class Player {

    private int stamina;  // инициализируется через конструктор
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;
        //  выносливость достигает 0, игроку нужен отдых и он уходит с поля
        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        System.out.println(
                countPlayers < 6 ? "Команды неполные. На поле еще есть "
                        + (6 - countPlayers) + " свободных мест" :
                        "На поле нет свободных мест");
    }
}
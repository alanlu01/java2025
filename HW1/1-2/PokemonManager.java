package ntou.cs.java2025;
// Pokemon收藏管理器
class PokemonManager {
    private static final int MAX_SIZE = 10;
    private static Pokemon[] collection = new Pokemon[MAX_SIZE];
    private static int count = 0;

    // 靜態方法：新增Pokemon
    public static boolean add(Pokemon pokemon) {
        if (count < MAX_SIZE) {
            collection[count++] = pokemon;
            return true;
        } else {
            return false;
        }
    }

    // 靜態方法：顯示所有Pokemon
    public static void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + collection[i]);
        }
    }

    // 靜態方法：按類型查找Pokemon
    public static Pokemon[] findByType(PokemonType type) {
        int foundCount = 0;
        for (int i = 0; i < count; i++) {
            if (collection[i].getType() == type) {
                foundCount++;
            }
        }
        Pokemon[] result = new Pokemon[foundCount];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (collection[i].getType() == type) {
                result[index++] = collection[i];
            }
        }
        return result;
    }

    // 靜態方法：獲取最強的Pokemon
    public static Pokemon getStrongest() {
        if (count == 0) {
            return null;
        }
        Pokemon strongest = collection[0];
        for (int i = 1; i < count; i++) {
            if (collection[i].getPower() > strongest.getPower()) {
                strongest = collection[i];
            }
        }
        return strongest;
    }
}
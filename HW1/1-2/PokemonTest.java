package ntou.cs.java2025;//01257117呂翰昇
public class PokemonTest {
    public static void main(String[] args) {
        // Add Pokemon to the Collection
        PokemonManager.add(new Pokemon("皮卡丘 (Pikachu)", PokemonType.ELECTRIC, 750));
        PokemonManager.add(new Pokemon("雷丘 (Raichu)", PokemonType.ELECTRIC, 950));
        PokemonManager.add(new Pokemon("傑尼龜 (Squirtle)", PokemonType.WATER, 550));
        PokemonManager.add(new Pokemon("可達鴨 (Psyduck)", PokemonType.WATER, 620));
        PokemonManager.add(new Pokemon("小火龍 (Charmander)", PokemonType.FIRE, 650));
        PokemonManager.add(new Pokemon("噴火龍 (Charizard)", PokemonType.FIRE, 1100));
        PokemonManager.add(new Pokemon("妙蛙種子 (Bulbasaur)", PokemonType.GRASS, 600));
        PokemonManager.add(new Pokemon("妙蛙花 (Venusaur)", PokemonType.GRASS, 1020));
        PokemonManager.add(new Pokemon("超夢 (Mewtwo)", PokemonType.PSYCHIC, 1200));
        PokemonManager.add(new Pokemon("胡地 (Alakazam)", PokemonType.PSYCHIC, 980));
        PokemonManager.add(new Pokemon("雷電獸 (Manectric)", PokemonType.ELECTRIC, 870));
        PokemonManager.add(new Pokemon("暴鯉龍 (Gyarados)", PokemonType.WATER, 1150));

        // 顯示所有Pokemon
        PokemonManager.showAll();

        // 顯示最強的Pokemon
        System.out.println("\n最強的Pokemon：" + PokemonManager.getStrongest());

        // 搜尋水系Pokemon
        System.out.println("\n水系Pokemon：");
        Pokemon[] waterType = PokemonManager.findByType(PokemonType.WATER);
        for (Pokemon p : waterType) {
            System.out.println(p);
        }
    }
}
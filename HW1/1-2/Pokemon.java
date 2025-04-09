package ntou.cs.java2025;
//01257117呂翰昇
public class Pokemon {
    private final String name;
    private final PokemonType type;
    private final int power;

    public Pokemon(String name, PokemonType type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", " + power + ")";
    }
}
/**
 * Represents one row from the Pokemon dataset.
 *
 * This class encapsulates data for a single Pokemon including its name, types,
 * stats, and other attributes from the CSV file.
 *
 * @author BeeRice31
 * @version 1.0
 * @collaborator CoPilot
 */
public class Pokemon {

    private String name;
    private int pokedexNumber;
    private String type1;
    private String type2;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private String sprite;
    private String description;

    /**
     * Constructs a new Pokemon object with all attributes.
     *
     * @param name the name of the Pokemon
     * @param pokedexNumber the Pokedex number
     * @param type1 the primary type
     * @param type2 the secondary type (can be empty string)
     * @param hp the HP stat
     * @param attack the Attack stat
     * @param defense the Defense stat
     * @param speed the Speed stat
     * @param sprite the URL to the Pokemon sprite
     * @param description the description of the Pokemon
     */
    public Pokemon(String name, int pokedexNumber, String type1, String type2, int hp, int attack, int defense, int speed, String sprite, String description) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.sprite = sprite;
        this.description = description;
    }

    /**
     * Gets the name of the Pokemon.
     *
     * @return the Pokemon's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Pokedex number of the Pokemon.
     *
     * @return the Pokedex number
     */
    public int getPokedexNumber() {
        return pokedexNumber;
    }

    /**
     * Gets the primary type of the Pokemon.
     *
     * @return the primary type
     */
    public String getType1() {
        return type1;
    }

    /**
     * Gets the secondary type of the Pokemon.
     *
     * @return the secondary type (empty string if none)
     */
    public String getType2() {
        return type2;
    }

    /**
     * Gets the HP stat of the Pokemon.
     *
     * @return the HP value
     */
    public int getHp() {
        return hp;
    }

    /**
     * Gets the Attack stat of the Pokemon.
     *
     * @return the Attack value
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Gets the Defense stat of the Pokemon.
     *
     * @return the Defense value
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Gets the Speed stat of the Pokemon.
     *
     * @return the Speed value
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the sprite URL of the Pokemon.
     *
     * @return the sprite URL
     */
    public String getSprite() {
        return sprite;
    }

    /**
     * Gets the description of the Pokemon.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a string representation of the Pokemon object.
     *
     * @return a formatted string with all Pokemon data
     */
    @Override
    public String toString() {
        return String.format("Pokemon{name='%s', pokedexNumber=%d, type1='%s', type2='%s', hp=%d, attack=%d, defense=%d, speed=%d, sprite='%s', description='%s'}",
                name, pokedexNumber, type1, type2, hp, attack, defense, speed, sprite, description);
    }
}
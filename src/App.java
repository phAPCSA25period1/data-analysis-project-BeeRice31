import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * This program reads a Pokemon dataset from a CSV file, parses the data into Pokemon objects,
 * performs various analyses on the data, and answers the guiding question about the most common types.
 *
 * @author BeeRice31
 * @version 1.0
 * @collaborator CoPilot
 */
public class App {

    /**
     * Main method that executes the data analysis program.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Update this with your CSV file path
        File file = new File("data/pokemon.csv");

        // Create an ArrayList of Pokemon objects to store data
        ArrayList<Pokemon> pokemonList = new ArrayList<>();

        // Read file using Scanner
        try (Scanner scanner = new Scanner(file)) {
            // Skip header row
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Loop through rows
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                // Ensure we have the correct number of columns
                if (parts.length >= 10) {
                    // Parse each column
                    int number = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String type1 = parts[2].trim();
                    String type2 = parts[3].trim();
                    int hp = Integer.parseInt(parts[4].trim());
                    int attack = Integer.parseInt(parts[5].trim());
                    int defense = Integer.parseInt(parts[6].trim());
                    int speed = Integer.parseInt(parts[7].trim());
                    String sprite = parts[8].trim();
                    String description = parts[9].trim();

                    // Create new Pokemon object and add to list
                    Pokemon pokemon = new Pokemon(name, number, type1, type2, hp, attack, defense, speed, sprite, description);
                    pokemonList.add(pokemon);
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Call your analysis methods
        Map<String, Integer> typeCounts = countTypes(pokemonList);
        double averageHP = computeAverageHP(pokemonList);
        int maxAttack = findMaxAttack(pokemonList);
        int minDefense = findMinDefense(pokemonList);
        String mostCommonType = findMostCommonType(typeCounts);

        // Print insights
        System.out.println("=== Pokemon Data Analysis ===");
        System.out.println("Number of Pokemon loaded: " + pokemonList.size());
        System.out.println("Average HP: " + String.format("%.2f", averageHP));
        System.out.println("Maximum Attack: " + maxAttack);
        System.out.println("Minimum Defense: " + minDefense);
        System.out.println("\nType Distribution:");
        for (Map.Entry<String, Integer> entry : typeCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nMost common type: " + mostCommonType);

        // Answer to guiding question
        System.out.println("\nGuiding Question: What are the most common types from the original 151 pokemon?");
        System.out.println("Answer: The most common type is " + mostCommonType + " with " + typeCounts.get(mostCommonType) + " occurrences.");
    }

    /**
     * Counts the occurrences of each Pokemon type (both primary and secondary).
     *
     * @param pokemonList the list of Pokemon objects
     * @return a map containing type names as keys and their counts as values
     */
    public static Map<String, Integer> countTypes(ArrayList<Pokemon> pokemonList) {
        Map<String, Integer> typeCounts = new HashMap<>();
        for (Pokemon pokemon : pokemonList) {
            // Count primary type
            String type1 = pokemon.getType1();
            if (!type1.isEmpty()) {
                typeCounts.put(type1, typeCounts.getOrDefault(type1, 0) + 1);
            }
            // Count secondary type
            String type2 = pokemon.getType2();
            if (!type2.isEmpty()) {
                typeCounts.put(type2, typeCounts.getOrDefault(type2, 0) + 1);
            }
        }
        return typeCounts;
    }

    /**
     * Computes the average HP across all Pokemon.
     *
     * @param pokemonList the list of Pokemon objects
     * @return the average HP value
     */
    public static double computeAverageHP(ArrayList<Pokemon> pokemonList) {
        if (pokemonList.isEmpty()) return 0.0;
        int totalHP = 0;
        for (Pokemon pokemon : pokemonList) {
            totalHP += pokemon.getHp();
        }
        return (double) totalHP / pokemonList.size();
    }

    /**
     * Finds the maximum attack stat among all Pokemon.
     *
     * @param pokemonList the list of Pokemon objects
     * @return the maximum attack value
     */
    public static int findMaxAttack(ArrayList<Pokemon> pokemonList) {
        if (pokemonList.isEmpty()) return 0;
        int maxAttack = Integer.MIN_VALUE;
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getAttack() > maxAttack) {
                maxAttack = pokemon.getAttack();
            }
        }
        return maxAttack;
    }

    /**
     * Finds the minimum defense stat among all Pokemon.
     *
     * @param pokemonList the list of Pokemon objects
     * @return the minimum defense value
     */
    public static int findMinDefense(ArrayList<Pokemon> pokemonList) {
        if (pokemonList.isEmpty()) return 0;
        int minDefense = Integer.MAX_VALUE;
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getDefense() < minDefense) {
                minDefense = pokemon.getDefense();
            }
        }
        return minDefense;
    }

    /**
     * Finds the most common type from the type counts map.
     *
     * @param typeCounts the map of type counts
     * @return the name of the most common type
     */
    public static String findMostCommonType(Map<String, Integer> typeCounts) {
        String mostCommonType = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : typeCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonType = entry.getKey();
            }
        }
        return mostCommonType;
    }
}
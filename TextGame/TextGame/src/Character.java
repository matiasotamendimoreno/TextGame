import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private int strength;
    private int perception;
    private int endurance;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;
    private List<String> perks;
    private List<String> skills;

    private Equipment equipment;

    // Constructor
    public Character(String name, int strength, int perception, int endurance, int charisma, int intelligence, int agility, int luck, double maxCarryWeight) {
        this.name = name;
        this.strength = strength;
        this.perception = perception;
        this.endurance = endurance;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.agility = agility;
        this.luck = luck;
        this.perks = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.equipment = new Equipment(maxCarryWeight);
    }

    // Métodos para gestionar perks y skills
    public void addPerk(String perk) {
        perks.add(perk);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public List<String> getPerks() {
        return perks;
    }

    public List<String> getSkills() {
        return skills;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getPerception() {
        return perception;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getLuck() {
        return luck;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}


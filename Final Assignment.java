import java.util.Random;

public class World {
   private int temperature;
   private String weather;
   private int foodlevel;
   private int numCreatures;

   public void setTemp(int temp) {
      temperature = temp;
   }

   public void setWeather(String w) {
      weather = w;
   }

   public void createCreature() {
        numCreatures = numc;
   }

   public void spawnFood() {

   }
   
   public void foodLevel() {
        foodlevel = f;
   }

/* I was a little confused on these 2 so I had to look it up*/
   public void mainLoop() {
    while (numCreatures > 0) {
       for (Creature creature : creatures) {
          if (Math.random() < creature.getDieChance()) {
             creatures.remove(creature);
             numCreatures--;
          }
          else if (Math.random() < creature.getReproduceChance()) {
             creatures.add(createCreature(creature.getName()));
             numCreatures++;
          }
       }
    }
 }

   public String nameGenerator() {
    List<String> names = null;
    try {
       names = Files.readAllLines(Paths.get("name.txt"));
    } catch (IOException e) {
       e.printStackTrace();
    }
 
    int numNames = names.size();
    int randomIndex = (int) (Math.random() * numNames);
    return names.get(randomIndex);
 }
}

public class Creature extends World {
    private double dieChance;
    private double reproduceChance;

   public void die() {

   }

   public void reproduce() {
 
   }
    public void checkHabitability() {
 
   }
}
/* These creatures have the same variable types but I didnt put into the parent becasue they will be different for both*/
public class CreatureType1 extends Creature {
    private int hunger;
    private int health;
    private int happiness;
    private int tempSensitivity;
    private int weatherSensitivity;

    public void setName(String n) {
        name = n;
     }
     public void setHealth(int h) {
        health = h;
     }
 }
 
 public class CreatureType2 extends Creature {
    private int hunger;
    private int health;
    private int happiness;
    private int tempSensitivity;
    private int weatherSensitivity;
   
    public void setName(String n) {
        name = n;
     }
     public void setHealth(int h) {
        health = h;
     }
 }

public class Main {
   public static void main(String[] args) {

   }
}
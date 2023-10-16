import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to my game!");
        System.out.print("Please write your name");

        Scanner scanner = new Scanner(System.in);
        Person gamer = new Person();
        gamer.name = scanner.nextLine();
        Monster creep = new Monster();
        System.out.println(" What number of max hp for monster you want?");
        double n = Math.random() * 100;

        creep.changeDef(28);
        creep.changeDamage(10);
        creep.changeMaxHp(100);

        gamer.changeDef(15);
        gamer.changeDamage(20);
        gamer.changeMaxHp(100);

    }

    private static double numberOfCubes(double damage, double defends) {

        if (damage - defends <= 0) {
            return 1;
        } else {
            return (damage - defends + 1);
        }

    }

    private static double damageDeterminant(double n, double damage) {
        double allDamage = 0;
        for (double i = 0; i < n; n++) {
            allDamage = allDamage + Math.random() * damage;
        }
        return allDamage;
    }

    private static void applicationDamage(double damage, double hp) {
        if (hp - damage <= 0) hp = 0;
        else hp = hp - damage;
    }
}

abstract class Character {
    private double def, damage, hp, maxHp;

    public void changeDef(double def) {
        this.def = def;
    }

    public void changeDamage(double def) {
        this.def = def;
    }

    public void changeMaxHp(double maxHp) {
        this.maxHp = hp = maxHp;
    }

    public void changeHp(double hp) {
        this.hp = hp;
    }

    public void healing(double n){

        hp = Math.min(hp + hp * n, maxHp);

    }

}
class Monster extends Character{
    String name;
    {
        name = "Undefined";
    }

}
class Person extends Character {
    String name;
    private int heal = 4;

    public void usingHeal(double n){
        if (heal>0) {
            heal--;
            healing(n);
        }
        else System.out.println("Sorry but your healing is over");
    }
}
package homework.hw4;

/*
Homework 4
Dynasties
 */
public class Dynasties {
    public static void main(String[] args) {
        byte leeSoldierDamage = 13;
        byte leeArcherDamage = 24;
        byte leeRiderDamage = 46;
        int leeEachWarriorsQuantity = 860;
        int leeTotalDamage = (leeSoldierDamage + leeArcherDamage + leeRiderDamage) * leeEachWarriorsQuantity;
        System.out.println("The total damage of Lee`s warriors is " + leeTotalDamage);

        byte mingSoldierDamage = 9;
        byte mingArcherDamage = 35;
        byte mingRiderDamage = 12;
        int mingEachWarriorsQuantity = (int) (leeEachWarriorsQuantity * 1.5);
        int mingTotalDamage = (mingSoldierDamage + mingArcherDamage + mingRiderDamage) * mingEachWarriorsQuantity;
        System.out.println("The total damage of Ming`s warriors is " + mingTotalDamage);
    }
}
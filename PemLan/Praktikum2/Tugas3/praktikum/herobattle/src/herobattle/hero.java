package herobattle;

    import java.util.Scanner;

    public class hero {
        private String name;
        private double healthPoint;
        private double attack;
        private double defense;
    
        public hero(String name, double healthPoint, double attack, double defense) {
            this.name = name;
            this.healthPoint = healthPoint;
            this.attack = attack;
            this.defense = defense;
        }
    
        public String getName() {
            return name;
        }
    
        public double getHealthPoint() {
            return healthPoint;
        }
    
        public void setHealthPoint(double healthPoint) {
            this.healthPoint = healthPoint;
        }
    
        public double getAttack() {
            return attack;
        }
    
        public double getDefense() {
            return defense;
        }

        public void attack(hero opponent) {
            System.out.println(this.name + " menyerang " + opponent.getName());
        
            // Serangan dari hero ke opponent
            double damageToOpponent = calculateDamage(this.attack, opponent.getDefense());
            System.out.println(this.name + " menyerang sebesar " + damageToOpponent);
            opponent.setHealthPoint(opponent.getHealthPoint() - damageToOpponent);
            System.out.println(opponent.getName() + " memiliki pertahanan sebesar " + opponent.getDefense());
            System.out.println("Health " + opponent.getName() + " saat ini " + opponent.getHealthPoint());
        
            // Serangan balik dari opponent ke hero
            double damageToHero = calculateDamage(opponent.getAttack(), this.defense);
            System.out.println(opponent.getName() + " menyerang " + this.name);
            System.out.println(opponent.getName() + " menyerang sebesar " + damageToHero);
            this.healthPoint -= damageToHero;
            System.out.println(this.name + " memiliki pertahanan sebesar " + this.defense);
            System.out.println("Health " + this.name + " saat ini " + this.healthPoint);
        }         
    
        private double calculateDamage(double attack, double defense) {
            double damage = attack - defense;
            if (damage < 0) {
                damage = 0;
            }
            return damage;
        }
    }


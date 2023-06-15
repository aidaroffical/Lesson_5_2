public class Hero {
    private int Health;
    private int Damage;
    private int superFly;

    public Hero(String Naruto, int health, int damage, int i){
            Health = health;
            Damage = damage;
    }

    public int getHealth(){
        return Health;
    }

    public int getDamage(){
        return Damage;
    }

    public int getSuperFly(){
        return superFly;
    }

    public Hero(int health, int damage, int superFly){
        Health = health;
        Damage = damage;
        this.superFly = superFly;
    }
}

public class Boss {
    private int Health;
    private int Damage;
    private String bossDefenceType;

    public int getHealth(){
        return Health;
    }

    public void setHealth(int health){
        Health = health;
    }

    public int getDamage(){
        return Damage;

    }

    public void setDamage(int damage){
        Damage = damage;
    }

    public String getBossDefencetype(){
        return bossDefenceType;
    }

    public void setBossDefencetype(String bossDefenceType){
        this.bossDefenceType = bossDefenceType;
    }
}

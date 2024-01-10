/*
a simple game scenario with two player classes, Player_1 and Player_2. Both players have attributes such as name, weapon, and health. 
Player_2 is a subclass of Player_1 and introduces an extra attribute called armor.
The game features methods like damageByGan1() and damageByGan2() to simulate damage inflicted on players by different guns.
Additionally, there is a healing method (heal()) to replenish a player's health.
In the Test class, instances of both Player_1 and Player_2 are created, and various methods are invoked to demonstrate the damage and 
healing mechanisms. Overall, the code provides a basic illustration of player classes and their interactions in a simple game context.
*/

//Let's see the code--------->>>>>>>>
//--------------------------->>>>>>>>

//player-1
package Simple_game;
public class Player_1 {
    private String name;
    private String Weapon;
    private int health;
    
    public Player_1(String name,String Weapon,int health){
        this.name=name;
        this.Weapon=Weapon;
        
        if(health<0 || health>100)
            this.health=100;
        else
        this.health=health;
    }
    
    public void damageByGan1(){
        this.health-=30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by Gun_1. health is reduce by 30"+
                ". New health is "+this.health);
        if(health==0){
            System.out.println(getName()+" is dead");
        }
    }
    
        public void damageByGan2(){
        this.health-=50;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by Gun_1. health is reduce by 30"+
                ". New health is "+this.health);
        if(health==0){
            System.out.println(getName()+" is dead");
        }
    }

         public void heal(){
             if(health<=0)
                 System.out.println("player is dead .Heal is not possible");
             else{
                 this.health=100;
                 System.out.println("health is "+this.health);
             }
         }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String Weapon) {
        this.Weapon = Weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
}

//player-2
package Simple_game;
public class Player_2 extends Player_1 {
    private int health;
    private boolean armor;
 

    public Player_2(String name, String Weapon, int health,boolean armor) {
        super(name, Weapon, health);
        this.health=health;
        this.armor=armor;
    }
    
    @Override
    public void damageByGan1(){
        if(armor){
            this.health-=20;
            if(health<=0){
                this.health=0;
            }
            System.out.println("Armor is on. Got hit by gun 1. Health is reduced by 20."
                    + " New health is "+ this.health);
        }
        if(!armor){
            this.health-=30;
            if(this.health<=0)
                this.health=0;
            System.out.println("Armor is off. Got hit by gun 1. Health is reduced by 30."
                    + " New health is "+ this.health);
        }
        if(this.health==0){
             System.out.println(getName()+"is dead");
        }
    }
    
        @Override
    public void damageByGan2(){
        if(armor){
            this.health-=20;
            if(health<=0){
                this.health=0;
            }
            System.out.println("Armor is on. Got hit by gun 2. Health is reduced by 20."
                    + " New health is "+ this.health);
        }
        if(!armor){
            this.health-=30;
            if(this.health<=0)
                this.health=0;
            System.out.println("Armor is off. Got hit by gun 2. Health is reduced by 30."
                    + " New health is "+ this.health);
        }
                if(this.health==0){
             System.out.println(getName()+"is dead");
        }
    }
}

//main class
package Simple_game;
public class Test {

    public static void main(String[] args) {
          Player_1 player=new Player_1("Israt", "Sword",100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());
           
        player.damageByGan1();
         player.damageByGan1();
       //   player.damageByGan2();
          player.heal();

         Player_2 betterplayer=new Player_2("jahan", "machine gan", 90,false);
         betterplayer.damageByGan1();
    }
    
}


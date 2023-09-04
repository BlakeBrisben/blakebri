public class NonPlayableCharacter {
    public boolean playable = false;
    public boolean resting = true;
    public String name;
    public String action = "default";

    public NonPlayableCharacter(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        NonPlayableCharacter npc1 = new NonPlayableCharacter("Fred");
        
        if(!npc1.playable && !npc1.resting){
            switch (npc1.action){
                case "talking":
                    npc1.talk();
                    break;
                case "moving":
                    npc1.move();
                    break;
                case "eating":
                    npc1.eat();
                    break;
                case "drinking":
                    npc1.drink();
                    break;
                default:
                    npc1.defaultAction();
            }
        }
    }

    public void talk(){
        System.out.println(this.name + ": What a marvelous day!");
        this.resting = true;
        this.action = "default";
    }

    public void move(){
        //insert functionality for moving
        //this will take several lines
        //of code
    }

    public void eat(){
        //insert functionality eating
        //this will take several lines
        //of code
    }

    public void drink(){
        //insert functionality for drinking
        //this will take several lines
        //of code
    }

    public void defaultAction(){
        //do nothing
        //or do something 
    }
}
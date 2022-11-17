public class Mario implements Contract {
    private String character;
    private int tokens;
    private int shrooms;
    private static boolean direction;
    private static String item;
    private int hitPoints; 
    private boolean forward;
    private boolean backward;


public Mario(String character, int tokens, int shrooms){
    this.character = character;
    this.tokens = tokens;
    this.tokens = 0;
    this.shrooms = shrooms;
    this.shrooms = 0;
    this.hitPoints = 5;


}


/**
 * This chooses if you want to be Mario or Luigi a7nd it will print which you are and the description
 * @param name the name of the character
 */
public void player(String name) {

    if (this.character == "Mario");{
        System.out.println("It's a-me, Mario!");
        System.out.println("Mario has a red hat with an M on it!");}
    
    if (this.character == "Luigi"){
        System.out.println("Luigi has a green hat with an L on it!");
        System.out.println("I'm-a Luigi, number one!");}
   
    else{
        System.out.println("Sorry, try again. Would you like to be Mario or Luigi?");
    }  
}

/**
 * This tells you that if you are walking forward or backward, then the walk method is true
 * @param direction - it tells us if you are moving forward or backward
 * @return boolean - true/false whether or not the character can walk
 */
public boolean walk(String direction) {
    if (Mario.direction = forward){
        System.out.println("You are walking forward!");
    }
    if (Mario.direction == backward){
        System.out.println("You are walking backward!");
}
    return true;
}

/**
 * This asks if there are enough shrooms or feathers for the character to fly
 * @param int shrooms - tells us the number of shrooms - if it qualifies for flying
 * @param int feathers - tells us the number of feathers - if it qualifies for flying
 * @return boolean, true/false whether you are flying or not
 */
public boolean fly(int shrooms, int feathers) {
    if (shrooms == 7){
        System.out.println("You have collected enough to fly!");
    }
    if (feathers == 2){
    System.out.println("You have collected enough feathers to fly!");
    }
    return true;
}



/**
 * Tells us if your character is grabbing a token or not
 * @param item - if you are grabbing a token and then it will add a token to the count
 */
public void grab(String item) {
if (this.tokens == 0){
    System.out.println("No tokens for you! Go get more!");
}    
if (this.tokens == 1){
    this.tokens =+ 1;
    System.out.println("You got a token!");}
}

/**
 * Tells us if you drop a token if you are holding too many (more than five)
 * @param item - the tokens your character has/is holding
 * @return item - returns the item used
 */
public String drop(String item) {
  
    if (tokens == 5 || tokens > 5){
        System.out.println("You have too many tokens! Get rid of one!");
    }
    if (tokens == 1){
        tokens =- 1;
        System.out.println("You dropped a token!");}
    else{
        System.out.println("You're good! You can always get some more!");
    }
    return item;
    }

/**
 * Examines if there is an enemy, if not goes forward
 * @param item
 */
    public void examine(String item) {
        if (this.item == "Goombas"){
        System.out.println("There's something in your way! Examine it!");}
            else{
                System.out.println("Nothing is there! Keep on going friend!");
            }
    }

/**
 *  Allows you to use the shrooms depending on the number - the more you save the cooler the benefits
 * @param item
 */    
    public void use(String item) {
        if (shrooms == 2){
            System.out.println("You have used two shrooms. You can now double jump!");
        }
        if (shrooms == 4){
            System.out.println("You have used four shrooms. You can now sprint!");
        }
        if (shrooms == 6){
            System.out.println("You have used six shrooms. You can now turn invisible!");
        }
    }

/**
 * This will undo/revive you if you are dead or not - depemnds on how many tokens you have
 */
public void undo() {
    if (tokens > 10){
        System.out.println("You have used 10 tokens. Your progress has been saved. You will be revived at the last checkpoint.");
    }
    if (tokens < 10){
        System.out.println("You do not have enough tokens. You unfortunately must restart this level.");
    }
}

/**
 * This will shrink you if you take too many hits
 * @return hitPoints
 */
public Number shrink() {
    if (hitPoints == 1){
       System.out.println("You've been hit too much. You will now shrink.");
    }
    else{
        System.out.println("You will remain at normal size.");
    }
    return hitPoints;
    }


/**
 * This causes you to grow if you eat a certain number of shrooms
 * @return shrooms
 */
public Number grow() {
    if (shrooms == 1){
        System.out.println("You have used a shroom! You are big now!");
    }
    else{
        System.out.println("You are remaining your normal size.");
    }
    return shrooms;
    }

/**
 * This tells you to rest/die depending on what your hitpoints are at
 */    
public void rest() {
    if (hitPoints == 0){
        System.out.println("You have been hit too many times. You are now dead.");
    }
    else{
        System.out.println("You are still on your feet! Keep going!");
    }
        
    }

public static void main(String args[]){
    Mario Player = new Mario("Mario", 4, 7);
    System.out.println(Player);
    System.out.println("Welcome to the game!");
    Player.grab(item);
    Player.drop(item);
    Player.examine(item);
    Player.use(item);
    
    
    

}
}

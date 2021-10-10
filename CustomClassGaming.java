// Create a Class for Rockstar Games Capable of Hitting, Running, Firing, etc.

package com.CodeByMeet;
class RockstarGames{
    public void Hit(){
        System.out.println("Hitting...");
    }
    public void Run(){
        System.out.println("Running...");
    }
    public void Fire(){
        System.out.println("Firing...");
    }
}
public class CustomClassGaming {
    public static void main(String[] args) {
        RockstarGames Anonymous = new RockstarGames();    // Instantiating a new RockstarGames Object.

        // Printing Attributes
        Anonymous.Hit();
        Anonymous.Run();
        Anonymous.Fire();
    }
}
// We can Apply Conditions to make This Program into Real Game.
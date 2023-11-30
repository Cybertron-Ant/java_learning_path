package com.test;


// class 'MagicalWorld' showing the magical world with mystical creatures casting spells and transforming
public class MagicalWorld {
    public static void main(String[] args) {

        // let's summon a unicorn!
        // creating a 'Unicorn' named Luna
        Unicorn myUnicorn = new Unicorn("Luna");

        // see its magical powers
        // using methods inherited from the MagicalCreature interface
        myUnicorn.castSpell(); // casting a spell
        myUnicorn.displayEssence(); // displaying essence

        // see the unicorn transform
        // utilizing a unique method of the Unicorn class
        myUnicorn.transform(); // transformation
      
    }// end method 'main'
  
}// end class 'MagicalWorld'

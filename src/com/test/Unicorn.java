package com.test;

import java.util.Random;

// class 'Unicorn' representing a mythical creature - the Unicorn
public class Unicorn implements MagicalCreature {
    private String name;

    // a mystical unicorn is born with a name.
    // constructor 'Unicorn' to initialize the 'Unicorn' with a name
    public Unicorn(String name) {
        this.name = name;
    }// end constructor 'Unicorn'

    // the unicorn casts a spell! It's utterly enchanting.
    // implements the 'castSpell' method defined in the 'MagicalCreature' interface
    @Override
    public void castSpell() {
        System.out.println(name + " casts a spell: *sparkles everywhere*");
    }// end method 'castSpell'

    // unicorns are ethereal, let's display their essence.
    // simulates casting a spell
    @Override
    public void displayEssence() {
        System.out.println(name + " emanates pure magic and grace.");
    }// end method 'displayEssence'
    
    // a mystical transformation for the unicorn!
    // A unique method for 'Unicorn': 'Transformation'
    public void transform() {
        // In a whirl of magic, the unicorn transforms.
        System.out.println(name + " transforms into a pegasus!");
    }// end method 'transform'
  
}// end class 'Unicorn'

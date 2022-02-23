public class Animal {
    // This class is going to be the superclass of many subclasses
    // Before going on, please draw the heirarchy of the following classes:
    // Animal, Human, Mammal, and Reptile
    
    // I haven't made the following classes, but try adding them to your hierarchy:
    // Bird, Falcon, Lizard, Dog, Amphibian, Poodle

    // What does it mean to be a "private" variable?
    private String name;
    private int numLegs;
    private boolean eatsMeat;
    private boolean isVertebrate;

    // What does it mean to be a "public" variable?
    // What does it mean to be a "static" variable?
    // What is this variable doing?
    public static int animals = 0;

    // What kind of method is this?
    // Is there a return type (i.e. void, int, String, boolean)
    // If there is a return type, what is it?
    // If there isn't a return type, why isn't there one?
    Animal() {
        name = "";
        numLegs = 0;
        eatsMeat = false;
        isVertebrate = false;
        animals++;
    }

    // What does the "this" keyword mean?
    // Does it matter that the parameters of this method have the same names as our data members?
    Animal(String name, int numLegs, boolean eatsMeat, boolean isVertebrate) {
        this.name = name;
        this.numLegs = numLegs;
        this.eatsMeat = eatsMeat;
        this.isVertebrate = isVertebrate;
        animals++;
    }

    // Why is this method public? What would happen if it wasn't public?
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public int getNumLegs() {
        return numLegs;
    }
    public void setNumLegs(int newNumLegs) {
        numLegs = newNumLegs;
    }

    public boolean eatsMeat() {
        return eatsMeat;
    }
    public void eatsMeat(boolean newBool) {
        eatsMeat = newBool;
    }

    public boolean isVertebrate() {
        return isVertebrate;
    }
    public void isVertebrate(boolean newBool) {
        isVertebrate = newBool;
    }

    // While it may be useful to create accessor (getter) and mutator (setter) methods
    // for ALL data members, that does not always make sense.

    // Do any of the above methods not make sense for an "Animal"?
    // Should we be able to "get" and "set" all of these variables?


    // Why would we want a toString() method in a class?
    public String toString() {
        String out = "";

        out += "Name: " + name + "\n";
        out += "Has " + numLegs + " legs.\n";

        // What is "\n"?

        if (eatsMeat) {
            out += "Eats meat.\n";
        }
        else {
            out += "Doesn't eat meat.\n";
        }

        if (isVertebrate) {
            out += "Has a spine.\n";
        }
        else {
            out += "Doesn't have a spine.\n";
        }

        return out;
    }

    // What would be printed if the following code was run in Main.java?

    // Animal a = new Animal( "Beverly", 4, true, true );
    // System.out.println( a.toString() );

}

public class Mammal extends Animal {
    
    private boolean hasHair;
    private boolean hasFur;

    Mammal() {

        // What does this do?
        super();

        hasHair = true;
        hasFur = false;
    }

    Mammal(String name, int numLegs, boolean eatsMeat, boolean isVertebrate, Speak noise, boolean hasHair, boolean hasFur) {

        // What does this do? What class is "super"?
        super(name, numLegs, eatsMeat, isVertebrate, noise);

        this.hasHair = hasHair;
        this.hasFur = hasFur;
    }


    public boolean hasHair() {
        return hasHair;
    }

    public boolean hasFur() {
        return hasFur;
    }

    // Why did I refrain from creating mutators/setters for those two booleans?
    // Hint: think about real life mammals


    // Why can't we just use the toString() method from the Animal class?
    public String toString() {
        String out = "";

        // What is this code doing?
        out += super.toString();

        out += "Is a mammal.\n";

        return out;
    }

}

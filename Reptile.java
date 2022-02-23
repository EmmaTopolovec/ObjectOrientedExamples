public class Reptile extends Animal {
    // What other class is on the same level of the heirarchy as Reptile?

    // What is Reptile's superclass?
    // What are all of Reptile's subclasses?
    
    private boolean hasScales;
    private boolean hasScutes;

    Reptile() {
        super();
        hasScales = true;
        hasScutes = false;
    }

    Reptile(String name, int numLegs, boolean eatsMeat, boolean isVertebrate, Speak noise, boolean hasScales, boolean hasScutes) {

        // What does this do? What class is "super"?
        super(name, numLegs, eatsMeat, isVertebrate, noise);

        this.hasScales = hasScales;
        this.hasScutes = hasScutes;
    }


    public boolean hasScales() {
        return hasScales;
    }

    public boolean hasScutes() {
        return hasScutes;
    }

    // Does not override the toString() method

}

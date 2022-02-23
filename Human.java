public class Human extends Mammal {

    // Is a Human an Mammal?
    // Is it an Animal?
    
    private String job;

    // What are some other variables we could make for the Human class?
    // Remember, each human should have a different value for that variable
    // Also, the variables should not be something all mammals or animals have

    Human() {
        super();
        job = "None";
    }
    

    Human(String name, int numLegs, boolean eatsMeat, boolean isVertebrate, Speak noise, boolean hasHair, boolean hasFur, String job) {

        // What does this do? What class is "super"?
        super(name, numLegs, eatsMeat, isVertebrate, noise, hasHair, hasFur);

        this.job = job;
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // Does it make sense to have a accessor and mutator for the "job" variable?


    // What is wrong with the following method?
    public String toString() {
        String out = "";

        out += super.toString();
        out += "Is a mammal.\n";
        out += "Is a human.\n";

        return out;
    }
    // Hint: what class is "super"?

}

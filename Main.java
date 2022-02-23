public class Main {
    // Please read through the files in the following order:

    /*
        1. Speak.java    
        2. Animal.java
        3. Mammal.java
        4. Human.java
        5. Reptile.java
        6. Speak.java (again)
        7. Main.java
    */

    // For each file, make sure to look at the comments and answer all questions

    // Look at the main method AFTER looking at ALL OTHER FILES!
    public static void main(String[] args) {

        /*
            While answering the following questions, don't be afraid to go back
            to the other files to see what certain methods are doing!
        */
        
        Animal a = new Animal();

        a.setName("Bob");
        System.out.println(a.toString()); // What is printed?

        a.isVertebrate(true);
        System.out.println(a.toString()); // What is printed?

        a.isVertebrate();
        System.out.println(a.toString()); // What is printed?
    

        Animal b = new Animal("Beverly", 4, true, true, new Speak(true, "Ribbit"));
        System.out.println(b.toString()); // What is printed?


        Mammal c = new Mammal();
        c.setName("Taylor Swift");
        System.out.println(c.hasHair()); // What is printed?


        Human d = new Human();
        d.setName(c.getName());
        d.setJob("Singer");   
        System.out.println(d.getJob()); // What is printed?


        System.out.println();


        Reptile e = new Reptile("Larry", 4, true, true, new Speak(false), true, false);
        System.out.println(e.toString()); // What is printed?

    }
}

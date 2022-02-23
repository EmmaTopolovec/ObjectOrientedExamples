public class Main {
    // Please read through the files in the following order:

    /*
        1. Animal.java
        2. Mammal.java
        3. Human.java
        4. Reptile.java
        5. Friendship.java
        6. Main.java
    */

    // For each file, make sure to look at the comments and answer all questions




    // Look at this main method AFTER looking at ALL OTHER FILES!
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
    


        Animal b = new Animal("Beverly", 4, true, true);
        System.out.println(b.toString()); // What is printed?


        Mammal c = new Mammal();
        c.setName("Taylor Swift");
        System.out.println(c.hasHair()); // What is printed?


        Human d = new Human();
        d.setName(c.getName());
        d.setJob("Singer");   
        System.out.println(d.getJob()); // What is printed?


        System.out.println();


        Reptile e = new Reptile("Larry", 4, true, true, true, false);
        System.out.println(e.toString()); // What is printed?


        Friendship f = new Friendship(d, e);
        f.printFriends(); // What is printed?


        // Why can you access the "animals" variable without a public getter method?
        // Could you do a.animals or b.animals ?
        System.out.println(Animal.animals); // What is printed?
    }
}

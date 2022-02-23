public record Speak(boolean makesNoise, String exampleNoise) {
    
    // What is a record?

    // Constructor
    Speak(boolean b) {
        // Calls default constructor below
        // What does the default constructor do?
        this(b, "");
    }

    // Prints exampleNoise
    public void speak() {
        System.out.println(exampleNoise);
    }


    // After looking at all of the other files (besides Main.java), answer the following questions:


    // Do makesNoise and exampleNoise function like public or private class variables?

    // How can you access makesNoise and exampleNoise outside of this file?

    // Are records easier to code than classes?

    // Why can't Animal be a record?

}

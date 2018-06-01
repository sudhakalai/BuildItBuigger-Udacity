package com.example.android.javajokeslibrary;

import java.util.Random;

public class myClass {

    private String[] jokes;
    private Random random;

    public myClass(){
        jokes = new String[11];
        jokes[0] = "When do you go at red and stop at green? When you're eating a watermelon.";
        jokes[1] = "Knock! Knock! Who’s there? A broken pencil. A broken pencil who? Never mind, it’s pointless.";
        jokes[2] = "Why is a bee’s hair always sticky? Because it uses a honey comb!";
        jokes[3] = "Nothing ruins a Friday more than an understanding that today is Tuesday.";
        jokes[4] = "What do you call a pile of kittens? A meowntain";
        jokes[5] = "What kind of dog chases anything red? A Bulldog.";
        jokes[6] = "Why do dogs bury bones in the ground? Because you can’t bury them in trees!";
        jokes[7] = "What do you call a cold dog? A Chilli Dog.";
        jokes[8] = "How are a dog and a marine biologist alike? One wags a tail and the other tags a whale.";
        jokes[9] = "What do you call a black Eskimo dog? A dusky husky!";
        jokes[10] = "What do you get when you cross a dog and a calculator? A friend you can count on.";

        random = new Random();
    }

    public String[] getJokes(){ return jokes;}

    public String getRandomJoke(){
        return jokes[random.nextInt(jokes.length)];
    }
}

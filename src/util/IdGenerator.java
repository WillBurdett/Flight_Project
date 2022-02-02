package util;

import java.util.Random;

public class IdGenerator {

    public String randomIdGenerator(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String randomString = "";

        Random random = new Random();

        for (int i=0; i<7; i++){
            randomString += characters.charAt(random.nextInt(characters.length()));
        }

        // if it matches an existing id, randomIdGenerator().
        return randomString;
    }
}

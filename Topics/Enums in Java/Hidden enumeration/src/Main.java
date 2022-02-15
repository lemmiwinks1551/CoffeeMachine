public class Main {
/*
    enum test {
        STAR, CRASH, START
    }*/

    public static void main(String[] args) {
    // write your program here
        int counter = 0;
        for (Secret item: Secret.values()) {
            if (item.toString().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/

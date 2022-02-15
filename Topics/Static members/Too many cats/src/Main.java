class Cat {

    // write static and instance variables
    static int counter = 0;
    /*
    public static void main(String[] args) {
        Cat cat1 = new Cat("1", 1);
        Cat cat2 = new Cat("2", 2);
        Cat cat3 = new Cat("3", 3);
        Cat cat4 = new Cat("4", 4);
        Cat cat5 = new Cat("5", 5);
        Cat cat6 = new Cat("6", 6);
        Cat cat7 = new Cat("7", 7);
        System.out.println(Cat.getNumberOfCats());
    }*/

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}
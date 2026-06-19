class GoodDogTestDrive {
    public static void main (String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(15);
        GoodDog three = new GoodDog();
        three.setSize(7);
        one.bark();
        two.bark();
        three.bark();
        }
    }
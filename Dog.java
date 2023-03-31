public class Dog {
    String breed;
    boolean hasOwner;
    int age;
    boolean hasFriends;
    long dateOfBirth; 
    
    public Dog(String dogBreed, boolean dogOwned, int dogYears, boolean hasFriends, long dateOfBirth) {
      System.out.println("Constructor invoked!");
      
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;
      hasFriends = hasFriends;
      dateOfBirth = dateOfBirth;
    }
    
    public static void main(String[] args) {
      System.out.println("Main method started");
      
      Dog fido = new Dog("poodle", false, 4, false, 2020102);
      Dog nunzio = new Dog("shiba inu", true, 12, false, 20220101);
      Dog tux = new Dog("germanshepper", true, 1, true, 20220204);
      Dog jules = new Dog("mix", false, 2, true, 20200101);
      boolean isFidoOlder = fido.age > nunzio.age;
      int totalDogYears = nunzio.age + fido.age;
  
      System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
      System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
      System.out.println("The total age of the dogs is: " + totalDogYears);
      System.out.println("Tux is a bread of: " + tux.breed + " and does he has friends? " + tux.hasFriends);
      System.out.println("Jules is of a race called: " + jules.breed );
      System.out.println("Main method finished");
    }
  }



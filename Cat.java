public class Cat {  // java class must be the same name on file
    String name;
    int age;
    long dateOfBirth;
    String location;
    boolean hasOwner;

    public Cat(String catName, int catAge, long birthDay, String catLocation, boolean hasOwner) { // java constructor is named after the class
        name = catName;
        age = catAge;
        dateOfBirth = birthDay;
        location = catLocation;
        hasOwner = hasOwner;
    }

        public static void main(String[] args) { // java method statements inside are executed when a method is call 
            Cat judy = new Cat("Judy", 3, 20191200, "new jersey", true);
            Cat jackie = new Cat("Jackie", 1, 20220100, "new jersey", false);

            System.out.println("Cat 1 info: " + judy.name + " " + judy.age + " " + judy.dateOfBirth + " " + judy.hasOwner);
            System.out.println("Cat 2 info: " + jackie.name + " " + jackie.age + " " + jackie.dateOfBirth + " " + jackie.hasOwner);
        }
}
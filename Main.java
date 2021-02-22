public class Main {
  public static void main(String[] args) {
    Room r = null;
    r = new Room("Violet");
    System.out.println(r.toString());
    //Expected output: Room Violet, contains: nothing

    Animal a = new Animal("Peter");
    System.out.println(a.toString());
    //Expected output: Animal Peter

    r.addAnimal(a);
    System.out.println(r.toString());
    //Expected output: Room Violet, contains: Animal Peter
    
    Room green = new Room("Green");
    for (int i = 0; i < 10; i++) {
      Animal aForGreen = new Animal("Name" + i);
      green.addAnimal(aForGreen);
    }

    System.out.println(green.toString());
    //Expected output: Room Green, contains: Animal Name0, Animal Name1, Animal Name2, Animal Name3, Animal Name4, Animal Name5, Animal Name6, Animal Name7, Animal Name8, and Animal Name9 

    Animal entering = new Animal("Lily");
    green.addAnimal(entering);
    //Expected output: Animal Lily cannot enter Room Green. There is no space for it.

    System.out.println(green.toString());
    //Expected output: Room Green, contains: Animal Name0, Animal Name1, Animal Name2, Animal Name3, Animal Name4, Animal Name5, Animal Name6, Animal Name7, Animal Name8, and Animal Name9 
  }
}

public class TestAnimal {
    public  static  void  main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.setName("Manjunatha P R");
        myAnimal.setAverageWeight(60);
        myAnimal.setAge(24);
        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
        System.out.println("Number of legs: " + myAnimal.getAge());
    }
}

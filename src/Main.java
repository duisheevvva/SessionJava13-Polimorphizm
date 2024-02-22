
public class Main {
    public static void main(String[] args) {

//       object tuzduk(parent classtyn negizinde) jana constructor jardamy menen maani berdik
        Animal animal1 = new Shark("white", 5, 'f');

        Animal animal2 = new Turtle("black", 7, 'm');

        Animal animal3 = new Eagle("black", 6, 'm');


//        Animal tibindegi massiv tuzduk
        Animal[] animals = {animal1, animal2, animal3};

//        ak tustogy janymardy chygaryy
        for (Animal animal : animals) {
            if (animal.getColor().equalsIgnoreCase("white")) {
                System.out.println(animal);
            }
        }

//        janybarlardy gender boiuncha aluu
        for (Animal animal : animals) {
            if (animal.getGender() == 'f') {
                System.out.println("Female: " + animal);
            }
        }


    }
}
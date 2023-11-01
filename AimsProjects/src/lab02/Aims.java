// Ta Van Hoan 20204973
package lab02;

public class Aims {

    public static void main(String[] args) {

        //Create a new cart
        Cart anOder = new Cart();

        //Create new dvd object and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars" , "Science Fiction", "George Lucas", 87, 24.95f);
        anOder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOder.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost is: ");
        System.out.println(anOder.totalCost());
        anOder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");
        System.out.println(anOder.totalCost());
    }
}
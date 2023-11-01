//Ta Van Hoan 20204973
package lab02;

public class Cart {
     public static final int MAX_NUMBER_ORDER = 20;
     private DigitalVideoDisc itemsOrdered [] =
             new DigitalVideoDisc[MAX_NUMBER_ORDER];

     public int qtyOrdered = 0;

     // method to add a DigitalVideoDisc object to the cart
     public void addDigitalVideoDisc(DigitalVideoDisc disc) {
          if(qtyOrdered >= MAX_NUMBER_ORDER){
               System.out.println("The cart is almost full");
          }
          else {
               itemsOrdered[qtyOrdered] = disc;
               qtyOrdered++;
               System.out.println("The disc has been added");
          }
     }

     // method to remove a DigitalVideoDisc object from the cart
     public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
          if (qtyOrdered == 0) {
               System.out.println("The cart is empty");
          }
          else {
               int index = -1;
               for (int i = 0; i < qtyOrdered; i++){
                    if (itemsOrdered[i].equals(disc)) {
                         index = i;
                    }
               }
               if(index != -1) {
                    for(int i = index; i< qtyOrdered-1; i++){
                         itemsOrdered[i] = itemsOrdered[i+1];
                    }
                    System.out.println("The disc has been removed");
                    qtyOrdered--;
               }
               else {
                    System.out.println("Can't find the disc");
               }
          }
     }

     // method to calculate the total cost of all DigitalVideoDisc objects in the cart
     public float totalCost() {
          float total = 0;
          for (int i = 0; i < qtyOrdered; i++){
               total += itemsOrdered[i].getCost();

          }
          return total;
     }
}

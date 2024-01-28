import java.util.ArrayList;

public class CarpetCalculatorApp {
  public static void main(String[] args) {
    ArrayList<RoomCarpet> carpets = new ArrayList<>();

    carpets.add(new RoomCarpet(new RoomDimension(12, 10.5), 8.99));
    carpets.add(new RoomCarpet(new RoomDimension(23, 10), 10.25));
    carpets.add(new RoomCarpet(new RoomDimension(18.25, 16), 13.50));

    for (RoomCarpet carpet : carpets) {
      System.out.println(carpet); 
      System.out.println("Total cost: $" + carpet.getTotalCost());
    }
  }
}

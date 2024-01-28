public class RoomCarpet implements Comparable<RoomCarpet> {
  private RoomDimension size;
  private double carpetCost;

  public RoomCarpet(RoomDimension dim, double cost) {
      this.size = new RoomDimension(dim);
      this.carpetCost = cost;
  }

  // Copy constructor
  public RoomCarpet(RoomCarpet other) {
      this.size = new RoomDimension(other.size);
      this.carpetCost = other.carpetCost;
  }

  public double getTotalCost() {
      return size.getArea() * carpetCost;
  }

  // toString method
  @Override
  public String toString() {
      return "RoomCarpet [RoomDimensions = " + size + ", Carpet Cost per square foot = " + carpetCost + "]";
  }

  // clone method
  @Override
  public RoomCarpet clone() {
      return new RoomCarpet(this);
  }

  // hashCode method
  @Override
  public int hashCode() {
      return java.util.Objects.hash(size, carpetCost);
  }

  // equals method
  @Override
  public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      RoomCarpet that = (RoomCarpet) obj;
      return Double.compare(that.carpetCost, carpetCost) == 0 &&
             java.util.Objects.equals(size, that.size);
  }

  // compareTo() method
  @Override
  public int compareTo(RoomCarpet other) {
      return Double.compare(this.getTotalCost(), other.getTotalCost());
  }

  // finalize method
  @Override
  protected void finalize() throws Throwable {
      super.finalize();
      // Here you can close resources if needed
  }
}
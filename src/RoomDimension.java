public class RoomDimension {
  private double length;
  private double width;

  public RoomDimension (double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Copy constructor
  public RoomDimension(RoomDimension other) {
    this.length = other.length;
    this.width = other.width;
  }

  public double getArea() {
    return length * width;
  }

  // toString method
  @Override
  public String toString() {
    return "RoomDimensions: [Length = " + length + " Width = " + width + "]";
  }

  // clone method
  @Override 
  public RoomDimension clone() {
    return new RoomDimension(this);
  }

  // hashCode method
  @Override
  public int hashCode() {
    return java.util.Objects.hash(length, width);
  }

  // equals method
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    RoomDimension that = (RoomDimension) obj;
    return Double.compare(that.length,length) == 0 &&
            Double compare(that.width, width) == 0;
  }

  // compareTo method
  public int compareTo(RoomDimension other) {
    return Double.compare(this.getAreea(), other.getArea());
  }
  
  // finlaize method
  @Override 
  protected void finalize() throws Throwable {
    super.finalize();
  }

  
}

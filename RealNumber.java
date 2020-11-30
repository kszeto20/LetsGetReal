public class RealNumber extends Number {
  public static void main (String[] args) {}

  private double value;
  //constructor
  public RealNumber(double v){
    value = v;
  }

  public double getValue() {
    return value;
  }
  public String toString() {
    return ""+getValue();
  }

  public RealNumber add(RealNumber other) {
    RealNumber sum = new RealNumber(this.getValue() + other.getValue());
    return sum;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber product = new RealNumber(this.getValue() * other.getValue());
    return product;
  }

  public RealNumber divide(RealNumber other) {
    if (other.getValue() == 0) {
      RealNumber overZero = new RealNumber(0.0);
      return overZero;
    }
    RealNumber quotient = new RealNumber(this.getValue() / other.getValue());
    return quotient;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber difference = new RealNumber(this.getValue() - other.getValue());
    return difference;
  }
}

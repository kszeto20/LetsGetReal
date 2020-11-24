public class RealNumber {
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

  public boolean equals(RealNumber other) {
    double a = other.getValue();
    double b = this.getValue();
    if (a == 0 && b == 0) {
      return true;
    }
    if ((Math.abs(a - b)/a) < 0.00001) {
      return true;
    }
    return false;
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
    RealNumber quotient = new RealNumber(this.getValue() / other.getValue());
    return quotient;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber difference = new RealNumber(this.getValue() - other.getValue());
    return difference;
  }
}

public class RationalNumber extends RealNumber {
  private int numerator;
  private int denominator;

  public RationalNumber(int nume, int deno) {
    super( ((double)nume) / deno);
    if (deno == 0){
      numerator = 0;
      denominator = nume;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue() {
    double result = (double)numerator / denominator;
    return result;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    int tempDeno = denominator;
    int tempNume = numerator;
    numerator = tempDeno;
    denominator = tempNume;
    RationalNumber recip = new RationalNumber(numerator, denominator);
    return recip;
  }

  public boolean equals(RationalNumber other) {
    if (this.getNumerator() == other.getNumerator()) {
      if (this.getDenominator() == other.getDenominator()) {
        return true;
      }
    }
      return false;
  }

  public String toString() {
    return "" + numerator + "/" + denominator;
  }

  public static int gcd(int a, int b) {
    int gcd = 0;

    for(int i = 1; i <= a && i <= b; i++) {
      if (a%i==0 && b%i==0) {
        gcd = i;
      }
    }
    return gcd;
  }

  public void reduce() {
    int gcdVal = gcd(numerator, denominator);
    numerator = numerator / gcdVal;
    denominator = denominator / gcdVal;
  }

  public RationalNumber multiply(RationalNumber other) {
    int newNum = (this.getNumerator()) * (other.getNumerator());
    int newDem = (this.getDenominator()) * (other.getDenominator());
    RationalNumber product = new RationalNumber(newNum, newDem);
    return product;
  }

  public RationalNumber divide(RationalNumber other) {
    int newNum = (this.getNumerator()) * (other.getDenominator());
    int newDem = (this.getDenominator()) * (other.getNumerator());
    RationalNumber quotient = new RationalNumber(newNum, newDem);
    return quotient;
  }

  public RationalNumber add(RationalNumber other) {
    int newNum = ((this.getNumerator()) * (other.getDenominator())) +
                  ((other.getNumerator()) * (this.getDenominator()));
    int newDem = (this.getDenominator()) * (other.getDenominator());
    RationalNumber sum = new RationalNumber(newNum, newDem);
    return sum;
  }

  public RationalNumber subtract(RationalNumber other) {
    int newNum = ((this.getNumerator()) * (other.getDenominator())) -
                  ((other.getNumerator()) * (this.getDenominator()));
    int newDem = (this.getDenominator()) * (other.getDenominator());
    RationalNumber difference = new RationalNumber(newNum, newDem);
    return difference;
  }
}

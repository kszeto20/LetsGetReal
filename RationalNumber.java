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


}

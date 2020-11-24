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
}

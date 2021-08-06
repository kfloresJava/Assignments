import java.lang.Math;
public class PythagoreanTheorem {
  public Number Compute(int leg1, int leg2)
  {
    double valx= (leg1*leg1)+(leg2*leg2) ;
    double hypotenuse =Math.sqrt(valx);
    return hypotenuse;
  }


}

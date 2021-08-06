public class PythagoreanTheoremTest {
    public static void main(String[]args) {
        PythagoreanTheorem solve = new PythagoreanTheorem();
        int leg1=2;
        int leg2=3;
        Number ans= solve.Compute(leg1, leg2);
        System.out.println(ans);
    }
}

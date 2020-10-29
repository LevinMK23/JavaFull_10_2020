package lesson6.expressions;

public class Test {
    public static void main(String[] args) {
        System.out.print(new Sum(
                        new Sum(new Constant(5), new Constant(10)),
                        new Sum(
                                new Constant(3),
                                new Constant(4))
                )
        );
        System.out.println("=" + new Sum(
                        new Sum(new Constant(5), new Constant(10)),
                        new Sum(
                                new Constant(3),
                                new Constant(4))
                ).apply()
        );

        Expression exp = new Multiply(new Sum(new Constant(2), new Constant(3)),
                new Sum(new Constant(5), new Constant(5)));
        System.out.print(exp + "=" + exp.apply());
    }
}

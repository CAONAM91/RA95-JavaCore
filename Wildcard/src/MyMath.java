public class MyMath<N extends Number> {
    @SafeVarargs
    public final double DigitAdd(N... numbers) {
        double sum = 0;
        for (N num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public double pow(N a, N b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}

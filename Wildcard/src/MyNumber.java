public class MyNumber<N extends Number & Comparable<N>> {
    public Number findMax(N a, N b) {
        return (a.compareTo(b) > 0 ? a : b);

    }
}

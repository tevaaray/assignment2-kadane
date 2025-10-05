package algorithms;

public class KadaneResult {
    public final long maxSum;
    public final int start;
    public final int end;

    public KadaneResult(long maxSum, int start, int end) {
        this.maxSum = maxSum;
        this.start = start;
        this.end = end;
    }
}
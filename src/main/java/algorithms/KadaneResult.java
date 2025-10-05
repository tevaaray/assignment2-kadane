package algorithms;

public class KadaneResult {
    private final long maxSum;
    private final int startIndex;
    private final int endIndex;

    public KadaneResult(long maxSum, int startIndex, int endIndex) {
        this.maxSum = maxSum;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public long getMaxSum() {
        return maxSum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
}

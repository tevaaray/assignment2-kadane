package metrics;

public class PerformanceTracker {
    private long comparisons = 0;
    private long arrayAccesses = 0;
    private long assignments = 0;
    private long nanos = 0;
    private long memBefore = 0;
    private long memAfter = 0;

    public void incComparisons(long v) { comparisons += v; }
    public void incArrayAccesses(long v) { arrayAccesses += v; }
    public void incAssignments(long v) { assignments += v; }

    public void setNanos(long v) { nanos = v; }
    public void setMemBefore(long v) { memBefore = v; }
    public void setMemAfter(long v) { memAfter = v; }

    public long getComparisons() { return comparisons; }
    public long getArrayAccesses() { return arrayAccesses; }
    public long getAssignments() { return assignments; }
    public long getNanos() { return nanos; }
    public long getMemBefore() { return memBefore; }
    public long getMemAfter() { return memAfter; }
    public long getMemDelta() { return memAfter - memBefore; }

    public void reset() {
        comparisons = 0;
        arrayAccesses = 0;
        assignments = 0;
        nanos = 0;
        memBefore = 0;
        memAfter = 0;
    }
}
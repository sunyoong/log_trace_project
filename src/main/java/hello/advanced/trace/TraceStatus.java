package hello.advanced.trace;


public class TraceStatus {

    public TraceId traceId;
    public Long StartTime;
    public String message;

    public TraceStatus(TraceId traceId, Long startTime, String message) {
        this.traceId = traceId;
        this.StartTime = startTime;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTime() {
        return StartTime;
    }

    public String getMessage() {
        return message;
    }
}

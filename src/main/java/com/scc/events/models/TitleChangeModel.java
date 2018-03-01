package com.scc.events.models;

import com.scc.onlinedogshow.model.Title;

public class TitleChangeModel {

    private String type;
    private String action;
    private Title title;
    private String traceId;
    private long timestamp;

    public TitleChangeModel(){
        super();
    }

    public TitleChangeModel(String type, String action, Title title, String traceId, long timestamp) {
        super();
        this.type   = type;
        this.action = action;
        this.title = title;
        this.traceId = traceId;
        this.timestamp = timestamp;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public Title getTitle() { return title; }
    public void setTitle(Title title) { this.title = title; }

    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

	public long getTimestamp() { return timestamp; }
	public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
	
    @Override
    public String toString() {
        return "TitleChangeModel [type=" + type +
                ", action=" + action +
                ", titleId="  + title.toString() +
                ", traceId=" + traceId + 
                ", timestamp=" + timestamp + "]";
    }

}

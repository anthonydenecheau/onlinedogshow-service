package com.scc.events.models;

import com.scc.onlinedogshow.model.Owner;

public class OwnerChangeModel {

    private String type;
    private String action;
    private Owner owner;
    private String traceId;
    private long timestamp;

    public OwnerChangeModel(){
        super();
    }

    public OwnerChangeModel(String type, String action, Owner owner, String traceId, long timestamp) {
        super();
        this.type   = type;
        this.action = action;
        this.owner = owner;
        this.traceId = traceId;
        this.timestamp = timestamp;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }

    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

	public long getTimestamp() { return timestamp; }
	public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
	
    @Override
    public String toString() {
        return "OwnerChangeModel [type=" + type +
                ", action=" + action +
                ", ownerId="  + owner.toString() +
                ", traceId=" + traceId + 
                ", timestamp=" + timestamp + "]";
    }

}

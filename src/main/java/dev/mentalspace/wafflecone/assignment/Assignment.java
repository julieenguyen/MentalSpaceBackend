package dev.mentalspace.wafflecone.assignment;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assignment {
    public Long assignmentId;
    @JsonProperty("classId")
    public Long periodId;
    public Long dateAssigned;
    public Long dateDue;
    public String type;
    public Long estimatedBurden;
    public String name;
    public String description;

    public JSONObject toJsonObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject
            .put("assignmentId",       this.assignmentId)
            .put("periodId",           this.periodId)
            .put("dateAssigned",       this.dateAssigned)
            .put("dateDue",            this.dateDue)
            .put("type",               this.type)
            .put("estimatedBurden",    this.estimatedBurden)
            .put("name",               this.name)
            .put("description",        this.description);
        return jsonObject;
    }

    public JSONObject toJsonObject(JSONObject jsonObject) {
        jsonObject
            .put("assignmentId",       this.assignmentId)
            .put("periodId",           this.periodId)
            .put("dateAssigned",       this.dateAssigned)
            .put("dateDue",            this.dateDue)
            .put("type",               this.type)
            .put("estimatedBurden",    this.estimatedBurden)
            .put("name",               this.name)
            .put("description",        this.description);
        return jsonObject;
    }
}

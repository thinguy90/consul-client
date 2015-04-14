package com.orbitz.consul.model.agent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Check {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Notes")
    private String notes;

    @JsonProperty("Script")
    private String script;

    @JsonProperty("http")
    private String http;

    @JsonProperty("Interval")
    private String interval;

    @JsonProperty("TTL")
    private String ttl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
    
      /**
       * @return the http request to call
       */
      public String getHttp(){
            return http;
      }

      /**
       * @param http the http to set
       */
      public void setHttp(String http){
            this.http = http;
      }    
}

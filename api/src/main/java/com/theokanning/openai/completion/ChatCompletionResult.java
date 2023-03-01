package com.theokanning.openai.completion;

import com.theokanning.openai.Usage;
import lombok.Data;

import java.util.List;

@Data
public class ChatCompletionResult {
    String id;
    String object;
    long created;
    String model;
    List<ChatCompletionChoice> choices;
    Usage usage;

    public ChatCompletionResult() {
    }

    public String getId() {
        return this.id;
    }

    public String getObject() {
        return this.object;
    }

    public long getCreated() {
        return this.created;
    }

    public String getModel() {
        return this.model;
    }

    public List<ChatCompletionChoice> getChoices() {
        return this.choices;
    }

    public Usage getUsage() {
        return this.usage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setChoices(List<ChatCompletionChoice> choices) {
        this.choices = choices;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    protected boolean canEqual(Object other) {
        return other instanceof CompletionResult;
    }

    public String toString() {
        return "CompletionResult(id=" + this.getId() + ", object=" + this.getObject() + ", created=" + this.getCreated() + ", model=" + this.getModel() + ", choices=" + this.getChoices() + ", usage=" + this.getUsage() + ")";
    }
}


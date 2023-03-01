package com.theokanning.openai.completion;

import lombok.Data;

@Data
public class ChatCompletionChoice {
    ChatMessage message;
    Integer index;
    String finish_reason;

    public ChatCompletionChoice() {
    }

    public ChatMessage getMessage() {
        return message;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getFinish_reason() {
        return this.finish_reason;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }
}

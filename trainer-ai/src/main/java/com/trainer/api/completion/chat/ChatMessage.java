package com.trainer.api.completion.chat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ChatMessage {
    @NonNull
    public String role;

    public String name;

    @JsonInclude()
    public String content;

    @JsonProperty("function_call")
    public ChatFunctionCall functionCall;

    public ChatMessage(@NonNull String role, String content) {
        this.role = role;
        this.content = content;
    }

    public ChatMessage(@NonNull String role, String content, String name) {
        this.role = role;
        this.content = content;
        this.name = name;
    }
}

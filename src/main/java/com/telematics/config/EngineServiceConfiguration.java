package com.telematics.config;

import com.yammer.dropwizard.config.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@SuppressWarnings("UnusedDeclaration")
public class EngineServiceConfiguration extends Configuration {

    @NotNull
    @Valid
    private MessagesConfiguration messages;
    public MessagesConfiguration getMessages() {
        return messages;
    }

    public void setMessages(MessagesConfiguration messages) {
        this.messages = messages;
    }
}

package com.telematics.config;

import javax.validation.constraints.NotNull;

@SuppressWarnings("UnusedDeclaration")
public class MessagesConfiguration {

    @NotNull
    private String engineType, engineParameters;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineParameters() {return engineParameters;}

    public void setEngineParameters(String engineParameters) {
        this.engineParameters = engineParameters;
    }


}

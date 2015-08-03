package com.telematics.platformdata;

@SuppressWarnings("UnusedDeclaration")
public class PlatformDataService   {
    private String obdType = "obdData 1 2 3";
    private String obdParams = "obdParams a b c";

    public String getObdParams() {
        return obdParams;
    }

    public String getObdType() {
        return obdType;
    }
}

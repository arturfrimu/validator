package com.arturfrimu.version2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum RequestReason {
    CREDIT_FOR_INDIVIDUAL("CRI"),
    CREDIT_FOR_ENTREPRENEUR("CRM"),
    CREDIT_FOR_LEGAL_ENTITY("CRC"),
    LEASING("CRO"),
    CREDIT_CARD("CRR"),
    CONTRACT_MONITORING("CM"),
    OTHER_REASON("OTH"),
    SUBJECT_CREDIT_HISTORY_REQUEST("SCHR"),
    REFINANCING_CREDIT("RCR");

    private String value;

    RequestReason(String value) {
        this.value = value;
    }

    public static RequestReason getByValue(String lookUpValue) {
        return Arrays.stream(values()).filter(it -> it.value.equals(lookUpValue)).findFirst().orElse(null);
    }

    public static List<String> getValueForAll() {
        List<String> valueOfEnum = new ArrayList<>();
        Arrays.stream(RequestReason.values()).forEach(requestReason -> valueOfEnum.add(requestReason.value));
        return valueOfEnum;
    }

    public static List<String> getNameForAll() {
        List<String> nameOfEnum = new ArrayList<>();
        Arrays.stream(RequestReason.values()).forEach(requestReason -> nameOfEnum.add(requestReason.name()));
        return nameOfEnum;
    }
}
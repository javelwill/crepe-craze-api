package com.javelwilson.crepecrazeapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Log {

    private String userId;
    private Action action;
    private Status status;
    private Message message;
    private String detail;

    public enum Action {
        REGISTER;
    }

    public enum Status {
        PROCESSING, SUCCESS, FAILED;
    }

    public enum Message {
        VALIDATION_ERROR;
    }
}

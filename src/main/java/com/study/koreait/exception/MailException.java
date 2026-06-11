package com.study.koreait.exception;

import lombok.Getter;

@Getter
public class MailException extends BusinessException {
    private final MailErrorCode errorCode;

    public MailException(MailErrorCode errorCode) {
        super(errorCode.getMessage(), errorCode.getStatus());
        this.errorCode = errorCode;
    }
}

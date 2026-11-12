package com.prakarsh.razorpay.common.enums;

public enum PaymentEvent {
    Authorize_Attempt,
    Authorize_Success,
    Authorize_Failure,
    Capture_request,
    Capture_Success,
    Capture_Failure,
    Refund_INIT,
    Refund_Complete,
    SETTLE,
    CANCEL,
    Capture_timeout

}
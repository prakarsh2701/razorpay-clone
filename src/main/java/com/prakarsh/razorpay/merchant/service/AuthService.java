package com.prakarsh.razorpay.merchant.service;

import com.prakarsh.razorpay.merchant.dto.request.LoginRequest;
import com.prakarsh.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.prakarsh.razorpay.merchant.dto.response.LoginResponse;
import com.prakarsh.razorpay.merchant.dto.response.MerchantResponse;

public interface AuthService {
        MerchantResponse signup(MerchantSignupRequest request);

        LoginResponse login(LoginRequest request);
    }



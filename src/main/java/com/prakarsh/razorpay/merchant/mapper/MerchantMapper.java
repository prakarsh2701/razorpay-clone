package com.prakarsh.razorpay.merchant.mapper;

import com.prakarsh.razorpay.merchant.dto.request.MerchantSignupRequest;
import com.prakarsh.razorpay.merchant.dto.response.MerchantResponse;
import com.prakarsh.razorpay.merchant.entity.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


public interface MerchantMapper {

    Merchant toEntityFromSignUpRequest(MerchantSignupRequest request);

    MerchantResponse toResponse(Merchant merchant);
}

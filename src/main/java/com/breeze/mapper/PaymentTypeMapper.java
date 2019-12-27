package com.breeze.mapper;

import com.breeze.pojo.PaymentType;

/**
 * @author Created by wdnnccey
 * @date 2019-07-01 08:54
 */
public interface PaymentTypeMapper {

    int deleteById(Integer id);

    int add(PaymentType record);

    PaymentType findById(Integer id);

    int update(PaymentType record);
}
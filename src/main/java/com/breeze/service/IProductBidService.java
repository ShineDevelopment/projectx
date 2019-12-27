package com.breeze.service;

import com.breeze.pojo.ProductBid;
import com.breeze.pojo.bo.UserBuyHistoryBO;
import com.breeze.pojo.bo.ProductBidBO;
import com.breeze.pojo.bo.ProductUserBidBO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Created by wdnnccey
 * @date 2019-07-09 09:18
 * @Description: 一句话描述该类的功能
 */
public interface IProductBidService {

    int deleteById(Long id);

    int add(ProductBid record);

    ProductBid findById(Long id);

    int update(ProductBid record);

    /**
     * 通过用户id和商品id修改出价状态
     *
     * @param userId
     * @param productId
     * @return
     */
    int updateStatusByUserIdAndProductId(Integer status, Long userId, Long productId);

    /**
     * 通过产品id查询出当前想购买者出的最高价格
     *
     * @param productId
     * @return
     */
    ProductBid findHighBidByProductId(Long productId);

    /**
     * 正在出价买的商品
     *
     * @return
     */
    List<ProductBidBO> findAll();

    /**
     * 查询用户出价商品
     *
     * @return
     */
    List<ProductUserBidBO> findByUserId(Long userId);

    /**
     * 购买页的历史
     *
     * @return
     */
    List<UserBuyHistoryBO> findUserBuyHistory(Long userId);

    /**
     * 通过产品id和用户id查询数据
     *
     * @param userId 产品id
     * @param price  出价价格
     * @param status 状态
     * @return
     */
    Integer findByUserIdAndPriceAndStatus(Long userId, BigDecimal price, Integer status);

    /**
     * 通过产品id，用户id，状态，查询
     *
     * @param productId
     * @param userId
     * @param status
     * @return
     */
    ProductBid findByProductIdAndUserIdAndStatus(Long productId, Long userId, Integer status);

    /**
     * 通过产品id和状态id查询当前商品是否有出价信息
     *
     * @param productId
     * @param status
     * @return
     */
    List<ProductBid> findByProductIdAndStatus(Long productId, Integer status);

    /**
     * 用户出价买单数
     *
     * @param userId
     * @return
     */
    Long findBuyQuantity(Long userId);

    /**
     * 查询用户当前出价的中的内容和出价历史（重新出价，还未成交的数据）
     *
     * @return 数据Id
     */
    List<Long> findByUserIdAndStatusAndProductId(Long userId, Integer status, Long productId);
}

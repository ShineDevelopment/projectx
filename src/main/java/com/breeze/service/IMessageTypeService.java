package com.breeze.service;

import com.breeze.pojo.MessageType;

import java.util.List;

/**
 * @author 莫奇
 */
public interface IMessageTypeService {

    /**
     * 获取全部类型
     * @return
     */
    List<MessageType> findAll();

    /**
     * 根据Id查询消息类型
     * @param id
     * @return
     */
    MessageType findById(Long id);

    /**
     * 新增消息类型
     * @param messageType
     * @return
     */
    int add(MessageType messageType);

    /**
     * 修改消息类型
     * @param messageType
     * @return
     */
    int update(MessageType messageType);

    /**
     * 删除消息类型
     * @param id
     * @return
     */
    int deleteById(Long id);
}

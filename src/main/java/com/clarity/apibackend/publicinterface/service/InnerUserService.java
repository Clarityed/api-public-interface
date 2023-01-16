package com.clarity.apibackend.publicinterface.service;

import com.clarity.apibackend.publicinterface.model.entity.User;

/**
 * 提供给内部系统操作用户信息的接口
 *
 * @author: clarity
 * @date: 2023年01月15日 17:54
 */

public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     *
     * @param accessKey 用户秘钥
     * @return 用户信息
     */
    User getInvokeUser(String accessKey);
}

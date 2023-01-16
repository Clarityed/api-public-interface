package com.clarity.apibackend.publicinterface.service;

import com.clarity.apibackend.publicinterface.model.entity.InterfaceInfo;

/**
 * 提供给内部系统操作接口信息的接口
 *
 * @author: clarity
 * @date: 2023年01月15日 17:43
 */

public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     *
     * @param path   请求路径
     * @param method 请求方法
     * @return 接口信息
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}

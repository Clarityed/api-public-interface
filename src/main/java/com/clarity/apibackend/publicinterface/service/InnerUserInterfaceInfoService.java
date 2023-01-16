package com.clarity.apibackend.publicinterface.service;

/**
 * 提供给内部系统操作有关该用户接口信息的接口
 *
 * @author: clarity
 * @date: 2023年01月15日 17:50
 */

public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计方法
     *
     * @param interfaceInfoId 接口信息 id
     * @param userId          用户 id
     * @return 1 - 表示调用成功，0 - 表示调用失败
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}

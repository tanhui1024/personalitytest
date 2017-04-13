/*
 * 鼎方公司源代码，版权归鼎方公司所有。
 * 创建日期 : 2017年4月5日
 * 修改历史 : 
 *     1. [2017年4月5日]创建文件 by gehanbiao
 */
package com.personalitytest.user.service;


import com.personalitytest.entity.HR_UserBO;
import com.personalitytest.utils.JsonResult;

/**
 * HR管理员操作接口
 * @author gehanbiao
 * @version 2017年4月5日
 */
public interface IUserService {
    /**
     * @description： 用户登录接口
     * @param userName
     * @param password
     * @return
     * @author：gehanbiao
     * @crateDate：2017年4月13日上午10:38:56
     */
    JsonResult<HR_UserBO> userLogin(String userName,String password);
    /**
     * 
     * @description： 添加HR管理员
     * @param userBO
     * @return
     * @author：gehanbiao
     * @crateDate：2017年4月13日上午10:38:48
     */
    boolean insertUser(HR_UserBO userBO);
}

package cn.sz.dao;

import cn.sz.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDAO {
    /**
     * 登录
     * @param user
     * @return user
     */
    public User login(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    public Integer register(User user);

    /**
     * 判断是否是手机号
     * @param user
     * @return
     */
    public String isphone(User user);

    /**
     * 修改密码
     * @param userid
     */
    public void changePassword(Integer userid);

    /**
     * 查看个人信息
     * @param userid
     * @return
     */

    public User seeInfo(Integer userid);

}

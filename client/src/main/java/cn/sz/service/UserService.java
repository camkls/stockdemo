package cn.sz.service;

import cn.sz.vo.User;

public interface UserService {
    public User login(User user);

    public Integer register(User user);

    public String isphone(User user);

    public void changePassword(Integer userid);
}

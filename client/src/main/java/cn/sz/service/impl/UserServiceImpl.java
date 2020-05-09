package cn.sz.service.impl;

import cn.sz.dao.IUserDAO;
import cn.sz.service.UserService;
import cn.sz.vo.User;
import com.show.api.ShowApiRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDAO userdao;

    @Override
    public User login(User user){
        if(user==null||user.getUsername()==null||user.getUsername().equals("")||user.getPassword()==null||user.getPassword().equals("")){
            return null;
        }
        return userdao.login(user);
    }

    @Override
    public Integer register(User user) {
       return userdao.register(user);
    }

    @Override
    public String isphone(User user) {

            String res=new ShowApiRequest("http://route.showapi.com/1502-1","217556","49780c15e980492fb9a495872593905e")
                    .addTextPara("mobile",user.getPhone())
                    .addTextPara("country","")
                    .post();
            String r=res.substring(239,243);

            return r;

    }

    @Override
    public void changePassword(Integer userid) {

    }
}

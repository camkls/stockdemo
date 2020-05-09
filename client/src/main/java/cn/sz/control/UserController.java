package cn.sz.control;

import cn.sz.service.UserService;
import cn.sz.vo.JsonData;
import cn.sz.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userServiceImpl;


    @PostMapping("login")
    public JsonData islogin(User user){

        System.out.println(user.getUsername());

        User u=userServiceImpl.login(user);
        if(u!=null){
            return JsonData.buildSuccess(u,0);
        }
        return null;

    }
    @PostMapping("register")
    public JsonData register(User user){

        System.out.println(user);

        if(user.getUsername()!=null&&user.getPassword()!=null&&userServiceImpl.isphone(user).equals("true")){
            System.out.println("1");
            userServiceImpl.register(user);
        }
        System.out.println("2");
        return null;
    }
    @PostMapping("changePassword")
    public  void changePassword(Integer userid){
        System.out.println("11");


    }

}

package com.blog.service;

import com.blog.entity.User;
import com.blog.entity.Vo.UserVo;
import com.blog.entity.Vo.loginVo;
import com.blog.entity.Vo.RegisterVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;


public interface UserService {
    User findUserByAccountId(String accountId);//获取用户信息

    Map<String,Object> register(RegisterVo registerVo);//注册

    boolean send(String phoneNum, String templateCode, String code,String code2);//发送注册验证码

    boolean login(loginVo loginuser);//登录

    void settoken(String token,loginVo loginVo); //向redis设置token值

    Map<String,Object> updateUserInfo(String token,UserVo userVo);  //修改用户信息

    boolean updateHeaderUrl(MultipartFile headerImage, String accountId) throws IOException;//修改用户头像

    UserVo queryUserInfo(String accountId);
}

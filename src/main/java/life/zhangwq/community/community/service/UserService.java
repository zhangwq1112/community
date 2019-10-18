package life.zhangwq.community.community.service;

import life.zhangwq.community.community.mapper.UserMapper;
import life.zhangwq.community.community.model.User;
import life.zhangwq.community.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangwq on 2019/10/18.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andAccountIdEqualTo(user.getAccountId());
        List<User> users = userMapper.selectByExample(example);
        if (users.size() == 0) {
            // 插入
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(System.currentTimeMillis());
            userMapper.insert(user);
        } else {
            // 更新
            User dbUser = users.get(0);
            User userUpdate = new User();

            userUpdate.setGmtCreate(System.currentTimeMillis());
            userUpdate.setAvatarUrl(user.getAvatarUrl());
            userUpdate.setName(user.getName());
            userUpdate.setToken(user.getToken());
            UserExample userExample = new UserExample();
            userExample.createCriteria().andIdEqualTo(dbUser.getId());
            userMapper.updateByExampleSelective(userUpdate, userExample);
        }
    }
}

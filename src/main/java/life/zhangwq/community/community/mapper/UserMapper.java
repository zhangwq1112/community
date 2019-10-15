package life.zhangwq.community.community.mapper;

import life.zhangwq.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangwq on 2019/10/14.
 */
@Repository
@Mapper
public interface UserMapper {
    @Insert("insert into user(name, account_id, token, gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}

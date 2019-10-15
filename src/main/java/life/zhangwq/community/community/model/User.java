package life.zhangwq.community.community.model;

import lombok.Data;

/**
 * Created by zhangwq on 2019/10/14.
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}

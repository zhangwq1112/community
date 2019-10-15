package life.zhangwq.community.community.dto;

import lombok.Data;

/**
 * Created by zhangwq on 2019/10/12.
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio; // descriptin
    private String avatarUrl;
}

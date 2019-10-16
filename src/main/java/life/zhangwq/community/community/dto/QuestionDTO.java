package life.zhangwq.community.community.dto;

import life.zhangwq.community.community.model.User;
import lombok.Data;

/**
 * Created by zhangwq on 2019/10/16.
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}

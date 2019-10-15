package life.zhangwq.community.community.model;

import lombok.Data;

/**
 * Created by zhangwq on 2019/10/15.
 */
@Data
public class Question {
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
}

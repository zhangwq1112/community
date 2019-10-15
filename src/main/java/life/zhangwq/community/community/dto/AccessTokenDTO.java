package life.zhangwq.community.community.dto;

import lombok.Data;

/**
 * Created by zhangwq on 2019/10/12.
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public String getClient_id() {
        return client_id;
    }
}

package com.book.comm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 接口返回统一结果
 * @author LiuWang
 * @date 2017/11/2
 */
@Data
/*@AllArgsConstructor
@NoArgsConstructor*/
public class ActionResult implements Serializable {

    private String responseCode;//结果状态码

    private Object content;//返回内容

    private String ext;//扩展内容

    public ActionResult() {
    }
    public ActionResult(String responseCode, Object content, String ext) {
        this.responseCode = responseCode;
        this.content = content;
        this.ext = ext;
    }
}

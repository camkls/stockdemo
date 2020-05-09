package cn.sz.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonData implements Serializable {

    private Integer code;
    private Object data;
    private String msg;

    public JsonData() {
    }

    public JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    //成功
    public static JsonData buildSuccess() {
        return new JsonData(0, null, null);
    }
    //成功,传入描述信息
    public static JsonData buildSuccess(String  msg) {
        return new JsonData(0, null, msg);
    }

    //成功,传入数据和描述信息
    public static JsonData buildSuccess(Object data, String  msg) {
        return new JsonData(0, data, msg);
    }
    //成功，传入数据和状态码
    public static JsonData buildSuccess(Object data, Integer code) {
        return new JsonData(code, data, null);
    }
    //成功，传入数据
    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, data, null);
    }

    //失败传入描述信息
    public static JsonData buildError(String msg) {
        return new JsonData(-1, null, msg);
    }

    //失败传入描述信息
    public static JsonData buildError(String msg, Integer code) {
        return new JsonData(code, null, msg);
    }


}

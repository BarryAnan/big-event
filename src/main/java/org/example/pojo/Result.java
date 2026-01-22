package org.example.pojo;

// 统一响应结果

public class Result<T> {
    private Integer code; // 业务状态码 0-成功 1-失败
    private String message; // 提示信息
    private T data; // 响应数据

    // 快速返回操作成功响应结果(带响应数据)
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(0);
        result.setMessage("操作成功");
        result.setData(data);
        return result;
    }

    // 快速返回操作成功响应结果
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(0);
        result.setMessage("操作成功");
        result.setData(null);
        return result;
    }

    // 快速返回操作失败响应结果
    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.setCode(1);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    // Getter 和 Setter 方法
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
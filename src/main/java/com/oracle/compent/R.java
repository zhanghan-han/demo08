package com.oracle.compent;

public class R<T> {
    public Integer code;
    public String msg;
    public T data;

    public static<T> R success(T t){
        R r = new R(Status.SUCCESS.getCode(),Status.SUCCESS.getMsg());
        r.setData(t);
        return r;
    }

    public static<T> R filed(T t){
        R r = new R(Status.Filed.getCode(),Status.Filed.getMsg());
        r.setData(t);
        return r;
    }

    public R() {
    }

    public R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

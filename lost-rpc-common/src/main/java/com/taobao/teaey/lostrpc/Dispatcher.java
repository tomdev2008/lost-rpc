package com.taobao.teaey.lostrpc;

/**
 * Created by xiaofei.wxf on 14-2-13.
 */
public interface Dispatcher<T> {
    void dispatch(Connection c, T p);
}

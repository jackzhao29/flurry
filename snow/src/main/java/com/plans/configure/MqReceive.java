package com.plans.configure;

/**
 * 收消息
 *
 * @author yuanxiang
 *         20151106
 */
public interface MqReceive extends Runnable {

    void receive();

}

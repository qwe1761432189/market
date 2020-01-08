package com.mxz.supermarket.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mxz.supermarket.utils.LogUtils;
import com.mxz.supermarket.utils.SendMail;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author whg
 * @date 2019/12/12 20:13
 **/
@Component
public class HandlerRegisterCodeQueue {

    @RabbitHandler
    @RabbitListener(queues = "book_manager_sent_register")
    public void handle(Message message) {
        byte[] body = message.getBody();
        String s = new String(body);
        JSONObject jsonObject = JSON.parseObject(s);
        StringBuffer sb = new StringBuffer();
        sb.append("这是书店管理系统发送的验证码：" + jsonObject.get("code") + "</br>5分钟后到期");
        SendMail.sendMail("验证码", sb.toString(),jsonObject.get("mailbox").toString());
        LogUtils.getTimeOutTaskLogger().info("对" + jsonObject.get("name") + "发送了注册码");
    }
}

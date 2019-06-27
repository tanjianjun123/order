package com.tz.order.websocket.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author: tanjianjun
 * @Date: 2019/4/16 14:35
 * @Version 1.0
 */
@Controller
@RequestMapping("/websocket/url")
@Api(tags="websocket")
public class UrlController {

    private String username;
    /**
     * 跳转到登录界面
     *
     * @return
     */
    @ApiOperation(value = "跳转到websoket", notes = "跳转到websoket")
    @RequestMapping(value = "/websocket/{username}.action", method = RequestMethod.GET)
    public String login(@PathVariable("username")String username) {
        this.username=username;
        return "/websocket.html";
    }

    /**
     * 跳转到登录界面
     *
     * @return
     */
    @ApiOperation(value = "跳转到websoket", notes = "跳转到websoket")
    @RequestMapping(value = "/websocket/getUsername.action", method = RequestMethod.GET)
    @ResponseBody
    public String getUsername() {
        return this.username;
    }
}

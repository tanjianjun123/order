package com.tz.order.controller;


import com.tz.order.domain.Activiti;
import com.tz.order.service.ActivitiService;
import com.tz.order.service.AreaService;
import com.tz.order.service.LineService;
import com.tz.order.service.NodeService;
import com.tz.order.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @author tanjianjun
 * @create 2018-12-19 10:51
 */
@Controller
@RequestMapping("url")
@Api(tags="页面跳转类")
public class LoginController {
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    RedisUtil redisUtil;
    @Autowired
    ActivitiService activitiService;
    @Autowired
    NodeService nodeService;
    @Autowired
    LineService lineService;
    @Autowired
    AreaService areaService;



    /**
     * 跳转到登录界面
     *
     * @return
     */
    @ApiOperation(value = "跳转到登录页", notes = "跳转到登录页")
    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String login() {
        //登录信息灵活书写 这里加上model是应用freemarker ，此时已经不用了就不要添加了
//        model.addAttribute("title", "欢迎登录商城后台");
        return "/login.html";
    }

    @PostMapping(value = "/data.action")
    public String data(@RequestBody String json) throws UnsupportedEncodingException {
        //https://ask.csdn.net/questions/352249

        json=URLDecoder.decode(json, "utf-8");
        JSONObject jsonObject=new JSONObject(json);
        /*
        * 这里存在一个很大问题，多个service无法实现事务控制
        * 所以改变思路，保存时不拆分，用的时候再拆
        * */


        //title节点
        String title = jsonObject.getString("title");
       /* Activiti activiti = new Activiti(title,json);
        activitiService.insert(activiti);*/
        Activiti activiti = activitiService.queryById(17);
        System.out.print(activiti);

       /*
       //        json="{\"age\": 35,\"sex\": \"men\",\"dynasty\": \"唐朝\",\"name\": \"李白\",\"weight\": 63.5}";
        JSONObject jsonObject=new JSONObject(json);
       //nodes节点
        JSONObject nodes = jsonObject.getJSONObject("nodes");
        Iterator it = nodes.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            JSONObject value = nodes.getJSONObject(key);
            String name = value.getString("name");
            String type = value.getString("type");
            Integer left = value.getInt("left");
            Integer top = value.getInt("top");
            Integer width = value.getInt("width");
            Integer height = value.getInt("height");
            Node node = new Node(key,name,type,left,top,width,height);
            node.setActivitiId(activiti.getId());
            nodeService.insert(node);
        }
        //lines节点
        JSONObject lines = jsonObject.getJSONObject("lines");
        Iterator itl = lines.keys();
        while (itl.hasNext()) {
            String key = (String) itl.next();
            JSONObject value = lines.getJSONObject(key);
            String type = value.getString("type");
            String from = value.getString("from");
            String to = value.getString("to");
            String name = value.getString("name");
            Boolean marked = value.getBoolean("marked");
            Line line = new Line(type,from,to,name,marked);
            line.setActivitiId(activiti.getId());
            lineService.insert(line);
        }

        //area节点
        JSONObject areas = jsonObject.getJSONObject("areas");
        Iterator ita = areas.keys();
        while (ita.hasNext()) {
            String key = (String) ita.next();
            JSONObject value = areas.getJSONObject(key);
            String name = value.getString("name");
            String color = value.getString("color");
            Integer left = value.getInt("left");
            Integer top = value.getInt("top");
            Integer width = value.getInt("width");
            Integer height = value.getInt("height");
            Area area = new Area(name,color,left,top,width,height);
            area.setActivitiId(activiti.getId());
            areaService.insert(area);
        }*/


        return "/login.html";
    }

    /**
     * 测试图片上传接口
     * @param pic
     * @return
     */
   /* @GetMapping("pic.action")
    @ResponseBody
    public Map<String, Object> pic(String pic) {
        Map<String, Object> result = new HashMap<>();
        try {
            String downloadPic = DownloadPicFromURL.downloadPic(pic);
            Integer read = ImageRecognition.read(downloadPic);
            result.put("data", read);
        } catch (Exception e) {
            logger.error(e.toString());
        }
        return result;
    }*/
}
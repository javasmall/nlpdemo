package com.nlpdemoclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class imageController {

    static final String zuuladdress="biggsai.com:8888/image/";
    @GetMapping("api")
    public Map<String,Object> getpic()
    {

        Map<String,Object>map2=new HashMap<>();
        map2.put("speaktime",zuuladdress+"hour.png");
        map2.put("classcloud",zuuladdress+"wordcloud.png");
        List<String>list = new ArrayList<>();
        list.add(zuuladdress+"emotion1.png");list.add(zuuladdress+"emotion2.png");
        map2.put("classemotion",list);
        //hello
        list = new ArrayList<>();
        list.add(zuuladdress+"wordtime2.png");
        list.add(zuuladdress+"wordtime2.png");
        map2.put("wordtime",list);
        return map2;
    }
    @GetMapping("api/{qq}")
    public Map<String,Object> getpicbystudent(@PathVariable("qq")  String qq)
    {
        Map<String,Object>map=new HashMap<>();


        List<String>list=new ArrayList<>();
        list.add(zuuladdress+"emotion1.png");list.add(zuuladdress+"emotion2.png");
        map.put(zuuladdress+"classemotion",list);
        list.clear();
        list.add(zuuladdress+"wordtime.png");
        list.add(zuuladdress+"wordtime2.png");
        map.put("wordtime",list);
        map.put("speaktime",zuuladdress+"hour.png");
        map.put("classcloud",zuuladdress+"wordcloud.png");
        if(qq==null||"".equals(qq))return map;
        map.put("studentcloud",zuuladdress+qq+"cloud.png");
        map.put("studentemotion",zuuladdress+qq+"emotion.png");
        return map;
    }

}

package com.bookcode.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class WeatherResponse implements Serializable {



    /**
     * 消息数据
     */
    private Weather data;

    /**
     * 消息状态
     */
    private String status;

    /**
     * 消息描述
     */
    private String desc;
}

package com.xnt.dhq.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by afu on 2019-03-19.
 */
@Getter
@Setter

public class DeviceQueryParam {
    private Integer id;

    private String name;

    private Integer type_id;

    private Integer price;

    //@JsonFormat(pattern="yyyy-MM-dd")
    private String produce_date;

    private Integer use_year;

    private String describtion;

    private String first_category;
    private String second_category;
    private String third_category;


    @Override
    public String toString() {
        return "DeviceQueryParam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type_id=" + type_id +
                ", price=" + price +
                ", produce_date=" + produce_date +
                ", use_year=" + use_year +
                ", describtion='" + describtion + '\'' +
                ", first_category='" + first_category + '\'' +
                ", second_category='" + second_category + '\'' +
                ", third_category='" + third_category + '\'' +
                '}';
    }
}

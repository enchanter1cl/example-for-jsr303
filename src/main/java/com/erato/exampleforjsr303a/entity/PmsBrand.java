package com.erato.exampleforjsr303a.entity;

import com.erato.exampleforjsr303a.common.valid.OnAdd;
import com.erato.exampleforjsr303a.common.valid.OnUpdate;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌(PmsBrand)实体类
 *
 * @author makejava
 * @since 2023-02-04 00:16:25
 */
public class PmsBrand implements Serializable {
    private static final long serialVersionUID = -76918460527510626L;
    /**
     * 品牌id
     */
    @NotNull(message = "id must be specified to UPDATE", groups = OnUpdate.class)
    @Null(message = "id mustn't be specified to ADD", groups = OnAdd.class)
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "Name can not be blank", groups = {OnUpdate.class, OnAdd.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @URL(message = "Logo must be a legal url",groups = {OnAdd.class, OnUpdate.class})
    private String logo;
    /**
     * 介绍
     */
    private String description;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = {OnAdd.class, OnUpdate.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty(groups={OnAdd.class})
    @Pattern(regexp="^[a-zA-Z]$",message = "First letter must be a letter", groups={OnAdd.class,OnUpdate.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups={OnAdd.class})
    @Min(value = 0,message = "Sort must >= 0",groups={OnAdd.class, OnUpdate.class})
    private Integer sort;


    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}


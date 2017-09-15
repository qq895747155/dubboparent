package com.handl.spring.dubbo.pojo;

import java.io.Serializable;

/**
 * Created by handl on 2017/9/15.
 */
public class Mhxy implements Serializable {

    private String name;
    private String menpai;
    private Integer dengji;
    private String renwu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenpai() {
        return menpai;
    }

    public void setMenpai(String menpai) {
        this.menpai = menpai;
    }

    public Integer getDengji() {
        return dengji;
    }

    public void setDengji(Integer dengji) {
        this.dengji = dengji;
    }

    public String getRenwu() {
        return renwu;
    }

    public void setRenwu(String renwu) {
        this.renwu = renwu;
    }
}

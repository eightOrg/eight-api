package org.eight.hange.pojo;

import java.math.BigDecimal;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String mobilephone;

    private String realname;

    private String description;

    private Integer areaid;

    private Integer level;

    private Integer exp;

    private Integer gold;

    private String picture;

    private BigDecimal monincome;

    private BigDecimal dayincome;

    private BigDecimal monexpense;

    private BigDecimal dayexpense;

    private String isremind;

    private String code;

    private Long createtime;

    private Long changetime;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public BigDecimal getMonincome() {
        return monincome;
    }

    public void setMonincome(BigDecimal monincome) {
        this.monincome = monincome;
    }

    public BigDecimal getDayincome() {
        return dayincome;
    }

    public void setDayincome(BigDecimal dayincome) {
        this.dayincome = dayincome;
    }

    public BigDecimal getMonexpense() {
        return monexpense;
    }

    public void setMonexpense(BigDecimal monexpense) {
        this.monexpense = monexpense;
    }

    public BigDecimal getDayexpense() {
        return dayexpense;
    }

    public void setDayexpense(BigDecimal dayexpense) {
        this.dayexpense = dayexpense;
    }

    public String getIsremind() {
        return isremind;
    }

    public void setIsremind(String isremind) {
        this.isremind = isremind == null ? null : isremind.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getChangetime() {
        return changetime;
    }

    public void setChangetime(Long changetime) {
        this.changetime = changetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}
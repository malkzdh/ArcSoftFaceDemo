package com.itboyst.facedemo.domain;


import java.util.Date;


public class UserFaceInfo {

        private Integer id;             // 主键
        private Integer groupId;        // 分组id
        private String faceId;          // 人脸唯一Id
        private String name;            // 名字
        private Integer age;            // 年纪
        private String email;           // 邮箱地址
        private Short gender;           // 性别，1=男，2=女
        private String phoneNumber;     // 电话号码
        private Date createTime;        // 创建时间
        private Date updateTime;        // 更新时间
        private byte[] faceFeature;     // 特征值

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        
        public Integer getGroupId() {
            return groupId;
        }

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public String getFaceId() {
            return faceId;
        }

        public void setFaceId(String faceId) {
            this.faceId = faceId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Short getGender() {
            return gender;
        }

        public void setGender(Short gender) {
            this.gender = gender;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        public Date getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        public byte[] getFaceFeature() {
            return faceFeature;
        }

        public void setFaceFeature(byte[] faceFeature) {
            this.faceFeature = faceFeature;
        }
    }


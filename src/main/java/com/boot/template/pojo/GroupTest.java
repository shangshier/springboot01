package com.boot.template.pojo;

/**
 * @author: shangshanshan
 * @date: 2019-3-19 17:34
 * @Description: TODO
 */
public class GroupTest {

    private int stage;

    private String schoolFkCode;

    public GroupTest() {
    }

    public GroupTest(int stage, String schoolFkCode) {
        this.stage = stage;
        this.schoolFkCode = schoolFkCode;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getSchoolFkCode() {
        return schoolFkCode;
    }

    public void setSchoolFkCode(String schoolFkCode) {
        this.schoolFkCode = schoolFkCode;
    }


}

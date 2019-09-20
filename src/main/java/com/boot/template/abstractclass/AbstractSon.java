package com.boot.template.abstractclass;

/**
 * @author: shangshanshan
 * @date: 2019-7-11 21:36
 * @Description: TODO
 */
public class AbstractSon extends AbstractParent {

    private String school;

    @Override
    public void abstrPubFun() {

    }

    @Override
    protected void abstrProFun() {

    }

    @Override
    public void abstrPtPubFun() {
        super.abstrPtPubFun();
    }

    @Override
    protected void abstrPtProFun() {
        super.abstrPtProFun();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

package com.teamdev.comet.bean.properties;

class CometEnzymeInfo {
    private String name;
    private int paramOne;
    private String paramTwo;
    private String paramThree;

    public CometEnzymeInfo() {
    }

    CometEnzymeInfo(String name, int paramOne, String paramThree, String paramTwo) {
        this.name = name;
        this.paramOne = paramOne;
        this.paramThree = paramThree;
        this.paramTwo = paramTwo;
    }

    @Override
    public String toString() {
        return  name + "\t" + paramOne + "\t" + paramTwo + "\t" + paramThree;
    }
}

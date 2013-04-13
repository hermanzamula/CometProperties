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
        return  String.format("%-25s %2s %10s  %10s\n", name, paramOne, paramTwo, paramThree);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParamOne() {
        return paramOne;
    }

    public void setParamOne(int paramOne) {
        this.paramOne = paramOne;
    }

    public String getParamTwo() {
        return paramTwo;
    }

    public void setParamTwo(String paramTwo) {
        this.paramTwo = paramTwo;
    }

    public String getParamThree() {
        return paramThree;
    }

    public void setParamThree(String paramThree) {
        this.paramThree = paramThree;
    }
}

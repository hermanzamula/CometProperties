package com.teamdev.comet.bean.properties;

class VariableModifications {
    static private String defaultMod = "0.0 X 0 3";
    private String variableMod1 = "15.9949 M 0 3";
    private String variableMod2 = defaultMod;
    private String variableMod3 = defaultMod;
    private String variableMod4 = defaultMod;
    private String variableMod5 = defaultMod;
    private String variableMod6 = defaultMod;

    private int maxVariableModsInPeptide = 5;

    public static String getDefaultMod() {
        return defaultMod;
    }

    public static void setDefaultMod(String defaultMod) {
        VariableModifications.defaultMod = defaultMod;
    }

    public String getVariableMod1() {
        return variableMod1;
    }

    public void setVariableMod1(String variableMod1) {
        this.variableMod1 = variableMod1;
    }

    public String getVariableMod2() {
        return variableMod2;
    }

    public void setVariableMod2(String variableMod2) {
        this.variableMod2 = variableMod2;
    }

    public String getVariableMod3() {
        return variableMod3;
    }

    public void setVariableMod3(String variableMod3) {
        this.variableMod3 = variableMod3;
    }

    public String getVariableMod4() {
        return variableMod4;
    }

    public void setVariableMod4(String variableMod4) {
        this.variableMod4 = variableMod4;
    }

    public String getVariableMod5() {
        return variableMod5;
    }

    public void setVariableMod5(String variableMod5) {
        this.variableMod5 = variableMod5;
    }

    public String getVariableMod6() {
        return variableMod6;
    }

    public void setVariableMod6(String variableMod6) {
        this.variableMod6 = variableMod6;
    }

    public int getMaxVariableModsInPeptide() {
        return maxVariableModsInPeptide;
    }

    public void setMaxVariableModsInPeptide(int maxVariableModsInPeptide) {
        this.maxVariableModsInPeptide = maxVariableModsInPeptide;
    }

    @Override
    public String toString() {
        return  "variable_mod1 = " + variableMod1 + '\n' +
                "variable_mod2 = " + variableMod2 + '\n' +
                "variable_mod3 = " + variableMod3 + '\n' +
                "variable_mod4 = " + variableMod4 + '\n' +
                "variable_mod5 = " + variableMod5 + '\n' +
                "variable_mod6 = " + variableMod6 + '\n' +
                "max_variable_mods_in_peptide = " + maxVariableModsInPeptide + "\n";
    }
}

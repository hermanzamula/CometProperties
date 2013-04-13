package com.teamdev.comet.bean.properties;


import static com.teamdev.comet.bean.properties.CometParameters.doubleFormat;
import static com.teamdev.comet.bean.properties.Output.toInt;

class FragmentIons {
    private double fragmentBinTol = 0.36;
    private double fragmentBinOffset = 0.11;
    private THEORETICAL_FRAGMENT_IONS theoreticalFragmentIons = THEORETICAL_FRAGMENT_IONS.DEFAULT;
    private boolean useAIons = false;
    private boolean useBIons = true;
    private boolean useCIons = false;
    private boolean useXIons = false;
    private boolean useYIons = true;
    private boolean useZIons = false;
    private boolean useNLIons = true;

    public double getFragmentBinTol() {
        return fragmentBinTol;
    }

    public void setFragmentBinTol(double fragmentBinTol) {
        this.fragmentBinTol = fragmentBinTol;
    }

    public double getFragmentBinOffset() {
        return fragmentBinOffset;
    }

    public void setFragmentBinOffset(double fragmentBinOffset) {
        this.fragmentBinOffset = fragmentBinOffset;
    }

    public THEORETICAL_FRAGMENT_IONS getTheoreticalFragmentIons() {
        return theoreticalFragmentIons;
    }

    public void setTheoreticalFragmentIons(THEORETICAL_FRAGMENT_IONS theoreticalFragmentIons) {
        this.theoreticalFragmentIons = theoreticalFragmentIons;
    }

    public boolean isUseAIons() {
        return useAIons;
    }

    public void setUseAIons(boolean useAIons) {
        this.useAIons = useAIons;
    }

    public boolean isUseBIons() {
        return useBIons;
    }

    public void setUseBIons(boolean useBIons) {
        this.useBIons = useBIons;
    }

    public boolean isUseCIons() {
        return useCIons;
    }

    public void setUseCIons(boolean useCIons) {
        this.useCIons = useCIons;
    }

    public boolean isUseXIons() {
        return useXIons;
    }

    public void setUseXIons(boolean useXIons) {
        this.useXIons = useXIons;
    }

    public boolean isUseYIons() {
        return useYIons;
    }

    public void setUseYIons(boolean useYIons) {
        this.useYIons = useYIons;
    }

    public boolean isUseZIons() {
        return useZIons;
    }

    public void setUseZIons(boolean useZIons) {
        this.useZIons = useZIons;
    }

    public boolean isUseNLIons() {
        return useNLIons;
    }

    public void setUseNLIons(boolean useNLIons) {
        this.useNLIons = useNLIons;
    }

    public static enum THEORETICAL_FRAGMENT_IONS {
        DEFAULT(0), M(1);
        private int value;

        private THEORETICAL_FRAGMENT_IONS(int i) {
            value = i;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public int getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return  "\nfragment_bin_tol = " + doubleFormat(fragmentBinTol, 2) +
                "\nfragment_bin_offset = " + doubleFormat(fragmentBinOffset, 2) +
                "\ntheoretical_fragment_ions = " + theoreticalFragmentIons +
                "\nuse_A_ions = " + toInt(useAIons) +
                "\nuse_B_ions = " + toInt(useBIons) +
                "\nuse_C_ions = " + toInt(useCIons) +
                "\nuse_X_ions = " + toInt(useXIons) +
                "\nuse_Y_ions = " + toInt(useYIons) +
                "\nuse_Z_ions = " + toInt(useZIons) +
                "\nuse_NL_ions = " + toInt(useNLIons);
    }
}

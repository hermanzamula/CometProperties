package com.teamdev.comet.bean.properties;

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

    enum THEORETICAL_FRAGMENT_IONS {
        DEFAULT, //0
        M,//1
    }

}

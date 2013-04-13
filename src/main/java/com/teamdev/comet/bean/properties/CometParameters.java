package com.teamdev.comet.bean.properties;

import java.io.*;
import java.nio.charset.CharsetEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.StreamHandler;


public class CometParameters {

    private String databaseName;
    private DECOY_SEARCH decoySearch = DECOY_SEARCH.DEFAULT;
    private int numThreads = 0;
    private Masses masses = new Masses();
    private SearchEnzyme searchEnzyme = new SearchEnzyme();
    private VariableModifications variableModifications = new VariableModifications();
    private FragmentIons fragmentIons = new FragmentIons();
    private Output output = new Output();
    private mzXmlParameters mzXmlParameters = new mzXmlParameters();
    private MiscParameters miscParameters = new MiscParameters();
    private SpectralProcessing spectralProcessing = new SpectralProcessing();
    private AdditionalModifications additionalModifications = new AdditionalModifications();

    private List<CometEnzymeInfo> cometEnzymeInfoList = new ArrayList<CometEnzymeInfo>() {{
        add(new CometEnzymeInfo("No_enzyme", 0, "-", "-"));
        add(new CometEnzymeInfo("Trypsin", 1, "KR", "P"));
        add(new CometEnzymeInfo("Trypsin/P", 1, "KR", "-"));
        add(new CometEnzymeInfo("Lys_C", 1, "K", "P"));
        add(new CometEnzymeInfo("Lys_N", 0, "K", "-"));
        add(new CometEnzymeInfo("Arg_C", 1, "R", "P"));
        add(new CometEnzymeInfo("Asp_N", 0, "D", "-"));
        add(new CometEnzymeInfo("CNBr", 1, "M", "-"));
        add(new CometEnzymeInfo("Glu_C", 1, "DE", "P"));
        add(new CometEnzymeInfo("PepsinA", 1, "FL", "P"));
        add(new CometEnzymeInfo("Ghymotrypsin", 1, "FWYL", "P"));
    }};

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DECOY_SEARCH getDecoySearch() {
        return decoySearch;
    }

    public void setDecoySearch(DECOY_SEARCH decoySearch) {
        this.decoySearch = decoySearch;
    }

    public int getNumThreads() {
        return numThreads;
    }

    public void setNumThreads(int numThreads) {
        this.numThreads = numThreads;
    }

    public Masses getMasses() {
        return masses;
    }

    public void setMasses(Masses masses) {
        this.masses = masses;
    }

    public SearchEnzyme getSearchEnzyme() {
        return searchEnzyme;
    }

    public void setSearchEnzyme(SearchEnzyme searchEnzyme) {
        this.searchEnzyme = searchEnzyme;
    }

    public VariableModifications getVariableModifications() {
        return variableModifications;
    }

    public void setVariableModifications(VariableModifications variableModifications) {
        this.variableModifications = variableModifications;
    }

    public FragmentIons getFragmentIons() {
        return fragmentIons;
    }

    public void setFragmentIons(FragmentIons fragmentIons) {
        this.fragmentIons = fragmentIons;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public mzXmlParameters getMzXmlParameters() {
        return mzXmlParameters;
    }

    public void setMzXmlParameters(mzXmlParameters mzXmlParameters) {
        this.mzXmlParameters = mzXmlParameters;
    }

    public MiscParameters getMiscParameters() {
        return miscParameters;
    }

    public void setMiscParameters(MiscParameters miscParameters) {
        this.miscParameters = miscParameters;
    }

    public SpectralProcessing getSpectralProcessing() {
        return spectralProcessing;
    }

    public void setSpectralProcessing(SpectralProcessing spectralProcessing) {
        this.spectralProcessing = spectralProcessing;
    }

    public AdditionalModifications getAdditionalModifications() {
        return additionalModifications;
    }

    public void setAdditionalModifications(AdditionalModifications additionalModifications) {
        this.additionalModifications = additionalModifications;
    }

    public List<CometEnzymeInfo> getCometEnzymeInfoList() {
        return cometEnzymeInfoList;
    }

    public void setCometEnzymeInfoList(List<CometEnzymeInfo> cometEnzymeInfoList) {
        this.cometEnzymeInfoList = cometEnzymeInfoList;
    }

    public void setToStream(OutputStream stream) throws IOException {
        if(stream == null) throw new NullPointerException("Output stream is null");
        Writer writer = new OutputStreamWriter(stream, "ascii");
        writer.write(toString());
        writer.close();
    }

    public static enum DECOY_SEARCH {
        DEFAULT(0), CONCATENATED(1), SEPARATE(2);
        private int value;

        private DECOY_SEARCH(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public static String doubleFormat(double val, int zeros) {
        final double pow = Math.pow(10., zeros);
        if((val - (int)val) % pow != 0) return String.valueOf(val);
        return String.format("%."+ zeros +"f" , val);
    }

    @Override
    public String toString() {
        if(databaseName == null) {
            throw new IllegalStateException("Database name is not specified.");
        }

        StringBuilder infoList = new StringBuilder();
        infoList.append("\n[COMET_ENZYME_INFO]\n");
        for(int i = 0; i < cometEnzymeInfoList.size(); i++) {
            infoList.append(i).append(".\t")
                    .append(cometEnzymeInfoList.get(i));
        }

        return "# Comet MS/MS search engine parameters file.\n" +
                "\ndatabase_name = " + databaseName +
                "\ndecoy_search = " + decoySearch +
                "\n\nnum_threads = " + numThreads +
                "\n\n#\n# masses\n#" + masses +
                "\n\n#\n# search enzyme\n#" + searchEnzyme +
                "\n\n#\n# Up to 6 variable modifications are supported\n#\n" + variableModifications +
                "\n\n#\n# fragment ions\n#" + fragmentIons +
                "\n\n#\n# output\n#\n" + output +
                "\n\n#\n# mzXML parameters\n#" + mzXmlParameters +
                "\n\n#\n# misc parameters\n#" + miscParameters +
                "\n\n#\n# spectral processing\n#" + spectralProcessing +
                "\n\n#\n# additional modifications\n#" + additionalModifications +
                "\n\n#\n# COMET_ENZYME_INFO\n#" + infoList;
    }
}


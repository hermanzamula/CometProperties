package com.teamdev.comet.bean.properties;

import java.io.*;
import java.nio.charset.CharsetEncoder;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.StreamHandler;


class Precision {
    public static DecimalFormat TWO = new DecimalFormat("#.##");
    public static DecimalFormat FOUR = new DecimalFormat("#.####");
    public static DecimalFormat SIX = new DecimalFormat("#.######");
}

public class CometProperties {

    private String databaseName = "database.fasta";
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

    public void setToStream(OutputStream stream) throws IOException {
        if(stream == null) throw new NullPointerException("Output stream is null");
        Writer writer = new OutputStreamWriter(stream, "ascii");
        writer.write(toString());
        writer.close();
    }

    public static enum DECOY_SEARCH {
        DEFAULT, //0
        CONCATENATED, //1
        SEPARATE
    }

    @Override
    public String toString() {
        return "CometProperties{" +
                "additionalModifications=" + additionalModifications +
                ", databaseName='" + databaseName + '\'' +
                ", decoySearch=" + decoySearch +
                ", numThreads=" + numThreads +
                ", masses=" + masses +
                ", searchEnzyme=" + searchEnzyme +
                ", variableModifications=" + variableModifications +
                ", fragmentIons=" + fragmentIons +
                ", output=" + output +
                ", mzXmlParameters=" + mzXmlParameters +
                ", miscParameters=" + miscParameters +
                ", spectralProcessing=" + spectralProcessing +
                ", cometEnzymeInfoList=" + cometEnzymeInfoList +
                '}';
    }
}


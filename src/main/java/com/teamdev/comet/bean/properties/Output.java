package com.teamdev.comet.bean.properties;

public class Output {
    private boolean outputSqtStream = false;
    private boolean outputSqtFile = false;
    private boolean outputPepXmlFile = true;
    private boolean outputOutFiles = false;
    private boolean printExpectScore = true;
    private int numOutputLines = 5;
    private boolean showFragmentIons = false;

    private int sampleEnzymeNumber = 1;

    public boolean isOutputSqtStream() {
        return outputSqtStream;
    }

    public void setOutputSqtStream(boolean outputSqtStream) {
        this.outputSqtStream = outputSqtStream;
    }

    public boolean isOutputSqtFile() {
        return outputSqtFile;
    }

    public void setOutputSqtFile(boolean outputSqtFile) {
        this.outputSqtFile = outputSqtFile;
    }

    public boolean isOutputPepXmlFile() {
        return outputPepXmlFile;
    }

    public void setOutputPepXmlFile(boolean outputPepXmlFile) {
        this.outputPepXmlFile = outputPepXmlFile;
    }

    public boolean isOutputOutFiles() {
        return outputOutFiles;
    }

    public void setOutputOutFiles(boolean outputOutFiles) {
        this.outputOutFiles = outputOutFiles;
    }

    public boolean isPrintExpectScore() {
        return printExpectScore;
    }

    public void setPrintExpectScore(boolean printExpectScore) {
        this.printExpectScore = printExpectScore;
    }

    public int getNumOutputLines() {
        return numOutputLines;
    }

    public void setNumOutputLines(int numOutputLines) {
        this.numOutputLines = numOutputLines;
    }

    public boolean isShowFragmentIons() {
        return showFragmentIons;
    }

    public void setShowFragmentIons(boolean showFragmentIons) {
        this.showFragmentIons = showFragmentIons;
    }

    public int getSampleEnzymeNumber() {
        return sampleEnzymeNumber;
    }

    public void setSampleEnzymeNumber(int sampleEnzymeNumber) {
        this.sampleEnzymeNumber = sampleEnzymeNumber;
    }

    @Override
    public String toString() {
        return  "\noutput_sqtstream = " + toInt(outputSqtStream) +
                "\noutput_sqtfile = " + toInt(outputSqtFile) +
                "\noutput_pepxmlfile = " + toInt(outputPepXmlFile) +
                "\noutput_outfiles = " + toInt(outputOutFiles) +
                "\nprint_expect_score = " + toInt(printExpectScore) +
                "\nnum_output_lines = " + numOutputLines +
                "\nshow_fragment_ions = " + toInt(showFragmentIons) +
                "\nsample_enzyme_number = " + sampleEnzymeNumber;
    }

    public static int toInt(boolean value) {
        return value?1:0;
    }
}

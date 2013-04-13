package com.teamdev.comet.bean.properties;

class SpectralProcessing {
    private int minimumPeaks = 5;
    private int minimumIntensity = 0;
    private PRECURSOR_REMOVE removePrecursorPeak = PRECURSOR_REMOVE.NO;
    private double removePrecursorTolerance = 1.5;

    public int getMinimumPeaks() {
        return minimumPeaks;
    }

    public void setMinimumPeaks(int minimumPeaks) {
        this.minimumPeaks = minimumPeaks;
    }

    public int getMinimumIntensity() {
        return minimumIntensity;
    }

    public void setMinimumIntensity(int minimumIntensity) {
        this.minimumIntensity = minimumIntensity;
    }

    public PRECURSOR_REMOVE getRemovePrecursorPeak() {
        return removePrecursorPeak;
    }

    public void setRemovePrecursorPeak(PRECURSOR_REMOVE removePrecursorPeak) {
        this.removePrecursorPeak = removePrecursorPeak;
    }

    public double getRemovePrecursorTolerance() {
        return removePrecursorTolerance;
    }

    public void setRemovePrecursorTolerance(double removePrecursorTolerance) {
        this.removePrecursorTolerance = removePrecursorTolerance;
    }

    public enum  PRECURSOR_REMOVE {
       NO(0), YES(1), ALL(2);
       private int value;

       private PRECURSOR_REMOVE(int i) {
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
        return  "\nminimum_peaks = " + minimumPeaks +
                "\nminimum_intensity = " + minimumIntensity +
                "\nremove_precursor_peak = " + removePrecursorPeak +
                "\nremove_precursor_tolerance = " + removePrecursorTolerance;
    }
}

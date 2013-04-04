package com.teamdev.comet.bean.properties;

class SpectralProcessing {
    private int minimumPeaks = 5;
    private int minimumIntensity = 0;
    private PRECURSOR_REMOVE removePrecursorPeak = PRECURSOR_REMOVE.NO;
    private double removePrecursorTolerance = 1.5;


   enum  PRECURSOR_REMOVE {
       NO, YES, ALL
   }
}

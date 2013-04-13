package com.teamdev.comet.bean.properties;

import static com.teamdev.comet.bean.properties.CometParameters.doubleFormat;

class Masses {

    private double peptideMassTolerance = 3.00;
    private PEPTIDE_UNITS peptideMassUnits =  PEPTIDE_UNITS.AMU;
    private MASSES_TYPE massTypeParent = MASSES_TYPE.MONOISOTOPIC;
    private MASSES_TYPE massTypeFragment = MASSES_TYPE.MONOISOTOPIC;
    private PRECURSOR_TOLERANCE precursorToleranceType = PRECURSOR_TOLERANCE.MH;
    private  ISOTOPE_ERROR isotopeError = ISOTOPE_ERROR.OFF;

    public double getPeptideMassTolerance() {
        return peptideMassTolerance;
    }

    public void setPeptideMassTolerance(double peptideMassTolerance) {
        this.peptideMassTolerance = peptideMassTolerance;
    }

    public PEPTIDE_UNITS getPeptideMassUnits() {
        return peptideMassUnits;
    }

    public void setPeptideMassUnits(PEPTIDE_UNITS peptideMassUnits) {
        this.peptideMassUnits = peptideMassUnits;
    }

    public MASSES_TYPE getMassTypeParent() {
        return massTypeParent;
    }

    public void setMassTypeParent(MASSES_TYPE massTypeParent) {
        this.massTypeParent = massTypeParent;
    }

    public MASSES_TYPE getMassTypeFragment() {
        return massTypeFragment;
    }

    public void setMassTypeFragment(MASSES_TYPE massTypeFragment) {
        this.massTypeFragment = massTypeFragment;
    }

    public PRECURSOR_TOLERANCE getPrecursorToleranceType() {
        return precursorToleranceType;
    }

    public void setPrecursorToleranceType(PRECURSOR_TOLERANCE precursorToleranceType) {
        this.precursorToleranceType = precursorToleranceType;
    }

    public ISOTOPE_ERROR getIsotopeError() {
        return isotopeError;
    }

    public void setIsotopeError(ISOTOPE_ERROR isotopeError) {
        this.isotopeError = isotopeError;
    }

    public enum PEPTIDE_UNITS {
        AMU(0), MMU(1), PPM(2);
       private int value;

       private PEPTIDE_UNITS(int i) {
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

    public enum MASSES_TYPE {
        AVERAGE(0),
        MONOISOTOPIC(1);
        private int value;

        private MASSES_TYPE(int i) {
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

    public enum PRECURSOR_TOLERANCE {
        MH(0),
        PRECURSOR_MZ(1);
        private int value;

        PRECURSOR_TOLERANCE(int i) {
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

    public enum ISOTOPE_ERROR {
        OFF(0), ON(1), LABELING(2);

        private int value;

        ISOTOPE_ERROR(int i) {
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

    @Override
    public String toString() {
        return
                "\npeptide_mass_tolerance = " + doubleFormat(peptideMassTolerance, 2) +
                "\npeptide_mass_units = " + peptideMassUnits +
                "\nmass_type_parent = " + massTypeParent +
                "\nmass_type_fragment = " + massTypeFragment +
                "\nprecursor_tolerance_type = " + precursorToleranceType +
                "\nisotope_error = " + isotopeError +
                '\n';
    }
}

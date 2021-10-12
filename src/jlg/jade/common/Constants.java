/* 
* Created by dan-geabunea on 4/19/2016.
* This code is the property of JLG Consulting. Please
* check the license terms for this product to see under what
* conditions you can use or modify this source code.
 */
package jlg.jade.common;

public class Constants {

    public static final int BYTE_TO_BITS = 8;
    public static final double LAT_LONG_WGS_HIGH_PRECISION_CAT021 = 0.00000016764;             //180 divided by 2^30
    public static final double LAT_LONG_WGS_PRECISION_CAT021_CAT062 = 0.000005364;             //180 divided by 2^25
    public static final double LAT_LONG_WGS_PRECISION_CAT021_CAT034_CAT048 = 0.00002145767;   //180 divided by 2^23
    public static final double IAS_CAT021 = 0.00000610352;   //2^-14 NM/s
    public static final double MACH_CAT021 = 0.001;   //Airpeed MACH
    public static final int FROM_ASTERIX_TO_METERS_PER_SECOND = 4;                     //0.25 meters per second * 4 => 1 meter per second
    public static final double FROM_ASTERIX_MAGENTIC_HEADING_TO_DEGREES = 0.0055;
    public static final double FROM_ASTERIX_ROLL_ANGLE_TO_DEGREES = 0.01;
    public static final double FROM_ASTERIX_GROUND_SPEED_TO_KNOTS = 0.22;
    public static final double FROM_KNOT_TO_NM_PER_SECOND = 0.000277778;
    public static final double FROM_ASTERIX_ALTITUDE_TO_FT = 6.25;
    public static final double FROM_ASTERIX_MACH_NB_TO_REAL_MACH_SPEED = 0.008;
    public static final int FROM_QUARTER_OF_SEC_TO_SEC = 4;
    public static final double FROM_ASTERIX_ALT_TO_FEET = 6.25;
    public static final double SSR_PLOT_RUNLENGTH_TO_DEGREES = 0.044; // 360 divided by 2^13
}

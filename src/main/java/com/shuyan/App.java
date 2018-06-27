package com.shuyan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String trackingNo_SF = "821148818417";
        String trackingNo_EMS = "1116076709214";
        String trackingNo_DB = "7042503016";
        System.out.println( ExpressTrackingUtil.expressTracking(ExpressTrackingUtil.EXPRESS_DEBANG,trackingNo_DB) );
    }
}

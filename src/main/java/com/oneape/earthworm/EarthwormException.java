/*
 * Copyright 2015 2dfire.com All right reserved. This software is the
 * confidential and proprietary information of 2dfire.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with 2dfire.com.
 */

package com.oneape.earthworm;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * described :
 * Created by oneape on 2018-12-06 16:55.
 * Modify:
 */
public class EarthwormException extends Exception {
    private Throwable cause = null;

    public EarthwormException() {
        super();
    }

    public EarthwormException(String message) {
        super(message);
    }

    public EarthwormException(String message, Throwable cause) {
        super(message, cause);
        this.cause = cause;
    }

    public EarthwormException(Throwable cause) {
        super(cause);
        this.cause = cause;
    }

    @Override
    public synchronized Throwable getCause() {
        return cause;
    }

    @Override
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
        if (cause != null) {
            s.print("Caused by: ");
            cause.printStackTrace();
        }
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
        if (cause != null) {
            s.print("Caused by: ");
            cause.printStackTrace();
        }
    }
}

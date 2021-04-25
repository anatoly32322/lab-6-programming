package com.Data;


import com.Commands.Execute;
import com.Data.Report;
import com.Data.ReportState;
import com.Data.Request;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public abstract class ExecuteRequest {
    public static Request sendingRequest;

    public static Request doingRequest() {
        try {
            sendingRequest = Execute.execute(true, new BufferedReader(new InputStreamReader(System.in)));
        } catch (RuntimeException e) {
            throw e;
        }

        return sendingRequest;
    }

}

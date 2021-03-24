package com.viveknaskar.bankaccountapp.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSVHelper {

    /**
     * This method will read data from CSV and return as a list
     */
    public static List<String[]> read(String file) {

        List<String[]> data = new LinkedList<>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (Exception e) {
            System.out.println(String.format("Exception is due to %s", e.getStackTrace()));
        }
        return data;

    }
}

package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {

    private static ArrayList<DataModel> loadJsonInputData(String inputFilePath) throws IOException {
        // Load JSON Data
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = new FileInputStream(inputFilePath);
        return mapper.readValue(is, new TypeReference<List<DataModel>>() {});
    }

    private static void printDataID(List<DataModel> dataList) {
        for (DataModel data : dataList) {
            System.out.println(data.getId());
        }
    }

    private static List<DataModel> findDuplicates(ArrayList<DataModel> inputDataList) {
        List<DataModel> duplicates = new ArrayList<DataModel>();
        Set<DataModel> uniqueDataList = new HashSet<DataModel>();
        for (DataModel dataModel : inputDataList) {
            if (!uniqueDataList.add(dataModel)) {
                duplicates.add(dataModel);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        try {
            ArrayList<DataModel> inputDataList = loadJsonInputData(args[0]);

            // print duplicate id
            System.out.println("Duplicate  Data\n");
            printDataID(findDuplicates(inputDataList));

            // Print invalid data
            System.out.println("\nInvalid Data \n");
            printDataID(inputDataList.stream().filter(dataModel -> dataModel.invalid()).collect(Collectors.toList()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

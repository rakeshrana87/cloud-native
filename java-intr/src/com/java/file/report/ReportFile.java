package com.java.file.report;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReportFile {

	public void saveReport(List<String> csvList) {

	Path outputCsvPath= Paths.get("output.csv");
	try(BufferedWriter writer=Files.newBufferedWriter(outputCsvPath)){
	for(String csv: csvList) {
		System.out.println("row written: " + csv);
		writer.append(csv);
		writer.append("\n");
	}
		System.out.println("writer: " + outputCsvPath);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

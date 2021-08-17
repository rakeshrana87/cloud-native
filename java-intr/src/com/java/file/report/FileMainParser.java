package com.java.file.report;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileMainParser {
	public static void main(String[] args) {
		Path csvFile = Paths.get("employee.csv");
		List<String> content = new ArrayList<String>();
		try (Stream<String> ss = Files.lines(csvFile)) {
			ss.forEach(line -> content.add(line));
			String columnRow=content.remove(0);
			System.out.println("row column: " + columnRow);
			new Sortingfile().sortFile(content, ColumnNames.ID,columnRow);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
} 

package com.java.file.report;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CsvWriter {
	public static void main(String[] args) {
		Path path = Paths.get("employee.csv");
		List<List<String>> row = Arrays.asList(Arrays.asList("ID", "Name", "LastName", "Designation", "Employer"),
				Arrays.asList("4", "rakesh", "rana", "Architect", "Ericsson"),
				Arrays.asList("3", "sashakt", "bajaj", "TechLead", "Wipro"),
				Arrays.asList("2", "anubhav", "sinha", "Architect", "Ericsson"),
				Arrays.asList("1", "vinay", "kumar", "softwareEngineer", "TCS"),
				Arrays.asList("6", "rajan", "verma", "Tester", "qualcom"),
				Arrays.asList("5", "surya", "prakash", "manager", "Accenture"));

		System.out.println(row);

		/*
		 * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		 * for(List<String> rowdata : row) { writer.append(String.join(",", rowdata));
		 * writer.append("\n"); } } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
	}

}
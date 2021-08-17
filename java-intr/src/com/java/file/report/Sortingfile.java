package com.java.file.report;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortingfile {

	public void sortFile(List<String> csvLines, String column, String columnRow) {
		System.out.println("before sorting: " + csvLines);
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String csvLine1, String csvLine2) {
				String[] s1 = csvLine1.split(",");
				String[] s2 = csvLine2.split(",");
				int sortingIndex=getIndexFromColumn(column,columnRow);
				return s1[sortingIndex].compareTo(s2[sortingIndex]);
			}

			private int getIndexFromColumn(String column,String columnRow) {
				String[] colArray = columnRow.split(",");
				List<String> coList=Arrays.asList(colArray);
				int i=0;
				for (String ls: coList) {
					if(ls.equalsIgnoreCase(column)) {
					System.out.println("Sorting list by: " + column);
						return i;
					}
					i++;
				}
				return 0 ;
			}
		};
		Collections.sort(csvLines, comp);
		System.out.println("After sotring " + csvLines + "size of the list: " +csvLines.size());
		new ReportFile().saveReport(csvLines);
	}
}

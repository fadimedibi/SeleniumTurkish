package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class WebTables extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", "https://www.seleniumeasy.com/test/table-search-filter-demo.html");

		// identifying the number of rows and columns

		// rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("Number of rows " + rows.size()); // 7

		// columns (HEADERS)
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of cols " + cols.size()); // 4

		// name of columns:
		for (int i = 0; i < cols.size(); i++) {
			String nameOfCols = cols.get(i).getText();
			System.out.println("Name of the columns " + nameOfCols); // # Task assignee, status, .....
		}

		// name of the rows

		Iterator<WebElement> rowIt = rows.iterator();

		while (rowIt.hasNext()) {
			String rowData = rowIt.next().getText();
			System.out.println(rowData);
		}

		// finding all the cells (all data)

		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));

		for (WebElement cell : cells) {
			String cellVal = cell.getText();
			System.out.println(cellVal);

		}
		driver.quit();
	}

}

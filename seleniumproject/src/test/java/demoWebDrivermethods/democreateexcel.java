package demoWebDrivermethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class democreateexcel {
	@Test
	public void f() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook();
		FileOutputStream out = new FileOutputStream(new File("bhupendra.xlsx"));

		wb.write(out);
		out.close();
		System.out.println("File created successfully");

	}
}

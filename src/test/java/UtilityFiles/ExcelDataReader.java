package UtilityFiles;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	   public static HashMap<String, String> storeValues = new HashMap<String, String>();

	    public static List<HashMap<String, String>> data(String filepath, String sheetName) {

	        List<HashMap<String, String>> mydata = new ArrayList<>();
	        try {
	            FileInputStream fs = new FileInputStream(filepath);
	            XSSFWorkbook workbook = new XSSFWorkbook(fs);
	            XSSFSheet sheet = workbook.getSheet(sheetName);
	            Row headerRow = sheet.getRow(0);
	            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
	                Row currentRow = sheet.getRow(i);
	                HashMap<String, String> currentHash = new HashMap<String, String>();
	                for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
	                    Cell currentCell = currentRow.getCell(j);
	                    switch (currentCell.getCellType()) {
	                        case STRING:
	                            currentHash.put(headerRow.getCell(j).getStringCellValue(),
	                                    currentCell.getStringCellValue());
	                            break;
	                        case NUMERIC:
	                            if (DateUtil.isCellDateFormatted(currentCell)) {
	                                currentHash.put(headerRow.getCell(j).getStringCellValue(),
	                                        currentCell.getDateCellValue().toString());
	                            } else {
	                                currentCell.setCellType(CellType.STRING);
	                                currentHash.put(headerRow.getCell(j).getStringCellValue(),
	                                        currentCell.getStringCellValue());
	                            }
	                            break;
	                        default:
	                            break;
	                    }
	                }
	                mydata.add(currentHash);
	            }
	            fs.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return mydata;
	    }

}

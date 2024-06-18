package SomanyTestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {
//    public static void main(String[] args) throws IOException {
//        ExcelDataDriven a = new ExcelDataDriven();
//        ArrayList<String> data = a.getExcelData();
//        for (String datum : data) {
//            System.out.println(datum);
//        } 
   // }

    public ArrayList<String> getExcelData(String PathOfSheet, String SheetName, String CellValue, String MobFieldValue ) throws IOException {
        ArrayList<String> a = new ArrayList<>();
        FileInputStream fis = null;
        XSSFWorkbook workbook = null;
        
        try {
            fis = new FileInputStream(PathOfSheet);
            workbook = new XSSFWorkbook(fis);

            int sheets = workbook.getNumberOfSheets();
            for (int i = 0; i < sheets; i++) {
                if (workbook.getSheetName(i).equalsIgnoreCase(SheetName)) {
                    XSSFSheet sheet = workbook.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> ce = firstRow.cellIterator();
                    int k = 0;
                    int column = 0;

                    while (ce.hasNext()) {
                        Cell value = ce.next();
                        if (value.getStringCellValue().equalsIgnoreCase(CellValue)) {                 //CellValue = tital of coloumn
                            column = k;
                        }
                        k++;
                    }
                    System.out.println("Column index: " + column);

                    while (rows.hasNext()) {
                        Row r = rows.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(MobFieldValue)) {       //MobFieldValue = fildname
                            Iterator<Cell> cv = r.cellIterator();
                            while (cv.hasNext()) {
                                Cell c = cv.next();
                                if (c.getCellType() == CellType.STRING) {
                                    System.out.println("String value: " + c.getStringCellValue());
                                    a.add(c.getStringCellValue());
                                } else if (c.getCellType() == CellType.NUMERIC) {
                                    System.out.println("Numeric value: " + NumberToTextConverter.toText(c.getNumericCellValue()));
                                    a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            if (workbook != null) { 
                workbook.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return a;
    }
}

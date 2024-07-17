package org.staragile.june27;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class D03ReadFromExcel {
//     <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
//    <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
    //these 2 dependencies should paste and sync in pom.xml
    String fPath = System.getProperty("user.dir") + "\\ExcelFiles\\LoginData.xlsx";
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

//    public static void main(String[] args) {
//     //here we can use man activity and we can run that also
//    }

    //here it is returning String[][] but we use DataProvider annotation,so we have to give general Object[][]
    @DataProvider
    public Object[][] readData() throws IOException
    {
        file = new File(fPath);
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();
        String[][] loginData = new String[rows][2];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                cell = sheet.getRow(i).getCell(j);
                //System.out.println(cell.getStringCellValue());
                loginData[i][j] = cell.getStringCellValue();
            }
        }

        wb.close();
        fis.close();

        return loginData;
    }
}

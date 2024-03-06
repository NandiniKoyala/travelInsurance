package utilityMethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static XSSFCellStyle style;
	static String file="C:\\Users\\2303766\\OneDrive - Cognizant\\Documents\\hackathon\\ExcelFile\\output.xlsx";
	static String path ="C:\\Users\\2303766\\OneDrive - Cognizant\\Documents\\hackathon\\ExcelFile\\InputData.xlsx";
	public static void setcelldata(String Sheet,String text,int r,int c) throws IOException {
		fi=new FileInputStream(file);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(Sheet);
		if(ws.getRow(r) != null) {
	        row = ws.getRow(r);}
	    else {
	        row = ws.createRow(r);
	    }
		cell=row.createCell(c);
		cell.setCellValue(text);
		fo=new FileOutputStream(file);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	public static String getcelldata(String Sheet,int r,int c) throws IOException {
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(Sheet);
		row=ws.getRow(r);
		cell=row.getCell(c);
		String data;
		try 
		{
			//data=cell.toString();
			DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);
            return data;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}


	

}

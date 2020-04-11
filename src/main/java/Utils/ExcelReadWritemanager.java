package Utils;

public class ExcelReadWritemanager {
	
	public static Xls_Reader obj;
	public static String path = "src\\test\\resources\\data\\";
	
	public static void setExcelData(String FileName, String ColName, int RowNum, String data) {
		obj = new Xls_Reader(path+FileName+".xlsx");
		obj.setCellData("Sheet1", ColName, RowNum, data);
		obj.setCellData("Sheet1", ColName, RowNum, data);
		System.out.println("Data has been set in the excel");
	}
	
	public static String getExcelData(String FileName, String colName, int rowNum) {
		obj = new Xls_Reader(path+FileName+".xlsx");
		return obj.getCellData("Sheet1", colName, rowNum);
	}
	

}




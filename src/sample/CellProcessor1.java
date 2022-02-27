package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.supercsv.cellprocessor.FmtDate;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class CellProcessor1 {

	public static void main(String[] args)throws IOException {
		
		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(),
				new NotNull(),
				new FmtDate("yyyy/MM/dd"),
				new NotNull(),
				new Optional()
		};
		
		Path path = Paths.get("employee.csv");
		String[] header = {"name","age","birth","email","note"} ;
		List<Employee> employeeList = new ArrayList<>();
		try(ICsvBeanWriter beanWriter = new CsvBeanWriter(Files.newBufferedWriter(path),CsvPreference.STANDARD_PREFERENCE)) {
			beanWriter.writeHeader(header);
			for(Employee employee : employeeList) {
				beanWriter.write(employee, header, processors);
			}
		}
		
		Employee employee1 = new Employee();
		employee1.setName("ファビアン");
		employee1.setAge(24);
		Calendar cl = Calendar.getInstance();
		cl.set(1997, 3,27);
		employee1.setBirth(cl.getTime());
		employee1.setEmail("nagokaitofabian@gmail.com");
		employee1.setNote("所有免許:第二種免許,情報パスポート");
		employeeList.add(employee1);

	}

}

package sample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class JavaTest5 {

	public static void main(String[] args) {
		
		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(),
				new NotNull(),
				new FmtDate("yyyy/MM/dd"),
				new NotNull(),
				new Optional()
		};
		
		Path path = Paths.get("employee.csv");
		try(ICsvBeanWriter beanWriter = new CsvBeanWriter(Files.newBufferedWriter(path),CsvPrefence.STANDARD_PREFERENCE)) {
			beanWriter.writeHeader(header);
			for(Employee employee : employeeList) {
				beanWriter.write(employee, header, processors);
			}
		}

	}

}

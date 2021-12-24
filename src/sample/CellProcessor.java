package sample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class CellProcessor {

	public static void main(String[] args) {
		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(),
				new ParseInt(new NotNull()),
				new ParseDate("yyyy/MM/dd"),
				new StrRegEx("[a-z0-9¥¥._]+@[a-z0-9¥¥.]+"),
				new Optional()
		};
		
		Path path = Paths.get("employee.csv");
		try(ICvBeanReader beanReader = new CsvBeanReader(Files.newBufferedReader(path),CsvPreference.STANDARD_PREFERENCE)) {
			String[] header = beanReader.getHeader(true);
			Employee employee;
			while((employee = beanReader.read(Employee.class, header, processors)) != null) {
				
			}
		}

	}

}

package sample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaTest8 {

	public static void main(String[] args)throws IOException {
		Employee employee = new Employee();
		employee.setName("山田 太郎");
		employee.setAge(38);
		employee.setLicenses(Arrays.asList("第一運転免許", "応用情報技術者"));
		
		File file = new File("C:\\projects\\pleiades\\workspace\\sample\\src\\sample\\employee.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(file, employee);

	}

}

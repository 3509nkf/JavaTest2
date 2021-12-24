package sample;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaTest7 {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\projects\\pleiades\\workspace\\sample\\src\\sample\\employee.json");
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(file,Employee.class);
		Map<?,?> map = mapper.readValue(file, Map.class);
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(((List<?>)map.get("licenses")).get(0));
		System.out.println(((List<?>)map.get("licenses")).get(1));
	}

}

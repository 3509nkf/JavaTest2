package sample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaTest9 {

	public static void main(String[] args) throws IOException{
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("name", "名呉魁人ファビアン");
		map.put("age", 67);
		map.put("licenses", Arrays.asList("第一種運転免許","応用情報技術者"));
		
	File file = new File("C:\\projects\\pleiades\\workspace\\sample\\src\\sample\\employee.json");
	ObjectMapper mapper = new ObjectMapper();
	mapper.writeValue(file, map);
	}

}

package cv4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
public class Executable {
	
	public static void main(String[] args) throws IOException {
		// ---------------WORD-COUNT-----------------------
		String content = new String(Files.readAllBytes(Paths.get("D:\\xbalus02\\cv4\\src\\cv4\\Untitled 1")));
		String[] res = content.split("[ .;,]");
		
		Map<String, Integer> dict = new TreeMap<String, Integer>();
		for (String string : res) {
			string = string.toLowerCase();
			if(string == "") {
				continue;
			}
			if( dict.containsKey(string)) {
				dict.put(string, dict.get(string)+1);
			}
			else {
				dict.put(string, 1);
			}
		}
		dict.forEach((key,value) -> System.out.println(key + " = " + value));
		
		
		//------------------LIST----------------------------
		MyList list = new MyList();
		list.addToStart(5);
		list.addToStart(6);
		list.addToStart(7);
		list.addToStart(8);
		list.addToStart(9);
		list.removeFromStart();
		list.removeFromStart();
		System.out.println("dlzka "+ list.length());
		System.out.println(list.contains(6));
		System.out.println(list.empty());
		list.print();
		list.reverse();
		System.out.println("----------------");
		list.print();
		
	}
	
	
}

package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class FileUtils {

	/**
	 * transter dto to json
	 */
	public static void dto2json(String file) throws Exception {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(file)), Charset.forName("UTF-8")));
		JsonObject noNullobject = new JsonObject();
		JsonObject withNullobject = new JsonObject();
		String tempLine = reader.readLine();
		while (StringUtils.isNotBlank(tempLine)) {
			String[] strings = tempLine.split("\t");
			int lastStr = strings.length - 1;
			String prop = strings[0];
			String value = null;
			if (strings[lastStr].startsWith("\"")) {
				value = strings[lastStr].split("\"")[1];
			} else {
				value = strings[lastStr];
			}

			if (value.equals("null"))
				withNullobject.add(prop, JsonNull.INSTANCE);
			else
				withNullobject.addProperty(prop, value);
			if (!value.equals("null")) {
				noNullobject.addProperty(prop, value);
			}
			
			tempLine = reader.readLine();
		}
		System.out.println(noNullobject.toString());
		System.out.println(withNullobject.toString());
	}
	
	public static void annotationConvert(String file) throws Exception{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(file)), Charset.forName("UTF-8")));
		BufferedWriter writer =new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(new File(file)),Charset.forName("UTF-8")));
		
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println("=====Dto to Json transter======");
		dto2json("D:\\file.txt");

	}
}

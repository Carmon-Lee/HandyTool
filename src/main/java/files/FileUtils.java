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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class FileUtils {

	private static String space="    ";
	/**
	 * transter dto to json
	 */
	public static void dto2json(String file) throws Exception {
		String classFile=FileUtils.class.getClassLoader().getResource(file).getFile();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(classFile)), Charset.forName("UTF-8")));
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
	
	//������ע�͸�Ϊһ��ע��
	public static void multy2singleAnno(String file) throws Exception{
		String classFile=FileUtils.class.getClassLoader().getResource(file).getFile();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(classFile)), Charset.forName("UTF-8")));
		BufferedWriter writer =new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(new File("new"+file)),Charset.forName("UTF-8")));
		
		StringBuilder sBuilder=new StringBuilder();
		String anno="";
		//��ʼ��¼ע�ͱ�־
		boolean annoFlag=false;
		//ע���Ѿ���д��body�ı�־
		boolean annoRead=false;
		String temp=reader.readLine();
		
		while (temp!=null) {			
			
			//ע�Ϳ�ͷ
			if (temp.indexOf("/*")>=0) {
				annoFlag=true;
			}
			//ע�ͽ�β
			if (temp.indexOf("*/")>=0) {
				annoFlag=false;
			}
			if (annoFlag) {
				anno+=temp+"\n";
				annoRead=false;
			} else {
				if (temp.indexOf("*/")<0) {
					//�����ע���У���ֱ�����
					sBuilder.append(temp+"\n");
				}
				if (!annoRead) {
					//sBuilder.append("\n");
					annoRead=true;
				}
				
			}
			int markPos=temp.indexOf("*");
			if (temp.indexOf("*/")<0 && temp.indexOf("/*")<0 && markPos>=0 && markPos<temp.length()) {
				sBuilder.append("    //"+temp.substring(markPos+1, temp.length())+"\n");
			}
			temp=reader.readLine();
		}
		String result=sBuilder.toString();
		System.out.println(result);
	}
	
	public static void single2multiAnno(String file) throws Exception{
		String classFile=FileUtils.class.getClassLoader().getResource(file).getFile();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(classFile)), Charset.forName("UTF-8")));
		
		StringBuilder sBuilder=new StringBuilder();
		String anno="";
		String temp=reader.readLine();
		int annoCount=0;
		while (temp!=null) {			
			
			int markPos=temp.indexOf("//");
			//ע�Ϳ�ͷ
			if (markPos>=0 && markPos+2<temp.length()) {
				annoCount++;
				anno+=space+" * "+temp.substring(markPos+2, temp.length())+"\n";
			} else {
				if(annoCount>0) {
					sBuilder.append(space+"/**\n"+anno+space+" */\n");
					anno="";
					annoCount=0;
					sBuilder.append(temp+"\n");
				} else {
					sBuilder.append(temp+"\n");
				}				
			}								
			temp=reader.readLine();
		}
		String result=sBuilder.toString();
		System.out.println(result);
	}

	public static void main(String[] args) throws Exception {
		//System.out.println("=====Dto to Json transter======");
		dto2json("file.txt");
		String file="File.java";
		//System.out.println("/*****".indexOf("*/*"));
		//multy2singleAnno(file);
		//single2multiAnno(file);

	}
}

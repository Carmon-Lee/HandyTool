package reflect;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Enumeration;

import reflect.annotation.MyComponentScan;

@MyComponentScan
public class ScanDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Package package1=Package.getPackage("reflect");
//		System.out.println(package1.getName());
		String classPath=package1.getName()+".ScanDemo";
//		System.out.println(classPath);
		//Class clazz1=Thread.currentThread().getClass().getClassLoader().loadClass(classPath);
		Class clazz=Class.forName(classPath);
		Annotation[] annotations=clazz.getAnnotations();
		for(Annotation annotation:annotations) {
//			System.out.println(annotation.annotationType().getCanonicalName());
//			System.out.println(annotation.annotationType().getName());
//			System.out.println(annotation.annotationType().getSimpleName());
			if (annotation.annotationType().getSimpleName().equals("MyComponentScan")) {
				System.out.println(annotation.toString());
			}
		}
		System.out.println(clazz);
		scanAll(package1);
	}
	
	public static void scanAll(Package pkg) throws Exception {
		String pkgName=pkg.getName();
		System.out.println(pkgName);
		Enumeration<URL> urls=Thread.currentThread().getContextClassLoader().getResources(pkgName);
		while (urls.hasMoreElements()) {
			URL url=urls.nextElement();
			if (url.getProtocol().equals("file")) {
				Thread.currentThread().getContextClassLoader().loadClass("");
			}
			System.out.println(url.getProtocol()+" "+url.toString());
		}
		
	}

}

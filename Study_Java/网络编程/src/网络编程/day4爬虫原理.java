package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class day4爬虫原理 {

	 public static void main(String[] args) {
	        basicSpider();
	    }
	    //网络爬虫
	    static void basicSpider() {
	        URL url = null;
	        InputStream is = null;//输入流
	        BufferedReader br = null;
	        StringBuilder sb = new StringBuilder();
	        String temp = "";
	        try {
//	            url = new URL("http://www.baidu.com");
	        	
	        	
	        	//---------------------------------------------------//模拟流浪器访问
	        	 url = new URL("https://www.dianping.com/");//单访问会报错
	        	 HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	        	 conn.setRequestMethod("GET");
	        	 conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");	        	         	
	             br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));//转换为
	        	 //------------------------------------------------//
	        	 
	        	 
	        	 
//	            is = url.openStream();//打开一个流输入到程序
//	            br = new BufferedReader(new InputStreamReader(is,"utf-8"));//转换为
	            /* 
	             * 这样就可以将网络内容下载到本地机器。
	             * 然后进行数据分析，建立索引。这也是搜索引擎的第一步。
	             */
	            while ((temp = br.readLine()) != null) {
	            	 System.out.println(temp);
	            }
//	            System.out.println(sb);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            try {
	                is.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

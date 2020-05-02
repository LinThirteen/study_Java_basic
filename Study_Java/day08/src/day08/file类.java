package day08;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class file类 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//文件和目录
		//获取文件对象
		File f = new File("d:/01.txt");  //"d:/a.txt"
		
		System.out.println(f);
		
		//修改文件名
		f.renameTo(new File("d:/02.txt"));
		
		
		//默认目录为项目目录
		System.out.println(System.getProperty("user.dir"));
		
		
		//默认建立到当前目录
		File f2 = new File("03.text");
		f2.createNewFile();
		
		
	    System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());//相对路径
        System.out.println("File的目录路径："+f.getAbsolutePath());//绝对路径
		
		
        //目录结构中有一个不存在
//        File f3 = new File("d:/电影/华语/大陆");
//        boolean flag = f3.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
//        System.out.println(flag);//创建失败
        
        
        
//       //目录结构中有一个不存在也没关系 
        File f3 = new File("d:/电影/华语/大陆");
        boolean flag = f3.mkdirs();//目录结构中有一个不存在也没关系；创建整个目录树
        System.out.println(flag);//创建成功
        
        
        
        //指定一个文件
        File file = new File("d:/sxt/b.txt");
        //判断该文件是否存在
        boolean flags= file.exists();
        //如果存在就删除，如果不存在就创建
        if(flags){
            //删除
            boolean flagd = file.delete();
            if(flagd){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            //创建
            boolean flagn = true;
            try {
                //如果目录不存在，先创建目录
                File dir = file.getParentFile();
                dir.mkdirs();
                //创建文件
                flagn = file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                System.out.println("创建失败");
                e.printStackTrace();
            }          
        }
        //文件重命名(同学可以自己测试一下)
        //file.renameTo(new File("d:/readme.txt"));
		
	}

}

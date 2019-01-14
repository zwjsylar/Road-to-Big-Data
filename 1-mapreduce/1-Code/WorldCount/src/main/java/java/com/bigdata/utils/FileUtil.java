package java.com.bigdata.utils;

import java.io.File;

/**
 * @program: mapreduce
 * @description: 文件工具类
 * @author: zwj
 * @create: 2019-01-14 21:54
 **/
public class FileUtil {

    public static boolean deleteDir(String path){
        File file = new File(path);
        if(file.exists()){
            for(File f:file.listFiles()){
                if(f.isDirectory()){
                    deleteDir(f.getName());
                }else {
                    f.delete();
                }
            }

            file.delete();
            return true;
        }else{
            System.err.println("文件（夹）不存在");
            return false;
        }
    }
}

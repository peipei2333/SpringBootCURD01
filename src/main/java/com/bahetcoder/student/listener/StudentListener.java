package com.bahetcoder.student.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.bahetcoder.student.entity.StudentEntity;
import com.bahetcoder.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StudentListener extends AnalysisEventListener<StudentEntity> {

    @Autowired
    private StudentService studentService;

    public StudentListener(StudentService studentService){
        this.studentService = studentService;
    }
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;
    List<StudentEntity> list = new ArrayList<>();

    public StudentListener() {

    }

    /**
     * invoke
     * @param data
     * @param analysisContext
     */
    public void invoke(StudentEntity data, AnalysisContext analysisContext) {
        System.out.println("解析到一条数据:"+JSON.toJSONString(data));
        list.add(data);
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    /**
     * 读取之后的操作
     * @param analysisContext
     */
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        System.out.println("所有数据解析完成！");
    }
    /**
     * 加上存储数据库
     */
    private void saveData() {
        System.out.println(list.size()+"条数据，开始存储数据库！");
        System.out.println(list);
        if (list.size()>0){
           studentService.saveStudent((StudentEntity) list);
            System.out.println("存储数据库成功！");
        }else {
            System.out.println("存储数据库失败！");
        }
    }
}

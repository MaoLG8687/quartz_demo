package cn.cooplan.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 简单的执行任务, 打印时间和你好
 * 实现接口Job 从写方法execute
 * 该方法就是你定时器执行任务的逻辑
 */
public class HiJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = simpleDateFormat.format(new Date());
        System.out.println(nowTime + ":你好");
    }
}

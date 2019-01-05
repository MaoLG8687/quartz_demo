package cn.cooplan.quartz.scheduler;

import cn.cooplan.quartz.job.HiJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * 启动一个简单的任务, 2秒执行一次HiJob
 */
public class StartScheduler {

    public static void doHiJob() throws SchedulerException {

        JobDetail build = JobBuilder.newJob(HiJob.class).withIdentity("HiJob", "group1").build();

        Trigger trigger = TriggerBuilder.newTrigger().startNow()
                .withIdentity("trigger", "group1")
                .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(2).repeatForever())
                .build();

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();
        scheduler.scheduleJob(build, trigger);
    }
}

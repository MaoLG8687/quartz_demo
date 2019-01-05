package cn.cooplan.quartz.test;

import cn.cooplan.quartz.scheduler.CronScheduler;
import org.quartz.SchedulerException;

public class Test {
    public static void main(String[] args) throws SchedulerException {
        CronScheduler.cronScheduler();

    }
}

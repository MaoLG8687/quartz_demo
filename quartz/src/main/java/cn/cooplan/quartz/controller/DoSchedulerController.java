package cn.cooplan.quartz.controller;

import cn.cooplan.quartz.job.HiJob;
import cn.cooplan.quartz.scheduler.CronScheduler;
import cn.cooplan.quartz.scheduler.StartScheduler;
import org.quartz.SchedulerException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 调用, 启动 HiJob
 */
@RestController
@RequestMapping("/quartz")
public class DoSchedulerController {

    @RequestMapping("/doHiJob")
    public Object doHiJob() throws SchedulerException {
//        StartScheduler.doHiJob();
        CronScheduler.cronScheduler();
        return "OK";
    }
}

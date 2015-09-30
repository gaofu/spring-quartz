package hello;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class DemoJob extends QuartzJobBean {
    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Job executing……");
        System.out.println("hello " + hello);
        try {
            SchedulerContext context = jobExecutionContext.getScheduler().getContext();
            List list = (List) context.get("list");
            for (Object item : list)
                System.out.println(item.getClass().toString() + " - " + item);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}

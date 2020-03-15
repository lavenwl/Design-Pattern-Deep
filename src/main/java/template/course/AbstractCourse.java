package template.course;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-03-11 21:43
 */
public abstract class AbstractCourse {

    protected final void createCourse(){
        // 1. 发布预习资料
        postPreResource();
        // 制作ppt
        createPPT();
        // 录视频
        liveVideo();
        // 上传课程资料
        postResource();

        // 布置作业
        postHomework();
        
        // 检查作业
        if (needCheckHomework()) {
            checkHomework();
        }
    }

    protected void postHomework(){
        System.out.println("布置作业");
    };

    protected abstract void checkHomework();

    protected abstract boolean needCheckHomework();

    protected void postResource(){
        System.out.println("上传课程资料");
    }

    protected void liveVideo(){
        System.out.println("录视频");
    }

    protected void createPPT(){
        System.out.println("制作ppt");
    }

    protected void postPreResource(){
        System.out.println("上传课程资料");
    }

}

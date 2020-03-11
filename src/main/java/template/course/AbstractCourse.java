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
        
        // 检查作业
        if (needCheckHomework()) {
            checkHomework();
        }
    }

    protected abstract void checkHomework();


    protected boolean needCheckHomework() {
        return false;
    }

    protected void postResource(){
        System.out.println("");
    }

    protected void liveVideo(){
        System.out.println("");
    }

    protected void createPPT(){
        System.out.println("");
    }

    protected void postPreResource(){
        System.out.println("");
    }

}

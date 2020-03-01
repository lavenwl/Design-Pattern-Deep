package factory.simplefactory;

/**
 * @Description:
 * @Author: laven
 * @Date: 2020-02-23 20:45
 */
public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz) {
        try{
//            if (!(null == className || "".equals(className))){
//
//            }

            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Calendar 获取使用了简单工厂模式
//        LoggerFactory.getLogger(); 使用了简单工厂模式


        return null;
    }
}

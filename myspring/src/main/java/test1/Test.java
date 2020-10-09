package test1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        Object a = null;
        AnnotationConfigApplicationContext ac = new
                AnnotationConfigApplicationContext(AnnotationConfig.class);
        UserDao userDao = ac.getBean(UserDao.class);
        userDao.printInfo();
    }
}
package test1;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private UserSub userSub;
    private String name;

    public void printInfo(){
        logger.info("user dao");
        System.out.println("=====user dao====");
        System.out.println("011100110000".replaceAll("0+$",""));
    }

    public UserSub getUserSub() {
        return userSub;
    }

    public void setUserSub(UserSub userSub) {
        this.userSub = userSub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
import com.gyt.study.test.DTO.User
import com.gyt.study.test.services.UserService
import com.gyt.study.test.utils.ContextUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext

import javax.servlet.http.HttpServletRequest

/**
 * @Author: guiyuting* @Date: 2020/8/7 11:41
 * @Description:
 */

class TestGroovy {

//    @Autowired
//    UserService userService;


    Object run(String username, HttpServletRequest requestInfo) {

        User user = User.builder().userName(username).build();
        System.out.println("Session:" + requestInfo.getSession());

        UserService userService = ContextUtil.getBean("userService");
        System.out.println("Spring Bean:" + userService.testUser());

        user.setAge(30);
        return user;
    }

//    static void main(args) {
//        Map map = getProperties();
//        System.out.println(map);
//  //      run();
//    }


}

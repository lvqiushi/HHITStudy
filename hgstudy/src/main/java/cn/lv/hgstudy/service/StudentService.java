/**   
 * @Title: TeacherService.java 
 * @Package cn.lv.hgstudy.service 
 * @Description: TODO
 * @author lv 
 * @date 2017年9月13日 下午7:28:23 
 * @version V1.0   
 */
package cn.lv.hgstudy.service;

import cn.lv.hgstudy.pojo.Student;


/** 
 * @ClassName: TeacherService 
 * @Description: TODO
 * @author lv
 * @date 2017年9月13日 下午7:28:23 
 *  
 */

public interface StudentService {
	Student showStudentInfor(String stuid);
	Student loginStudent(String username,String password);
}

package in.igct.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.igct.binding.IGCTCourse;

@Service

public class CourseService {
	
public List<IGCTCourse> getCourse(){
	
List list=new ArrayList();
	
IGCTCourse  course1= new IGCTCourse(1,"BA (BACHELOR OF ART)","3: Year");

IGCTCourse  course2= new IGCTCourse(2,"BACA (BACHELOR OF ART IN COMPUTER APPLICATION)","3: Year");

IGCTCourse  course3= new IGCTCourse(3,"BBA (BACHELOR OF BUSINESS ADMINISTRATION) ","3: Year");

IGCTCourse  course4= new IGCTCourse(4,"BCA (BACHELOR OF COMPUTER APPLICATION)","3: Year");

IGCTCourse  course5= new IGCTCourse(5,"BCOM (BACHELOR OF COMMERCE)","3: Year");

IGCTCourse  course6= new IGCTCourse(6," BCOM CA (BACHELOR OF COMMERCE IN COMPUTER APPLICATION)","3: Year");

IGCTCourse  course7= new IGCTCourse(7,"BMLT (Bachelor of Medical Laboratory Technology)","3: Year");

IGCTCourse  course8= new IGCTCourse(8,"DMLT (Diploma in Medical Laboratory Technology)","2: Year");

IGCTCourse  course9= new IGCTCourse(9,"DCA (DIPLOMA In COMPUTER APPLICATION)","1: Year");

IGCTCourse  course10= new IGCTCourse(10,"PGDCA (POST GRADUATE DIPLOMA IN COMPUTER APPLICATION)","1: Year");

IGCTCourse  course11= new IGCTCourse(11,"MA (MASTER OF ARTS Hindi / English / Education / Sanskrit)","2: Year");

IGCTCourse  course12= new IGCTCourse(12," MSC (Master Of Science Math / CS )","2: Year");



list.add(course1);list.add(course2);list.add(course3);list.add(course4);list.add(course5);list.add(course6);
list.add(course7); list.add(course8); list.add(course9); list.add(course10); list.add(course11); list.add(course12);


return list;

}

public List<String> getCourseAll()
{
	
	List<String> listofCourse=new ArrayList();
	listofCourse.add("BCA");
	listofCourse.add("DCA");
	listofCourse.add("PGDCA");
	listofCourse.add("BBA");
	listofCourse.add("BA CA");
	listofCourse.add("BCOM");
	listofCourse.add("Tally");
	listofCourse.add("BCOM CA");
	listofCourse.add("MA Hindi/English/Economics/Education");
	listofCourse.add("MSC Math/Computer");
	
	return listofCourse;
}

}

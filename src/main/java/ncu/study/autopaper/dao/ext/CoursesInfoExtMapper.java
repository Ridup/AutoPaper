package ncu.study.autopaper.dao.ext;

import ncu.study.autopaper.common.pojo.ChapterPojo;
import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.common.pojo.VersionPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  CoursesInfoExtMapper .java  v0.1  2018/4/25 11:50 Exp $
 */
public interface CoursesInfoExtMapper {

    public List<GradePojo> getAllGrade();

    public List<CoursePojo> getAllCourse(@Param("gradePojo") GradePojo pojo);

    public List<VersionPojo> getAllVersion(@Param("gradePojo") GradePojo gradePojo,@Param("coursePojo") CoursePojo coursePojo);

    public List<ChapterPojo> getChapterInfoById(Integer courseId);

}

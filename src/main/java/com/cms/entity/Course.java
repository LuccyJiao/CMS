package com.cms.entity;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.Course_Info_ID
     *
     * @mbg.generated
     */
    private Integer courseInfoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.Teacher_ID
     *
     * @mbg.generated
     */
    private Integer teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.Class_ID
     *
     * @mbg.generated
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.Classroom_ID
     *
     * @mbg.generated
     */
    private Integer classroomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.Teach_Time
     *
     * @mbg.generated
     */
    private Integer teachTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.Begin_Date
     *
     * @mbg.generated
     */
    private Date beginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.End_Date
     *
     * @mbg.generated
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.ID
     *
     * @return the value of course.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.ID
     *
     * @param id the value for course.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.Course_Info_ID
     *
     * @return the value of course.Course_Info_ID
     *
     * @mbg.generated
     */
    public Integer getCourseInfoId() {
        return courseInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.Course_Info_ID
     *
     * @param courseInfoId the value for course.Course_Info_ID
     *
     * @mbg.generated
     */
    public void setCourseInfoId(Integer courseInfoId) {
        this.courseInfoId = courseInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.Teacher_ID
     *
     * @return the value of course.Teacher_ID
     *
     * @mbg.generated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.Teacher_ID
     *
     * @param teacherId the value for course.Teacher_ID
     *
     * @mbg.generated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.Class_ID
     *
     * @return the value of course.Class_ID
     *
     * @mbg.generated
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.Class_ID
     *
     * @param classId the value for course.Class_ID
     *
     * @mbg.generated
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.Classroom_ID
     *
     * @return the value of course.Classroom_ID
     *
     * @mbg.generated
     */
    public Integer getClassroomId() {
        return classroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.Classroom_ID
     *
     * @param classroomId the value for course.Classroom_ID
     *
     * @mbg.generated
     */
    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.Teach_Time
     *
     * @return the value of course.Teach_Time
     *
     * @mbg.generated
     */
    public Integer getTeachTime() {
        return teachTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.Teach_Time
     *
     * @param teachTime the value for course.Teach_Time
     *
     * @mbg.generated
     */
    public void setTeachTime(Integer teachTime) {
        this.teachTime = teachTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.Begin_Date
     *
     * @return the value of course.Begin_Date
     *
     * @mbg.generated
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.Begin_Date
     *
     * @param beginDate the value for course.Begin_Date
     *
     * @mbg.generated
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.End_Date
     *
     * @return the value of course.End_Date
     *
     * @mbg.generated
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.End_Date
     *
     * @param endDate the value for course.End_Date
     *
     * @mbg.generated
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseInfoId=").append(courseInfoId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", classId=").append(classId);
        sb.append(", classroomId=").append(classroomId);
        sb.append(", teachTime=").append(teachTime);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
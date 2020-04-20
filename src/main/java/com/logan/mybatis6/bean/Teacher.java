package com.logan.mybatis6.bean;

import java.io.Serializable;

public class Teacher implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_id
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    private String tId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.t_name
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    private String tName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_id
     *
     * @return the value of teacher.t_id
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public String gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_id
     *
     * @param tId the value for teacher.t_id
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.t_name
     *
     * @return the value of teacher.t_name
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public String gettName() {
        return tName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.t_name
     *
     * @param tName the value for teacher.t_name
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", tName=").append(tName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
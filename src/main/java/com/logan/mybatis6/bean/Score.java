package com.logan.mybatis6.bean;

import java.io.Serializable;

public class Score extends ScoreKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.s_score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    private Integer sScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.s_d_id
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    private Integer sDId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.s_score
     *
     * @return the value of score.s_score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public Integer getsScore() {
        return sScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.s_score
     *
     * @param sScore the value for score.s_score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.s_d_id
     *
     * @return the value of score.s_d_id
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public Integer getsDId() {
        return sDId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.s_d_id
     *
     * @param sDId the value for score.s_d_id
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    public void setsDId(Integer sDId) {
        this.sDId = sDId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Mar 26 10:35:56 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sScore=").append(sScore);
        sb.append(", sDId=").append(sDId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
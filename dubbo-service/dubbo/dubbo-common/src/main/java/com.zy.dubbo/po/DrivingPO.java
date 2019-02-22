package com.zy.dubbo.po;

/**
 * @author zheng
 * @date 2019年2月22日
 */
public class DrivingPO {
    /**
     * 题目
     */
    private String subject;

    /**
     * 答案
     */
    private String answer;


    public DrivingPO(String subject, String answer) {
        this.subject = subject;
        this.answer = answer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "DrivingPO{" +
                ", subject='" + subject + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}

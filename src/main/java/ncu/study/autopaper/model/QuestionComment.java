package ncu.study.autopaper.model;

import java.util.Date;

public class QuestionComment {
    private Long questionCommentId;

    private Integer userId;

    private Long questionId;

    private String questionComment;

    private Date questionCommentTime;

    private Integer questionCommentPraise;

    private String status;

    public QuestionComment(Long questionCommentId, Integer userId, Long questionId, String questionComment, Date questionCommentTime, Integer questionCommentPraise, String status) {
        this.questionCommentId = questionCommentId;
        this.userId = userId;
        this.questionId = questionId;
        this.questionComment = questionComment;
        this.questionCommentTime = questionCommentTime;
        this.questionCommentPraise = questionCommentPraise;
        this.status = status;
    }

    public QuestionComment() {
        super();
    }

    public Long getQuestionCommentId() {
        return questionCommentId;
    }

    public void setQuestionCommentId(Long questionCommentId) {
        this.questionCommentId = questionCommentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionComment() {
        return questionComment;
    }

    public void setQuestionComment(String questionComment) {
        this.questionComment = questionComment == null ? null : questionComment.trim();
    }

    public Date getQuestionCommentTime() {
        return questionCommentTime;
    }

    public void setQuestionCommentTime(Date questionCommentTime) {
        this.questionCommentTime = questionCommentTime;
    }

    public Integer getQuestionCommentPraise() {
        return questionCommentPraise;
    }

    public void setQuestionCommentPraise(Integer questionCommentPraise) {
        this.questionCommentPraise = questionCommentPraise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
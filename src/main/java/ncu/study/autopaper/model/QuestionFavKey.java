package ncu.study.autopaper.model;

public class QuestionFavKey {
    private Integer userId;

    private Long questionId;

    public QuestionFavKey(Integer userId, Long questionId) {
        this.userId = userId;
        this.questionId = questionId;
    }

    public QuestionFavKey() {
        super();
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
}
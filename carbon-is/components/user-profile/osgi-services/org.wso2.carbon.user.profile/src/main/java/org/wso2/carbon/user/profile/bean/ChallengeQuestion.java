package org.wso2.carbon.user.profile.bean;

/**
 * User's challenge questions
 */
public class ChallengeQuestion {
    int questionId;
    String answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

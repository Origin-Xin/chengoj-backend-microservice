package com.chengoj.chengojbackendjudgeservice.judge;


import com.chengoj.chengojbackendmodel.model.entity.QuestionSubmit;

public interface JudgeService {
    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}

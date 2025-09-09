package com.chengoj.chengojbackendjudgeservice.judge.strategy;


import com.chengoj.chengojbackendmodel.model.codesandbox.JudgeInfo;

public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}

package com.chengoj.chengojbackendjudgeservice.judge;


import com.chengoj.chengojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.chengoj.chengojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.chengoj.chengojbackendjudgeservice.judge.strategy.JudgeContext;
import com.chengoj.chengojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.chengoj.chengojbackendmodel.model.codesandbox.JudgeInfo;
import com.chengoj.chengojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

     JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}

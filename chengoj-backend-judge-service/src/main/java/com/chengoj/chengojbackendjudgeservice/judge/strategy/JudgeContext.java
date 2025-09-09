package com.chengoj.chengojbackendjudgeservice.judge.strategy;


import com.chengoj.chengojbackendmodel.model.codesandbox.JudgeInfo;
import com.chengoj.chengojbackendmodel.model.dto.question.JudgeCase;
import com.chengoj.chengojbackendmodel.model.entity.Question;
import com.chengoj.chengojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;
/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> outputList;

    private List<String> inputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}

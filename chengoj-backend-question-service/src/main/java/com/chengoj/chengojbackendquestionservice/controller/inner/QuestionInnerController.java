package com.chengoj.chengojbackendquestionservice.controller.inner;

import com.chengoj.chengojbackendmodel.model.entity.Question;
import com.chengoj.chengojbackendmodel.model.entity.QuestionSubmit;
import com.chengoj.chengojbackendquestionservice.service.QuestionService;
import com.chengoj.chengojbackendquestionservice.service.QuestionSubmitService;
import com.chengoj.chengojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 该服务仅内部调用，不提供给前端
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId){
        return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionId){
        return questionSubmitService.getById(questionId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit){
        return questionSubmitService.updateById(questionSubmit);
    }
}

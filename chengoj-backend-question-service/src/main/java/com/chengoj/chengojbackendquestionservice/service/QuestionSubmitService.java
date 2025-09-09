package com.chengoj.chengojbackendquestionservice.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chengoj.chengojbackendmodel.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.chengoj.chengojbackendmodel.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.chengoj.chengojbackendmodel.model.entity.QuestionSubmit;
import com.chengoj.chengojbackendmodel.model.entity.User;
import com.chengoj.chengojbackendmodel.model.vo.QuestionSubmitVO;

/**
 * @author 6992
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2025-06-16 20:51:08
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取问题提交封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取问题提交封装
     *
     * @param questionSubmitVOPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitVOPage, User loginUser);
}

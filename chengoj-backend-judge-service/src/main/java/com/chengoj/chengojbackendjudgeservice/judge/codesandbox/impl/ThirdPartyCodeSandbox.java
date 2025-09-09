package com.chengoj.chengojbackendjudgeservice.judge.codesandbox.impl;


import com.chengoj.chengojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.chengoj.chengojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.chengoj.chengojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用远程第三方代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}

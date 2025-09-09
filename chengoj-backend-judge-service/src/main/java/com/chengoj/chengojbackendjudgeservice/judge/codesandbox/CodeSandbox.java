package com.chengoj.chengojbackendjudgeservice.judge.codesandbox;

import com.chengoj.chengojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.chengoj.chengojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

package com.chengoj.chengojbackendjudgeservice.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.excel.util.StringUtils;
import com.chengoj.chengojbackendcommon.common.ErrorCode;
import com.chengoj.chengojbackendcommon.exception.BusinessException;
import com.chengoj.chengojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.chengoj.chengojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.chengoj.chengojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用的代码沙箱接口）
 */
public class RemoteCodeSandbox implements CodeSandbox {

    // 定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        String url = "http://localhost:8090/executeCode";
        String jsonStr = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(jsonStr)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}

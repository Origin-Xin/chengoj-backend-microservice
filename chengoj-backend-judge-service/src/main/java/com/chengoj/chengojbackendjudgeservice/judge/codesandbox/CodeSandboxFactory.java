package com.chengoj.chengojbackendjudgeservice.judge.codesandbox;


import com.chengoj.chengojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandbox;
import com.chengoj.chengojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandbox;
import com.chengoj.chengojbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 */
public class CodeSandboxFactory {
    /**
     *   创建代码沙箱示例
     * @param type 沙箱类
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}

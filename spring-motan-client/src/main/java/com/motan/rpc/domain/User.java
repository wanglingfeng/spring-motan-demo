package com.motan.rpc.domain;

import java.io.Serializable;

/**
 * Created by lfwang on 2017/8/14.
 */
public class User implements Serializable {
    
    private String name;
    private String word;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
